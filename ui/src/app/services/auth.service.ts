import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { JwtHelperService } from '@auth0/angular-jwt';
import { map } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class AuthService {
  currentUser:any;

  constructor(private http:HttpClient,private jwtHelper:JwtHelperService) { 
    const token=localStorage.getItem('jwt_token')
    if(token)
      this.currentUser= jwtHelper.decodeToken(token);
  }

  login(credentials: any) { 
    return this.http.post<any>('/api/authenticate', credentials)
    .pipe(
      map(result=> {
       
        if (result && result['access_token']) {
         localStorage.setItem('jwt_token', result['access_token']);
         this.currentUser = this.jwtHelper.decodeToken(result['access_token']);
         console.log("current user",this.currentUser)
         return true; 
       }
       else return false; 

      }
    ))
    

       
  
   }
  

  logout(){
    localStorage.removeItem('jwt_token')
    this.currentUser=null
  }

  isLoggedIn():boolean {
    return !this.jwtHelper.isTokenExpired();
  }
}

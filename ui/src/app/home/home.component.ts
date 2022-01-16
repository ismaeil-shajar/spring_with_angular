import { Component, OnInit } from '@angular/core';
import { HomeService } from '../services/home.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  home:string="In";
  constructor(private homeService:HomeService) { }

  ngOnInit(): void {
    this.homeService.getHome().subscribe(result=> {
      console.log("result");
      
      console.log(result);
      this.home=result;
    });
  }

}

package com.shajar.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HomeService {
    public String getHome() {
       return "Welcome Home Spring";
    }

    public Map<String,String> getToken() {
        Map<String,String> tokenObj=new HashMap<>();
        tokenObj.put("access_token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwicm9sZSI6WyJVU0VSIl0sImlhdCI6MTUxNjIzOTAyMn0.Yz_BtLspCvnpf2xgMfEnLSP40Jm7ILqu1Rd1VGhNtrA");
        return tokenObj;
    }
}

package com.example;

public class MyService {

    ExternalAPI api;

    MyService(ExternalAPI api){
        this.api=api;
    }

    String fetchData(){
        return api.getData();
    }
}
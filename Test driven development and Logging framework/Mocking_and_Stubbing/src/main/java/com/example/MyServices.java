package com.example;

public class MyServices{

    private final ExternalApi api;

    public MyServices(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}
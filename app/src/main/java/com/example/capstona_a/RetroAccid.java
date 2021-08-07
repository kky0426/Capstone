package com.example.capstona_a;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroAccid {
    private static RetroAccid Instance = new RetroAccid();

    public static RetroAccid getInstance() {
        return Instance;
    }

    private RetroAccid() {

    }

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://kr.api.riotgames.com/lol/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    GetAccidService service = retrofit.create(GetAccidService.class);
    public GetAccidService getService(){
        return service;
    }

}

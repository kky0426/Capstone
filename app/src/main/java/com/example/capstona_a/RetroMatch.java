package com.example.capstona_a;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroMatch {
    private static RetroMatch Instance1 = new RetroMatch();

    public static RetroMatch getInstance() {
        return Instance1;
    }

    private RetroMatch() {

    }

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://kr.api.riotgames.com/lol/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    GetAccidService service2 = retrofit.create(GetAccidService.class);
    public GetAccidService getService2(){
        return service2;
    }
}

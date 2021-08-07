package com.example.capstona_a;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroLeague {    private static RetroLeague Instance1 = new RetroLeague();

    public static RetroLeague getInstance() {
        return Instance1;
    }

    private RetroLeague() {

    }

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://kr.api.riotgames.com/lol/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    GetAccidService service1 = retrofit.create(GetAccidService.class);
    public GetAccidService getService(){
        return service1;
    }

}

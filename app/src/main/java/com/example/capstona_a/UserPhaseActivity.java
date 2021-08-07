package com.example.capstona_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserPhaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_phase);
        Intent intent = getIntent();
        CUserDTO User =(CUserDTO)intent.getSerializableExtra("user");
        TextView textView = (TextView)findViewById(R.id.name_summoner_phase);
        Button btn = (Button)findViewById(R.id.btn_ingameInfo);
        ImageView img = (ImageView)findViewById(R.id.img_summoner);
        String api_key="RGAPI-20a0010d-63d7-4d65-916d-ea00d5178511";
        textView.setText(User.getName());
        String imgSrc = "https://ddragon.leagueoflegends.com/cdn/11.15.1/img/profileicon/"+String.valueOf(User.getProfileIconId())+".png";
        Glide.with(this).load(imgSrc).into(img);
        ListView listView = (ListView)findViewById(R.id.listview_user_phase);
        Call<MatchData>res2=RetroMatch.getInstance().getService2().getMatchId(User.getAccountId(),api_key);
        res2.enqueue(new Callback<MatchData>() {
            @Override
            public void onResponse(Call<MatchData> call, Response<MatchData> response) {
                Log.d("Retrofit match success", response.toString());
                ArrayList<Match> matchList = null;
                MatchData matchData1 = response.body();
                Toast my = Toast.makeText(UserPhaseActivity.this,matchData1.getMatches().get(0).toString(),Toast.LENGTH_LONG);
                my.show();
                for (int i = 0; i < 10; i++)
                {
                    matchList.add(matchData1.getMatches().get(i));
                }


                final UserPhaseAdapter userPhaseAdapter = new UserPhaseAdapter(getApplicationContext(),matchList);
                listView.setAdapter(userPhaseAdapter);

            }

            @Override
            public void onFailure(Call<MatchData> call, Throwable t) {

            }
        });


        /*
        Call<CUserLeagueResult> res2=RetroLeague.getInstance().getService().getUserDetail("ZEwSFvGvoKRevXsEodFn0dMk8GyyN6VNc2Fj_6R90XzZ_1Y",api_key);
        res2.enqueue(new Callback<CUserLeagueResult>() {
            @Override
            public void onResponse(Call<CUserLeagueResult> call, Response<CUserLeagueResult> response) {
                CUserLeagueResult cUserLeagueResult = response.body();
                CUserLeaguelistDTO cUserLeaguelistDTO = cUserLeagueResult.getcUserLeaguelistDTO();
                Log.d("Retrofit success",response.toString());
                Toast MY = Toast.makeText(UserPhaseActivity.this,cUserLeaguelistDTO.getLeagueDTOList().get(0).getLeagueId(),Toast.LENGTH_SHORT);
                MY.show();

            }

            @Override
            public void onFailure(Call<CUserLeagueResult> call, Throwable t) {
                Log.d("ERROR League","FAIL");
            }
        });
        */

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(UserPhaseActivity.this,IngameActivity.class);
                intent1.putExtra("user",User);
                startActivity(intent1);
            }
        });



    }



}
package com.example.capstona_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import retrofit2.Callback;
import retrofit2.Response;

import retrofit2.Call;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.btn_search);
        EditText editText=(EditText)findViewById(R.id.search_textbar);
        String api_key="RGAPI-20a0010d-63d7-4d65-916d-ea00d5178511";
        Intent intent = new Intent(MainActivity.this, UserPhaseActivity.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=editText.getText().toString();
                Handler handler = new Handler();
                CUserDTO CUserDTO1 = new CUserDTO();

                Call<CUserDTO>res= RetroAccid.getInstance().getService().getAcc_id(name,api_key);
                res.enqueue(new Callback<CUserDTO>() {
                    @Override
                    public void onResponse(Call<CUserDTO> call, Response<CUserDTO> response) {
                        Log.d("Retrofit success",response.toString());
                        CUserDTO CUserDTO1 = response.body();
                        intent.putExtra("user", CUserDTO1);
                        //Toast myT= Toast.makeText(getApplicationContext(),CUser1.getId(),Toast.LENGTH_LONG);
                        startActivity(intent);


                    }

                    @Override
                    public void onFailure(Call<CUserDTO> call, Throwable t) {
                        Log.d("ERROR Cuser","FAIL");

                    }
                });







            }
        });
    }







}

package com.example.asif047.cricketzzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    CricketAdapter cricketAdapter;
    List<CricInfoResponse.Datum> data = new ArrayList<>();
    private ListView listView;

    private Retrofit retrofit;
    private CricketApiService cricketApiService;

    private static final String APPID="918033";
    private static final String APPKEY="6krnL0YcJrVul5eNZrNee4ogpVF2";
    private static final String BASE_URL="http://cricapi.com/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView= (ListView) findViewById(R.id.listview);

        retrofit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        cricketApiService=retrofit.create(CricketApiService.class);


        requestCricketResponse();




    }



    private void requestCricketResponse()
    {
        String urlString=String.format("matchCalendar/?unique_id=%s&&apikey=%s",APPID,APPKEY);


        Call<CricInfoResponse> cricInfoResponseCall=cricketApiService.getCricInfoResponse(urlString);

        cricInfoResponseCall.enqueue(new Callback<CricInfoResponse>() {
            @Override
            public void onResponse(Call<CricInfoResponse> call, Response<CricInfoResponse> response) {
                if(response.code()==200)
                {
                    CricInfoResponse cricInfoResponse=response.body();
                    data = cricInfoResponse.getData();


                    cricketAdapter = new CricketAdapter(MainActivity.this,data);
                    listView.setAdapter(cricketAdapter);


                }
            }

            @Override
            public void onFailure(Call<CricInfoResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this,"No data found",Toast.LENGTH_LONG).show();
            }
        });
    }




}

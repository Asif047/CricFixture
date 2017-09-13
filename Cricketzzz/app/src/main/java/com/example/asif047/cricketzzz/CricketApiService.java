package com.example.asif047.cricketzzz;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Asif on 9/12/2017.
 */

public interface CricketApiService {

    @GET()
    Call<CricInfoResponse>getCricInfoResponse(@Url String urlString);

}

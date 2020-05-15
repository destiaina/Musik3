package com.example.musik.api.services;

import java.util.List;

import com.example.musik.api.models.Envelope;
import com.example.musik.api.models.Song;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface{
    @GET("v3.0/tracks")
    Call<Envelope<List<Song>>> getLagu(@Query("client_id") String client_id, @Query("format") String format, @Query("name") String name);

}

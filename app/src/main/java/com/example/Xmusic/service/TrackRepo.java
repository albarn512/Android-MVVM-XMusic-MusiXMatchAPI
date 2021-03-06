package com.example.Xmusic.service;

import com.example.Xmusic.model.track.TrackResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TrackRepo {
    @GET("/ws/1.1/chart.tracks.get?chart_name=top&page=1&page_size=15&country=id&apikey=0683f9648f8a91e0d3e84abf6f4db18e")
    Call<TrackResponse> getTrackChart();
}

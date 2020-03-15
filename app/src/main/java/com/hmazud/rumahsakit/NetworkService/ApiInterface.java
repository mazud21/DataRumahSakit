package com.hmazud.rumahsakit.NetworkService;

import com.hmazud.rumahsakit.ModelData.MasalahData;
import com.hmazud.rumahsakit.ModelData.RsData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("json.json")
    Call<RsData> rsData();

    @GET("Pdam_masalah")
    Call<MasalahData> masalahData();
}
package com.hmazud.rumahsakit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

import com.hmazud.rumahsakit.Adapter.RsAdapter;
import com.hmazud.rumahsakit.Model.RsModel;
import com.hmazud.rumahsakit.ModelData.RsData;
import com.hmazud.rumahsakit.NetworkService.ApiClient;
import com.hmazud.rumahsakit.NetworkService.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    private RecyclerView.Adapter rsAdapter;
    ApiInterface apiInterface;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    public static MainActivity mainActivity;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvRs);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        context = this;

        Call<RsData> rsDataCall = apiInterface.rsData();

        rsDataCall.enqueue(new Callback<RsData>() {
            @Override
            public void onResponse(Call<RsData> call, Response<RsData> response) {
                List<RsModel> rsDataList = response.body().getRsDataList();
                rsAdapter = new RsAdapter(rsDataList, context);

                //gridView.setAdapter(rsAdapter);
                recyclerView.setAdapter(rsAdapter);
            }

            @Override
            public void onFailure(Call<RsData> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }

        });
    }
}

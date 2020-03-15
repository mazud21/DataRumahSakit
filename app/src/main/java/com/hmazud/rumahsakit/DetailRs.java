package com.hmazud.rumahsakit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.hmazud.rumahsakit.Model.RsModel;

public class DetailRs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_rs);

        TextView tNama = findViewById(R.id.namaRs);
        TextView tTelp = findViewById(R.id.telpRs);
        TextView tDaerah = findViewById(R.id.daerahRs);
        TextView tRegion = findViewById(R.id.regionRs);

        ImageView imgRs = findViewById(R.id.imgRs);

        RsModel rsModel = getIntent().getParcelableExtra("data");

        String nama = rsModel.getHospital_name();
        String telp = rsModel.getHospital_phone();
        String daerah = rsModel.getHospital_district();
        String region = rsModel.getRegion();

        Glide.with(this).load(rsModel.getHospital_photo()).into(imgRs);

        tNama.setText(nama);
        tTelp.setText(telp);
        tDaerah.setText(daerah);
        tRegion.setText(region);
    }
}

package com.hmazud.rumahsakit.ModelData;

import com.google.gson.annotations.SerializedName;
import com.hmazud.rumahsakit.Model.MasalahModel;

import java.util.List;

public class MasalahData {

    @SerializedName("status")
    String status;
    @SerializedName("data")
    List<MasalahModel> masalahDataList;

    public List<MasalahModel> getMasalahDataList() {
        return masalahDataList;
    }
}


package com.hmazud.rumahsakit.ModelData;

import com.google.gson.annotations.SerializedName;
import com.hmazud.rumahsakit.Model.RsModel;

import java.util.List;

public class RsData {

    @SerializedName("status")
    String status;
    @SerializedName("message")
    String message;
    @SerializedName("data")
    List<RsModel> rsDataList;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public List<RsModel> getRsDataList() {
        return rsDataList;
    }
}


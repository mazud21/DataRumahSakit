package com.hmazud.rumahsakit.Model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class RsModel implements Parcelable {

    @SerializedName("hospital_id")
    private String hospital_id;
    @SerializedName("hospital_name")
    private String hospital_name;
    @SerializedName("hospital_category")
    private String hospital_category;
    @SerializedName("hospital_address")
    private String hospital_address;
    @SerializedName("hospital_email")
    private String hospital_email;
    @SerializedName("hospital_phone")
    private String hospital_phone;
    @SerializedName("hospital_district_id")
    private String hospital_district_id;
    @SerializedName("hospital_lat")
    private String hospital_lat;
    @SerializedName("hospital_lng")
    private String hospital_lng;
    @SerializedName("hospital_photo_enc")
    private String hospital_photo_enc;
    @SerializedName("hospital_photo_ori")
    private String hospital_photo_ori;

    @SerializedName("region")
    private String region;
    @SerializedName("hospital_district")
    private String hospital_district;

    @SerializedName("hospital_photo")
    private String hospital_photo;

    public String getHospital_id() {
        return hospital_id;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public String getHospital_category() {
        return hospital_category;
    }

    public String getHospital_address() {
        return hospital_address;
    }

    public String getHospital_email() {
        return hospital_email;
    }

    public String getHospital_phone() {
        return hospital_phone;
    }

    public String getHospital_district_id() {
        return hospital_district_id;
    }

    public String getHospital_lat() {
        return hospital_lat;
    }

    public String getHospital_lng() {
        return hospital_lng;
    }

    public String getHospital_photo_enc() {
        return hospital_photo_enc;
    }

    public String getHospital_photo_ori() {
        return hospital_photo_ori;
    }

    public String getRegion() {
        return region;
    }

    public String getHospital_district() {
        return hospital_district;
    }

    public String getHospital_photo() {
        return hospital_photo;
    }

    public RsModel(String hospital_id, String hospital_name, String hospital_category, String hospital_address, String hospital_email, String hospital_phone, String hospital_district_id, String hospital_lat, String hospital_lng, String hospital_photo_enc, String hospital_photo_ori, String region, String hospital_district, String hospital_photo) {
        this.hospital_id = hospital_id;
        this.hospital_name = hospital_name;
        this.hospital_category = hospital_category;
        this.hospital_address = hospital_address;
        this.hospital_email = hospital_email;
        this.hospital_phone = hospital_phone;
        this.hospital_district_id = hospital_district_id;
        this.hospital_lat = hospital_lat;
        this.hospital_lng = hospital_lng;
        this.hospital_photo_enc = hospital_photo_enc;
        this.hospital_photo_ori = hospital_photo_ori;
        this.region = region;
        this.hospital_district = hospital_district;
        this.hospital_photo = hospital_photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.hospital_id);
        dest.writeString(this.hospital_name);
        dest.writeString(this.hospital_category);
        dest.writeString(this.hospital_address);
        dest.writeString(this.hospital_email);
        dest.writeString(this.hospital_phone);
        dest.writeString(this.hospital_district_id);
        dest.writeString(this.hospital_lat);
        dest.writeString(this.hospital_lng);
        dest.writeString(this.hospital_photo_enc);
        dest.writeString(this.hospital_photo_ori);
        dest.writeString(this.region);
        dest.writeString(this.hospital_district);
        dest.writeString(this.hospital_photo);
    }

    protected RsModel(Parcel in) {
        this.hospital_id = in.readString();
        this.hospital_name = in.readString();
        this.hospital_category = in.readString();
        this.hospital_address = in.readString();
        this.hospital_email = in.readString();
        this.hospital_phone = in.readString();
        this.hospital_district_id = in.readString();
        this.hospital_lat = in.readString();
        this.hospital_lng = in.readString();
        this.hospital_photo_enc = in.readString();
        this.hospital_photo_ori = in.readString();
        this.region = in.readString();
        this.hospital_district = in.readString();
        this.hospital_photo = in.readString();
    }

    public static final Parcelable.Creator<RsModel> CREATOR = new Parcelable.Creator<RsModel>() {
        @Override
        public RsModel createFromParcel(Parcel source) {
            return new RsModel(source);
        }

        @Override
        public RsModel[] newArray(int size) {
            return new RsModel[size];
        }
    };
}

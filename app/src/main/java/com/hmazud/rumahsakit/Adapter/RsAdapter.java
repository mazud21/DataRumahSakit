package com.hmazud.rumahsakit.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.hmazud.rumahsakit.BuildConfig;
import com.hmazud.rumahsakit.DetailRs;
import com.hmazud.rumahsakit.Model.RsModel;
import com.hmazud.rumahsakit.R;

import java.util.List;

public class RsAdapter extends RecyclerView.Adapter<RsAdapter.ViewHolder> {
    private List<RsModel> rsDataList;
    private Context context;

    public RsAdapter(List<RsModel> rsDataList, Context context) {
        this.rsDataList = rsDataList;
        this.context = context;
    }

    @NonNull
    @Override
    public RsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rs_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RsAdapter.ViewHolder holder, final int position) {
        holder.namaRs.setText(rsDataList.get(position).getHospital_name());
        holder.telpRs.setText(rsDataList.get(position).getHospital_phone());
        holder.daerahRs.setText(rsDataList.get(position).getHospital_district());
        holder.daerahRs.setText(rsDataList.get(position).getHospital_district());

//        holder.imgRs.setImageBitmap(rsDataList.get(position).get);
        Glide.with(context)
                .load(rsDataList
                        .get(position)
                        .getHospital_photo())
        .into(holder.imgRs);

        holder.imgRs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RsModel rsModel = rsDataList.get(position);
                Intent intent = new Intent(context, DetailRs.class);
                intent.putExtra("data", rsModel);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return rsDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView namaRs, telpRs, daerahRs, regionRs;
        ImageView imgRs;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaRs = itemView.findViewById(R.id.namaRs);
            telpRs = itemView.findViewById(R.id.telpRs);
            daerahRs = itemView.findViewById(R.id.daerahRs);

            imgRs = itemView.findViewById(R.id.imgRs);
        }
    }
}
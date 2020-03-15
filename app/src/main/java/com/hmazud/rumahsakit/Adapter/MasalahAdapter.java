package com.hmazud.rumahsakit.Adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hmazud.rumahsakit.Model.MasalahModel;
import com.hmazud.rumahsakit.R;

import java.util.List;

public class MasalahAdapter extends RecyclerView.Adapter<MasalahAdapter.ViewHolder> {
    private List<MasalahModel> masalahDataList;

    public MasalahAdapter(List<MasalahModel> masalahDataList) {
        this.masalahDataList = masalahDataList;
    }

    @NonNull
    @Override
    public MasalahAdapter.ViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.masalah_list, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( MasalahAdapter.ViewHolder viewHolder, int i) {
        viewHolder.mTxtWilayah.setText(masalahDataList.get(i).getWilayah());
        viewHolder.mTxtHari.setText(masalahDataList.get(i).getHari());
        viewHolder.mTxtTanggal.setText(masalahDataList.get(i).getTanggal());
        viewHolder.mTxtEstimasi.setText(masalahDataList.get(i).getEstimasi());
        viewHolder.mTxtEstMulai.setText(masalahDataList.get(i).getEst_mulai());
        viewHolder.mTxtEstSelesai.setText(masalahDataList.get(i).getEst_selesai());
        viewHolder.mTxtKerusakan.setText(masalahDataList.get(i).getKerusakan());
        viewHolder.mTxtAlternatif.setText(masalahDataList.get(i).getAlternatif());
        viewHolder.mTxtPenanganan.setText(masalahDataList.get(i).getPenanganan());
    }

    @Override
    public int getItemCount() {
        return masalahDataList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTxtWilayah, mTxtHari, mTxtTanggal, mTxtEstimasi, mTxtEstMulai, mTxtEstSelesai, mTxtKerusakan, mTxtAlternatif, mTxtPenanganan;

        ViewHolder( View itemView) {
            super(itemView);
            mTxtWilayah = itemView.findViewById(R.id.txtNama);
            mTxtHari = itemView.findViewById(R.id.txtAlamat);
            mTxtTanggal = itemView.findViewById(R.id.txtNoHp);
            mTxtEstimasi = itemView.findViewById(R.id.txtEstimasi);
            mTxtEstMulai = itemView.findViewById(R.id.txtEstMulai);
            mTxtEstSelesai = itemView.findViewById(R.id.txtEstSelesai);
            mTxtKerusakan = itemView.findViewById(R.id.txtKerusakan);
            mTxtAlternatif = itemView.findViewById(R.id.txtAlternatif);
            mTxtPenanganan = itemView.findViewById(R.id.txtPenanganan);
        }
    }
}
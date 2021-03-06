package com.mango.autumnleaves.adapter.adapterdosen;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mango.autumnleaves.R;
import com.mango.autumnleaves.adapter.adaptermahasiswa.HistoryAdapter;
import com.mango.autumnleaves.model.Bap;
import com.mango.autumnleaves.model.History;
import com.mango.autumnleaves.ui.activity.dosen.DetailBapActivity;

import java.util.List;

public class BapAdapter extends RecyclerView.Adapter<BapAdapter.ViewHolder> {

    private Context mContext;
    private List<Bap> mData;

    public BapAdapter(Context mContext, List<Bap> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.list_bap_dosen,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tvBapTanggal.setText(mData.get(position).getWaktu());

        String matakuliah = mData.get(position).getMatakuliah();
        String ruangan = mData.get(position).getRuangan();
        String tanggal = mData.get(position).getWaktu();
        String waktu = mData.get(position).getJam();
        String materi = mData.get(position).getMateri();
        int JumlahMhs = mData.get(position).getJumlahMhs();
        int pertemuan = mData.get(position).getPertemuan();
        int hadir = mData.get(position).getHadir();
        int izin = mData.get(position).getIzin();
        int alfa = mData.get(position).getAlfa();
        int sakit = mData.get(position).getSakit();
        String kelas = mData.get(position).getKelas();
        String catatan = mData.get(position).getCatatan();
        String id = mData.get(position).getId();

        holder.BapLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DetailBapActivity.class);
                intent.putExtra("MATAKULIAH",matakuliah);
                intent.putExtra("RUANGAN",ruangan);
                intent.putExtra("TANGGAL",tanggal);
                intent.putExtra("WAKTU",waktu);
                intent.putExtra("MATERI",materi);
                intent.putExtra("PERTEMUAN",pertemuan);
                intent.putExtra("JUMLAHMHS",JumlahMhs);
                intent.putExtra("KELAS",kelas);
                intent.putExtra("HADIR",hadir);
                intent.putExtra("ALFA",alfa);
                intent.putExtra("SAKIT",sakit);
                intent.putExtra("IZIN",izin);
                intent.putExtra("CATATAN",catatan);
                intent.putExtra("ID_BAP", id);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvBapTanggal;
        LinearLayout BapLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvBapTanggal = itemView.findViewById(R.id.tvBapTanggal);
            BapLayout = itemView.findViewById(R.id.tableBap);
        }
    }
}

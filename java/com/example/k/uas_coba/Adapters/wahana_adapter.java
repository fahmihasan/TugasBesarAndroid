package com.example.k.uas_coba.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.k.uas_coba.Detail.DetailWahana;
import com.example.k.uas_coba.Models.WahanaModel;
import com.example.k.uas_coba.R;
import com.example.k.uas_coba.Rest.ApiClient;
import com.squareup.picasso.Picasso;

import java.util.List;

public class wahana_adapter extends RecyclerView.Adapter<wahana_adapter.ViewHolder>
{
    private  List<WahanaModel> mWahanaModel;
    private Context mContext;

    public wahana_adapter(List<WahanaModel> mWahanaModel, Context mContext)
    {
        this.mWahanaModel = mWahanaModel;
        this.mContext = mContext;
    }

    @Override
    public wahana_adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_wahana, parent, false);
        wahana_adapter.ViewHolder mViewHolder = new wahana_adapter.ViewHolder(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(wahana_adapter.ViewHolder holder, final int position)
    {
        Picasso.with(mContext).load(ApiClient.BASE_IMG+ mWahanaModel.get(position).getFoto_wahana()).into(holder.img);

        holder.img.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(mContext, DetailWahana.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.putExtra("nama_wahana", mWahanaModel.get(position).getNama_wahana());
                i.putExtra("deskripsi_wahana", mWahanaModel.get(position).getDeskripsi_wahana());
                i.putExtra("jadwal_wahana", mWahanaModel.get(position).getJadwal_wahana());
                i.putExtra("latitude_wahana", mWahanaModel.get(position).getLatitude_wahana());
                i.putExtra("longitude_wahana", mWahanaModel.get(position).getLongitude_wahana());
                i.putExtra("foto_wahana", mWahanaModel.get(position).getFoto_wahana());
                i.putExtra("poin_wahana", mWahanaModel.get(position).getPoin_wahana());
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mWahanaModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView img;

        public ViewHolder(View itemView)
        {
            super(itemView);
            img = itemView.findViewById(R.id.itemWahana_imgWahana);
        }
    }
}

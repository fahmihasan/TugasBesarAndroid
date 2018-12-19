package com.example.k.uas_coba.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.k.uas_coba.Detail.DetailEvent;
import com.example.k.uas_coba.Models.EventModel;
import com.example.k.uas_coba.R;
import com.example.k.uas_coba.Rest.ApiClient;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by k on 11/11/2018.
 */

public class event_adapter extends RecyclerView.Adapter<event_adapter.ViewHolder>
{
    private List<EventModel> mEvent;
    private Context mContext;

    public event_adapter(List<EventModel> mEvent, Context mContext) {
        this.mEvent = mEvent;
        this.mContext = mContext;
    }

    @Override
    public event_adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_event, parent, false);
        event_adapter.ViewHolder mViewHolder = new event_adapter.ViewHolder(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Picasso.with(mContext).load(ApiClient.BASE_IMG+mEvent.get(position).getFoto_event()).into(holder.img);

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mContext, DetailEvent.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.putExtra("nama_event", mEvent.get(position).getNama_event());
                i.putExtra("deskripsi_event", mEvent.get(position).getDeskripsi_event());
                i.putExtra("jadwal_event", mEvent.get(position).getJadwal_event());
                i.putExtra("foto_event", mEvent.get(position).getFoto_event());
                i.putExtra("poin_event", mEvent.get(position).getPoin_event());
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mEvent.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;

        public ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_itemEvent);
        }
    }
}

package com.example.capstona_a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class UserPhaseAdapter extends BaseAdapter{
    Context myContext = null;
    LayoutInflater myInflater = null;
    ArrayList<CMatch> CMatches;
    public UserPhaseAdapter(Context context, ArrayList<CMatch> data){
        myContext = context;
        CMatches = data;
        myInflater = LayoutInflater.from(myContext);
    }
    @Override
    public int getCount(){
        return CMatches.size();
    }
    @Override
    public long getItemId(int position)
    {
        return position;
    }
    @Override
    public CMatch getItem(int position)
    {
        return CMatches.get(position);
    }
    @Override
    public View getView(int position, View converView, ViewGroup parent)
    {
        View view = myInflater.inflate(R.layout.listview_userphase_single, null);
        ImageView imageView = (ImageView)view.findViewById(R.id.img_recordchamp);
        TextView champname=(TextView)view.findViewById(R.id.record_champ);
        TextView lane=(TextView)view.findViewById(R.id.record_lane);

        Glide.with(imageView).load(CMatches.get(position).getImgSrc()).into(imageView);
        champname.setText(CMatches.get(position).getChampName());
        lane.setText(CMatches.get(position).getLane());

        return view;

    }
}

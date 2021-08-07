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
    ArrayList<Match> match;
    public UserPhaseAdapter(Context context, ArrayList<Match> data){
        myContext = context;
        match = data;
        myInflater = LayoutInflater.from(myContext);
    }
    @Override
    public int getCount(){
        return match.size();
    }
    @Override
    public long getItemId(int position)
    {
        return position;
    }
    @Override
    public Match getItem(int position)
    {
        return match.get(position);
    }
    @Override
    public View getView(int position, View converView, ViewGroup parent)
    {
        View view = myInflater.inflate(R.layout.listview_userphase_single, null);
        ImageView imageView = (ImageView)view.findViewById(R.id.img_recordchamp);
        TextView champname=(TextView)view.findViewById(R.id.record_champ);
        TextView lane=(TextView)view.findViewById(R.id.record_lane);

        Glide.with(imageView).load(match.get(position).getImgSrc()).into(imageView);
        champname.setText(match.get(position).getChampion());
        lane.setText(match.get(position).getLane());

        return view;

    }
}

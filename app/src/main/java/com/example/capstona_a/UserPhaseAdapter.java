package com.example.capstona_a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class UserPhaseAdapter extends BaseAdapter{
    Context myContext = null;
    LayoutInflater myInflater = null;
    ArrayList<CMatch> Cmatch;
    public UserPhaseAdapter(Context context, ArrayList<CMatch> data){
        myContext = context;
        Cmatch = data;
        myInflater = LayoutInflater.from(myContext);
    }
    @Override
    public int getCount(){
        return Cmatch.size();
    }
    @Override
    public long getItemId(int position)
    {
        return position;
    }
    @Override
    public CMatch getItem(int position)
    {
        return Cmatch.get(position);
    }
    @Override
    public View getView(int position, View converView, ViewGroup parent)
    {
        View view = myInflater.inflate(R.layout.listview_userphase_single, null);
        ImageView imageView = (ImageView)view.findViewById(R.id.img_recordchamp);
        TextView champname=(TextView)view.findViewById(R.id.name_champ);
        TextView kda=(TextView)view.findViewById(R.id.record_kda);
        TextView average = (TextView)view.findViewById(R.id.record_average);
        ImageView item1=(ImageView)view.findViewById(R.id.Item1);
        ImageView item2=(ImageView)view.findViewById(R.id.Item2);
        ImageView item3=(ImageView)view.findViewById(R.id.Item3);
        ImageView item4=(ImageView)view.findViewById(R.id.Item4);
        ImageView item5=(ImageView)view.findViewById(R.id.Item5);
        ImageView item6=(ImageView)view.findViewById(R.id.Item6);
        TextView gameduration=(TextView)view.findViewById(R.id.gameDuration);


        Glide.with(imageView).load(Cmatch.get(position).getImgSrc()).into(imageView);
        champname.setText(Cmatch.get(position).getChampName());
        //kda.setText(" "+ Cusprintdata.get(position).getKill().toString()+" / "+Cusprintdata.get(position).getDeaths().toString()+" / "+Cusprintdata.get(position).getAssist().toString());
        //average.setText(" "+Cusprintdata.get(position).getAverage().toString());
        //Glide.with(item1).load("https://ddragon.leagueoflegends.com/cdn/10.11.1/img/item/"+Cusprintdata.get(position).getItem1().toString()+".png");
        //Glide.with(item2).load("https://ddragon.leagueoflegends.com/cdn/10.11.1/img/item/"+Cusprintdata.get(position).getItem2().toString()+".png");
        //Glide.with(item3).load("https://ddragon.leagueoflegends.com/cdn/10.11.1/img/item/"+Cusprintdata.get(position).getItem3().toString()+".png");
        //Glide.with(item4).load("https://ddragon.leagueoflegends.com/cdn/10.11.1/img/item/"+Cusprintdata.get(position).getItem4().toString()+".png");
        //Glide.with(item5).load("https://ddragon.leagueoflegends.com/cdn/10.11.1/img/item/"+Cusprintdata.get(position).getItem5().toString()+".png");
        //Glide.with(item6).load("https://ddragon.leagueoflegends.com/cdn/10.11.1/img/item/"+Cusprintdata.get(position).getItem6().toString()+".png");
//        int Duration=Cusprintdata.get(position).getGameDuration().intValue();
//        int HourDuration=Duration/100;
//        int MinuteDuration=Duration%100;
//        gameduration.setText(Integer.toString(HourDuration)+"분 "+Integer.toString(MinuteDuration)+"초");

        return view;

    }
}

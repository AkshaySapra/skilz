package com.example.micha_000.skilz;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SearchResults extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] user;
    private final String[] cost;
    private final String[] score;
    private final Integer[] imageId;
    public SearchResults(Activity context,String[] user, Integer[] imageId, String[] cost, String[] score)
    {
        super(context,R.layout.single_listview_layout,user);
        this.context = context;
        this.user = user;
        this.imageId = imageId;
        this.cost = cost;
        this.score = score;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.single_listview_layout,null,true);
        TextView usertxtTitle = (TextView) rowView.findViewById(R.id.User_id);
        TextView costTxtTitle = (TextView) rowView.findViewById(R.id.Point_Cost);
        TextView scoreTxtTitle = (TextView) rowView.findViewById(R.id.Score);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.User_Picture);
        usertxtTitle.setText(user[position]);
        costTxtTitle.setText(cost[position]);
        scoreTxtTitle.setText(score[position]);

        imageView.setImageResource(imageId[position]);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);

        return rowView;
    }

}

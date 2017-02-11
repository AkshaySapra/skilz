package com.example.micha_000.skilz;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by James on 2/11/2017.
 */

public class skill_i_have extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] skills;

    public skill_i_have(Activity context, String[] skills)
    {
        super(context,R.layout.skills_i_have,skills);
        this.context = context;
        this.skills = skills;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowview = inflater.inflate(R.layout.skills_i_have,null,true);
        TextView skills_title = (TextView) rowview.findViewById(R.id.Myskill);
        skills_title.setText(skills[position]);
        return rowview;
    }


}

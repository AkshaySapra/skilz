package com.example.micha_000.skilz;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by James on 2/11/2017.
 */

public class settings extends AppCompatActivity {

   ListView list;
    String[] skills = {

    "UNDERWATER BASKETWEAVING",

            "Housekeeping",
            "Gardening",
            "Cooking",
            "Cleaning",
            "Language",
            "Arduino",
            "Coding",
            "musical instruments",
            "canvas painting",
            "Tap Dancing",
            "Sports",
            "IT Solutions",
            "Caligraphy",
            "Taxes",
            "Rock Climbing",
            "Nutrition",
            "knitting",
            "singing"

};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

    skill_i_have adapter = new skill_i_have(settings.this,skills);
        list = (ListView) findViewById(R.id.listedskills);
        list.setAdapter(adapter);

    }



}

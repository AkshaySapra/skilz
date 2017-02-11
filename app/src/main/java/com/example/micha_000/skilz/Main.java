package com.example.micha_000.skilz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    ListView list;
    String[] web = {
            "Erik",
            "Pav",
    };

    Integer[] imageId = {
            R.drawable.erik,
            R.drawable.pav
    };
    String[] score = {
            "45",
            "66"
    };
    String[] cost = {
            "5",
            "7"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        SearchResults adapter = new SearchResults(Main.this,web,imageId,cost,score);
        list = (ListView)findViewById(R.id.list);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                    Toast.makeText(Main.this,"You Clicked at " +web[ + position],Toast.LENGTH_SHORT).show();
                }
            });

    }
}

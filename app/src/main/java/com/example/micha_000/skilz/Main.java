package com.example.micha_000.skilz;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ToolbarWidgetWrapper;
=======
import android.util.Log;
>>>>>>> b5805afa09fbe66950f563f3ba2a11bd37b1639d
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
<<<<<<< HEAD
import android.view.Window;
import android.view.WindowManager;
=======
import android.widget.AdapterView;
>>>>>>> b5805afa09fbe66950f563f3ba2a11bd37b1639d
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Arrays;

public class Main extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        ListView lv = (ListView)findViewById(R.id.listViewCountry);
        ArrayList<String> arrayCountry = new ArrayList<>();
        arrayCountry.addAll(Arrays.asList(getResources().getStringArray(R.array.array_skills)));

        adapter = new ArrayAdapter<>(
                Main.this,
                android.R.layout.simple_list_item_1,
                arrayCountry);
        lv.setAdapter(adapter);


        Button button = (Button) findViewById(R.id.Settings_button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
             Intent i = new Intent(getApplicationContext(),settings.class);
                startActivity(i);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("listener","this is listener");
                   Intent myIntent = new Intent (getApplicationContext(),searchresultsmain.class);
                   startActivity(myIntent);


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);
        MenuItem item = menu.findItem(R.id.menuSearch);
        Log.i("listener","this is listener");
        SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);

                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }
}

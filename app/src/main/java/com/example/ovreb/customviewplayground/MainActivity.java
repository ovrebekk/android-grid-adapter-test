package com.example.ovreb.customviewplayground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) findViewById(R.id.listViewMain);
        String[] values = new String[]{"1 - Ballemann", "2 - Ostemann", "3 - Penispakke", "4 - Kameldrager"};

        TooObjectManager myObjectManager = new TooObjectManager();
        myObjectManager.add(new TooObject("Test", "Balletest", 0));
        myObjectManager.add(new TooObject("More", "More testing here", 1));
        myObjectManager.add(new TooObject("Me be", "Important question", 2));
        myObjectManager.add(new TooObject("testing stuff", "many people say...", 3));

        final TooArrayAdapter adapter = new TooArrayAdapter(getApplicationContext(), myObjectManager);
        listView.setAdapter(adapter);
    }
}

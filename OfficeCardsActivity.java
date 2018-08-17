/*
 Raylph Evangelista
 revange9@my.smccd.edu
 CIS 135OL
 OfficeCardsActivity.java

 This file is the main activity file. It will be used to actually launch the app on the emulator or
 device. This file will be in charge of dealing with the recyclerView, adapter and the collapsing
 tool bar. Since this is the main activity file, this is where it is programmed that when scrolling
 back up from the bottom, the color of the collapsing tool bar will be the color cyan. Also it is
 important to note that this is a using a menu format, however I deleted the call to inflate the
 menu since it is not needed.

 Assignment #4
 4/6/18
*/

package com.evangelista.officecards;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.design.widget.CollapsingToolbarLayout;
import android.graphics.Color;

import java.util.ArrayList;

public class OfficeCardsActivity extends AppCompatActivity
{
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    private ArrayList<Employee> mEmployeeList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_cards);

        CollapsingToolbarLayout collapsingToolbarLayout =
            (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setContentScrimColor(Color.CYAN);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(mEmployeeList);
        recyclerView.setAdapter(adapter);
    }
}

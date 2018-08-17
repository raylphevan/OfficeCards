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

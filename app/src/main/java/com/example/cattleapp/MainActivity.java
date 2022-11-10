package com.example.cattleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;
    private SearchView searchView;
    ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        searchView = findViewById(R.id.searchView);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
                return false;
            }
        });
    }

    private void filterList(String text) {
        List<ListElement> filteredList = new ArrayList<>();
        for (ListElement item : elements){
            if (item.getName().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
            if(!filteredList.isEmpty()){
                listAdapter.setFilteredList(filteredList);
            }

        }
    }

    public void init() {
        elements = new ArrayList<>();
        elements.add(new ListElement("1", "ES477845781479", "lago"));
        elements.add(new ListElement("2", "ES477845780274", "lago"));
        elements.add(new ListElement("3", "ES477845786018", "lago"));
        elements.add(new ListElement("4", "ES477845787354", "lago"));
        elements.add(new ListElement("5", "ES477845785845", "lago"));
        elements.add(new ListElement("6", "ES477845785012", "lago"));
        elements.add(new ListElement("7", "ES477845787610", "lago"));
        elements.add(new ListElement("8", "ES477845782154", "lago"));
        elements.add(new ListElement("9", "ES477845785781", "lago"));
        elements.add(new ListElement("10", "ES477845784154", "lago"));
        elements.add(new ListElement("11", "ES477845788420", "lago"));
        elements.add(new ListElement("12", "No eartag", "lago"));
        elements.add(new ListElement("Abel", "ES477845781479", "lago"));

        listAdapter = new ListAdapter(elements, this, new ListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ListElement item) {
                moveToDescription(item);
            }
        });
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);


    }
    public void moveToDescription(ListElement item) {
        Intent intent = new Intent(this, DescriptionActivity.class);
        intent.putExtra("ListElement", item);
        startActivity(intent);
    }
}
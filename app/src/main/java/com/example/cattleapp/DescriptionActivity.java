package com.example.cattleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    TextView ageDescriptionTextView;
    TextView genderDescriptionTextView;
    TextView raceDescriptionTextView;
    TextView motherDescriptionTextView;
    TextView fatherDescriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        ListElement element = (ListElement) getIntent().getSerializableExtra("ListElement");
        ageDescriptionTextView = findViewById(R.id.ageDescriptionTextView);
        genderDescriptionTextView = findViewById(R.id.genderDescriptionTextView);
        raceDescriptionTextView = findViewById(R.id.raceDescriptionTextView);
        motherDescriptionTextView = findViewById(R.id.motherDescriptionTextView);
        fatherDescriptionTextView = findViewById(R.id.fatherDescriptionTextView);

        // titleDescriptionTextView.setText(element.getname());
        ageDescriptionTextView.setText("Edad: 8 años");
        genderDescriptionTextView.setText("Sexo: Hembra");
        raceDescriptionTextView.setText("Raza: Salers");
        motherDescriptionTextView.setText("Madre: ES477845787354");
        fatherDescriptionTextView.setText("Padre: Abel");
    }
}
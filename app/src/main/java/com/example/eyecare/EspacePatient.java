package com.example.eyecare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EspacePatient extends AppCompatActivity {
    CardView projectionGrainsMeule;
    CardView ProjectionSoluté;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espace_patient);

        projectionGrainsMeule = findViewById(R.id.Projection_grains_meule);
        projectionGrainsMeule.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EspacePatient.this ,ProjectionGrainsMeule.class));
            }
        });
        ProjectionSoluté = findViewById(R.id.Projection_soluté);
        ProjectionSoluté.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EspacePatient.this ,ProjectionSolute.class));
            }
        });
    }
}
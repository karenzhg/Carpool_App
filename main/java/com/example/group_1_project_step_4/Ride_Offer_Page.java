package com.example.group_1_project_step_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ride_Offer_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ride_offer);
    }
    public void message1(View view){
        Intent intent = new Intent(this, Ride_Offer_Menu_Page.class);
        startActivity(intent);

    }
}
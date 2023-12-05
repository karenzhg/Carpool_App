package com.example.group_1_project_step_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Message_Text_Page extends AppCompatActivity {

    private int request = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_text);
    }
    public void completeRide(View view) {
        Intent intent;
        if (request == 1) {
            intent = new Intent(this, Complete_Offer_Page.class);
            startActivity(intent);
        } else {
            intent = new Intent(this, Complete_Rider_Page.class);
            startActivity(intent);
        }

    }
}
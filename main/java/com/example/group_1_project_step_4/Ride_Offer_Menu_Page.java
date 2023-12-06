package com.example.group_1_project_step_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testingfirebase.R;

public class Ride_Offer_Menu_Page extends AppCompatActivity {

    private TextView username, pick_up, drop_off, departure_time, num_passenger, gender_pref, car_pref, smoking_pref;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ride_offer_menu);

        username = findViewById(R.id.username_text);
        pick_up = findViewById(R.id.pick_up_text);
        drop_off = findViewById(R.id.drop_off_text);
        departure_time = findViewById(R.id.departure_time_text);
        num_passenger = findViewById(R.id.num_pass_text);
        gender_pref = findViewById(R.id.gender_pref_text);
        car_pref = findViewById(R.id.car_pref_text);
        smoking_pref = findViewById(R.id.smoking_pref_text);

        String username_db = "subaru";
        String pick_up_db = "UBCO";
        String drop_off_db = "OK college";
        String departure_time_db = "20:00:00";
        String num_passenger_db = "2";
        String gender_pref_db = "any";
        String car_pref_db = "SUV";
        String smoking_pref_db = "non-smoking";

        username.setText(username_db);
        pick_up.setText(pick_up_db);
        drop_off.setText(drop_off_db);
        departure_time.setText(departure_time_db);
        num_passenger.setText(num_passenger_db);
        gender_pref.setText(gender_pref_db);
        car_pref.setText(car_pref_db);
        smoking_pref.setText(smoking_pref_db);
    }
    public void accept (View view){
        Intent intent = new Intent(this, Message_Page.class);
        Bundle bundle = new Bundle();
        bundle.putInt("request", 2);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void deny (View view){
        Intent intent = new Intent(this, Ride_Offer_Page.class);
        startActivity(intent);
    }
    public void back (View view){
        finish();
    }
    public void account (View view){
        Intent intent = new Intent(this, Account_Page.class);
        startActivity(intent);
    }
    public void home (View view){
        Intent intent = new Intent(this, Main_Page.class);
        startActivity(intent);
    }
    public void search_ride (View view){
        Intent intent = new Intent(this, Request_Page.class);
        startActivity(intent);
    }
    public void payment (View view){
        Intent intent = new Intent(this, Account_Payment_Info_Page.class);
        startActivity(intent);
    }
    public void message (View view){
        Intent intent = new Intent(this, Message_Page.class);
        startActivity(intent);
    }
}

package com.example.group_1_project_step_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ride_Request_Page extends AppCompatActivity {
    private EditText current_location;
    private EditText destination;
    private EditText date_time;
    private TextView num_passenger;
    private RadioGroup gender_pref;
    private RadioGroup smoking_pref;
    private RadioGroup car_pref;
    private int num_pass = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ride_request);

        current_location = findViewById(R.id.current_location_text);
        destination = findViewById(R.id.destination_text);
        date_time = findViewById(R.id.date_time_text);
        num_passenger = findViewById(R.id.num_passenger);
        gender_pref = findViewById(R.id.gender_pref_radio);
        smoking_pref = findViewById(R.id.smoking_preference_radio);
        car_pref = findViewById(R.id.car_preference_radio);
    }
    public void minus_passenger_button (View view){
        if (num_pass > 0)
            num_pass--;
        num_passenger.setText(num_pass);
    }
    public void add_passenger_button (View view){
        num_pass++;
        num_passenger.setText(num_pass);
    }
    public void current_location (View view){

    }
    public void destination (View view){

    }
    public void date_time (View view){

    }
    public void submit (View view){
        Intent intent = new Intent(this, Account_Payment_Info_Page.class);
        Bundle bundle = new Bundle();

        bundle.putString("current_location", current_location.toString());
        bundle.putString("destination", destination.toString());
        bundle.putString("date_timed", date_time.toString());
        bundle.putString("num_passenger", num_passenger.toString());
        bundle.putString("gender", gender_pref.toString());
        bundle.putString("smoking", smoking_pref.toString());
        bundle.putString("car_pref", car_pref.toString());

        intent.putExtras(bundle);
        startActivity(intent);
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
        Intent intent = new Intent(this, Ride_Request_Page.class);
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

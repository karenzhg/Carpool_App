package com.example.group_1_project_step_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Request_Page extends AppCompatActivity {
    private EditText current_location, destination, date_time;
    private String from, to, departAt;
    private TextView num_passenger;
    private int numPassenger;
    private RadioGroup gender_pref, smoking_pref, car_pref;
    private RadioButton gender_prf, smoking_prf, car_prf;
    String gender, smoke, car;
    private int num_pass = 0;
    private int requestNum;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        // 1 creates a ride request and 2 creates a offer request
        requestNum = bundle.getInt("request");

        current_location = findViewById(R.id.current_location_text);
        destination = findViewById(R.id.destination_text);
        date_time = findViewById(R.id.date_time_text);
        num_passenger = findViewById(R.id.num_passenger_text);
        gender_pref = findViewById(R.id.gender_pref_radio);
        smoking_pref = findViewById(R.id.smoking_preference_radio);
        car_pref = findViewById(R.id.car_preference_radio);
    }
    public void minus_passenger_button (View view){
        if (num_pass > 0)
            num_pass--;
        num_passenger.setText(String.valueOf(num_pass));
    }
    public void add_passenger_button (View view){
        num_pass++;
        num_passenger.setText(String.valueOf(num_pass));
    }
    public boolean checkLocation (String location) {
        if (location.isEmpty())
            return false;
        else
            return true;
    }
    public boolean checkDateTime (String datetime) {
        if (datetime.isEmpty())
            return false;
        else {

            return true;
        }
    }
    public boolean checkRadioButton (RadioButton radio_button){
        try {
            if (radio_button != null && radio_button.isChecked())  // gender selected
                return true;
            else                                                 // gender not selected
                return false;
        } catch (Exception e) {

        }
        return false;
    }
    public void toastMessage(String message) {
        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(this /* MyActivity */, text, duration);
        toast.show();
    }
    public void submit (View view){
        from = current_location.getText().toString();
        to = destination.getText().toString();
        departAt = date_time.getText().toString();
        numPassenger = Integer.parseInt(num_passenger.getText().toString());

        int selectedId = gender_pref.getCheckedRadioButtonId();
        try {
            gender_prf = findViewById(selectedId);
            gender = gender_prf.getText().toString();
        } catch (Exception e) {

        }

        selectedId = smoking_pref.getCheckedRadioButtonId();
        try {
            smoking_prf = findViewById(selectedId);
            smoke = smoking_prf.getText().toString();
        } catch (Exception e) {

        }

        selectedId = car_pref.getCheckedRadioButtonId();
        try {
            car_prf = findViewById(selectedId);
            car = car_prf.getText().toString();
        } catch (Exception e) {

        }

        int error = 0;
        if (!checkLocation(from)) {
            error = 0;
            toastMessage("Please enter your current location");
            error++;
        } else if (!checkLocation(to)) {
            error = 0;
            toastMessage("Please enter your destination");
            error++;
        } else if (!checkDateTime(departAt)) {
            error = 0;
            toastMessage("Please enter a depart date and time");
            error++;
        } else if (numPassenger <= 0) {
            toastMessage("Please select a number of passengers");
            error++;
        } else if (!checkRadioButton(gender_prf)) {
            error = 0;
            toastMessage("Please select a gender preference");
            error++;
        } else if (!checkRadioButton(smoking_prf)) {
            error = 0;
            toastMessage("Please select a smoking preference");
            error++;
        } else if (!checkRadioButton(car_prf)) {
            error = 0;
            toastMessage("Please select a car type");
            error++;
        }

        if(error < 1) {
            Intent intent;
            if (requestNum == 1){
                intent= new Intent(this, Order_Summary_Page.class);
            } else{
                intent = new Intent(this, Ride_Offer_Page.class);
            }

            Bundle bundle = new Bundle();
            bundle.putString("from", from);
            bundle.putString("to", to);
            bundle.putString("departAt", departAt);
            bundle.putInt("numPassenger", numPassenger);
            bundle.putString("gender", gender);
            bundle.putString("smoking", smoke);
            bundle.putString("car", car);

            intent.putExtras(bundle);
            startActivity(intent);
        }

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

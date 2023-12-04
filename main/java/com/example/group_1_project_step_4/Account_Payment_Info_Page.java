package com.example.group_1_project_step_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Account_Payment_Info_Page extends AppCompatActivity {
    private Spinner spinner;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_payment_info);

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.creditArray, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter1);
    }
    public void submit(View view) {
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

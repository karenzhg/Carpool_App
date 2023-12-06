package com.example.group_1_project_step_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Complete_Offer_Page extends AppCompatActivity {

    private int confirm_code;
    private EditText code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complete_offer);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        confirm_code = bundle.getInt("random");

        code = findViewById(R.id.code);
    }
    public void submit (View view) {

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
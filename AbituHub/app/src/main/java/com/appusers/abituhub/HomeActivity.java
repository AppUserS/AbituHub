package com.appusers.abituhub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity{
    Button button;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id. button2);
    }

    public void setButtonClick(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void setButton2Click(View view){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}

package com.example.tranh.studentapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tranh.studentapp.R;


public class StartActivity extends AppCompatActivity {
    public Button btStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        setupUI();
        preferences();
    }

    private void setupUI() {
        btStart = (Button) this.findViewById(R.id.bt_Start);
    }


    private void preferences() {
        btStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoActivity();
            }
        });
    }

    private void gotoActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

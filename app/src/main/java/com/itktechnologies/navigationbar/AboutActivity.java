package com.itktechnologies.navigationbar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    TextView Disclaimer;
    TextView WhatIsDepression;
    TextView SelfGuide;
    Button LogoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Disclaimer = findViewById(R.id.InfoDisclaimer);
        WhatIsDepression = findViewById(R.id.definedepression);
        SelfGuide = findViewById(R.id.selfguide);
        LogoutBtn = findViewById(R.id.btnlogout);


        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }

    public void browser1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nimh.nih.gov/health/publications/depression/index.shtml#pub6"));
        startActivity(browserIntent);
    }

    public void browser2(View view) {
        Intent browser2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.moodjuice.scot.nhs.uk/depression.asp"));
        startActivity(browser2Intent);
    }
}
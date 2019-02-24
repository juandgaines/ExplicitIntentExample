package com.mytechideas.explicitintentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();

        if(intent!=null){
            String textFromMainActivity=intent.getStringExtra("key_contact");
            Log.d(DetailsActivity.class.getSimpleName(),"The data from intent is:" +textFromMainActivity);
        }
    }
}

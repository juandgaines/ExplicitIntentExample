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

        //TODO 16: save and get the incoming intent with the getIntent method
        Intent intent = getIntent();

        //TODO 17: Check if the intent is different from null
            //TODO 18: If the intent is valid, you can extract the data
            //TODO 19: Log the result of the incoming data
        if(intent!=null){
            String textFromMainActivity=intent.getStringExtra("key_contact");
            Log.d(DetailsActivity.class.getSimpleName(),"The data from intent is:" +textFromMainActivity);
        }
    }
}

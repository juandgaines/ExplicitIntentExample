package com.mytechideas.explicitintentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

//TODO 9: Implement the the OnClickAdapter interface in the MainActivityClass

public class MainActivity extends AppCompatActivity implements MyAdapter.OnClickAdapter {

    private static final String KEY_CONTACT ="key_contact" ;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        recyclerView.setHasFixedSize(true);

        String [] myDataset={"Contact 0","Contact 1","Contact 2","Contact 3","Contact 4","Contact 5","Contact 6","Contact 7","Contact 8","Contact 9","Contact 10","Contact 11","Contact 12","Contact 13","Contact 14","Contact 15"};

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        //TODO 10: Pass the MainActivity context to the adapter as a second parameter.
        mAdapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);
    }

    //TODO 11: Cast the view to a TextView and save it on a TexView variable
    //TODO 12: Get the string from the TextView and save it into a String object.

    //TODO 13: Create a new Intent variable named intent and pass the MainActivity.this as a first parameter and the activity
    //we want to call as a second parameter (DetailsActivity.class).
    //TODO 14: Add the extra data to the intent that we would share to the second activity using the constant field KEY_CONTACT.
    //TODO 15: call startActivity() method and pass the intent variable as a parameter.

}

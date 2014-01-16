package com.michaelfoget.mfogetlab1_1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MfogetLab1_1Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mfoget_lab1_1, menu);
        return true;
    }
    
}

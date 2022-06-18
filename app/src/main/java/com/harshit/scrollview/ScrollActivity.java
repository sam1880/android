package com.harshit.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ScrollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
    }
    CharSequence text = "hello this is a toast";
    int duration = Toast.LENGTH_LONG;

    public void onClickToastMessage(View view){

        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
    }
}
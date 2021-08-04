package com.example.profilebadgeact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSometing(View view) {
        switch (view.getId()){

            case R.id.button:
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/"));
                startActivity(i1);
                break;

            case R.id.button2:
                Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ph.linkedin.com/"));
                startActivity(i2);
                break;

            case R.id.button3:
                Intent i3 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/gconsolacion1/"));
                startActivity(i3);
                break;

            case R.id.button4:
                Intent i4 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/"));
                startActivity(i4);
                break;
        }
    }
}
package com.example.nttr.showimageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeImageButton = (Button) findViewById(R.id.change_image);

        changeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView musubiImage = (ImageView) findViewById(R.id.musubi);
                musubiImage.setImageResource(R.drawable.musubi2);
            }
        });
    }
}

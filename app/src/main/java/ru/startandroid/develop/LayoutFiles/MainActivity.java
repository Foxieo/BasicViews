package ru.startandroid.develop.LayoutFiles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.startandroid.p0041basicviews.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
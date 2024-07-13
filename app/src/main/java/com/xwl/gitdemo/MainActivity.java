package com.xwl.gitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.concurrent.locks.ReentrantLock;

public class MainActivity extends AppCompatActivity {
    ReentrantLock
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TAG","第一次提交");
    }
}
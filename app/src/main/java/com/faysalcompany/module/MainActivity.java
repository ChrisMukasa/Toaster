package com.faysalcompany.module;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.chris.mukasa.toastlibrary.Toaster;


public class MainActivity extends AppCompatActivity
{
    private Toaster toaster = new Toaster();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}

package com.example.fragmenttransaction29072019;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.MediatorLiveData;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity{

    FragmentManager fragmentManager = getSupportFragmentManager();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addAndroid(View view) {
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        AndroidFragment androidFragment =  new AndroidFragment();
        fragmentTransaction.add(R.id.liearlayoutContainer,androidFragment);
        fragmentTransaction.commit();
    }

    public void addIos(View view) {
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        IosFragment iosFragment =  new IosFragment();
        fragmentTransaction.add(R.id.liearlayoutContainer,iosFragment);
        fragmentTransaction.commit();
    }
}
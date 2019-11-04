package com.example.fragmenttransaction29072019;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.MediatorLiveData;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
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
        fragmentTransaction.add(R.id.liearlayoutContainer,androidFragment,"fragment_android");
        fragmentTransaction.addToBackStack("android");
        fragmentTransaction.commit();
    }

    public void addIos(View view) {
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        IosFragment iosFragment =  new IosFragment();
        fragmentTransaction.add(R.id.liearlayoutContainer,iosFragment,"fragment_ios");
        fragmentTransaction.addToBackStack("ios");
        fragmentTransaction.commit();
    }

    public void replaceAndroid(View view) {
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        AndroidFragment androidFragment =  new AndroidFragment();
        fragmentTransaction.replace(R.id.liearlayoutContainer,androidFragment);
        fragmentTransaction.commit();
    }

    public void replaceIos(View view) {
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        IosFragment iosFragment =  new IosFragment();
        fragmentTransaction.replace(R.id.liearlayoutContainer,iosFragment);
        fragmentTransaction.commit();

    }

    public void removeAndroid(View view) {
        AndroidFragment androidFragment = (AndroidFragment) getSupportFragmentManager().findFragmentByTag("fragment_android");
        if (androidFragment != null){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(androidFragment);
            fragmentTransaction.commit();
        }
    }

    public void removeIos(View view) {
        IosFragment iosFragment = (IosFragment) getSupportFragmentManager().findFragmentByTag("fragment_android");
        if (iosFragment != null){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(iosFragment);
            fragmentTransaction.commit();
        }

    }

    public void popBackstack(View view) {
        fragmentManager.popBackStack( );
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (fragmentManager.executePendingTransactions()){
                    if (fragmentManager.getFragments().size() == 0){
                        finish();
                    }
                }else {
                    this.run();
                }
            }
        });
    }

    public void detach(View view) {
        AndroidFragment androidFragment = (AndroidFragment) getSupportFragmentManager().findFragmentByTag("fragment_android");
        if (androidFragment != null){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.detach(androidFragment);
            fragmentTransaction.commit();
        }
    }

    public void attach(View view) {
        AndroidFragment androidFragment = (AndroidFragment) getSupportFragmentManager().findFragmentByTag("fragment_android");
        if (androidFragment != null){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.attach(androidFragment);
            fragmentTransaction.commit();
        }
    }
}
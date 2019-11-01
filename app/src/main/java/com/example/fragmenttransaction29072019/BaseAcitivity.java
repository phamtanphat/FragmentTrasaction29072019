package com.example.fragmenttransaction29072019;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public abstract class BaseAcitivity extends AppCompatActivity implements LifecycleOwner {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getLayout());
        init();
        mapview();
        event();
        observerViewmodel();
        destroyviewModel();

    }


    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    protected abstract void destroyviewModel();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    protected abstract void observerViewmodel();

    protected abstract int getLayout();

    protected abstract void event();

    protected abstract void mapview();

    protected abstract void init();

}

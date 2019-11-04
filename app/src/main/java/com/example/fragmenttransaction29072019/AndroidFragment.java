package com.example.fragmenttransaction29072019;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.CalendarContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidFragment extends Fragment {


    View view;
    FrameLayout frameLayout;

    public AndroidFragment() {
        // Required empty public constructor
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("BBB","Android fragment :  onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BBB","Android fragment : onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("BBB","Android fragment : onCreateView");
        view = inflater.inflate(R.layout.fragment_android, container, false);
        frameLayout = view.findViewById(R.id.frameLayout);
        frameLayout.setBackgroundColor(Color.rgb(
                new Random().nextInt(255) ,
                new Random().nextInt(255),
                new Random().nextInt(255)
        ));
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("BBB","Android fragment : onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("BBB","Android fragment : onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("BBB","Android fragment : onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("BBB","Android fragment : onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("BBB","Android fragment : onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("BBB","Android fragment : onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Android fragment : onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("BBB","Android fragment : onDetach");
    }
}

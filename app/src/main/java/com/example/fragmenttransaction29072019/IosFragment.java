package com.example.fragmenttransaction29072019;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class IosFragment extends Fragment {


    public IosFragment() {
        // Required empty public constructor
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("BBB","Ios fragment :  onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BBB","Ios fragment :  onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("BBB","Ios fragment :  onCreateView");
        return inflater.inflate(R.layout.fragment_ios, container, false);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("BBB","Ios fragment :  onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("BBB","Ios fragment :  onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("BBB","Ios fragment :  onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("BBB","Ios fragment :  onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("BBB","Ios fragment :  onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("BBB","Ios fragment :  onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Ios fragment :  onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("BBB","Ios fragment :  onDetach");
    }

}

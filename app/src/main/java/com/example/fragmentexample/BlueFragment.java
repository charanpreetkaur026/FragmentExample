package com.example.fragmentexample;


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
public class BlueFragment extends Fragment {
    private static final String fragmentTag = "Tag Blue Fragment";

    public BlueFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blue, container, false);
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(fragmentTag, "onAttach invoked");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(fragmentTag, "onCreate invoked");

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e(fragmentTag, "onViewCreated  invoked");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(fragmentTag, "onActivityCreated invoked");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(fragmentTag, "onStart invoked");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(fragmentTag, "onResume invoked");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(fragmentTag, "onPause invoked");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(fragmentTag, "onStop invoked");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(fragmentTag, "onDestroyView invoked");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(fragmentTag, "onDestroy invoked");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(fragmentTag, "onDetach invoked");
    }

}

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
import android.widget.Button;



public class RedFragment extends Fragment  {
    private static final String fragmentTag = "Tag Red Fragment";
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Button btnRed;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public RedFragment() {
        // Required empty public constructor
    }



    public static RedFragment newInstance(String param1, String param2) {
        RedFragment fragment = new RedFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.e(fragmentTag,"onCreate invoked");
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e(fragmentTag,"onCreateView invoked");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_red, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(String str) {
        if (mListener != null) {
            mListener.onFragmentInteraction(str);
        }
    }

    @Override
    public void onAttach(Context context) {
        Log.e(fragmentTag,"onAttach invoked");
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        Log.e(fragmentTag,"onViewCreated invoked");
        super.onViewCreated(view, savedInstanceState);
        // Get the ids of views here
////        btnRed = view.findViewById(R.id.btnSelector);
//        btnRed.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onButtonPressed("Hello from RED");
//            }
//        });

    }

    @Override
    public void onStart() {
        Log.e(fragmentTag,"onStart invoked");
        super.onStart();
    }

    @Override
    public void onPause() {
        Log.e(fragmentTag,"onPause invoked");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e(fragmentTag,"onStop invoked");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.e(fragmentTag,"onDestroy invoked");
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        Log.e(fragmentTag,"onDestroyView invoked");
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        Log.e(fragmentTag,"onDetach invoked");
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(String uri);

        void onClick(View v);
    }
}

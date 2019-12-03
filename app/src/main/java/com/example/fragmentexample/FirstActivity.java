package com.example.fragmentexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity implements RedFragment.OnFragmentInteractionListener {

    private TextView txtTitle;
    private static final String firstActivityTag = " Tag First Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //1
        Log.d(firstActivityTag,"onCreate invoked");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTitle = findViewById(R.id.txtMainTitle);


    }
    //2
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(firstActivityTag,"onStart invoked");
    }
//3
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(firstActivityTag, "onResume invoked");
    }
//4
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(firstActivityTag, "onPause invoked");
    }
//5
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(firstActivityTag, "onStop invoked");
    }
//6
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(firstActivityTag, "onDestroy invoked");
    }
//7
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(firstActivityTag, "onRestart invoked");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        getMenuInflater().inflate(R.menu.menu_fragment_addition, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction  mFragmentTransaction = mFragmentManager.beginTransaction();
        if(item.getItemId() == R.id.action_blue){


            BlueFragment mBlueFragment = new BlueFragment();
           // mBlueFragment = (BlueFragment) mFragmentManager.findFragmentByTag("BLUE");
            mFragmentTransaction.add(R.id.fragment_container, mBlueFragment, "BLUE");


        }else if (item.getItemId() == R.id.action_add){

           AdditionFragment mAdditionFragment = new AdditionFragment();
            mFragmentTransaction.replace(R.id.fragment_container, mAdditionFragment, "ADDITION");



        }else  if(item.getItemId() == R.id.action_next){
            Intent mIntent = new Intent(FirstActivity.this, SecondActivity.class);
            //mIntent.putExtra("name", edtName.getText().toString());
            startActivity(mIntent);
        }
        mFragmentTransaction.commit();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(String str) {
    txtTitle.setText(str);
    }

    @Override
    public void onClick(View v) {

    }
//    @Override
//    public void onClick(View v) {
//
//            //move to next screen
//            Intent mIntent = new Intent(FirstActivity.this, SecondActivity.class);
//            //mIntent.putExtra("name", edtName.getText().toString());
//            startActivity(mIntent);
//
//    }
}

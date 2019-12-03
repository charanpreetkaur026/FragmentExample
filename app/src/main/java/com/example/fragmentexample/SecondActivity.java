package com.example.fragmentexample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

import com.example.fragmentexample.R;

public class SecondActivity extends AppCompatActivity {

    private static final String Tag = " Tag Second Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Tag, "onCreate invoked");
        setContentView(R.layout.activity_second);

        Bundle mbundle = getIntent().getExtras();
        if(mbundle != null){
            String name = mbundle.getString("name");
            Log.d("NAME", name);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag, "onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag, "onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag,"onPause invoked ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag, "onStop invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag, "onDestroy invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Tag, "onRestart invoked");
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        showAlert();
    }
    private void showAlert(){
        AlertDialog.Builder alertDailogBuilder = new AlertDialog.Builder(this);
        // alertDailogBuilder.setIcon(R.drawable.);
        alertDailogBuilder.setTitle("Back");
        alertDailogBuilder.setMessage("Are you sure to go back?");
        alertDailogBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDailogBuilder.setNegativeButtonIcon(getResources().getDrawable(R.drawable.ic_launcher_foreground));
        AlertDialog mAlertDialog = alertDailogBuilder.create();
        mAlertDialog.show();
    }
}

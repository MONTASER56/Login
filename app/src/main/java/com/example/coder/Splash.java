package com.example.coder;

import android.app.Activity;
;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;



public class Splash extends Activity implements View.OnClickListener {
    LinearLayout splash;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spalsh_layout);
        splash=findViewById(R.id.splash);
        splash.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {

       Intent myIntent=new Intent(this,MainActivity.class);
       startActivity(myIntent);
    }
}

package com.pageupp.fragmentdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Configuration configuration=getResources().getConfiguration();
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

      //  android.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        if(configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){

            LM_Fragment lm_fragment=new LM_Fragment();
            fragmentTransaction.replace(android.R.id.content,lm_fragment);
        }else{

            PM_Fragment pm_fragment=new PM_Fragment();
            fragmentTransaction.replace(android.R.id.content,pm_fragment);
        }
        fragmentTransaction.commit();
    }
}

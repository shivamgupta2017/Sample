package com.example.shivam.sample;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  static  int back=0;
    static Toolbar toolbar;
    static TabLayout tabLayout;
    static ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);




    }


    @Override
    public void onBackPressed() {


        //Toast.makeText(getApplicationContext(),"press again in order to get exit",Toast.LENGTH_LONG).show();
        System.out.println("on back pressed");

        //back++;

        //if(back>1) {
            this.finish();
        //}
    }
}




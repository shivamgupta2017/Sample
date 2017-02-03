package com.example.shivam.sample;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    private EditText name,email,password;
    private FloatingActionButton signup;
    String Uname,Email,Password;

    Handler handler=new Handler();
ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView=(ImageView)findViewById(R.id.imageView);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.anim);
        imageView.startAnimation(animation);





        handler.post(new Runnable() {
            @Override
            public void run() {


                if(getName())
                {

                    Intent next=new Intent(Splash.this,MainActivity.class);
                    startActivity(next);
                    finish();
                }
                else
                {

                    Intent login=new Intent(getApplicationContext(),Login.class);
                    startActivity(login);
                    finish();
                }
            }
        });




    }

    public boolean getName()

    {

        boolean res=true;
        String r=null;
        SharedPreferences sp=getApplicationContext().getSharedPreferences("user", Context.MODE_PRIVATE);
        String name=sp.getString("keyName",null);
        String pass=sp.getString("keypass",null);


        if((name==r)&&(pass==r))
        {
            res=false;
            System.out.println("res=:false");
        }


        System.out.println(name+":name and pass:"+pass);







        return res;
    }
}

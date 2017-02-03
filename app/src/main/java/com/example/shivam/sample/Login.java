package com.example.shivam.sample;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    TextView textview;
    EditText username,password;
    Handler handler=new Handler();

    private String uname,upass;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textview=(TextView) findViewById(R.id.textView);

        username=(EditText)findViewById(R.id.username);

        password=(EditText)findViewById(R.id.password);

        button=(Button)findViewById(R.id.button);









        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                try  {
                    InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                } catch (Exception e) {

                }
                getdata();




            }
        });

    }



public void getdata()
{


    uname=username.getText().toString().trim();
    upass=password.getText().toString().trim();
    setName(uname,upass);
    System.out.println("String accepted and passed to shared reference");
    Intent i=new Intent(getApplicationContext(),MainActivity.class);
    startActivity(i);
    finish();
}


        public void setName(String uName,String upass)
    {

        SharedPreferences sp=this.getSharedPreferences("user",Context.MODE_PRIVATE);

        SharedPreferences.Editor editor=sp.edit();
        editor.putString("keyName",uName);
        editor.putString("keypass",upass);

        editor.commit();




    }








}

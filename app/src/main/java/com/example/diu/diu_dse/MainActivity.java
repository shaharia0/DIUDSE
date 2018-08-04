package com.example.diu.diu_dse;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button button1,button2,button3,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.buttonswe);
        button2 = (Button) findViewById(R.id.buttonfaculty);
        button3 = (Button) findViewById(R.id.buttonfacilities);
        button4 = (Button) findViewById(R.id.buttondiu);
        button5 = (Button) findViewById(R.id.buttonadmission);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);



    }


    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.buttonswe){
            Intent intent = new Intent(MainActivity.this,AboutSweActivity.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.buttonfaculty){
            Intent intent = new Intent(MainActivity.this,FacultyMembers.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.buttonfacilities){
            Intent intent = new Intent(MainActivity.this,Facilities.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.buttondiu){
            Intent intent = new Intent(MainActivity.this,AboutDiu.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.buttonadmission){
            Intent intent = new Intent(MainActivity.this,AdmissionInfo.class);
            startActivity(intent);
        }

    }

}

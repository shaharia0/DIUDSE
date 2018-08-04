package com.example.diu.diu_dse;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdmissionInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_info);

    }
   public void openbrowser(View view){
       Intent browserintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://admission.daffodilvarsity.edu.bd/#/"));
       startActivity(browserintent);
   }


}

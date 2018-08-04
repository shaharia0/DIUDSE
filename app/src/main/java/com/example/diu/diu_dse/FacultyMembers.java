package com.example.diu.diu_dse;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FacultyMembers extends AppCompatActivity {
    private ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_members);

        listView = (ListView) findViewById(R.id.listviewid);
        @SuppressLint("ResourceType") String [] facultymembers = getResources().getStringArray(R.array.faculty_members);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(FacultyMembers.this,R.layout.faculty_members,R.id.textviewid,facultymembers);
        listView.setAdapter(adapter);

    }
}

package com.example.myapplication3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.firebase.client.Firebase;

public class SandtoFirebase extends AppCompatActivity {
    private RadioButton radio8,radio9,radio10,radio11,radio12,radio13,radio14,radio15;
    private EditText AddNameBox,AddScoolBox;
    private Button SandButton;
    Firebase Sanddata;
    char pee = 'A';
    char blood ='A';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandto_firebase);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        AddNameBox = (EditText)findViewById(R.id.AddNameBox);
        AddScoolBox = (EditText)findViewById(R.id.AddScoolBox);
        SandButton = (Button)findViewById(R.id.SandButton);
        Firebase.setAndroidContext(this);
        Sanddata = new Firebase("https://myproject-46f45.firebaseio.com");
        SandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Firebase SandDT = Sanddata.child(AddNameBox.getText().toString()+" อยู่ชั้น");
                if (pee == 'A'){
                SandDT.setValue("ปี1");}
                else if (pee =='B'){
                    SandDT.setValue("ปี2");
                }
                else if (pee =='C'){
                    SandDT.setValue("ปี3");
                }
                else if (pee =='D'){
                    SandDT.setValue("ปี4");
                }
                Firebase MGG = Sanddata.child(AddNameBox.getText().toString()+" จบจากโรงเรียน"+AddScoolBox.getText().toString());
                if (blood == 'A'){
                    MGG.setValue("กรุ๊ปเลือด A");
                }else if (blood == 'B'){
                    MGG.setValue("กรุ๊ปเลือด B");
                }else if (blood == 'C'){
                    MGG.setValue("กรุ๊ปเลือด O");
                }else if (blood == 'D'){
                    MGG.setValue("กรุ๊ปเลือด AB");
                }
                Toast.makeText(SandtoFirebase.this,"ส่งข้อมูลเรียบร้อย(รอการพิจารณา)",Toast.LENGTH_SHORT).show();
                Intent POPP = new Intent(SandtoFirebase.this, MainActivity.class);
                startActivity(POPP);
            }
        });


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "กดเพื่อ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        init5();
        radio8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio8.setChecked(true);
                radio9.setChecked(false);
                radio10.setChecked(false);
                radio11.setChecked(false);
                pee = 'A';

            }
        });
        radio9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio8.setChecked(false);
                radio9.setChecked(true);
                radio10.setChecked(false);
                radio11.setChecked(false);
                pee = 'B';
            }
        });
        radio10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio8.setChecked(false);
                radio9.setChecked(false);
                radio10.setChecked(true);
                radio11.setChecked(false);
                pee = 'C';
            }
        });
        radio11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio8.setChecked(false);
                radio9.setChecked(false);
                radio10.setChecked(false);
                radio11.setChecked(true);
                pee = 'D';
            }
        });
        radio12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio12.setChecked(true);
                radio13.setChecked(false);
                radio14.setChecked(false);
                radio15.setChecked(false);
                blood = 'A';

            }
        });
        radio13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio12.setChecked(false);
                radio13.setChecked(true);
                radio14.setChecked(false);
                radio15.setChecked(false);
                blood = 'B';
            }
        });
        radio14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio12.setChecked(false);
                radio13.setChecked(false);
                radio14.setChecked(true);
                radio15.setChecked(false);
                blood = 'C';
            }
        });
        radio15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio12.setChecked(false);
                radio13.setChecked(false);
                radio14.setChecked(false);
                radio15.setChecked(true);
                blood = 'D';
            }
        });
    }
    public  void init5(){
        AddNameBox =(EditText)findViewById(R.id.AddNameBox);

        radio8 = (RadioButton)findViewById(R.id.radio8);
        radio9 = (RadioButton)findViewById(R.id.radio9);
        radio10 = (RadioButton)findViewById(R.id.radio10);
        radio11 = (RadioButton)findViewById(R.id.radio11);
        radio12 = (RadioButton)findViewById(R.id.radio12);
        radio13= (RadioButton)findViewById(R.id.radio13);
        radio14 = (RadioButton)findViewById(R.id.radio14);
        radio15 = (RadioButton)findViewById(R.id.radio15);
    }
}

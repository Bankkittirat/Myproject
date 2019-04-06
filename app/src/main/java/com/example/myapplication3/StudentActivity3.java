package com.example.myapplication3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class StudentActivity3 extends AppCompatActivity {
    private Spinner StudentList3;
    private ImageView infoPic3;
    private TextView infoSname3, infoAge3, infoScool3, infoBlood3;
    private String[] Studentcollection3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student3);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("NAME");


        setTitle(name);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hello it me", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                init2();

            }
        });

        init2();

        Studentcollection3 = getResources().getStringArray(R.array.Studentcollection3);
        ArrayAdapter<String> Student = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, Studentcollection3);
        StudentList3.setAdapter(Student);

        StudentList3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String preSname, preAge, preScool, preBlood;
                preSname = getString(R.string.SSname);
                preAge = getString(R.string.Age);
                preScool = getString(R.string.Scool);
                preBlood = getString(R.string.Blood);
                if (position == 0){
                    infoPic3.setImageResource(R.drawable.tee);
                    infoSname3.setText(preSname + " " + getString(R.string.PteSname));
                    infoAge3.setText(preAge + " " + "\n" + getString(R.string.PteAge));
                    infoScool3.setText(preScool + " " + getString(R.string.PteEng));
                    infoBlood3.setText(preBlood +" "+ getString(R.string.PteBlood));

                } else if (position == 1) {
                    infoPic3.setImageResource(R.drawable.benz);
                    infoSname3.setText(preSname + " " + getString(R.string.PbenzSname));
                    infoAge3.setText(preAge + " " + "\n" + getString(R.string.PbenzAge));
                    infoScool3.setText(preScool + " " + getString(R.string.PbenzEng));
                    infoBlood3.setText(preBlood + " " + getString(R.string.PbenzBlood));
                } else if (position == 2) {
                    infoPic3.setImageResource(R.drawable.nut);
                    infoSname3.setText(preSname + " " + getString(R.string.PnutSname));
                    infoAge3.setText(preAge + " " + "\n" + getString(R.string.PnutAge));
                    infoScool3.setText(preScool + " " + getString(R.string.PnutEng));
                    infoBlood3.setText(preBlood + " " + getString(R.string.PnutBlood));

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
    }
    public void  init2(){
        StudentList3 = (Spinner)findViewById(R.id.StudentList3);
        infoPic3 = (ImageView)findViewById(R.id.infoPic3);
        infoSname3 = (TextView)findViewById(R.id.infoSname3);
        infoAge3 = (TextView)findViewById(R.id.infoAge3);
        infoScool3 = (TextView)findViewById(R.id.infoScool3);
        infoBlood3= (TextView)findViewById(R.id.infoBlood3);

    }

}

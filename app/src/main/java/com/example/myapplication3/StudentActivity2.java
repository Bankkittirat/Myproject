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

public class StudentActivity2 extends AppCompatActivity {
    private Spinner StudentList2;
    private ImageView infoPic2;
    private TextView infoSname2, infoAge2, infoScool2, infoBlood2;
    private String[] Studentcollection2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student2);
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
                init1();

            }
        });

            init1();

        Studentcollection2 = getResources().getStringArray(R.array.Studentcollection2);
        ArrayAdapter<String> Student = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, Studentcollection2);
        StudentList2.setAdapter(Student);

        StudentList2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String preSname, preAge, preScool, preBlood;
                preSname = getString(R.string.SSname);
                preAge = getString(R.string.Age);
                preScool = getString(R.string.Scool);
                preBlood = getString(R.string.Blood);
                if (position == 0){
                    infoPic2.setImageResource(R.drawable.ahom);
                    infoSname2.setText(preSname + " " + getString(R.string.Poumname));
                    infoAge2.setText(preAge + " " + "\n" + getString(R.string.PoumAge));
                    infoScool2.setText(preScool + " " + getString(R.string.PoumEng));
                    infoBlood2.setText(preBlood + " " + getString(R.string.PoumBlood));

                } else if (position == 1) {
                    infoPic2.setImageResource(R.drawable.dorm);
                    infoSname2.setText(preSname + " " + getString(R.string.PdomeSname));
                    infoAge2.setText(preAge + " " + "\n" + getString(R.string.PdomeAge));
                    infoScool2.setText(preScool + " " + getString(R.string.PdomeEng));
                    infoBlood2.setText(preBlood + " " + getString(R.string.PgetBlood));
                } else if (position == 2) {
                    infoPic2.setImageResource(R.drawable.get);
                    infoSname2.setText(preSname + " " + getString(R.string.PgetSname));
                    infoAge2.setText(preAge + " " + "\n" + getString(R.string.PgetAge));
                    infoScool2.setText(preScool + " " + getString(R.string.PoumEng));
                    infoBlood2.setText(preBlood + " " + getString(R.string.PgetBlood));

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
    }
    public void  init1(){
        StudentList2 = (Spinner)findViewById(R.id.StudentList3);
        infoPic2 = (ImageView)findViewById(R.id.infoPic3);
        infoSname2 = (TextView)findViewById(R.id.infoSname3);
        infoAge2 = (TextView)findViewById(R.id.infoAge3);
        infoScool2 = (TextView)findViewById(R.id.infoScool3);
        infoBlood2= (TextView)findViewById(R.id.infoBlood2);

    }

}


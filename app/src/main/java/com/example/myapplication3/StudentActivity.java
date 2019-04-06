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

public class StudentActivity extends AppCompatActivity {

    private Spinner StudentList;
    private ImageView infoPic;
    private TextView infoSname, infoAge, infoScool, infoBlood;
    private String[] Studentcollection1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle bundle = getIntent().getExtras();
        String name= bundle.getString("NAME");


        setTitle(name);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hello it me", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                init();

            }
        });

           init();

    Studentcollection1 = getResources().getStringArray(R.array.Studentcollection1);
    ArrayAdapter<String> Student = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, Studentcollection1);
        StudentList.setAdapter(Student);

        StudentList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String preSname, preAge, preScool, preBlood;
            preSname = getString(R.string.SSname);
            preAge = getString(R.string.Age);
            preScool = getString(R.string.Scool);
            preBlood = getString(R.string.Blood);
            if (position == 0){
                infoPic.setImageResource(R.drawable.aey);
                infoSname.setText(preSname + " " + getString(R.string.AssdawutSname));
                infoAge.setText(preAge + " " + "\n" + getString(R.string.AssdawutAge));
                infoScool.setText(preScool + " " + getString(R.string.AssdawutEng));
                infoBlood.setText(preBlood + " " + getString(R.string.AssdawutBlood));

            } else if (position == 1) {
                infoPic.setImageResource(R.drawable.weerachai);
                infoSname.setText(preSname + " " + getString(R.string.WeerachaiSname));
                infoAge.setText(preAge + " " + "\n" + getString(R.string.WeerachaiAge));
                infoScool.setText(preScool + " " + getString(R.string.WeerachaiEng));
                infoBlood.setText(preBlood + " " + getString(R.string.WeerachaiBlood));
            } else if (position == 2) {
                infoPic.setImageResource(R.drawable.kontorn);
                infoSname.setText(preSname + " " + getString(R.string.KontornSname));
                infoAge.setText(preAge + " " + "\n" + getString(R.string.KontornAge));
                infoScool.setText(preScool + " " + getString(R.string.KontornEng));
                infoBlood.setText(preBlood + " " + getString(R.string.KontornBlood));

            } else if (position == 3) {
                infoPic.setImageResource(R.drawable.atiwat);
                infoSname.setText(preSname + " " + getString(R.string.AtiwatSname));
                infoAge.setText(preAge + " " + "\n" + getString(R.string.AtiwatAge));
                infoScool.setText(preScool + " " + getString(R.string.AtiwatEng));
                infoBlood.setText(preBlood + " " + getString(R.string.AtiwatBlood));
            } else if (position == 4) {
                infoPic.setImageResource(R.drawable.nuttapong);
                infoSname.setText(preSname + " " + getString(R.string.NuttapongSname));
                infoAge.setText(preAge + " " + "\n" + getString(R.string.NuttapongAge));
                infoScool.setText(preScool + " " + getString(R.string.NuttapongEng));
                infoBlood.setText(preBlood + " " + getString(R.string.NuttapongBlood));
            }

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    });
}
    public void  init(){
        StudentList = (Spinner)findViewById(R.id.StudentList3);
        infoPic = (ImageView)findViewById(R.id.infoPic3);
        infoSname = (TextView)findViewById(R.id.infoSname3);
        infoAge = (TextView)findViewById(R.id.infoAge3);
        infoScool = (TextView)findViewById(R.id.infoScool3);
        infoBlood = (TextView)findViewById(R.id.infoBlood);

    }

}

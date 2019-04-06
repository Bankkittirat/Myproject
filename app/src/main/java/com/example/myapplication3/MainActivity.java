package com.example.myapplication3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private EditText nameBox;

    private RadioButton radio1,radio2,radio3,radio4;
    private Button buttonPee1,buttonPee2,buttonPee3,buttonPee4;
    char pee = 'A';


    String fullname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPee1 = (Button)findViewById(R.id.buttonPee1);
        buttonPee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next =new Intent(MainActivity.this, StudentActivity.class);
                if (pee == 'A'){
                    fullname = "สวัสดีน้อง" + nameBox.getText().toString();
                }else if (pee =='B'){
                    fullname = "สวัสดี" + nameBox.getText().toString();
                }else if (pee =='C'){
                    fullname = "สวัสดีพี่" + nameBox.getText().toString();
                }
                next.putExtra("NAME", fullname);
                startActivity(next);
            }
        });
        buttonPee2 = (Button)findViewById(R.id.buttonPee2);
        buttonPee2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next =new Intent(MainActivity.this, StudentActivity2.class);
                if (pee == 'A'){
                    fullname = "สวัสดีน้อง" + nameBox.getText().toString();
                }else if (pee =='B'){
                    fullname = "สวัสดี" + nameBox.getText().toString();
                }else if (pee =='C'){
                    fullname = "สวัสดีพี่" + nameBox.getText().toString();
                }
                next.putExtra("NAME", fullname);
                startActivity(next);
            }
        });
        buttonPee3 = (Button)findViewById(R.id.buttonPee3);
        buttonPee3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next =new Intent(MainActivity.this, StudentActivity3.class);
                if (pee == 'A'){
                    fullname = "สวัสดีน้อง" + nameBox.getText().toString();
                }else if (pee =='B'){
                    fullname = "สวัสดี" + nameBox.getText().toString();
                }else if (pee =='C'){
                    fullname = "สวัสดีพี่" + nameBox.getText().toString();
                }
                next.putExtra("NAME", fullname);
                startActivity(next);
            }
        });
        buttonPee4 = (Button)findViewById(R.id.buttonPee4);
        buttonPee4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next1 =new Intent(MainActivity.this, StudentActivity4.class);
                startActivity(next1);
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Sand = new Intent(MainActivity.this, SandtoFirebase.class);
                startActivity(Sand);
            }
        });
        init();
        radio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio1.setChecked(true);
                radio2.setChecked(false);
                radio3.setChecked(false);
                radio4.setChecked(false);
                pee = 'A';

            }
        });
        radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio1.setChecked(false);
                radio2.setChecked(true);
                radio3.setChecked(false);
                radio4.setChecked(false);
                pee = 'B';
            }
        });
        radio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio1.setChecked(false);
                radio2.setChecked(false);
                radio3.setChecked(true);
                radio4.setChecked(false);
                pee = 'C';
            }
        });
        radio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio1.setChecked(false);
                radio2.setChecked(false);
                radio3.setChecked(false);
                radio4.setChecked(true);
                pee = 'D';
            }
        });


    }
    public  void init(){
        nameBox =(EditText)findViewById(R.id.nameBox);

        radio1 = (RadioButton)findViewById(R.id.radio8);
        radio2 = (RadioButton)findViewById(R.id.radio2);
        radio3 = (RadioButton)findViewById(R.id.radio3);
        radio4 = (RadioButton)findViewById(R.id.radio4);

        buttonPee1 = (Button)findViewById(R.id.buttonPee1);
        buttonPee2 = (Button)findViewById(R.id.buttonPee2);
        buttonPee3 = (Button)findViewById(R.id.buttonPee3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

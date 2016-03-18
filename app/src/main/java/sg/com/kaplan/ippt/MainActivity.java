package sg.com.kaplan.ippt;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context context = this;
    String a ="false" , b ="true";
    private ImageButton Imagebutton;
    private ImageButton Recordbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final EditText age = (EditText) findViewById(R.id.age);

        Recordbutton = (ImageButton) findViewById(R.id.records);
        Imagebutton = (ImageButton) findViewById(R.id.button1);
        final CheckBox c1 = (CheckBox) findViewById(R.id.checkBox);

        final RadioButton r1 = (RadioButton) findViewById(R.id.Reservist);
        final RadioButton r2 = (RadioButton) findViewById(R.id.Acitve);




        c1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (c1.isChecked() == true) {
                    a = "true";
                } else {
                    a = "false";
                }

            }});


        r1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (r1.isChecked() == true) {
                    b = "true";
                } else {
                    b = "false";
                }

            }});

        r2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (r2.isChecked() == true) {
                    b = "false";
                } else {
                    b = "true";
                }

            }
        });


            //Upon click , go to page 2
            Imagebutton.setOnClickListener(new View.OnClickListener()

            {

                @Override
                public void onClick (View v){


                    String input = age.getText().toString();

                    if(input == null || input.trim().equals("")){
                        Toast.makeText(getApplicationContext(),"Please Enter Age", Toast.LENGTH_SHORT).show();
                    }
                    else {


                        //send Main page variables to page 2.
                        int agetext = Integer.parseInt(age.getText().toString());

                        Intent intent = new Intent(getApplicationContext(), page2.class);
                        intent.putExtra("agetext", agetext);
                        intent.putExtra("special", a);
                        intent.putExtra("status", b);


                        startActivity(intent);
                    }
                }
               }

            );

        Recordbutton.setOnClickListener(new View.OnClickListener()
            {

                @Override
                public void onClick (View v){



                        Intent intent = new Intent(getApplicationContext(), page3.class);
                        startActivity(intent);


                }
            }

        );
    }

    @Override
    protected void onResume() {
        super.onResume();

        final TextView recordv = (TextView) findViewById(R.id.tvr);

        //read value from SP and set it at textview
        SharedPreferences sharedPref3 = PreferenceManager.getDefaultSharedPreferences(context);
        String text = sharedPref3.getString("ptdipwt3", null);
        if(text != null && !text.isEmpty())
        {
            recordv.setText(text);
        }
        else {
            recordv.setText("0");
        }

    }
}



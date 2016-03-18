package sg.com.kaplan.ippt;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class page3 extends AppCompatActivity {


    private ImageButton Imagebutton;


Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        Imagebutton = (ImageButton) findViewById(R.id.home2);

        final TextView s1 = (TextView) findViewById(R.id.textView14);
        final TextView p1 = (TextView) findViewById(R.id.textView15);
        final TextView r1 = (TextView) findViewById(R.id.textView17);
        final TextView t1 = (TextView) findViewById(R.id.textView18);
        final TextView d1 = (TextView) findViewById(R.id.textView19);
        final TextView a1 = (TextView) findViewById(R.id.textView20);

        final TextView s2 = (TextView) findViewById(R.id.textView38);
        final TextView p2 = (TextView) findViewById(R.id.textView34);
        final TextView r2 = (TextView) findViewById(R.id.textView39);
        final TextView t2 = (TextView) findViewById(R.id.textView40);
        final TextView d2 = (TextView) findViewById(R.id.textView31);
        final TextView a2 = (TextView) findViewById(R.id.textView33);

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
        String running1 = sharedPref.getString("running1", null);
        String situp1 = sharedPref.getString("situp1", null);
        String pushup1 = sharedPref.getString("pushup1", null);
        String totalpoints1 = sharedPref.getString("totalpoints1", null);
        String age1 = sharedPref.getString("agerecord1", null);
        String date1 = sharedPref.getString("date1", null);

        String running2 = sharedPref.getString("running2", null);
        String situp2 = sharedPref.getString("situp2", null);
        String pushup2 = sharedPref.getString("pushup2", null);
        String totalpoints2 = sharedPref.getString("totalpoints2", null);
        String age2 = sharedPref.getString("agerecord2", null);
        String date2 = sharedPref.getString("date2", null);

        s1.setText(situp1);
        r1.setText(running1);
        p1.setText(pushup1);
        t1.setText(totalpoints1);
        d1.setText(date1);
        a1.setText(age1);


        s2.setText(situp2);
        r2.setText(running2);
        p2.setText(pushup2);
        t2.setText(totalpoints2);
        d2.setText(date2);
        a2.setText(age2);

        Imagebutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // return back to home page
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }

        });
    }
}

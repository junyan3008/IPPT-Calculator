package sg.com.kaplan.ippt;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class page2 extends AppCompatActivity {


    private ImageButton Imagebutton3;
    private ImageButton Imagebutton4;

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        final NumberPicker numPicker = (NumberPicker) findViewById(R.id.numberPicker);
        final NumberPicker numPicker2 = (NumberPicker) findViewById(R.id.numberPicker2);
        final NumberPicker numPicker3 = (NumberPicker) findViewById(R.id.numberPicker3);

        Imagebutton3 = (ImageButton) findViewById(R.id.button3);
        Imagebutton4 = (ImageButton) findViewById(R.id.button4);


        final TextView tv1 = (TextView) findViewById(R.id.pushup);
        final TextView tv2 = (TextView) findViewById(R.id.total);
        final TextView tv4 = (TextView) findViewById(R.id.running);
        final TextView tv5 = (TextView) findViewById(R.id.situp);

        final TextView tv6 = (TextView) findViewById(R.id.textView12);
        final TextView tv7 = (TextView) findViewById(R.id.textView16);

        Bundle extras = getIntent().getExtras();

        final String special = extras.getString("special");
        final String status = extras.getString("status");
        final  int ageint = extras.getInt("agetext");

        String age1 = Integer.toString(ageint);

        tv6.setText(age1);

        String []running = {"<=8:30","8:31 to 8:40","8:41 to 8:50","8:51 to 9:00","9:01 to 9:10","9:11 to 9:20","9:21 to 9:30","9:31 to 9:40","9:41 to 9:50","9:51 to 10:00",
                 "10:01 to 10:10","10:11 to 10:20","10:21 to 10:30","10:31 to 10:40","10:41 to 10:50","10:51 to 11:00","11:01 to 11:10","11:11 to 11:20","11:21 to 11:30","11:31 to 11:40","11:41 to 11:50","11:51 to 12:00",
                "12:01 to 12:10","12:11 to 12:20","12:21 to 12:30","12:31 to 12:40","12:41 to 12:50","12:51 to 13:00","13:01 to 13:10","13:11 to 13:20","13:21 to 13:30","13:31 to 13:40","13:41 to 13:50","13:51 to 14:00",
                "14:01 to 14:10","14:11 to 14:20","14:21 to 14:30","14:31 to 14:40","14:41 to 14:50","14:51 to 15:00","15:01 to 15:10","15:11 to 15:20","15:21 to 15:30","15:31 to 15:40","15:41 to 15:50","15:51 to 16:00",
                "16:01 to 16:10","16:11 to 16:20","16:21 to 16:30","16:31 to 16:40","16:41 to 16:50","16:51 to 17:00","17:01 to 17:10","17:11 to 17:20","17:21 to 17:30","17:31 to 17:40","17:41 to 17:50","17:51 to 18:00","18:01 to 18:10","18:11 to 18:20","<18:20"};

        numPicker.setMinValue(0);
        numPicker.setMaxValue(60);

        numPicker3.setMinValue(0);
        numPicker3.setMaxValue(60);

        numPicker2.setMinValue(0);
        numPicker2.setMaxValue(60);
        numPicker2.setDisplayedValues(running);


        numPicker.setWrapSelectorWheel(false);
        numPicker2.setWrapSelectorWheel(false);
        numPicker3.setWrapSelectorWheel(false);

        //Push-up selector
        numPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

            @Override
            public void onValueChange(NumberPicker numPicker, int oldVal, int newVal) {

                //Start of age group 1 ( <22 pushup)
                if (ageint < 22) {
                    if ((newVal >= 0) && (newVal <= 14)) {
                        tv1.setText("0");
                    } else if (newVal == 15) {
                        tv1.setText("1");
                    } else if (newVal == 16) {
                        tv1.setText("2");
                    } else if (newVal == 17) {
                        tv1.setText("4");
                    } else if (newVal == 18) {
                        tv1.setText("6");
                    } else if (newVal == 19) {
                        tv1.setText("8");
                    } else if (newVal == 20) {
                        tv1.setText("9");
                    } else if (newVal == 21) {
                        tv1.setText("10");
                    } else if (newVal == 22) {
                        tv1.setText("11");
                    } else if (newVal == 23) {
                        tv1.setText("12");
                    } else if (newVal == 24) {
                        tv1.setText("13");
                    } else if (newVal == 25) {
                        tv1.setText("14");
                    } else if ((newVal == 26) || (newVal == 27)) {
                        tv1.setText("15");
                    } else if ((newVal >= 28) && (newVal <= 30)) {
                        tv1.setText("16");
                    } else if ((newVal >= 31) && (newVal <= 33)) {
                        tv1.setText("17");
                    } else if ((newVal >= 34) && (newVal <= 36)) {
                        tv1.setText("18");
                    } else if ((newVal >= 37) && (newVal <= 39)) {
                        tv1.setText("19");
                    } else if ((newVal >= 40) && (newVal <= 43)) {
                        tv1.setText("20");
                    } else if ((newVal >= 44) && (newVal <= 47)) {
                        tv1.setText("21");
                    } else if ((newVal >= 48) && (newVal <= 51)) {
                        tv1.setText("22");
                    } else if ((newVal >= 52) && (newVal <= 55)) {
                        tv1.setText("23");
                    } else if ((newVal >= 56) && (newVal <= 59)) {
                        tv1.setText("24");
                    } else {
                        tv1.setText("25");
                    }
                } // end of age group 1 (<22)


                //Start of age group 2 ( 22 to 24 pushup)
                else if ((ageint >= 22) && (ageint <= 24)) {
                    if ((newVal >= 0) && (newVal <= 13)) {
                        tv1.setText("0");
                    } else if (newVal == 14) {
                        tv1.setText("1");
                    } else if (newVal == 15) {
                        tv1.setText("2");
                    } else if (newVal == 16) {
                        tv1.setText("4");
                    } else if (newVal == 17) {
                        tv1.setText("6");
                    } else if (newVal == 18) {
                        tv1.setText("8");
                    } else if (newVal == 19) {
                        tv1.setText("9");
                    } else if (newVal == 20) {
                        tv1.setText("10");
                    } else if (newVal == 21) {
                        tv1.setText("11");
                    } else if (newVal == 22) {
                        tv1.setText("12");
                    } else if (newVal == 23) {
                        tv1.setText("13");
                    } else if (newVal == 24) {
                        tv1.setText("14");
                    } else if ((newVal == 25) || (newVal == 26)) {
                        tv1.setText("15");
                    } else if ((newVal >= 27) && (newVal <= 29)) {
                        tv1.setText("16");
                    } else if ((newVal >= 30) && (newVal <= 31)) {
                        tv1.setText("17");
                    } else if ((newVal >= 32) && (newVal <= 35)) {
                        tv1.setText("18");
                    } else if ((newVal >= 36) && (newVal <= 38)) {
                        tv1.setText("19");
                    } else if ((newVal >= 39) && (newVal <= 42)) {
                        tv1.setText("20");
                    } else if ((newVal >= 43) && (newVal <= 46)) {
                        tv1.setText("21");
                    } else if ((newVal >= 47) && (newVal <= 50)) {
                        tv1.setText("22");
                    } else if ((newVal >= 51) && (newVal <= 54)) {
                        tv1.setText("23");
                    } else if ((newVal >= 55) && (newVal <= 58)) {
                        tv1.setText("24");
                    } else {
                        tv1.setText("25");
                    }
                } // end of age group 2 (22 to 24)

                //Start of age group 3 ( 25 to 27 pushup)
                else if ((ageint >= 25) && (ageint <= 27)) {
                    if ((newVal >= 0) && (newVal <= 12)) {
                        tv1.setText("0");
                    } else if (newVal == 13) {
                        tv1.setText("1");
                    } else if (newVal == 14) {
                        tv1.setText("2");
                    } else if (newVal == 15) {
                        tv1.setText("4");
                    } else if (newVal == 16) {
                        tv1.setText("6");
                    } else if (newVal == 17) {
                        tv1.setText("8");
                    } else if (newVal == 18) {
                        tv1.setText("9");
                    } else if (newVal == 19) {
                        tv1.setText("10");
                    } else if (newVal == 20) {
                        tv1.setText("11");
                    } else if (newVal == 21) {
                        tv1.setText("12");
                    } else if (newVal == 22) {
                        tv1.setText("13");
                    } else if (newVal == 23) {
                        tv1.setText("14");
                    } else if ((newVal == 24) || (newVal == 25)) {
                        tv1.setText("15");
                    } else if ((newVal >= 26) && (newVal <= 28)) {
                        tv1.setText("16");
                    } else if ((newVal >= 29) && (newVal <= 31)) {
                        tv1.setText("17");
                    } else if ((newVal >= 32) && (newVal <= 34)) {
                        tv1.setText("18");
                    } else if ((newVal >= 35) && (newVal <= 37)) {
                        tv1.setText("19");
                    } else if ((newVal >= 38) && (newVal <= 41)) {
                        tv1.setText("20");
                    } else if ((newVal >= 42) && (newVal <= 45)) {
                        tv1.setText("21");
                    } else if ((newVal >= 46) && (newVal <= 49)) {
                        tv1.setText("22");
                    } else if ((newVal >= 50) && (newVal <= 53)) {
                        tv1.setText("23");
                    } else if ((newVal >= 54) && (newVal <= 57)) {
                        tv1.setText("24");
                    } else {
                        tv1.setText("25");
                    }
                } // end of age group 3 (25 to 27)

                //Start of age group 4 ( 28 to 30 pushup)
                else if ((ageint >= 28) && (ageint <= 30)) {
                    if ((newVal >= 0) && (newVal <= 11)) {
                        tv1.setText("0");
                    } else if (newVal == 12) {
                        tv1.setText("1");
                    } else if (newVal == 13) {
                        tv1.setText("2");
                    } else if (newVal == 14) {
                        tv1.setText("4");
                    } else if (newVal == 15) {
                        tv1.setText("6");
                    } else if (newVal == 16) {
                        tv1.setText("8");
                    } else if (newVal == 17) {
                        tv1.setText("9");
                    } else if (newVal == 18) {
                        tv1.setText("10");
                    } else if (newVal == 19) {
                        tv1.setText("11");
                    } else if (newVal == 20) {
                        tv1.setText("12");
                    } else if (newVal == 21) {
                        tv1.setText("13");
                    } else if (newVal == 22) {
                        tv1.setText("14");
                    } else if ((newVal == 23) || (newVal == 24)) {
                        tv1.setText("15");
                    } else if ((newVal >= 25) && (newVal <= 27)) {
                        tv1.setText("16");
                    } else if ((newVal >= 28) && (newVal <= 30)) {
                        tv1.setText("17");
                    } else if ((newVal >= 31) && (newVal <= 33)) {
                        tv1.setText("18");
                    } else if ((newVal >= 34) && (newVal <= 36)) {
                        tv1.setText("19");
                    } else if ((newVal >= 37) && (newVal <= 40)) {
                        tv1.setText("20");
                    } else if ((newVal >= 41) && (newVal <= 44)) {
                        tv1.setText("21");
                    } else if ((newVal >= 45) && (newVal <= 48)) {
                        tv1.setText("22");
                    } else if ((newVal >= 49) && (newVal <= 52)) {
                        tv1.setText("23");
                    } else if ((newVal >= 53) && (newVal <= 56)) {
                        tv1.setText("24");
                    } else {
                        tv1.setText("25");
                    }
                } // end of age group 4 (28 to 30)


                //Start of age group 5 ( 31 to 33 pushup)
                else if ((ageint >= 31) && (ageint <= 33)) {
                    if ((newVal >= 0) && (newVal <= 10)) {
                        tv1.setText("0");
                    } else if (newVal == 11) {
                        tv1.setText("1");
                    } else if (newVal == 12) {
                        tv1.setText("2");
                    } else if (newVal == 13) {
                        tv1.setText("4");
                    } else if (newVal == 14) {
                        tv1.setText("6");
                    } else if (newVal == 15) {
                        tv1.setText("8");
                    } else if (newVal == 16) {
                        tv1.setText("9");
                    } else if (newVal == 17) {
                        tv1.setText("10");
                    } else if (newVal == 18) {
                        tv1.setText("11");
                    } else if (newVal == 19) {
                        tv1.setText("12");
                    } else if (newVal == 20) {
                        tv1.setText("13");
                    } else if (newVal == 21) {
                        tv1.setText("14");
                    } else if ((newVal == 22) || (newVal == 23)) {
                        tv1.setText("15");
                    } else if ((newVal >= 24) && (newVal <= 26)) {
                        tv1.setText("16");
                    } else if ((newVal >= 27) && (newVal <= 29)) {
                        tv1.setText("17");
                    } else if ((newVal >= 30) && (newVal <= 32)) {
                        tv1.setText("18");
                    } else if ((newVal >= 33) && (newVal <= 35)) {
                        tv1.setText("19");
                    } else if ((newVal >= 36) && (newVal <= 39)) {
                        tv1.setText("20");
                    } else if ((newVal >= 40) && (newVal <= 43)) {
                        tv1.setText("21");
                    } else if ((newVal >= 44) && (newVal <= 47)) {
                        tv1.setText("22");
                    } else if ((newVal >= 48) && (newVal <= 51)) {
                        tv1.setText("23");
                    } else if ((newVal >= 52) && (newVal <= 55)) {
                        tv1.setText("24");
                    } else {
                        tv1.setText("25");
                    }
                } // end of age group 5 (31 to 33)

                //Start of age group 6 ( 34 to 36 pushup)
                else if ((ageint >= 34) && (ageint <= 36)) {
                    if ((newVal >= 0) && (newVal <= 9)) {
                        tv1.setText("0");
                    } else if (newVal == 10) {
                        tv1.setText("1");
                    } else if (newVal == 11) {
                        tv1.setText("2");
                    } else if (newVal == 12) {
                        tv1.setText("4");
                    } else if (newVal == 13) {
                        tv1.setText("6");
                    } else if (newVal == 14) {
                        tv1.setText("8");
                    } else if (newVal == 15) {
                        tv1.setText("9");
                    } else if (newVal == 16) {
                        tv1.setText("10");
                    } else if (newVal == 17) {
                        tv1.setText("11");
                    } else if (newVal == 18) {
                        tv1.setText("12");
                    } else if (newVal == 19) {
                        tv1.setText("13");
                    } else if (newVal == 20) {
                        tv1.setText("14");
                    } else if ((newVal == 21) || (newVal == 22)) {
                        tv1.setText("15");
                    } else if ((newVal >= 23) && (newVal <= 25)) {
                        tv1.setText("16");
                    } else if ((newVal >= 26) && (newVal <= 28)) {
                        tv1.setText("17");
                    } else if ((newVal >= 29) && (newVal <= 31)) {
                        tv1.setText("18");
                    } else if ((newVal >= 32) && (newVal <= 34)) {
                        tv1.setText("19");
                    } else if ((newVal >= 35) && (newVal <= 38)) {
                        tv1.setText("20");
                    } else if ((newVal >= 39) && (newVal <= 42)) {
                        tv1.setText("21");
                    } else if ((newVal >= 43) && (newVal <= 46)) {
                        tv1.setText("22");
                    } else if ((newVal >= 47) && (newVal <= 50)) {
                        tv1.setText("23");
                    } else if ((newVal >= 51) && (newVal <= 54)) {
                        tv1.setText("24");
                    } else {
                        tv1.setText("25");
                    }
                } // end of age group 6 (34 to 36)

                //Start of age group 7 ( 37 to 39 pushup)
                else if ((ageint >= 37) && (ageint <= 39)) {
                    if ((newVal >= 0) && (newVal <= 8)) {
                        tv1.setText("0");
                    } else if (newVal == 9) {
                        tv1.setText("1");
                    } else if (newVal == 10) {
                        tv1.setText("2");
                    } else if (newVal == 11) {
                        tv1.setText("4");
                    } else if (newVal == 12) {
                        tv1.setText("6");
                    } else if (newVal == 13) {
                        tv1.setText("8");
                    } else if (newVal == 14) {
                        tv1.setText("9");
                    } else if (newVal == 15) {
                        tv1.setText("10");
                    } else if (newVal == 16) {
                        tv1.setText("11");
                    } else if (newVal == 17) {
                        tv1.setText("12");
                    } else if (newVal == 18) {
                        tv1.setText("13");
                    } else if (newVal == 19) {
                        tv1.setText("14");
                    } else if ((newVal == 20) || (newVal == 21)) {
                        tv1.setText("15");
                    } else if ((newVal >= 22) && (newVal <= 24)) {
                        tv1.setText("16");
                    } else if ((newVal >= 25) && (newVal <= 27)) {
                        tv1.setText("17");
                    } else if ((newVal >= 28) && (newVal <= 30)) {
                        tv1.setText("18");
                    } else if ((newVal >= 31) && (newVal <= 33)) {
                        tv1.setText("19");
                    } else if ((newVal >= 34) && (newVal <= 37)) {
                        tv1.setText("20");
                    } else if ((newVal >= 38) && (newVal <= 41)) {
                        tv1.setText("21");
                    } else if ((newVal >= 42) && (newVal <= 45)) {
                        tv1.setText("22");
                    } else if ((newVal >= 46) && (newVal <= 49)) {
                        tv1.setText("23");
                    } else if ((newVal >= 50) && (newVal <= 53)) {
                        tv1.setText("24");
                    } else {
                        tv1.setText("25");
                    }
                } // end of age group 7 (37 to 39)

                //Start of age group 8 ( 40 to 42 pushup)
                else if ((ageint >= 40) && (ageint <= 42)) {
                    if ((newVal >= 0) && (newVal <= 7)) {
                        tv1.setText("0");
                    } else if (newVal == 8) {
                        tv1.setText("1");
                    } else if (newVal == 9) {
                        tv1.setText("2");
                    } else if (newVal == 10) {
                        tv1.setText("4");
                    } else if (newVal == 11) {
                        tv1.setText("6");
                    } else if (newVal == 12) {
                        tv1.setText("8");
                    } else if (newVal == 13) {
                        tv1.setText("9");
                    } else if (newVal == 14) {
                        tv1.setText("10");
                    } else if (newVal == 15) {
                        tv1.setText("11");
                    } else if (newVal == 16) {
                        tv1.setText("12");
                    } else if (newVal == 17) {
                        tv1.setText("13");
                    } else if (newVal == 18) {
                        tv1.setText("14");
                    } else if ((newVal == 19) || (newVal == 20)) {
                        tv1.setText("15");
                    } else if ((newVal >= 21) && (newVal <= 23)) {
                        tv1.setText("16");
                    } else if ((newVal >= 24) && (newVal <= 26)) {
                        tv1.setText("17");
                    } else if ((newVal >= 27) && (newVal <= 29)) {
                        tv1.setText("18");
                    } else if ((newVal >= 30) && (newVal <= 32)) {
                        tv1.setText("19");
                    } else if ((newVal >= 33) && (newVal <= 36)) {
                        tv1.setText("20");
                    } else if ((newVal >= 37) && (newVal <= 40)) {
                        tv1.setText("21");
                    } else if ((newVal >= 41) && (newVal <= 44)) {
                        tv1.setText("22");
                    } else if ((newVal >= 45) && (newVal <= 48)) {
                        tv1.setText("23");
                    } else if ((newVal >= 49) && (newVal <= 52)) {
                        tv1.setText("24");
                    } else {
                        tv1.setText("25");
                    }
                } // end of age group 8 (40 to 42)

                //Start of age group 9 ( 43 to 45 pushup)
                else if ((ageint >= 43) && (ageint <= 45)) {
                    if ((newVal >= 0) && (newVal <= 6)) {
                        tv1.setText("0");
                    } else if (newVal == 7) {
                        tv1.setText("1");
                    } else if (newVal == 8) {
                        tv1.setText("2");
                    } else if (newVal == 9) {
                        tv1.setText("4");
                    } else if (newVal == 10) {
                        tv1.setText("6");
                    } else if (newVal == 11) {
                        tv1.setText("8");
                    } else if (newVal == 12) {
                        tv1.setText("9");
                    } else if (newVal == 13) {
                        tv1.setText("10");
                    } else if (newVal == 14) {
                        tv1.setText("11");
                    } else if (newVal == 15) {
                        tv1.setText("12");
                    } else if (newVal == 16) {
                        tv1.setText("13");
                    } else if (newVal == 17) {
                        tv1.setText("14");
                    } else if ((newVal == 18) || (newVal == 19)) {
                        tv1.setText("15");
                    } else if ((newVal >= 20) && (newVal <= 22)) {
                        tv1.setText("16");
                    } else if ((newVal >= 23) && (newVal <= 25)) {
                        tv1.setText("17");
                    } else if ((newVal >= 26) && (newVal <= 28)) {
                        tv1.setText("18");
                    } else if ((newVal >= 29) && (newVal <= 31)) {
                        tv1.setText("19");
                    } else if ((newVal >= 32) && (newVal <= 34)) {
                        tv1.setText("20");
                    } else if ((newVal >= 35) && (newVal <= 38)) {
                        tv1.setText("21");
                    } else if ((newVal >= 39) && (newVal <= 42)) {
                        tv1.setText("22");
                    } else if ((newVal >= 43) && (newVal <= 46)) {
                        tv1.setText("23");
                    } else if ((newVal >= 48) && (newVal <= 50)) {
                        tv1.setText("24");
                    } else {
                        tv1.setText("25");
                    }
                } // end of age group 9 (43 to 45)

                //Start of age group 10 ( 46 to 48 pushup)
                else if ((ageint >= 46) && (ageint <= 48)) {
                    if ((newVal >= 0) && (newVal <= 5)) {
                        tv1.setText("0");
                    } else if (newVal == 6) {
                        tv1.setText("1");
                    } else if (newVal == 7) {
                        tv1.setText("2");
                    } else if (newVal == 8) {
                        tv1.setText("4");
                    } else if (newVal == 9) {
                        tv1.setText("6");
                    } else if (newVal == 10) {
                        tv1.setText("8");
                    } else if (newVal == 11) {
                        tv1.setText("9");
                    } else if (newVal == 12) {
                        tv1.setText("10");
                    } else if (newVal == 13) {
                        tv1.setText("11");
                    } else if (newVal == 14) {
                        tv1.setText("12");
                    } else if (newVal == 15) {
                        tv1.setText("13");
                    } else if (newVal == 16) {
                        tv1.setText("14");
                    } else if ((newVal == 17) || (newVal == 18)) {
                        tv1.setText("15");
                    } else if ((newVal >= 19) && (newVal <= 21)) {
                        tv1.setText("16");
                    } else if ((newVal >= 22) && (newVal <= 24)) {
                        tv1.setText("17");
                    } else if ((newVal >= 25) && (newVal <= 29)) {
                        tv1.setText("18");
                    } else if ((newVal >= 28) && (newVal <= 30)) {
                        tv1.setText("19");
                    } else if ((newVal >= 31) && (newVal <= 33)) {
                        tv1.setText("20");
                    } else if ((newVal >= 34) && (newVal <= 36)) {
                        tv1.setText("21");
                    } else if ((newVal >= 37) && (newVal <= 40)) {
                        tv1.setText("22");
                    } else if ((newVal >= 41) && (newVal <= 44)) {
                        tv1.setText("23");
                    } else if ((newVal >= 45) && (newVal <= 48)) {
                        tv1.setText("24");
                    } else {
                        tv1.setText("25");
                    }
                } // end of age group 10 (46 to 48)

                //Start of age group 11 ( 49 to 51 pushup)
                else if ((ageint >= 49) && (ageint <= 51)) {
                    if ((newVal >= 0) && (newVal <= 4)) {
                        tv1.setText("0");
                    } else if (newVal == 5) {
                        tv1.setText("1");
                    } else if (newVal == 6) {
                        tv1.setText("2");
                    } else if (newVal == 7) {
                        tv1.setText("4");
                    } else if (newVal == 8) {
                        tv1.setText("6");
                    } else if (newVal == 9) {
                        tv1.setText("8");
                    } else if (newVal == 10) {
                        tv1.setText("9");
                    } else if (newVal == 11) {
                        tv1.setText("10");
                    } else if (newVal == 12) {
                        tv1.setText("11");
                    } else if (newVal == 13) {
                        tv1.setText("12");
                    } else if (newVal == 14) {
                        tv1.setText("13");
                    } else if (newVal == 15) {
                        tv1.setText("14");
                    } else if ((newVal == 16) || (newVal == 17)) {
                        tv1.setText("15");
                    } else if ((newVal >= 18) && (newVal <= 20)) {
                        tv1.setText("16");
                    } else if ((newVal >= 21) && (newVal <= 23)) {
                        tv1.setText("17");
                    } else if ((newVal >= 24) && (newVal <= 26)) {
                        tv1.setText("18");
                    } else if ((newVal >= 27) && (newVal <= 29)) {
                        tv1.setText("19");
                    } else if ((newVal >= 30) && (newVal <= 32)) {
                        tv1.setText("20");
                    } else if ((newVal >= 33) && (newVal <= 35)) {
                        tv1.setText("21");
                    } else if ((newVal >= 36) && (newVal <= 38)) {
                        tv1.setText("22");
                    } else if ((newVal >= 39) && (newVal <= 42)) {
                        tv1.setText("23");
                    } else if ((newVal >= 43) && (newVal <= 46)) {
                        tv1.setText("24");
                    } else {
                        tv1.setText("25");
                    }
                } // end of age group 11 (49 to 51)

                //Start of age group 12 ( 52 to 54 pushup)
                else if ((ageint >= 52) && (ageint <= 54)) {
                    if ((newVal >= 0) && (newVal <= 3)) {
                        tv1.setText("0");
                    } else if (newVal == 4) {
                        tv1.setText("1");
                    } else if (newVal == 5) {
                        tv1.setText("2");
                    } else if (newVal == 6) {
                        tv1.setText("4");
                    } else if (newVal == 7) {
                        tv1.setText("6");
                    } else if (newVal == 8) {
                        tv1.setText("8");
                    } else if (newVal == 9) {
                        tv1.setText("9");
                    } else if (newVal == 10) {
                        tv1.setText("10");
                    } else if (newVal == 11) {
                        tv1.setText("11");
                    } else if (newVal == 12) {
                        tv1.setText("12");
                    } else if (newVal == 13) {
                        tv1.setText("13");
                    } else if (newVal == 14) {
                        tv1.setText("14");
                    } else if ((newVal == 15) || (newVal == 16)) {
                        tv1.setText("15");
                    } else if ((newVal >= 17) && (newVal <= 19)) {
                        tv1.setText("16");
                    } else if ((newVal >= 20) && (newVal <= 22)) {
                        tv1.setText("17");
                    } else if ((newVal >= 23) && (newVal <= 25)) {
                        tv1.setText("18");
                    } else if ((newVal >= 26) && (newVal <= 28)) {
                        tv1.setText("19");
                    } else if ((newVal >= 29) && (newVal <= 31)) {
                        tv1.setText("20");
                    } else if ((newVal >= 32) && (newVal <= 34)) {
                        tv1.setText("21");
                    } else if ((newVal >= 35) && (newVal <= 37)) {
                        tv1.setText("22");
                    } else if ((newVal >= 38) && (newVal <= 40)) {
                        tv1.setText("23");
                    } else if ((newVal >= 41) && (newVal <= 44)) {
                        tv1.setText("24");
                    } else {
                        tv1.setText("25");
                    }
                } // end of age group 12 (52 to 54)

                //Start of age group 13 ( 55 to 57 pushup)
                else if ((ageint >= 55) && (ageint <= 57)) {
                    if ((newVal >= 0) && (newVal <= 2)) {
                        tv1.setText("0");
                    } else if (newVal == 3) {
                        tv1.setText("1");
                    } else if (newVal == 4) {
                        tv1.setText("2");
                    } else if (newVal == 5) {
                        tv1.setText("4");
                    } else if (newVal == 6) {
                        tv1.setText("6");
                    } else if (newVal == 7) {
                        tv1.setText("8");
                    } else if (newVal == 8) {
                        tv1.setText("9");
                    } else if (newVal == 9) {
                        tv1.setText("10");
                    } else if (newVal == 10) {
                        tv1.setText("11");
                    } else if (newVal == 11) {
                        tv1.setText("12");
                    } else if (newVal == 12) {
                        tv1.setText("13");
                    } else if (newVal == 13) {
                        tv1.setText("14");
                    } else if ((newVal == 14) || (newVal == 15)) {
                        tv1.setText("15");
                    } else if ((newVal >= 16) && (newVal <= 18)) {
                        tv1.setText("16");
                    } else if ((newVal >= 19) && (newVal <= 21)) {
                        tv1.setText("17");
                    } else if ((newVal >= 22) && (newVal <= 24)) {
                        tv1.setText("18");
                    } else if ((newVal >= 25) && (newVal <= 27)) {
                        tv1.setText("19");
                    } else if ((newVal >= 28) && (newVal <= 29)) {
                        tv1.setText("20");
                    } else if ((newVal >= 30) && (newVal <= 32)) {
                        tv1.setText("21");
                    } else if ((newVal >= 33) && (newVal <= 35)) {
                        tv1.setText("22");
                    } else if ((newVal >= 36) && (newVal <= 38)) {
                        tv1.setText("23");
                    } else if ((newVal >= 39) && (newVal <= 41)) {
                        tv1.setText("24");
                    } else {
                        tv1.setText("25");
                    }

                } // end of age group 13 (55 to 57)

                //Start of age group 14 ( 58 to 60 pushup)
                else {
                    if ((newVal <= 1)) {
                        tv1.setText("0");
                    } else if (newVal == 2) {
                        tv1.setText("1");
                    } else if (newVal == 3) {
                        tv1.setText("2");
                    } else if (newVal == 4) {
                        tv1.setText("4");
                    } else if (newVal == 5) {
                        tv1.setText("6");
                    } else if (newVal == 6) {
                        tv1.setText("8");
                    } else if (newVal == 7) {
                        tv1.setText("9");
                    } else if (newVal == 8) {
                        tv1.setText("10");
                    } else if (newVal == 9) {
                        tv1.setText("11");
                    } else if (newVal == 10) {
                        tv1.setText("12");
                    } else if (newVal == 11) {
                        tv1.setText("13");
                    } else if (newVal == 12) {
                        tv1.setText("14");
                    } else if ((newVal == 13) || (newVal == 14)) {
                        tv1.setText("15");
                    } else if ((newVal >= 15) && (newVal <= 17)) {
                        tv1.setText("16");
                    } else if ((newVal >= 18) && (newVal <= 20)) {
                        tv1.setText("17");
                    } else if ((newVal >= 21) && (newVal <= 23)) {
                        tv1.setText("18");
                    } else if ((newVal >= 24) && (newVal <= 26)) {
                        tv1.setText("19");
                    } else if ((newVal >= 27) && (newVal <= 28)) {
                        tv1.setText("20");
                    } else if ((newVal >= 29) && (newVal <= 30)) {
                        tv1.setText("21");
                    } else if ((newVal >= 31) && (newVal <= 33)) {
                        tv1.setText("22");
                    } else if ((newVal >= 34) && (newVal <= 36)) {
                        tv1.setText("23");
                    } else if ((newVal >= 37) && (newVal <= 39)) {
                        tv1.setText("24");
                    } else {
                        tv1.setText("25");
                    }
                } // end of age group 14 (58 to 60)

                int m = Integer.parseInt(tv1.getText().toString());
                int n = Integer.parseInt(tv4.getText().toString());
                int o = Integer.parseInt(tv5.getText().toString());
                int g = m + n + o;
                tv2.setText(String.valueOf(g));


                if (g < 51) {
                    if (status.equals("false")) {
                        int f = 61 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("You need ");
                        sb.append(str);
                        sb.append(" more points to pass. Add oil!");
                        tv7.setText(sb);

                    } else {
                        int f = 51 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("You need ");
                        sb.append(str);
                        sb.append(" more points to pass. Add oil!");
                        tv7.setText(sb);
                    }

                } else if ((g >= 51) && (g < 61)) {
                    if (status.equals("false")) {
                        int f = 61 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("You need ");
                        sb.append(str);
                        sb.append(" more points to pass. Add oil!");
                        tv7.setText(sb);

                    } else {
                        int f = 75 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Well done. You need ");
                        sb.append(str);
                        sb.append(" more points to get Silver.");
                        tv7.setText(sb);
                    }

                } else if ((g >= 61) && (g < 75)) {
                    int f = 75 - g;
                    String str = Integer.toString(f);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Well done. You need ");
                    sb.append(str);
                    sb.append(" more points to get Silver.");
                    tv7.setText(sb);
                } else if ((g >= 75) && (g < 85)) {
                    if (special.equals("true")) {
                        int f = 91 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Well done. You need ");
                        sb.append(str);
                        sb.append(" more points to get Gold.");
                        tv7.setText(sb);
                    } else {
                        int f = 85 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Well done. You need ");
                        sb.append(str);
                        sb.append(" more points to get Gold.");
                        tv7.setText(sb);
                    }
                } else {
                    if (special.equals("true")) {
                        if (g < 90) {
                            int f = 91 - g;
                            String str = Integer.toString(f);
                            StringBuilder sb = new StringBuilder();
                            sb.append("Well done. You need ");
                            sb.append(str);
                            sb.append(" more points to get Gold.");
                            tv7.setText(sb);
                        } else {
                            tv7.setText("You got GOLD!!");
                        }
                    } else {
                        tv7.setText("You got GOLD!!");
                    }
                }


            }
        }); //end of Push-up Selector



        // Start of Running 2.4km Selector
        numPicker2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

            @Override
            public void onValueChange(NumberPicker numPicker2, int oldVal2, int newVal2) {

                //Start of age group 1 ( <22 Running)
                if (ageint < 22) {
                    if (newVal2 == 0) {
                        tv4.setText("50");
                    } else if (newVal2 == 1) {
                        tv4.setText("49");
                    } else if (newVal2 == 2) {
                        tv4.setText("48");
                    } else if (newVal2 == 3) {
                        tv4.setText("47");
                    } else if (newVal2 == 4) {
                        tv4.setText("46");
                    } else if (newVal2 == 5) {
                        tv4.setText("45");
                    } else if (newVal2 == 6) {
                        tv4.setText("44");
                    } else if (newVal2 == 7) {
                        tv4.setText("43");
                    } else if (newVal2 == 8) {
                        tv4.setText("42");
                    } else if (newVal2 == 9) {
                        tv4.setText("41");
                    } else if (newVal2 == 10) {
                        tv4.setText("40");
                    } else if (newVal2 == 11) {
                        tv4.setText("39");
                    } else if ((newVal2 == 12) || (newVal2 == 13)) {
                        tv4.setText("38");
                    } else if ((newVal2 == 14) || (newVal2 == 15)) {
                        tv4.setText("37");
                    } else if ((newVal2 == 16) || (newVal2 == 17)) {
                        tv4.setText("36");
                    } else if ((newVal2 == 18) || (newVal2 == 19)) {
                        tv4.setText("35");
                    } else if (newVal2 == 20) {
                        tv4.setText("34");
                    } else if (newVal2 == 21) {
                        tv4.setText("33");
                    } else if (newVal2 == 22) {
                        tv4.setText("32");
                    } else if (newVal2 == 23) {
                        tv4.setText("31");
                    } else if (newVal2 == 24) {
                        tv4.setText("30");
                    } else if (newVal2 == 25) {
                        tv4.setText("29");
                    } else if (newVal2 == 26) {
                        tv4.setText("28");
                    } else if (newVal2 == 27) {
                        tv4.setText("27");
                    } else if (newVal2 == 28) {
                        tv4.setText("26");
                    } else if (newVal2 == 29) {
                        tv4.setText("25");
                    } else if (newVal2 == 30) {
                        tv4.setText("24");
                    } else if (newVal2 == 31) {
                        tv4.setText("23");
                    } else if (newVal2 == 32) {
                        tv4.setText("22");
                    } else if (newVal2 == 33) {
                        tv4.setText("21");
                    } else if (newVal2 == 34) {
                        tv4.setText("20");
                    } else if (newVal2 == 35) {
                        tv4.setText("19");
                    } else if (newVal2 == 36) {
                        tv4.setText("18");
                    } else if (newVal2 == 37) {
                        tv4.setText("16");
                    } else if (newVal2 == 38) {
                        tv4.setText("14");
                    } else if (newVal2 == 39) {
                        tv4.setText("12");
                    } else if (newVal2 == 40) {
                        tv4.setText("10");
                    } else if (newVal2 == 41) {
                        tv4.setText("8");
                    } else if (newVal2 == 42) {
                        tv4.setText("6");
                    } else if (newVal2 == 43) {
                        tv4.setText("4");
                    } else if (newVal2 == 44) {
                        tv4.setText("2");
                    } else if (newVal2 == 45) {
                        tv4.setText("1");
                    } else {
                        tv4.setText("0");
                    }

                } // end of age group 1 (<22)


                //Start of age group 2 ( 22 to 24 Running)
                else if ((ageint >= 22) && (ageint <= 24)) {
                    if (newVal2 <= 1) {
                        tv4.setText("50");
                    } else if (newVal2 == 2) {
                        tv4.setText("49");
                    } else if (newVal2 == 3) {
                        tv4.setText("48");
                    } else if (newVal2 == 4) {
                        tv4.setText("47");
                    } else if (newVal2 == 5) {
                        tv4.setText("46");
                    } else if (newVal2 == 6) {
                        tv4.setText("45");
                    } else if (newVal2 == 7) {
                        tv4.setText("44");
                    } else if (newVal2 == 8) {
                        tv4.setText("43");
                    } else if (newVal2 == 9) {
                        tv4.setText("42");
                    } else if (newVal2 == 10) {
                        tv4.setText("41");
                    } else if (newVal2 == 11) {
                        tv4.setText("40");
                    } else if (newVal2 == 12) {
                        tv4.setText("39");
                    } else if ((newVal2 == 13) || (newVal2 == 14)) {
                        tv4.setText("38");
                    } else if ((newVal2 == 15) || (newVal2 == 16)) {
                        tv4.setText("37");
                    } else if ((newVal2 == 17) || (newVal2 == 18)) {
                        tv4.setText("36");
                    } else if ((newVal2 == 19) || (newVal2 == 20)) {
                        tv4.setText("35");
                    } else if (newVal2 == 21) {
                        tv4.setText("34");
                    } else if (newVal2 == 22) {
                        tv4.setText("33");
                    } else if (newVal2 == 23) {
                        tv4.setText("32");
                    } else if (newVal2 == 24) {
                        tv4.setText("31");
                    } else if (newVal2 == 25) {
                        tv4.setText("30");
                    } else if (newVal2 == 26) {
                        tv4.setText("29");
                    } else if (newVal2 == 27) {
                        tv4.setText("28");
                    } else if (newVal2 == 28) {
                        tv4.setText("27");
                    } else if (newVal2 == 29) {
                        tv4.setText("26");
                    } else if (newVal2 == 30) {
                        tv4.setText("25");
                    } else if (newVal2 == 31) {
                        tv4.setText("24");
                    } else if (newVal2 == 32) {
                        tv4.setText("23");
                    } else if (newVal2 == 33) {
                        tv4.setText("22");
                    } else if (newVal2 == 34) {
                        tv4.setText("21");
                    } else if (newVal2 == 35) {
                        tv4.setText("20");
                    } else if (newVal2 == 36) {
                        tv4.setText("19");
                    } else if (newVal2 == 37) {
                        tv4.setText("18");
                    } else if (newVal2 == 38) {
                        tv4.setText("16");
                    } else if (newVal2 == 39) {
                        tv4.setText("14");
                    } else if (newVal2 == 40) {
                        tv4.setText("12");
                    } else if (newVal2 == 41) {
                        tv4.setText("10");
                    } else if (newVal2 == 42) {
                        tv4.setText("8");
                    } else if (newVal2 == 43) {
                        tv4.setText("6");
                    } else if (newVal2 == 44) {
                        tv4.setText("4");
                    } else if (newVal2 == 45) {
                        tv4.setText("2");
                    } else if (newVal2 == 46) {
                        tv4.setText("1");
                    } else {
                        tv4.setText("0");
                    }

                } // end of age group 2 (22 to 24)


                //Start of age group 3 ( 25 to 27 Running)
                else if ((ageint >= 25) && (ageint <= 27)) {
                    if (newVal2 <= 2) {
                        tv4.setText("50");
                    } else if (newVal2 == 3) {
                        tv4.setText("49");
                    } else if (newVal2 == 4) {
                        tv4.setText("48");
                    } else if (newVal2 == 5) {
                        tv4.setText("47");
                    } else if (newVal2 == 6) {
                        tv4.setText("46");
                    } else if (newVal2 == 7) {
                        tv4.setText("45");
                    } else if (newVal2 == 8) {
                        tv4.setText("44");
                    } else if (newVal2 == 9) {
                        tv4.setText("43");
                    } else if (newVal2 == 10) {
                        tv4.setText("42");
                    } else if (newVal2 == 11) {
                        tv4.setText("41");
                    } else if (newVal2 == 12) {
                        tv4.setText("40");
                    } else if (newVal2 == 13) {
                        tv4.setText("39");
                    } else if ((newVal2 == 14) || (newVal2 == 15)) {
                        tv4.setText("38");
                    } else if ((newVal2 == 16) || (newVal2 == 17)) {
                        tv4.setText("37");
                    } else if ((newVal2 == 18) || (newVal2 == 19)) {
                        tv4.setText("36");
                    } else if ((newVal2 == 20) || (newVal2 == 21)) {
                        tv4.setText("35");
                    } else if (newVal2 == 22) {
                        tv4.setText("34");
                    } else if (newVal2 == 23) {
                        tv4.setText("33");
                    } else if (newVal2 == 24) {
                        tv4.setText("32");
                    } else if (newVal2 == 25) {
                        tv4.setText("31");
                    } else if (newVal2 == 26) {
                        tv4.setText("30");
                    } else if (newVal2 == 27) {
                        tv4.setText("29");
                    } else if (newVal2 == 28) {
                        tv4.setText("28");
                    } else if (newVal2 == 29) {
                        tv4.setText("27");
                    } else if (newVal2 == 30) {
                        tv4.setText("26");
                    } else if (newVal2 == 31) {
                        tv4.setText("25");
                    } else if (newVal2 == 32) {
                        tv4.setText("24");
                    } else if (newVal2 == 33) {
                        tv4.setText("23");
                    } else if (newVal2 == 34) {
                        tv4.setText("22");
                    } else if (newVal2 == 35) {
                        tv4.setText("21");
                    } else if (newVal2 == 36) {
                        tv4.setText("20");
                    } else if (newVal2 == 37) {
                        tv4.setText("19");
                    } else if (newVal2 == 38) {
                        tv4.setText("18");
                    } else if (newVal2 == 39) {
                        tv4.setText("16");
                    } else if (newVal2 == 40) {
                        tv4.setText("14");
                    } else if (newVal2 == 41) {
                        tv4.setText("12");
                    } else if (newVal2 == 42) {
                        tv4.setText("10");
                    } else if (newVal2 == 43) {
                        tv4.setText("8");
                    } else if (newVal2 == 44) {
                        tv4.setText("6");
                    } else if (newVal2 == 45) {
                        tv4.setText("4");
                    } else if (newVal2 == 46) {
                        tv4.setText("2");
                    } else if (newVal2 == 47) {
                        tv4.setText("1");
                    } else {
                        tv4.setText("0");
                    }

                } // end of age group 3 (25 to 27)


                //Start of age group 4 ( 28 to 30 Running)
                else if ((ageint >= 28) && (ageint <= 30)) {
                    if (newVal2 <= 4) {
                        tv4.setText("50");
                    } else if (newVal2 == 5) {
                        tv4.setText("49");
                    } else if (newVal2 == 6) {
                        tv4.setText("48");
                    } else if (newVal2 == 7) {
                        tv4.setText("47");
                    } else if (newVal2 == 8) {
                        tv4.setText("46");
                    } else if (newVal2 == 9) {
                        tv4.setText("45");
                    } else if (newVal2 == 10) {
                        tv4.setText("44");
                    } else if (newVal2 == 11) {
                        tv4.setText("43");
                    } else if (newVal2 == 12) {
                        tv4.setText("42");
                    } else if (newVal2 == 13) {
                        tv4.setText("41");
                    } else if (newVal2 == 14) {
                        tv4.setText("40");
                    } else if (newVal2 == 15) {
                        tv4.setText("39");
                    } else if ((newVal2 == 16) || (newVal2 == 17)) {
                        tv4.setText("38");
                    } else if ((newVal2 == 18) || (newVal2 == 19)) {
                        tv4.setText("37");
                    } else if ((newVal2 == 20) || (newVal2 == 21)) {
                        tv4.setText("36");
                    } else if ((newVal2 == 22) || (newVal2 == 23)) {
                        tv4.setText("35");
                    } else if (newVal2 == 24) {
                        tv4.setText("34");
                    } else if (newVal2 == 25) {
                        tv4.setText("33");
                    } else if (newVal2 == 26) {
                        tv4.setText("32");
                    } else if (newVal2 == 27) {
                        tv4.setText("31");
                    } else if (newVal2 == 28) {
                        tv4.setText("30");
                    } else if (newVal2 == 29) {
                        tv4.setText("29");
                    } else if (newVal2 == 30) {
                        tv4.setText("28");
                    } else if (newVal2 == 31) {
                        tv4.setText("27");
                    } else if (newVal2 == 32) {
                        tv4.setText("26");
                    } else if (newVal2 == 33) {
                        tv4.setText("25");
                    } else if (newVal2 == 34) {
                        tv4.setText("24");
                    } else if (newVal2 == 35) {
                        tv4.setText("23");
                    } else if (newVal2 == 36) {
                        tv4.setText("22");
                    } else if (newVal2 == 37) {
                        tv4.setText("21");
                    } else if (newVal2 == 38) {
                        tv4.setText("20");
                    } else if (newVal2 == 39) {
                        tv4.setText("19");
                    } else if (newVal2 == 40) {
                        tv4.setText("18");
                    } else if (newVal2 == 41) {
                        tv4.setText("16");
                    } else if (newVal2 == 42) {
                        tv4.setText("14");
                    } else if (newVal2 == 43) {
                        tv4.setText("12");
                    } else if (newVal2 == 44) {
                        tv4.setText("10");
                    } else if (newVal2 == 45) {
                        tv4.setText("8");
                    } else if (newVal2 == 46) {
                        tv4.setText("6");
                    } else if (newVal2 == 47) {
                        tv4.setText("4");
                    } else if (newVal2 == 48) {
                        tv4.setText("2");
                    } else if (newVal2 == 49) {
                        tv4.setText("1");
                    } else {
                        tv4.setText("0");
                    }

                } // end of age group 4 (28 to 30)


                //Start of age group 5 ( 31 to 33 Running)
                else if ((ageint >= 31) && (ageint <= 33)) {
                    if (newVal2 <= 5) {
                        tv4.setText("50");
                    } else if (newVal2 == 6) {
                        tv4.setText("49");
                    } else if (newVal2 == 7) {
                        tv4.setText("48");
                    } else if (newVal2 == 8) {
                        tv4.setText("47");
                    } else if (newVal2 == 9) {
                        tv4.setText("46");
                    } else if (newVal2 == 10) {
                        tv4.setText("45");
                    } else if (newVal2 == 11) {
                        tv4.setText("44");
                    } else if (newVal2 == 12) {
                        tv4.setText("43");
                    } else if (newVal2 == 13) {
                        tv4.setText("42");
                    } else if (newVal2 == 14) {
                        tv4.setText("41");
                    } else if (newVal2 == 15) {
                        tv4.setText("40");
                    } else if (newVal2 == 16) {
                        tv4.setText("39");
                    } else if ((newVal2 == 17) || (newVal2 == 18)) {
                        tv4.setText("38");
                    } else if ((newVal2 == 19) || (newVal2 == 20)) {
                        tv4.setText("37");
                    } else if ((newVal2 == 21) || (newVal2 == 22)) {
                        tv4.setText("36");
                    } else if ((newVal2 == 23) || (newVal2 == 24)) {
                        tv4.setText("35");
                    } else if (newVal2 == 25) {
                        tv4.setText("34");
                    } else if (newVal2 == 26) {
                        tv4.setText("33");
                    } else if (newVal2 == 27) {
                        tv4.setText("32");
                    } else if (newVal2 == 28) {
                        tv4.setText("31");
                    } else if (newVal2 == 29) {
                        tv4.setText("30");
                    } else if (newVal2 == 30) {
                        tv4.setText("29");
                    } else if (newVal2 == 31) {
                        tv4.setText("28");
                    } else if (newVal2 == 32) {
                        tv4.setText("27");
                    } else if (newVal2 == 33) {
                        tv4.setText("26");
                    } else if (newVal2 == 34) {
                        tv4.setText("25");
                    } else if (newVal2 == 35) {
                        tv4.setText("24");
                    } else if (newVal2 == 36) {
                        tv4.setText("23");
                    } else if (newVal2 == 37) {
                        tv4.setText("22");
                    } else if (newVal2 == 38) {
                        tv4.setText("21");
                    } else if (newVal2 == 39) {
                        tv4.setText("20");
                    } else if (newVal2 == 40) {
                        tv4.setText("19");
                    } else if (newVal2 == 41) {
                        tv4.setText("18");
                    } else if (newVal2 == 42) {
                        tv4.setText("16");
                    } else if (newVal2 == 43) {
                        tv4.setText("14");
                    } else if (newVal2 == 44) {
                        tv4.setText("12");
                    } else if (newVal2 == 45) {
                        tv4.setText("10");
                    } else if (newVal2 == 46) {
                        tv4.setText("8");
                    } else if (newVal2 == 47) {
                        tv4.setText("6");
                    } else if (newVal2 == 48) {
                        tv4.setText("4");
                    } else if (newVal2 == 49) {
                        tv4.setText("2");
                    } else if (newVal2 == 50) {
                        tv4.setText("1");
                    } else {
                        tv4.setText("0");
                    }

                } // end of age group 5 (31 to 33)

                //Start of age group 6 ( 34 to 36 Running)
                else if ((ageint >= 34) && (ageint <= 36)) {
                    if (newVal2 <= 6) {
                        tv4.setText("50");
                    } else if (newVal2 == 7) {
                        tv4.setText("49");
                    } else if (newVal2 == 8) {
                        tv4.setText("48");
                    } else if (newVal2 == 9) {
                        tv4.setText("47");
                    } else if (newVal2 == 10) {
                        tv4.setText("46");
                    } else if (newVal2 == 11) {
                        tv4.setText("45");
                    } else if (newVal2 == 12) {
                        tv4.setText("44");
                    } else if (newVal2 == 13) {
                        tv4.setText("43");
                    } else if (newVal2 == 14) {
                        tv4.setText("42");
                    } else if (newVal2 == 15) {
                        tv4.setText("41");
                    } else if (newVal2 == 16) {
                        tv4.setText("40");
                    } else if (newVal2 == 17) {
                        tv4.setText("39");
                    } else if ((newVal2 == 18) || (newVal2 == 19)) {
                        tv4.setText("38");
                    } else if ((newVal2 == 20) || (newVal2 == 21)) {
                        tv4.setText("37");
                    } else if ((newVal2 == 22) || (newVal2 == 23)) {
                        tv4.setText("36");
                    } else if ((newVal2 == 24) || (newVal2 == 25)) {
                        tv4.setText("35");
                    } else if (newVal2 == 26) {
                        tv4.setText("34");
                    } else if (newVal2 == 27) {
                        tv4.setText("33");
                    } else if (newVal2 == 28) {
                        tv4.setText("32");
                    } else if (newVal2 == 29) {
                        tv4.setText("31");
                    } else if (newVal2 == 30) {
                        tv4.setText("30");
                    } else if (newVal2 == 31) {
                        tv4.setText("29");
                    } else if (newVal2 == 32) {
                        tv4.setText("28");
                    } else if (newVal2 == 33) {
                        tv4.setText("27");
                    } else if (newVal2 == 34) {
                        tv4.setText("26");
                    } else if (newVal2 == 35) {
                        tv4.setText("25");
                    } else if (newVal2 == 36) {
                        tv4.setText("24");
                    } else if (newVal2 == 37) {
                        tv4.setText("23");
                    } else if (newVal2 == 38) {
                        tv4.setText("22");
                    } else if (newVal2 == 39) {
                        tv4.setText("21");
                    } else if (newVal2 == 40) {
                        tv4.setText("20");
                    } else if (newVal2 == 41) {
                        tv4.setText("19");
                    } else if (newVal2 == 42) {
                        tv4.setText("18");
                    } else if (newVal2 == 43) {
                        tv4.setText("16");
                    } else if (newVal2 == 44) {
                        tv4.setText("14");
                    } else if (newVal2 == 45) {
                        tv4.setText("12");
                    } else if (newVal2 == 46) {
                        tv4.setText("10");
                    } else if (newVal2 == 47) {
                        tv4.setText("8");
                    } else if (newVal2 == 48) {
                        tv4.setText("6");
                    } else if (newVal2 == 49) {
                        tv4.setText("4");
                    } else if (newVal2 == 50) {
                        tv4.setText("2");
                    } else if (newVal2 == 51) {
                        tv4.setText("1");
                    } else {
                        tv4.setText("0");
                    }

                } // end of age group 6 (34 to 36)

                //Start of age group 7 ( 37 to 39 Running)
                else if ((ageint >= 37) && (ageint <= 39)) {
                    if (newVal2 <= 7) {
                        tv4.setText("50");
                    } else if (newVal2 == 8) {
                        tv4.setText("49");
                    } else if (newVal2 == 9) {
                        tv4.setText("48");
                    } else if (newVal2 == 10) {
                        tv4.setText("47");
                    } else if (newVal2 == 11) {
                        tv4.setText("46");
                    } else if (newVal2 == 12) {
                        tv4.setText("45");
                    } else if (newVal2 == 13) {
                        tv4.setText("44");
                    } else if (newVal2 == 14) {
                        tv4.setText("43");
                    } else if (newVal2 == 15) {
                        tv4.setText("42");
                    } else if (newVal2 == 16) {
                        tv4.setText("41");
                    } else if (newVal2 == 17) {
                        tv4.setText("40");
                    } else if (newVal2 == 18) {
                        tv4.setText("39");
                    } else if ((newVal2 == 19) || (newVal2 == 20)) {
                        tv4.setText("38");
                    } else if ((newVal2 == 21) || (newVal2 == 22)) {
                        tv4.setText("37");
                    } else if ((newVal2 == 23) || (newVal2 == 24)) {
                        tv4.setText("36");
                    } else if ((newVal2 == 25) || (newVal2 == 26)) {
                        tv4.setText("35");
                    } else if (newVal2 == 27) {
                        tv4.setText("34");
                    } else if (newVal2 == 28) {
                        tv4.setText("33");
                    } else if (newVal2 == 29) {
                        tv4.setText("32");
                    } else if (newVal2 == 30) {
                        tv4.setText("31");
                    } else if (newVal2 == 31) {
                        tv4.setText("30");
                    } else if (newVal2 == 32) {
                        tv4.setText("29");
                    } else if (newVal2 == 33) {
                        tv4.setText("28");
                    } else if (newVal2 == 34) {
                        tv4.setText("27");
                    } else if (newVal2 == 35) {
                        tv4.setText("26");
                    } else if (newVal2 == 36) {
                        tv4.setText("25");
                    } else if (newVal2 == 37) {
                        tv4.setText("24");
                    } else if (newVal2 == 38) {
                        tv4.setText("23");
                    } else if (newVal2 == 39) {
                        tv4.setText("22");
                    } else if (newVal2 == 40) {
                        tv4.setText("21");
                    } else if (newVal2 == 41) {
                        tv4.setText("20");
                    } else if (newVal2 == 42) {
                        tv4.setText("19");
                    } else if (newVal2 == 43) {
                        tv4.setText("18");
                    } else if (newVal2 == 44) {
                        tv4.setText("16");
                    } else if (newVal2 == 45) {
                        tv4.setText("14");
                    } else if (newVal2 == 46) {
                        tv4.setText("12");
                    } else if (newVal2 == 47) {
                        tv4.setText("10");
                    } else if (newVal2 == 48) {
                        tv4.setText("8");
                    } else if (newVal2 == 49) {
                        tv4.setText("6");
                    } else if (newVal2 == 50) {
                        tv4.setText("4");
                    } else if (newVal2 == 51) {
                        tv4.setText("2");
                    } else if (newVal2 == 52) {
                        tv4.setText("1");
                    } else {
                        tv4.setText("0");
                    }

                } // end of age group 7 (37 to 39)

                //Start of age group 8 ( 40 to 42 Running)
                else if ((ageint >= 40) && (ageint <= 42)) {
                    if (newVal2 <= 8) {
                        tv4.setText("50");
                    } else if (newVal2 == 9) {
                        tv4.setText("49");
                    } else if (newVal2 == 10) {
                        tv4.setText("48");
                    } else if (newVal2 == 11) {
                        tv4.setText("47");
                    } else if (newVal2 == 12) {
                        tv4.setText("46");
                    } else if (newVal2 == 13) {
                        tv4.setText("45");
                    } else if (newVal2 == 14) {
                        tv4.setText("44");
                    } else if (newVal2 == 15) {
                        tv4.setText("43");
                    } else if (newVal2 == 16) {
                        tv4.setText("42");
                    } else if (newVal2 == 17) {
                        tv4.setText("41");
                    } else if (newVal2 == 18) {
                        tv4.setText("40");
                    } else if (newVal2 == 19) {
                        tv4.setText("39");
                    } else if ((newVal2 == 20) || (newVal2 == 21)) {
                        tv4.setText("38");
                    } else if ((newVal2 == 22) || (newVal2 == 23)) {
                        tv4.setText("37");
                    } else if ((newVal2 == 24) || (newVal2 == 25)) {
                        tv4.setText("36");
                    } else if ((newVal2 == 26) || (newVal2 == 27)) {
                        tv4.setText("35");
                    } else if (newVal2 == 28) {
                        tv4.setText("34");
                    } else if (newVal2 == 29) {
                        tv4.setText("33");
                    } else if (newVal2 == 30) {
                        tv4.setText("32");
                    } else if (newVal2 == 31) {
                        tv4.setText("31");
                    } else if (newVal2 == 32) {
                        tv4.setText("30");
                    } else if (newVal2 == 33) {
                        tv4.setText("29");
                    } else if (newVal2 == 34) {
                        tv4.setText("28");
                    } else if (newVal2 == 35) {
                        tv4.setText("27");
                    } else if (newVal2 == 36) {
                        tv4.setText("26");
                    } else if (newVal2 == 37) {
                        tv4.setText("25");
                    } else if (newVal2 == 38) {
                        tv4.setText("24");
                    } else if (newVal2 == 39) {
                        tv4.setText("23");
                    } else if (newVal2 == 40) {
                        tv4.setText("22");
                    } else if (newVal2 == 41) {
                        tv4.setText("21");
                    } else if (newVal2 == 42) {
                        tv4.setText("20");
                    } else if (newVal2 == 43) {
                        tv4.setText("19");
                    } else if (newVal2 == 44) {
                        tv4.setText("18");
                    } else if (newVal2 == 45) {
                        tv4.setText("16");
                    } else if (newVal2 == 46) {
                        tv4.setText("14");
                    } else if (newVal2 == 47) {
                        tv4.setText("12");
                    } else if (newVal2 == 48) {
                        tv4.setText("10");
                    } else if (newVal2 == 49) {
                        tv4.setText("8");
                    } else if (newVal2 == 50) {
                        tv4.setText("6");
                    } else if (newVal2 == 51) {
                        tv4.setText("4");
                    } else if (newVal2 == 52) {
                        tv4.setText("2");
                    } else if (newVal2 == 53) {
                        tv4.setText("1");
                    } else {
                        tv4.setText("0");
                    }
                } // end of age group 8 (40 to 42)

                //Start of age group 9 ( 43 to 45 Running)
                else if ((ageint >= 43) && (ageint <= 45)) {
                    if (newVal2 <= 9) {
                        tv4.setText("50");
                    } else if (newVal2 == 10) {
                        tv4.setText("49");
                    } else if (newVal2 == 11) {
                        tv4.setText("48");
                    } else if (newVal2 == 12) {
                        tv4.setText("47");
                    } else if (newVal2 == 13) {
                        tv4.setText("46");
                    } else if (newVal2 == 14) {
                        tv4.setText("45");
                    } else if (newVal2 == 15) {
                        tv4.setText("44");
                    } else if (newVal2 == 16) {
                        tv4.setText("43");
                    } else if (newVal2 == 17) {
                        tv4.setText("42");
                    } else if (newVal2 == 18) {
                        tv4.setText("41");
                    } else if (newVal2 == 19) {
                        tv4.setText("40");
                    } else if (newVal2 == 20) {
                        tv4.setText("39");
                    } else if ((newVal2 == 21) || (newVal2 == 22)) {
                        tv4.setText("38");
                    } else if ((newVal2 == 23) || (newVal2 == 24)) {
                        tv4.setText("37");
                    } else if ((newVal2 == 25) || (newVal2 == 26)) {
                        tv4.setText("36");
                    } else if ((newVal2 == 27) || (newVal2 == 28)) {
                        tv4.setText("35");
                    } else if (newVal2 == 29) {
                        tv4.setText("34");
                    } else if (newVal2 == 30) {
                        tv4.setText("33");
                    } else if (newVal2 == 31) {
                        tv4.setText("32");
                    } else if (newVal2 == 32) {
                        tv4.setText("31");
                    } else if (newVal2 == 33) {
                        tv4.setText("30");
                    } else if (newVal2 == 34) {
                        tv4.setText("29");
                    } else if (newVal2 == 35) {
                        tv4.setText("28");
                    } else if (newVal2 == 36) {
                        tv4.setText("27");
                    } else if (newVal2 == 37) {
                        tv4.setText("26");
                    } else if (newVal2 == 38) {
                        tv4.setText("25");
                    } else if (newVal2 == 39) {
                        tv4.setText("24");
                    } else if (newVal2 == 40) {
                        tv4.setText("23");
                    } else if (newVal2 == 41) {
                        tv4.setText("22");
                    } else if (newVal2 == 42) {
                        tv4.setText("21");
                    } else if (newVal2 == 43) {
                        tv4.setText("20");
                    } else if (newVal2 == 44) {
                        tv4.setText("19");
                    } else if (newVal2 == 45) {
                        tv4.setText("18");
                    } else if (newVal2 == 46) {
                        tv4.setText("16");
                    } else if (newVal2 == 47) {
                        tv4.setText("14");
                    } else if (newVal2 == 48) {
                        tv4.setText("12");
                    } else if (newVal2 == 49) {
                        tv4.setText("10");
                    } else if (newVal2 == 50) {
                        tv4.setText("8");
                    } else if (newVal2 == 51) {
                        tv4.setText("6");
                    } else if (newVal2 == 52) {
                        tv4.setText("4");
                    } else if (newVal2 == 53) {
                        tv4.setText("2");
                    } else if (newVal2 == 54) {
                        tv4.setText("1");
                    } else {
                        tv4.setText("0");
                    }

                } // end of age group 9 (43 to 45)

                //Start of age group 10 ( 46 to 48 Running)
                else if ((ageint >= 46) && (ageint <= 48)) {
                    if (newVal2 <= 10) {
                        tv4.setText("50");
                    } else if (newVal2 == 11) {
                        tv4.setText("49");
                    } else if (newVal2 == 12) {
                        tv4.setText("48");
                    } else if (newVal2 == 13) {
                        tv4.setText("47");
                    } else if (newVal2 == 14) {
                        tv4.setText("46");
                    } else if (newVal2 == 15) {
                        tv4.setText("45");
                    } else if (newVal2 == 16) {
                        tv4.setText("44");
                    } else if (newVal2 == 17) {
                        tv4.setText("43");
                    } else if (newVal2 == 18) {
                        tv4.setText("42");
                    } else if (newVal2 == 19) {
                        tv4.setText("41");
                    } else if (newVal2 == 20) {
                        tv4.setText("40");
                    } else if (newVal2 == 21) {
                        tv4.setText("39");
                    } else if ((newVal2 == 22) || (newVal2 == 23)) {
                        tv4.setText("38");
                    } else if ((newVal2 == 24) || (newVal2 == 25)) {
                        tv4.setText("37");
                    } else if ((newVal2 == 26) || (newVal2 == 27)) {
                        tv4.setText("36");
                    } else if ((newVal2 == 28) || (newVal2 == 29)) {
                        tv4.setText("35");
                    } else if (newVal2 == 30) {
                        tv4.setText("34");
                    } else if (newVal2 == 31) {
                        tv4.setText("33");
                    } else if (newVal2 == 32) {
                        tv4.setText("32");
                    } else if (newVal2 == 33) {
                        tv4.setText("31");
                    } else if (newVal2 == 34) {
                        tv4.setText("30");
                    } else if (newVal2 == 35) {
                        tv4.setText("29");
                    } else if (newVal2 == 36) {
                        tv4.setText("28");
                    } else if (newVal2 == 37) {
                        tv4.setText("27");
                    } else if (newVal2 == 38) {
                        tv4.setText("26");
                    } else if (newVal2 == 39) {
                        tv4.setText("25");
                    } else if (newVal2 == 40) {
                        tv4.setText("24");
                    } else if (newVal2 == 41) {
                        tv4.setText("23");
                    } else if (newVal2 == 42) {
                        tv4.setText("22");
                    } else if (newVal2 == 43) {
                        tv4.setText("21");
                    } else if (newVal2 == 44) {
                        tv4.setText("20");
                    } else if (newVal2 == 45) {
                        tv4.setText("19");
                    } else if (newVal2 == 46) {
                        tv4.setText("18");
                    } else if (newVal2 == 47) {
                        tv4.setText("16");
                    } else if (newVal2 == 48) {
                        tv4.setText("14");
                    } else if (newVal2 == 49) {
                        tv4.setText("12");
                    } else if (newVal2 == 50) {
                        tv4.setText("10");
                    } else if (newVal2 == 51) {
                        tv4.setText("8");
                    } else if (newVal2 == 52) {
                        tv4.setText("6");
                    } else if (newVal2 == 53) {
                        tv4.setText("4");
                    } else if (newVal2 == 54) {
                        tv4.setText("2");
                    } else if (newVal2 == 55) {
                        tv4.setText("1");
                    } else {
                        tv4.setText("0");
                    }

                } // end of age group 10 (46 to 48)

                //Start of age group 11 ( 49 to 51 Running)
                else if ((ageint >= 49) && (ageint <= 51)) {
                    if (newVal2 <= 11) {
                        tv4.setText("50");
                    } else if (newVal2 == 12) {
                        tv4.setText("49");
                    } else if (newVal2 == 13) {
                        tv4.setText("48");
                    } else if (newVal2 == 14) {
                        tv4.setText("47");
                    } else if (newVal2 == 15) {
                        tv4.setText("46");
                    } else if (newVal2 == 16) {
                        tv4.setText("45");
                    } else if (newVal2 == 17) {
                        tv4.setText("44");
                    } else if (newVal2 == 18) {
                        tv4.setText("43");
                    } else if (newVal2 == 19) {
                        tv4.setText("42");
                    } else if (newVal2 == 20) {
                        tv4.setText("41");
                    } else if (newVal2 == 21) {
                        tv4.setText("40");
                    } else if (newVal2 == 22) {
                        tv4.setText("39");
                    } else if ((newVal2 == 23) || (newVal2 == 24)) {
                        tv4.setText("38");
                    } else if ((newVal2 == 25) || (newVal2 == 26)) {
                        tv4.setText("37");
                    } else if ((newVal2 == 27) || (newVal2 == 28)) {
                        tv4.setText("36");
                    } else if ((newVal2 == 29) || (newVal2 == 30)) {
                        tv4.setText("35");
                    } else if (newVal2 == 31) {
                        tv4.setText("34");
                    } else if (newVal2 == 32) {
                        tv4.setText("33");
                    } else if (newVal2 == 33) {
                        tv4.setText("32");
                    } else if (newVal2 == 34) {
                        tv4.setText("31");
                    } else if (newVal2 == 35) {
                        tv4.setText("30");
                    } else if (newVal2 == 36) {
                        tv4.setText("29");
                    } else if (newVal2 == 37) {
                        tv4.setText("28");
                    } else if (newVal2 == 38) {
                        tv4.setText("27");
                    } else if (newVal2 == 39) {
                        tv4.setText("26");
                    } else if (newVal2 == 40) {
                        tv4.setText("25");
                    } else if (newVal2 == 41) {
                        tv4.setText("24");
                    } else if (newVal2 == 42) {
                        tv4.setText("23");
                    } else if (newVal2 == 43) {
                        tv4.setText("22");
                    } else if (newVal2 == 44) {
                        tv4.setText("21");
                    } else if (newVal2 == 45) {
                        tv4.setText("20");
                    } else if (newVal2 == 46) {
                        tv4.setText("19");
                    } else if (newVal2 == 47) {
                        tv4.setText("18");
                    } else if (newVal2 == 48) {
                        tv4.setText("16");
                    } else if (newVal2 == 49) {
                        tv4.setText("14");
                    } else if (newVal2 == 50) {
                        tv4.setText("12");
                    } else if (newVal2 == 51) {
                        tv4.setText("10");
                    } else if (newVal2 == 52) {
                        tv4.setText("8");
                    } else if (newVal2 == 53) {
                        tv4.setText("6");
                    } else if (newVal2 == 54) {
                        tv4.setText("4");
                    } else if (newVal2 == 55) {
                        tv4.setText("2");
                    } else if (newVal2 == 56) {
                        tv4.setText("1");
                    } else {
                        tv4.setText("0");
                    }


                } // end of age group 11 (49 to 51)

                //Start of age group 12 ( 52 to 54 Running)
                else if ((ageint >= 52) && (ageint <= 54)) {
                    if (newVal2 <= 12) {
                        tv4.setText("50");
                    } else if (newVal2 == 13) {
                        tv4.setText("49");
                    } else if (newVal2 == 14) {
                        tv4.setText("48");
                    } else if (newVal2 == 15) {
                        tv4.setText("47");
                    } else if (newVal2 == 16) {
                        tv4.setText("46");
                    } else if (newVal2 == 17) {
                        tv4.setText("45");
                    } else if (newVal2 == 18) {
                        tv4.setText("44");
                    } else if (newVal2 == 19) {
                        tv4.setText("43");
                    } else if (newVal2 == 20) {
                        tv4.setText("42");
                    } else if (newVal2 == 21) {
                        tv4.setText("41");
                    } else if (newVal2 == 22) {
                        tv4.setText("40");
                    } else if (newVal2 == 23) {
                        tv4.setText("39");
                    } else if ((newVal2 == 24) || (newVal2 == 25)) {
                        tv4.setText("38");
                    } else if ((newVal2 == 26) || (newVal2 == 27)) {
                        tv4.setText("37");
                    } else if ((newVal2 == 28) || (newVal2 == 29)) {
                        tv4.setText("36");
                    } else if ((newVal2 == 30) || (newVal2 == 31)) {
                        tv4.setText("35");
                    } else if (newVal2 == 32) {
                        tv4.setText("34");
                    } else if (newVal2 == 33) {
                        tv4.setText("33");
                    } else if (newVal2 == 34) {
                        tv4.setText("32");
                    } else if (newVal2 == 35) {
                        tv4.setText("31");
                    } else if (newVal2 == 36) {
                        tv4.setText("30");
                    } else if (newVal2 == 37) {
                        tv4.setText("29");
                    } else if (newVal2 == 38) {
                        tv4.setText("28");
                    } else if (newVal2 == 39) {
                        tv4.setText("27");
                    } else if (newVal2 == 40) {
                        tv4.setText("26");
                    } else if (newVal2 == 41) {
                        tv4.setText("25");
                    } else if (newVal2 == 42) {
                        tv4.setText("24");
                    } else if (newVal2 == 43) {
                        tv4.setText("23");
                    } else if (newVal2 == 44) {
                        tv4.setText("22");
                    } else if (newVal2 == 45) {
                        tv4.setText("21");
                    } else if (newVal2 == 46) {
                        tv4.setText("20");
                    } else if (newVal2 == 47) {
                        tv4.setText("19");
                    } else if (newVal2 == 48) {
                        tv4.setText("18");
                    } else if (newVal2 == 49) {
                        tv4.setText("16");
                    } else if (newVal2 == 50) {
                        tv4.setText("14");
                    } else if (newVal2 == 51) {
                        tv4.setText("12");
                    } else if (newVal2 == 52) {
                        tv4.setText("10");
                    } else if (newVal2 == 53) {
                        tv4.setText("8");
                    } else if (newVal2 == 54) {
                        tv4.setText("6");
                    } else if (newVal2 == 55) {
                        tv4.setText("4");
                    } else if (newVal2 == 56) {
                        tv4.setText("2");
                    } else if (newVal2 == 57) {
                        tv4.setText("1");
                    } else {
                        tv4.setText("0");
                    }

                } // end of age group 12 (52 to 54)

                //Start of age group 13 ( 55 to 57 Running)
                else if ((ageint >= 55) && (ageint <= 57)) {
                    if (newVal2 <= 13) {
                        tv4.setText("50");
                    } else if (newVal2 == 14) {
                        tv4.setText("49");
                    } else if (newVal2 == 15) {
                        tv4.setText("48");
                    } else if (newVal2 == 16) {
                        tv4.setText("47");
                    } else if (newVal2 == 17) {
                        tv4.setText("46");
                    } else if (newVal2 == 18) {
                        tv4.setText("45");
                    } else if (newVal2 == 19) {
                        tv4.setText("44");
                    } else if (newVal2 == 20) {
                        tv4.setText("43");
                    } else if (newVal2 == 21) {
                        tv4.setText("42");
                    } else if (newVal2 == 22) {
                        tv4.setText("41");
                    } else if (newVal2 == 23) {
                        tv4.setText("40");
                    } else if (newVal2 == 24) {
                        tv4.setText("39");
                    } else if ((newVal2 == 25) || (newVal2 == 26)) {
                        tv4.setText("38");
                    } else if ((newVal2 == 27) || (newVal2 == 28)) {
                        tv4.setText("37");
                    } else if ((newVal2 == 29) || (newVal2 == 30)) {
                        tv4.setText("36");
                    } else if ((newVal2 == 31) || (newVal2 == 32)) {
                        tv4.setText("35");
                    } else if (newVal2 == 33) {
                        tv4.setText("34");
                    } else if (newVal2 == 34) {
                        tv4.setText("33");
                    } else if (newVal2 == 35) {
                        tv4.setText("32");
                    } else if (newVal2 == 36) {
                        tv4.setText("31");
                    } else if (newVal2 == 37) {
                        tv4.setText("30");
                    } else if (newVal2 == 38) {
                        tv4.setText("29");
                    } else if (newVal2 == 39) {
                        tv4.setText("28");
                    } else if (newVal2 == 40) {
                        tv4.setText("27");
                    } else if (newVal2 == 41) {
                        tv4.setText("26");
                    } else if (newVal2 == 42) {
                        tv4.setText("25");
                    } else if (newVal2 == 43) {
                        tv4.setText("24");
                    } else if (newVal2 == 44) {
                        tv4.setText("23");
                    } else if (newVal2 == 45) {
                        tv4.setText("22");
                    } else if (newVal2 == 46) {
                        tv4.setText("21");
                    } else if (newVal2 == 47) {
                        tv4.setText("20");
                    } else if (newVal2 == 48) {
                        tv4.setText("19");
                    } else if (newVal2 == 49) {
                        tv4.setText("18");
                    } else if (newVal2 == 50) {
                        tv4.setText("16");
                    } else if (newVal2 == 51) {
                        tv4.setText("14");
                    } else if (newVal2 == 52) {
                        tv4.setText("12");
                    } else if (newVal2 == 53) {
                        tv4.setText("10");
                    } else if (newVal2 == 54) {
                        tv4.setText("8");
                    } else if (newVal2 == 55) {
                        tv4.setText("6");
                    } else if (newVal2 == 56) {
                        tv4.setText("4");
                    } else if (newVal2 == 57) {
                        tv4.setText("2");
                    } else if (newVal2 == 58) {
                        tv4.setText("1");
                    } else {
                        tv4.setText("0");
                    }

                } // end of age group 13 (55 to 57)

                //Start of age group 14 ( 58 to 60 Running)
                else {
                    if (newVal2 <= 14) {
                        tv4.setText("50");
                    } else if (newVal2 == 15) {
                        tv4.setText("49");
                    } else if (newVal2 == 16) {
                        tv4.setText("48");
                    } else if (newVal2 == 17) {
                        tv4.setText("47");
                    } else if (newVal2 == 18) {
                        tv4.setText("46");
                    } else if (newVal2 == 19) {
                        tv4.setText("45");
                    } else if (newVal2 == 20) {
                        tv4.setText("44");
                    } else if (newVal2 == 21) {
                        tv4.setText("43");
                    } else if (newVal2 == 22) {
                        tv4.setText("42");
                    } else if (newVal2 == 23) {
                        tv4.setText("41");
                    } else if (newVal2 == 24) {
                        tv4.setText("40");
                    } else if (newVal2 == 25) {
                        tv4.setText("39");
                    } else if ((newVal2 == 26) || (newVal2 == 27)) {
                        tv4.setText("38");
                    } else if ((newVal2 == 28) || (newVal2 == 29)) {
                        tv4.setText("37");
                    } else if ((newVal2 == 30) || (newVal2 == 31)) {
                        tv4.setText("36");
                    } else if ((newVal2 == 32) || (newVal2 == 33)) {
                        tv4.setText("35");
                    } else if (newVal2 == 34) {
                        tv4.setText("34");
                    } else if (newVal2 == 35) {
                        tv4.setText("33");
                    } else if (newVal2 == 36) {
                        tv4.setText("32");
                    } else if (newVal2 == 37) {
                        tv4.setText("31");
                    } else if (newVal2 == 38) {
                        tv4.setText("30");
                    } else if (newVal2 == 39) {
                        tv4.setText("29");
                    } else if (newVal2 == 40) {
                        tv4.setText("28");
                    } else if (newVal2 == 41) {
                        tv4.setText("27");
                    } else if (newVal2 == 42) {
                        tv4.setText("26");
                    } else if (newVal2 == 43) {
                        tv4.setText("25");
                    } else if (newVal2 == 44) {
                        tv4.setText("24");
                    } else if (newVal2 == 45) {
                        tv4.setText("23");
                    } else if (newVal2 == 46) {
                        tv4.setText("22");
                    } else if (newVal2 == 47) {
                        tv4.setText("21");
                    } else if (newVal2 == 48) {
                        tv4.setText("20");
                    } else if (newVal2 == 49) {
                        tv4.setText("19");
                    } else if (newVal2 == 50) {
                        tv4.setText("18");
                    } else if (newVal2 == 51) {
                        tv4.setText("16");
                    } else if (newVal2 == 52) {
                        tv4.setText("14");
                    } else if (newVal2 == 53) {
                        tv4.setText("12");
                    } else if (newVal2 == 54) {
                        tv4.setText("10");
                    } else if (newVal2 == 55) {
                        tv4.setText("8");
                    } else if (newVal2 == 56) {
                        tv4.setText("6");
                    } else if (newVal2 == 57) {
                        tv4.setText("4");
                    } else if (newVal2 == 58) {
                        tv4.setText("2");
                    } else if (newVal2 == 59) {
                        tv4.setText("1");
                    } else {
                        tv4.setText("0");
                    }

                } // end of age group 14 (58 to 60)


                int m = Integer.parseInt(tv1.getText().toString());
                int n = Integer.parseInt(tv4.getText().toString());
                int o = Integer.parseInt(tv5.getText().toString());
                int g = m + n + o;
                tv2.setText(String.valueOf(g));

                if (g < 51) {
                    if (status.equals("false")) {
                        int f = 61 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("You need ");
                        sb.append(str);
                        sb.append(" more points to pass. Add oil!");
                        tv7.setText(sb);

                    } else {
                        int f = 51 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("You need ");
                        sb.append(str);
                        sb.append(" more points to pass. Add oil!");
                        tv7.setText(sb);
                    }

                } else if ((g >= 51) && (g < 61)) {
                    if (status.equals("false")) {
                        int f = 61 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("You need ");
                        sb.append(str);
                        sb.append(" more points to pass. Add oil!");
                        tv7.setText(sb);

                    } else {
                        int f = 75 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Well done. You need ");
                        sb.append(str);
                        sb.append(" more points to get Silver.");
                        tv7.setText(sb);
                    }
                } else if ((g >= 61) && (g < 75)) {
                    int f = 75 - g;
                    String str = Integer.toString(f);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Well done. You need ");
                    sb.append(str);
                    sb.append(" more points to get Silver.");
                    tv7.setText(sb);
                } else if ((g >= 75) && (g < 85)) {
                    if (special.equals("true")) {
                        int f = 91 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Well done. You need ");
                        sb.append(str);
                        sb.append(" more points to get Gold.");
                        tv7.setText(sb);
                    } else {
                        int f = 85 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Well done. You need ");
                        sb.append(str);
                        sb.append(" more points to get Gold.");
                        tv7.setText(sb);
                    }
                }
                else {
                    if (special.equals("true")) {
                        if ((g < 90) && (g >= 85)) {
                            int f = 91 - g;
                            String str = Integer.toString(f);
                            StringBuilder sb = new StringBuilder();
                            sb.append("Well done. You need ");
                            sb.append(str);
                            sb.append(" more points to get Gold.");
                            tv7.setText(sb);
                        } else {
                            tv7.setText("You got GOLD!!");
                        }
                    } else {
                        tv7.setText("You got GOLD!!");
                    }
                }

            }
        }); //end of Running Selector


// Start of Sit up Selector
        numPicker3.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

            @Override
            public void onValueChange(NumberPicker numPicker3, int oldVal1, int newVal1) {

                //Start of age group 1 ( <22 Sit Up)
                if (ageint < 22) {
                    if ((newVal1 >= 0) && (newVal1 <= 14)) {
                        tv5.setText("0");
                    } else if (newVal1 == 15) {
                        tv5.setText("1");
                    } else if (newVal1 == 16) {
                        tv5.setText("2");
                    } else if (newVal1 == 17) {
                        tv5.setText("3");
                    } else if (newVal1 == 18) {
                        tv5.setText("4");
                    } else if (newVal1 == 19) {
                        tv5.setText("5");
                    } else if ((newVal1 >= 20) && (newVal1 <= 21)) {
                        tv5.setText("6");
                    } else if ((newVal1 >= 22) && (newVal1 <= 23)) {
                        tv5.setText("7");
                    } else if (newVal1 == 24) {
                        tv5.setText("8");
                    } else if (newVal1 == 25) {
                        tv5.setText("9");
                    } else if (newVal1 == 26) {
                        tv5.setText("10");
                    } else if (newVal1 == 27) {
                        tv5.setText("11");
                    } else if (newVal1 == 28) {
                        tv5.setText("12");
                    } else if ((newVal1 >= 29) && (newVal1 <= 30)) {
                        tv5.setText("13");
                    } else if ((newVal1 >= 31) && (newVal1 <= 32)) {
                        tv5.setText("14");
                    } else if (newVal1 == 33) {
                        tv5.setText("15");
                    } else if (newVal1 == 34) {
                        tv5.setText("16");
                    } else if (newVal1 == 35) {
                        tv5.setText("17");
                    } else if ((newVal1 >= 36) && (newVal1 <= 37)) {
                        tv5.setText("18");
                    } else if ((newVal1 >= 38) && (newVal1 <= 39)) {
                        tv5.setText("19");
                    } else if ((newVal1 >= 40) && (newVal1 <= 43)) {
                        tv5.setText("20");
                    } else if ((newVal1 >= 44) && (newVal1 <= 47)) {
                        tv5.setText("21");
                    } else if ((newVal1 >= 48) && (newVal1 <= 51)) {
                        tv5.setText("22");
                    } else if ((newVal1 >= 52) && (newVal1 <= 55)) {
                        tv5.setText("23");
                    } else if ((newVal1 >= 56) && (newVal1 <= 59)) {
                        tv5.setText("24");
                    } else {
                        tv5.setText("25");
                    }
                } // end of age group 1 (<22)

                //Start of age group 2 ( 22 to 24 Sit Up)
                else if ((ageint >= 22) && (ageint <= 24)) {
                    if ((newVal1 >= 0) && (newVal1 <= 13)) {
                        tv5.setText("0");
                    } else if (newVal1 == 14) {
                        tv5.setText("1");
                    } else if (newVal1 == 15) {
                        tv5.setText("2");
                    } else if (newVal1 == 16) {
                        tv5.setText("3");
                    } else if (newVal1 == 17) {
                        tv5.setText("4");
                    } else if (newVal1 == 18) {
                        tv5.setText("5");
                    } else if ((newVal1 >= 19) && (newVal1 <= 20)) {
                        tv5.setText("6");
                    } else if ((newVal1 >= 21) && (newVal1 <= 22)) {
                        tv5.setText("7");
                    } else if (newVal1 == 23) {
                        tv5.setText("8");
                    } else if (newVal1 == 24) {
                        tv5.setText("9");
                    } else if (newVal1 == 25) {
                        tv5.setText("10");
                    } else if (newVal1 == 26) {
                        tv5.setText("11");
                    } else if (newVal1 == 27) {
                        tv5.setText("12");
                    } else if ((newVal1 >= 28) && (newVal1 <= 29)) {
                        tv5.setText("13");
                    } else if ((newVal1 >= 30) && (newVal1 <= 31)) {
                        tv5.setText("14");
                    } else if (newVal1 == 32) {
                        tv5.setText("15");
                    } else if (newVal1 == 33) {
                        tv5.setText("16");
                    } else if (newVal1 == 34) {
                        tv5.setText("17");
                    } else if ((newVal1 >= 35) && (newVal1 <= 36)) {
                        tv5.setText("18");
                    } else if ((newVal1 >= 37) && (newVal1 <= 38)) {
                        tv5.setText("19");
                    } else if ((newVal1 >= 39) && (newVal1 <= 42)) {
                        tv5.setText("20");
                    } else if ((newVal1 >= 43) && (newVal1 <= 46)) {
                        tv5.setText("21");
                    } else if ((newVal1 >= 47) && (newVal1 <= 50)) {
                        tv5.setText("22");
                    } else if ((newVal1 >= 51) && (newVal1 <= 54)) {
                        tv5.setText("23");
                    } else if ((newVal1 >= 55) && (newVal1 <= 58)) {
                        tv5.setText("24");
                    } else {
                        tv5.setText("25");
                    }
                } // end of age group 2 (22 to 24)


                //Start of age group 3 ( 25 to 27 Situp)
                else if ((ageint >= 25) && (ageint <= 27)) {
                    if ((newVal1 >= 0) && (newVal1 <= 12)) {
                        tv5.setText("0");
                    } else if (newVal1 == 13) {
                        tv5.setText("1");
                    } else if (newVal1 == 14) {
                        tv5.setText("2");
                    } else if (newVal1 == 15) {
                        tv5.setText("3");
                    } else if (newVal1 == 16) {
                        tv5.setText("4");
                    } else if (newVal1 == 17) {
                        tv5.setText("5");
                    } else if ((newVal1 >= 18) && (newVal1 <= 19)) {
                        tv5.setText("6");
                    } else if ((newVal1 >= 20) && (newVal1 <= 21)) {
                        tv5.setText("7");
                    } else if (newVal1 == 22) {
                        tv5.setText("8");
                    } else if (newVal1 == 23) {
                        tv5.setText("9");
                    } else if (newVal1 == 24) {
                        tv5.setText("10");
                    } else if (newVal1 == 25) {
                        tv5.setText("11");
                    } else if (newVal1 == 26) {
                        tv5.setText("12");
                    } else if ((newVal1 >= 27) && (newVal1 <= 28)) {
                        tv5.setText("13");
                    } else if ((newVal1 >= 29) && (newVal1 <= 30)) {
                        tv5.setText("14");
                    } else if (newVal1 == 31) {
                        tv5.setText("15");
                    } else if (newVal1 == 32) {
                        tv5.setText("16");
                    } else if (newVal1 == 33) {
                        tv5.setText("17");
                    } else if ((newVal1 >= 34) && (newVal1 <= 35)) {
                        tv5.setText("18");
                    } else if ((newVal1 >= 36) && (newVal1 <= 37)) {
                        tv5.setText("19");
                    } else if ((newVal1 >= 38) && (newVal1 <= 41)) {
                        tv5.setText("20");
                    } else if ((newVal1 >= 42) && (newVal1 <= 45)) {
                        tv5.setText("21");
                    } else if ((newVal1 >= 46) && (newVal1 <= 49)) {
                        tv5.setText("22");
                    } else if ((newVal1 >= 50) && (newVal1 <= 53)) {
                        tv5.setText("23");
                    } else if ((newVal1 >= 54) && (newVal1 <= 57)) {
                        tv5.setText("24");
                    } else {
                        tv5.setText("25");
                    }


                } // end of age group 3 (25 to 27)

                //Start of age group 4 ( 28 to 30 Situp)
                else if ((ageint >= 28) && (ageint <= 30)) {
                    if ((newVal1 >= 0) && (newVal1 <= 11)) {
                        tv5.setText("0");
                    } else if (newVal1 == 12) {
                        tv5.setText("1");
                    } else if (newVal1 == 13) {
                        tv5.setText("2");
                    } else if (newVal1 == 14) {
                        tv5.setText("3");
                    } else if (newVal1 == 15) {
                        tv5.setText("4");
                    } else if (newVal1 == 16) {
                        tv5.setText("5");
                    } else if ((newVal1 >= 17) && (newVal1 <= 18)) {
                        tv5.setText("6");
                    } else if ((newVal1 >= 19) && (newVal1 <= 20)) {
                        tv5.setText("7");
                    } else if (newVal1 == 21) {
                        tv5.setText("8");
                    } else if (newVal1 == 22) {
                        tv5.setText("9");
                    } else if (newVal1 == 23) {
                        tv5.setText("10");
                    } else if (newVal1 == 24) {
                        tv5.setText("11");
                    } else if (newVal1 == 25) {
                        tv5.setText("12");
                    } else if ((newVal1 >= 26) && (newVal1 <= 27)) {
                        tv5.setText("13");
                    } else if ((newVal1 >= 28) && (newVal1 <= 29)) {
                        tv5.setText("14");
                    } else if (newVal1 == 30) {
                        tv5.setText("15");
                    } else if (newVal1 == 31) {
                        tv5.setText("16");
                    } else if (newVal1 == 32) {
                        tv5.setText("17");
                    } else if ((newVal1 >= 33) && (newVal1 <= 34)) {
                        tv5.setText("18");
                    } else if ((newVal1 >= 35) && (newVal1 <= 36)) {
                        tv5.setText("19");
                    } else if ((newVal1 >= 37) && (newVal1 <= 40)) {
                        tv5.setText("20");
                    } else if ((newVal1 >= 41) && (newVal1 <= 44)) {
                        tv5.setText("21");
                    } else if ((newVal1 >= 45) && (newVal1 <= 48)) {
                        tv5.setText("22");
                    } else if ((newVal1 >= 49) && (newVal1 <= 52)) {
                        tv5.setText("23");
                    } else if ((newVal1 >= 53) && (newVal1 <= 56)) {
                        tv5.setText("24");
                    } else {
                        tv5.setText("25");
                    }


                } // end of age group 4 (28 to 30)


                //Start of age group 5 ( 31 to 33 Situp)
                else if ((ageint >= 31) && (ageint <= 33)) {
                    if ((newVal1 >= 0) && (newVal1 <= 10)) {
                        tv5.setText("0");
                    } else if (newVal1 == 11) {
                        tv5.setText("1");
                    } else if (newVal1 == 12) {
                        tv5.setText("2");
                    } else if (newVal1 == 13) {
                        tv5.setText("3");
                    } else if (newVal1 == 14) {
                        tv5.setText("4");
                    } else if (newVal1 == 15) {
                        tv5.setText("5");
                    } else if ((newVal1 >= 16) && (newVal1 <= 17)) {
                        tv5.setText("6");
                    } else if ((newVal1 >= 18) && (newVal1 <= 19)) {
                        tv5.setText("7");
                    } else if (newVal1 == 20) {
                        tv5.setText("8");
                    } else if (newVal1 == 21) {
                        tv5.setText("9");
                    } else if (newVal1 == 22) {
                        tv5.setText("10");
                    } else if (newVal1 == 23) {
                        tv5.setText("11");
                    } else if (newVal1 == 24) {
                        tv5.setText("12");
                    } else if ((newVal1 >= 25) && (newVal1 <= 26)) {
                        tv5.setText("13");
                    } else if ((newVal1 >= 27) && (newVal1 <= 28)) {
                        tv5.setText("14");
                    } else if (newVal1 == 29) {
                        tv5.setText("15");
                    } else if (newVal1 == 30) {
                        tv5.setText("16");
                    } else if (newVal1 == 31) {
                        tv5.setText("17");
                    } else if ((newVal1 >= 32) && (newVal1 <= 33)) {
                        tv5.setText("18");
                    } else if ((newVal1 >= 34) && (newVal1 <= 35)) {
                        tv5.setText("19");
                    } else if ((newVal1 >= 36) && (newVal1 <= 39)) {
                        tv5.setText("20");
                    } else if ((newVal1 >= 40) && (newVal1 <= 43)) {
                        tv5.setText("21");
                    } else if ((newVal1 >= 44) && (newVal1 <= 47)) {
                        tv5.setText("22");
                    } else if ((newVal1 >= 48) && (newVal1 <= 51)) {
                        tv5.setText("23");
                    } else if ((newVal1 >= 52) && (newVal1 <= 55)) {
                        tv5.setText("24");
                    } else {
                        tv5.setText("25");
                    }

                } // end of age group 5 (31 to 33)

                //Start of age group 6 ( 34 to 36 Situp)
                else if ((ageint >= 34) && (ageint <= 36)) {
                    if ((newVal1 >= 0) && (newVal1 <= 9)) {
                        tv5.setText("0");
                    } else if (newVal1 == 10) {
                        tv5.setText("1");
                    } else if (newVal1 == 11) {
                        tv5.setText("2");
                    } else if (newVal1 == 12) {
                        tv5.setText("3");
                    } else if (newVal1 == 13) {
                        tv5.setText("4");
                    } else if (newVal1 == 14) {
                        tv5.setText("5");
                    } else if ((newVal1 >= 15) && (newVal1 <= 16)) {
                        tv5.setText("6");
                    } else if ((newVal1 >= 17) && (newVal1 <= 18)) {
                        tv5.setText("7");
                    } else if (newVal1 == 19) {
                        tv5.setText("8");
                    } else if (newVal1 == 20) {
                        tv5.setText("9");
                    } else if (newVal1 == 21) {
                        tv5.setText("10");
                    } else if (newVal1 == 22) {
                        tv5.setText("11");
                    } else if (newVal1 == 23) {
                        tv5.setText("12");
                    } else if ((newVal1 >= 24) && (newVal1 <= 25)) {
                        tv5.setText("13");
                    } else if ((newVal1 >= 26) && (newVal1 <= 27)) {
                        tv5.setText("14");
                    } else if (newVal1 == 28) {
                        tv5.setText("15");
                    } else if (newVal1 == 29) {
                        tv5.setText("16");
                    } else if (newVal1 == 30) {
                        tv5.setText("17");
                    } else if ((newVal1 >= 31) && (newVal1 <= 32)) {
                        tv5.setText("18");
                    } else if ((newVal1 >= 33) && (newVal1 <= 34)) {
                        tv5.setText("19");
                    } else if ((newVal1 >= 35) && (newVal1 <= 38)) {
                        tv5.setText("20");
                    } else if ((newVal1 >= 39) && (newVal1 <= 42)) {
                        tv5.setText("21");
                    } else if ((newVal1 >= 43) && (newVal1 <= 46)) {
                        tv5.setText("22");
                    } else if ((newVal1 >= 47) && (newVal1 <= 50)) {
                        tv5.setText("23");
                    } else if ((newVal1 >= 51) && (newVal1 <= 54)) {
                        tv5.setText("24");
                    } else {
                        tv5.setText("25");
                    }

                } // end of age group 6 (34 to 36)

                //Start of age group 7 ( 37 to 39 situp)
                else if ((ageint >= 37) && (ageint <= 39)) {
                    if ((newVal1 >= 0) && (newVal1 <= 8)) {
                        tv5.setText("0");
                    } else if (newVal1 == 9) {
                        tv5.setText("1");
                    } else if (newVal1 == 10) {
                        tv5.setText("2");
                    } else if (newVal1 == 11) {
                        tv5.setText("3");
                    } else if (newVal1 == 12) {
                        tv5.setText("4");
                    } else if (newVal1 == 13) {
                        tv5.setText("5");
                    } else if ((newVal1 >= 14) && (newVal1 <= 15)) {
                        tv5.setText("6");
                    } else if ((newVal1 >= 16) && (newVal1 <= 17)) {
                        tv5.setText("7");
                    } else if (newVal1 == 18) {
                        tv5.setText("8");
                    } else if (newVal1 == 19) {
                        tv5.setText("9");
                    } else if (newVal1 == 20) {
                        tv5.setText("10");
                    } else if (newVal1 == 21) {
                        tv5.setText("11");
                    } else if (newVal1 == 22) {
                        tv5.setText("12");
                    } else if ((newVal1 >= 23) && (newVal1 <= 24)) {
                        tv5.setText("13");
                    } else if ((newVal1 >= 25) && (newVal1 <= 26)) {
                        tv5.setText("14");
                    } else if (newVal1 == 27) {
                        tv5.setText("15");
                    } else if (newVal1 == 28) {
                        tv5.setText("16");
                    } else if (newVal1 == 29) {
                        tv5.setText("17");
                    } else if ((newVal1 >= 30) && (newVal1 <= 31)) {
                        tv5.setText("18");
                    } else if ((newVal1 >= 32) && (newVal1 <= 33)) {
                        tv5.setText("19");
                    } else if ((newVal1 >= 34) && (newVal1 <= 37)) {
                        tv5.setText("20");
                    } else if ((newVal1 >= 38) && (newVal1 <= 41)) {
                        tv5.setText("21");
                    } else if ((newVal1 >= 42) && (newVal1 <= 45)) {
                        tv5.setText("22");
                    } else if ((newVal1 >= 46) && (newVal1 <= 49)) {
                        tv5.setText("23");
                    } else if ((newVal1 >= 50) && (newVal1 <= 53)) {
                        tv5.setText("24");
                    } else {
                        tv5.setText("25");
                    }

                } // end of age group 7 (37 to 39)

                //Start of age group 8 ( 40 to 42 situp)
                else if ((ageint >= 40) && (ageint <= 42)) {
                    if ((newVal1 >= 0) && (newVal1 <= 7)) {
                        tv5.setText("0");
                    } else if (newVal1 == 8) {
                        tv5.setText("1");
                    } else if (newVal1 == 9) {
                        tv5.setText("2");
                    } else if (newVal1 == 10) {
                        tv5.setText("3");
                    } else if (newVal1 == 11) {
                        tv5.setText("4");
                    } else if (newVal1 == 12) {
                        tv5.setText("5");
                    } else if ((newVal1 >= 13) && (newVal1 <= 14)) {
                        tv5.setText("6");
                    } else if ((newVal1 >= 15) && (newVal1 <= 16)) {
                        tv5.setText("7");
                    } else if (newVal1 == 17) {
                        tv5.setText("8");
                    } else if (newVal1 == 18) {
                        tv5.setText("9");
                    } else if (newVal1 == 19) {
                        tv5.setText("10");
                    } else if (newVal1 == 20) {
                        tv5.setText("11");
                    } else if (newVal1 == 21) {
                        tv5.setText("12");
                    } else if ((newVal1 >= 22) && (newVal1 <= 23)) {
                        tv5.setText("13");
                    } else if ((newVal1 >= 24) && (newVal1 <= 25)) {
                        tv5.setText("14");
                    } else if (newVal1 == 26) {
                        tv5.setText("15");
                    } else if (newVal1 == 27) {
                        tv5.setText("16");
                    } else if (newVal1 == 28) {
                        tv5.setText("17");
                    } else if ((newVal1 >= 29) && (newVal1 <= 30)) {
                        tv5.setText("18");
                    } else if ((newVal1 >= 31) && (newVal1 <= 32)) {
                        tv5.setText("19");
                    } else if ((newVal1 >= 33) && (newVal1 <= 36)) {
                        tv5.setText("20");
                    } else if ((newVal1 >= 37) && (newVal1 <= 40)) {
                        tv5.setText("21");
                    } else if ((newVal1 >= 41) && (newVal1 <= 44)) {
                        tv5.setText("22");
                    } else if ((newVal1 >= 45) && (newVal1 <= 48)) {
                        tv5.setText("23");
                    } else if ((newVal1 >= 49) && (newVal1 <= 52)) {
                        tv5.setText("24");
                    } else {
                        tv5.setText("25");
                    }

                } // end of age group 8 (40 to 42)

                //Start of age group 9 ( 43 to 45 Situp)
                else if ((ageint >= 43) && (ageint <= 45)) {
                    if ((newVal1 >= 0) && (newVal1 <= 6)) {
                        tv5.setText("0");
                    } else if (newVal1 == 7) {
                        tv5.setText("1");
                    } else if (newVal1 == 8) {
                        tv5.setText("2");
                    } else if (newVal1 == 9) {
                        tv5.setText("3");
                    } else if (newVal1 == 10) {
                        tv5.setText("4");
                    } else if (newVal1 == 11) {
                        tv5.setText("5");
                    } else if ((newVal1 >= 12) && (newVal1 <= 13)) {
                        tv5.setText("6");
                    } else if ((newVal1 >= 14) && (newVal1 <= 15)) {
                        tv5.setText("7");
                    } else if (newVal1 == 16) {
                        tv5.setText("8");
                    } else if (newVal1 == 17) {
                        tv5.setText("9");
                    } else if (newVal1 == 18) {
                        tv5.setText("10");
                    } else if (newVal1 == 19) {
                        tv5.setText("11");
                    } else if (newVal1 == 20) {
                        tv5.setText("12");
                    } else if ((newVal1 >= 21) && (newVal1 <= 22)) {
                        tv5.setText("13");
                    } else if ((newVal1 >= 23) && (newVal1 <= 24)) {
                        tv5.setText("14");
                    } else if (newVal1 == 25) {
                        tv5.setText("15");
                    } else if (newVal1 == 26) {
                        tv5.setText("16");
                    } else if (newVal1 == 27) {
                        tv5.setText("17");
                    } else if ((newVal1 >= 28) && (newVal1 <= 29)) {
                        tv5.setText("18");
                    } else if ((newVal1 >= 30) && (newVal1 <= 31)) {
                        tv5.setText("19");
                    } else if ((newVal1 >= 32) && (newVal1 <= 34)) {
                        tv5.setText("20");
                    } else if ((newVal1 >= 35) && (newVal1 <= 38)) {
                        tv5.setText("21");
                    } else if ((newVal1 >= 39) && (newVal1 <= 42)) {
                        tv5.setText("22");
                    } else if ((newVal1 >= 43) && (newVal1 <= 46)) {
                        tv5.setText("23");
                    } else if ((newVal1 >= 47) && (newVal1 <= 50)) {
                        tv5.setText("24");
                    } else {
                        tv5.setText("25");
                    }

                } // end of age group 9 (43 to 45)

                //Start of age group 10 ( 46 to 48 Situp)
                else if ((ageint >= 46) && (ageint <= 48)) {
                    if ((newVal1 >= 0) && (newVal1 <= 5)) {
                        tv5.setText("0");
                    } else if (newVal1 == 6) {
                        tv5.setText("1");
                    } else if (newVal1 == 7) {
                        tv5.setText("2");
                    } else if (newVal1 == 8) {
                        tv5.setText("3");
                    } else if (newVal1 == 9) {
                        tv5.setText("4");
                    } else if (newVal1 == 10) {
                        tv5.setText("5");
                    } else if ((newVal1 >= 11) && (newVal1 <= 12)) {
                        tv5.setText("6");
                    } else if ((newVal1 >= 13) && (newVal1 <= 14)) {
                        tv5.setText("7");
                    } else if (newVal1 == 15) {
                        tv5.setText("8");
                    } else if (newVal1 == 16) {
                        tv5.setText("9");
                    } else if (newVal1 == 17) {
                        tv5.setText("10");
                    } else if (newVal1 == 18) {
                        tv5.setText("11");
                    } else if (newVal1 == 19) {
                        tv5.setText("12");
                    } else if ((newVal1 >= 20) && (newVal1 <= 21)) {
                        tv5.setText("13");
                    } else if ((newVal1 >= 22) && (newVal1 <= 23)) {
                        tv5.setText("14");
                    } else if (newVal1 == 24) {
                        tv5.setText("15");
                    } else if (newVal1 == 25) {
                        tv5.setText("16");
                    } else if (newVal1 == 26) {
                        tv5.setText("17");
                    } else if ((newVal1 >= 27) && (newVal1 <= 28)) {
                        tv5.setText("18");
                    } else if ((newVal1 >= 29) && (newVal1 <= 30)) {
                        tv5.setText("19");
                    } else if ((newVal1 >= 31) && (newVal1 <= 33)) {
                        tv5.setText("20");
                    } else if ((newVal1 >= 34) && (newVal1 <= 36)) {
                        tv5.setText("21");
                    } else if ((newVal1 >= 37) && (newVal1 <= 40)) {
                        tv5.setText("22");
                    } else if ((newVal1 >= 41) && (newVal1 <= 44)) {
                        tv5.setText("23");
                    } else if ((newVal1 >= 45) && (newVal1 <= 48)) {
                        tv5.setText("24");
                    } else {
                        tv5.setText("25");
                    }


                } // end of age group 10 (46 to 48)

                //Start of age group 11 ( 49 to 51 situp)
                else if ((ageint >= 49) && (ageint <= 51)) {
                    if ((newVal1 >= 0) && (newVal1 <= 4)) {
                        tv5.setText("0");
                    } else if (newVal1 == 5) {
                        tv5.setText("1");
                    } else if (newVal1 == 6) {
                        tv5.setText("2");
                    } else if (newVal1 == 7) {
                        tv5.setText("3");
                    } else if (newVal1 == 8) {
                        tv5.setText("4");
                    } else if (newVal1 == 9) {
                        tv5.setText("5");
                    } else if ((newVal1 >= 10) && (newVal1 <= 11)) {
                        tv5.setText("6");
                    } else if ((newVal1 >= 12) && (newVal1 <= 13)) {
                        tv5.setText("7");
                    } else if (newVal1 == 14) {
                        tv5.setText("8");
                    } else if (newVal1 == 15) {
                        tv5.setText("9");
                    } else if (newVal1 == 16) {
                        tv5.setText("10");
                    } else if (newVal1 == 17) {
                        tv5.setText("11");
                    } else if (newVal1 == 18) {
                        tv5.setText("12");
                    } else if ((newVal1 >= 19) && (newVal1 <= 20)) {
                        tv5.setText("13");
                    } else if ((newVal1 >= 21) && (newVal1 <= 22)) {
                        tv5.setText("14");
                    } else if (newVal1 == 23) {
                        tv5.setText("15");
                    } else if (newVal1 == 24) {
                        tv5.setText("16");
                    } else if (newVal1 == 25) {
                        tv5.setText("17");
                    } else if ((newVal1 >= 26) && (newVal1 <= 27)) {
                        tv5.setText("18");
                    } else if ((newVal1 >= 28) && (newVal1 <= 29)) {
                        tv5.setText("19");
                    } else if ((newVal1 >= 30) && (newVal1 <= 32)) {
                        tv5.setText("20");
                    } else if ((newVal1 >= 33) && (newVal1 <= 35)) {
                        tv5.setText("21");
                    } else if ((newVal1 >= 36) && (newVal1 <= 39)) {
                        tv5.setText("22");
                    } else if ((newVal1 >= 40) && (newVal1 <= 43)) {
                        tv5.setText("23");
                    } else if ((newVal1 >= 44) && (newVal1 <= 47)) {
                        tv5.setText("24");
                    } else {
                        tv5.setText("25");
                    }


                } // end of age group 11 (49 to 51)

                //Start of age group 12 ( 52 to 54 situp)
                else if ((ageint >= 52) && (ageint <= 54)) {
                    if ((newVal1 >= 0) && (newVal1 <= 3)) {
                        tv5.setText("0");
                    } else if (newVal1 == 4) {
                        tv5.setText("1");
                    } else if (newVal1 == 5) {
                        tv5.setText("2");
                    } else if (newVal1 == 6) {
                        tv5.setText("3");
                    } else if (newVal1 == 7) {
                        tv5.setText("4");
                    } else if (newVal1 == 8) {
                        tv5.setText("5");
                    } else if ((newVal1 >= 9) && (newVal1 <= 10)) {
                        tv5.setText("6");
                    } else if ((newVal1 >= 11) && (newVal1 <= 12)) {
                        tv5.setText("7");
                    } else if (newVal1 == 13) {
                        tv5.setText("8");
                    } else if (newVal1 == 14) {
                        tv5.setText("9");
                    } else if (newVal1 == 15) {
                        tv5.setText("10");
                    } else if (newVal1 == 16) {
                        tv5.setText("11");
                    } else if (newVal1 == 17) {
                        tv5.setText("12");
                    } else if ((newVal1 >= 18) && (newVal1 <= 19)) {
                        tv5.setText("13");
                    } else if ((newVal1 >= 20) && (newVal1 <= 21)) {
                        tv5.setText("14");
                    } else if (newVal1 >= 22) {
                        tv5.setText("15");
                    } else if (newVal1 >= 23) {
                        tv5.setText("16");
                    } else if (newVal1 >= 24) {
                        tv5.setText("17");
                    } else if ((newVal1 >= 25) && (newVal1 <= 26)) {
                        tv5.setText("18");
                    } else if ((newVal1 >= 27) && (newVal1 <= 28)) {
                        tv5.setText("19");
                    } else if ((newVal1 >= 29) && (newVal1 <= 31)) {
                        tv5.setText("20");
                    } else if ((newVal1 >= 32) && (newVal1 <= 34)) {
                        tv5.setText("21");
                    } else if ((newVal1 >= 35) && (newVal1 <= 37)) {
                        tv5.setText("22");
                    } else if ((newVal1 >= 38) && (newVal1 <= 41)) {
                        tv5.setText("23");
                    } else if ((newVal1 >= 42) && (newVal1 <= 45)) {
                        tv5.setText("24");
                    } else {
                        tv5.setText("25");
                    }

                } // end of age group 12 (52 to 54)

                //Start of age group 13 ( 55 to 57 situp)
                else if ((ageint >= 55) && (ageint <= 57)) {

                    if ((newVal1 >= 0) && (newVal1 <= 2)) {
                        tv5.setText("0");
                    } else if (newVal1 == 3) {
                        tv5.setText("1");
                    } else if (newVal1 == 4) {
                        tv5.setText("2");
                    } else if (newVal1 == 5) {
                        tv5.setText("3");
                    } else if (newVal1 == 6) {
                        tv5.setText("4");
                    } else if (newVal1 == 7) {
                        tv5.setText("5");
                    } else if ((newVal1 >= 8) && (newVal1 <= 9)) {
                        tv5.setText("6");
                    } else if ((newVal1 >= 10) && (newVal1 <= 11)) {
                        tv5.setText("7");
                    } else if (newVal1 == 12) {
                        tv5.setText("8");
                    } else if (newVal1 == 13) {
                        tv5.setText("9");
                    } else if (newVal1 == 14) {
                        tv5.setText("10");
                    } else if (newVal1 == 15) {
                        tv5.setText("11");
                    } else if (newVal1 == 16) {
                        tv5.setText("12");
                    } else if ((newVal1 >= 17) && (newVal1 <= 18)) {
                        tv5.setText("13");
                    } else if ((newVal1 >= 19) && (newVal1 <= 20)) {
                        tv5.setText("14");
                    } else if (newVal1 >= 21) {
                        tv5.setText("15");
                    } else if (newVal1 >= 22) {
                        tv5.setText("16");
                    } else if (newVal1 >= 23) {
                        tv5.setText("17");
                    } else if ((newVal1 >= 24) && (newVal1 <= 25)) {
                        tv5.setText("18");
                    } else if ((newVal1 >= 26) && (newVal1 <= 27)) {
                        tv5.setText("19");
                    } else if ((newVal1 >= 28) && (newVal1 <= 30)) {
                        tv5.setText("20");
                    } else if ((newVal1 >= 31) && (newVal1 <= 33)) {
                        tv5.setText("21");
                    } else if ((newVal1 >= 34) && (newVal1 <= 36)) {
                        tv5.setText("22");
                    } else if ((newVal1 >= 37) && (newVal1 <= 39)) {
                        tv5.setText("23");
                    } else if ((newVal1 >= 40) && (newVal1 <= 43)) {
                        tv5.setText("24");
                    } else {
                        tv5.setText("25");
                    }

                } // end of age group 13 (55 to 57)

                //Start of age group 14 ( 58 to 60 situp)
                else {
                    if (newVal1 <= 0) {
                        tv5.setText("0");
                    } else if (newVal1 == 2) {
                        tv5.setText("1");
                    } else if (newVal1 == 3) {
                        tv5.setText("2");
                    } else if (newVal1 == 4) {
                        tv5.setText("3");
                    } else if (newVal1 == 5) {
                        tv5.setText("4");
                    } else if (newVal1 == 6) {
                        tv5.setText("5");
                    } else if ((newVal1 >= 7) && (newVal1 <= 8)) {
                        tv5.setText("6");
                    } else if ((newVal1 >= 9) && (newVal1 <= 10)) {
                        tv5.setText("7");
                    } else if (newVal1 == 11) {
                        tv5.setText("8");
                    } else if (newVal1 == 12) {
                        tv5.setText("9");
                    } else if (newVal1 == 13) {
                        tv5.setText("10");
                    } else if (newVal1 == 14) {
                        tv5.setText("11");
                    } else if (newVal1 == 15) {
                        tv5.setText("12");
                    } else if ((newVal1 >= 16) && (newVal1 <= 17)) {
                        tv5.setText("13");
                    } else if ((newVal1 >= 18) && (newVal1 <= 19)) {
                        tv5.setText("14");
                    } else if (newVal1 >= 20) {
                        tv5.setText("15");
                    } else if (newVal1 >= 21) {
                        tv5.setText("16");
                    } else if (newVal1 >= 22) {
                        tv5.setText("17");
                    } else if ((newVal1 >= 23) && (newVal1 <= 24)) {
                        tv5.setText("18");
                    } else if ((newVal1 >= 25) && (newVal1 <= 26)) {
                        tv5.setText("19");
                    } else if ((newVal1 >= 27) && (newVal1 <= 29)) {
                        tv5.setText("20");
                    } else if ((newVal1 >= 30) && (newVal1 <= 32)) {
                        tv5.setText("21");
                    } else if ((newVal1 >= 33) && (newVal1 <= 35)) {
                        tv5.setText("22");
                    } else if ((newVal1 >= 36) && (newVal1 <= 38)) {
                        tv5.setText("23");
                    } else if ((newVal1 >= 39) && (newVal1 <= 41)) {
                        tv5.setText("24");
                    } else {
                        tv5.setText("25");
                    }
                } // end of age group 14 (58 to 60)


                int m = Integer.parseInt(tv1.getText().toString());
                int n = Integer.parseInt(tv4.getText().toString());
                int o = Integer.parseInt(tv5.getText().toString());
                int g = m + n + o;
                tv2.setText(String.valueOf(g));

                if (g < 51) {
                    if (status.equals("false")) {
                        int f = 61 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("You need ");
                        sb.append(str);
                        sb.append(" more points to pass. Add oil!");
                        tv7.setText(sb);

                    } else {
                        int f = 51 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("You need ");
                        sb.append(str);
                        sb.append(" more points to pass. Add oil!");
                        tv7.setText(sb);
                    }

                } else if ((g >= 51) && (g < 61)) {
                    if (status.equals("false")) {
                        int f = 61 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("You need ");
                        sb.append(str);
                        sb.append(" more points to pass. Add oil!");
                        tv7.setText(sb);

                    } else {
                        int f = 75 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Well done. You need ");
                        sb.append(str);
                        sb.append(" more points to get Silver.");
                        tv7.setText(sb);
                    }
                } else if ((g >= 61) && (g < 75)) {
                    int f = 75 - g;
                    String str = Integer.toString(f);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Well done. You need ");
                    sb.append(str);
                    sb.append(" more points to get Silver.");
                    tv7.setText(sb);
                } else if ((g >= 75) && (g < 85)) {
                    if (special.equals("true")) {
                        int f = 91 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Well done. You need ");
                        sb.append(str);
                        sb.append(" more points to get Gold.");
                        tv7.setText(sb);
                    } else {
                        int f = 85 - g;
                        String str = Integer.toString(f);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Well done. You need ");
                        sb.append(str);
                        sb.append(" more points to get Gold.");
                        tv7.setText(sb);
                    }
                } else {
                    if (special.equals("true")) {
                        if (g < 90) {
                            int f = 91 - g;
                            String str = Integer.toString(f);
                            StringBuilder sb = new StringBuilder();
                            sb.append("Well done. You need ");
                            sb.append(str);
                            sb.append(" more points to get Gold.");
                            tv7.setText(sb);
                        } else {
                            tv7.setText("You got GOLD!!");
                        }
                    } else {
                        tv7.setText("You got GOLD!!");
                    }
                }


            }
        }); //end of Sit-up Selector



        Imagebutton3.setOnClickListener(new View.OnClickListener()

                                        {
                                            @Override
                                            public void onClick(View v) {

                                                // return back to home page
                                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                                startActivity(intent);

                                            }

                                        }

        );

            Imagebutton4.setOnClickListener(new View.OnClickListener()

                                            {

                                                @Override
                                                public void onClick(View v) {


                                                    String[] count = new String[50];
                                                    int x;


                                                    SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
                                                    String text = sharedPref.getString("countrecord", null);
                                                    if (text != null && !text.isEmpty()) {
                                                        if (text.equals("1")) {
                                                            x = 2;
                                                        } else {
                                                            x = 1;
                                                        }
                                                        // x = Integer.parseInt(text);
                                                        // x++;
                                                    } else {

                                                        x = 1;
                                                    }

                                                    String pushup = tv1.getText().toString();
                                                    String running = tv4.getText().toString();
                                                    String situp = tv5.getText().toString();
                                                    String totalpoints = tv2.getText().toString();
                                                    String agerecord = tv6.getText().toString();
                                                    String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

                                                    if (x == 1) {

                                                        SharedPreferences sharedPref1 = PreferenceManager.getDefaultSharedPreferences(context);
                                                        SharedPreferences.Editor editor = sharedPref1.edit();

                                                        editor.putString("countrecord", "1");
                                                        editor.putString("pushup1", pushup);
                                                        editor.putString("situp1", situp);
                                                        editor.putString("running1", running);
                                                        editor.putString("totalpoints1", totalpoints);
                                                        editor.putString("agerecord1", agerecord);
                                                        editor.putString("date1", date);
                                                        editor.commit();


                                                    } else {

                                                        SharedPreferences sharedPref2 = PreferenceManager.getDefaultSharedPreferences(context);
                                                        SharedPreferences.Editor editor = sharedPref2.edit();

                                                        editor.putString("countrecord", "2");
                                                        editor.putString("pushup2", pushup);
                                                        editor.putString("situp2", situp);
                                                        editor.putString("running2", running);
                                                        editor.putString("totalpoints2", totalpoints);
                                                        editor.putString("agerecord2", agerecord);
                                                        editor.putString("date2", date);
                                                        editor.commit();

                                                    }


                                                    Toast.makeText(getApplicationContext(), "Saved in record ", Toast.LENGTH_SHORT).show();


                                                }

                                            }

            );

        }
    }
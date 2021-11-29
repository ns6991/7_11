package com.example.a7_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout cl;
    AlertDialog.Builder adb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cl = (ConstraintLayout) findViewById(R.id.cl);
    }

    /*
    * set random background color
    * */
    public void random_color(){
        cl.setBackgroundColor(Color.rgb((int)(Math.random()*(255-2)+1),(int)(Math.random()*(255-2)+1),(int)(Math.random()*(255-2)+1)));
    }

    public void button1(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Hiii!!");
        adb.setMessage("Welcome to this program. have fun and go home :)))");
        adb.create().show();
    }

    public void button2(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Have a nice dayy!");
        adb.setMessage("A day without a smile is a wasted day");
        adb.setIcon(R.drawable.smile);
        adb.create().show();
    }

    public void button3(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Cancel");
        adb.setMessage("If you wanna say goodbye from this message :( click cancel!");
        adb.setIcon(android.R.drawable.ic_delete);
        adb.setPositiveButton("cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        adb.create().show();

    }

    public void button4(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("compliment for a gooood day");
        adb.setMessage("Mirror, mirror on the wall, who is fairest of them all?");
        adb.setIcon(R.drawable.mirror);
        adb.setPositiveButton("background color",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                random_color();
            }
        });
        adb.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        adb.create().show();
    }

    public void button5(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("The last compliment :((");
        adb.setMessage("Tell me, is your father a gardener? How did he get a flower like you?");
        adb.setIcon(R.drawable.flower);
        adb.setPositiveButton("background color",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                random_color();
            }
        });
        adb.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        adb.setNeutralButton("white background",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                cl.setBackgroundColor(Color.rgb(255,255,255));
            }
        });

        adb.create().show();
    }
}
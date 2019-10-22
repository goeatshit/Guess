package com.Ian.guess;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.service.autofill.OnClickAction;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private TextView num;
    int secret = new Random().nextInt(10)+1;
    private ImageView IV;
    private Button IS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        num = findViewById(R.id.number);
        Log.d(" Number","secret number :"+secret);
        IS = findViewById(R.id.Insert);



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 int guess = Integer.parseInt(num.getText().toString());
                   if (secret==guess){
                       Toast.makeText(MainActivity.this,"Good Job!",Toast.LENGTH_LONG).show();
                       IV.setImageResource(R.drawable.smile);
                       IV.setVisibility(View.VISIBLE);

                   }else if(secret<=guess){
                       Toast.makeText(MainActivity.this,"smaller",Toast.LENGTH_LONG).show();
                   }else if(secret>=guess){
                       Toast.makeText(MainActivity.this,"Bigger",Toast.LENGTH_LONG).show();
                   }else if(secret!=guess){
                       Toast.makeText(MainActivity.this,"Come on you can do it!",Toast.LENGTH_LONG).show();
                       IV.setImageResource(R.drawable.rockhand);

                   }

            }

        });
    }
    public void gg(View view){
        int guess = Integer.parseInt(num.getText().toString());
        if (secret==guess){
            Toast.makeText(MainActivity.this,"Good Job!",Toast.LENGTH_LONG).show();
   /*         IV.setImageResource(R.drawable.smile);
            IV.setVisibility(View.VISIBLE);*/
        }else if(secret<=guess){
            Toast.makeText(MainActivity.this,"smaller",Toast.LENGTH_LONG).show();
        }else if(secret>=guess){
            Toast.makeText(MainActivity.this,"Bigger",Toast.LENGTH_LONG).show();
        }else if (secret!=guess){
            Toast.makeText(MainActivity.this,"Come on you can do it!",Toast.LENGTH_LONG).show();
            IV.setImageResource(R.drawable.rockhand);

        }
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

package com.example.rajat.multiconverter;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button d = (Button) findViewById(R.id.button);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), distanceconverter.class);
                startActivity(i);
                //startActivityForResult(i,0);
            }
        });

   Button w = (Button) findViewById(R.id.button2);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j =new Intent(getApplicationContext(),weightconverter.class);
                startActivity(j);
            }
        });

        Button t = (Button) findViewById(R.id.button3);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j =new Intent(getApplicationContext(),temptype.class);
                startActivity(j);
            }
        });

        Button v = (Button) findViewById(R.id.button4);
<<<<<<< HEAD
        v.setOnClickListener(new View.OnClickListener() {
=======
        w.setOnClickListener(new View.OnClickListener() {
>>>>>>> 78abdb488bf6d259428716a417fb2833d663e752
            @Override
            public void onClick(View v) {
                Intent j =new Intent(getApplicationContext(),volconvert.class);
                startActivity(j);
            }
        });
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

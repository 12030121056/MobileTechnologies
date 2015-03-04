package com.example.rajat.multiconverter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class volconvert extends ActionBarActivity {
    private EditText text;
    private EditText disp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volconvert);


        text = (EditText) findViewById(R.id.editText);
        disp = (EditText) findViewById(R.id.editText2) ;
    }



    // this method is called at button click because we assigned the name to the
    // "OnClick property" of the button
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                RadioButton lButton = (RadioButton) findViewById(R.id.radio1);
                RadioButton gButton = (RadioButton) findViewById(R.id.radio2);
                if (text.getText().length() == 0) {
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG).show();
                    return;
                }

                float inputValue = Float.parseFloat(text.getText().toString());
                if (lButton.isChecked()) {
                    disp.setText(String
                            .valueOf(ConverterUtil.convertGToL(inputValue)));
                    lButton.setChecked(false);
                    gButton.setChecked(true);
                } else {
                    text.setText(String
                            .valueOf(ConverterUtil.convertLToG(inputValue)));
                    lButton.setChecked(false);
                    gButton.setChecked(true);
                }
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_volconvert, menu);
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

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

      findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
          /* String str1= ((EditText) findViewById(R.id.editTextField)).getText().toString();
           String str2= ((EditText) findViewById(R.id.editTextField1)).getText().toString();*/

        @Override
        public void onClick(View v){
            String str1= ((EditText) findViewById(R.id.editTextField)).getText().toString();
            String str2= ((EditText) findViewById(R.id.editTextField1)).getText().toString();
            Intent data = new Intent(); // create a new Intent, this is where we will put our data
            data.putExtra("string1", str1); // puts one string into the Intent, with the key as 'string1'
            data.putExtra("string2", str2); // puts another string into the Intent, with the key as 'string2
            setResult(RESULT_OK, data); // set result code and bundle data for response
            finish(); // closes this activity and pass data to the original activity that launched this activity
        }
    });
}


}

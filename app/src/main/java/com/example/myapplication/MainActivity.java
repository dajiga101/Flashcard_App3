package com.example.myapplication;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_question).setVisibility(v.INVISIBLE);
                findViewById(R.id.flashcard_answer).setVisibility(v.VISIBLE);
            }
        });
      /*  findViewById(R.id.option1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.option1).setBackgroundColor(Color.RED);
                findViewById(R.id.option3).setBackgroundColor(Color.GREEN);
            }
        });
        findViewById(R.id.option2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.option2).setBackgroundColor(Color.RED);
                findViewById(R.id.option3).setBackgroundColor(Color.GREEN);

            }
        });
        findViewById(R.id.option1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.option3).setBackgroundColor(Color.GREEN);
            }
        });
        findViewById(R.id.ImageButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.option1).setVisibility(v.INVISIBLE);
                findViewById(R.id.option2).setVisibility(v.INVISIBLE);
                findViewById(R.id.option3).setVisibility(v.INVISIBLE);
                findViewById(R.id.ImageButton).setVisibility(v.INVISIBLE);
                findViewById(R.id.ImageButton2).setVisibility(v.VISIBLE);
            }
        });*/
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                MainActivity.this.startActivityForResult(intent,100);
            }
        });;


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 100 && resultCode == RESULT_OK) { // this 100 needs to match the 100 we used when we called startActivityForResult!
            String string1 = data.getExtras().getString("string1"); // 'string1' needs to match the key we used when we put the string in the Intent
            String string2 = data.getExtras().getString("string2");
            ((TextView)findViewById(R.id.flashcard_question)).setText(string1);
            ((TextView)findViewById(R.id.flashcard_answer)).setText(string2);
        }
    }
}


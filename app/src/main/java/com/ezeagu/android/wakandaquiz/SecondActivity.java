package com.ezeagu.android.wakandaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Button button1, button2, button3, button4;
    TextView display;
    ImageView images;
    Intent intent;
    int score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button1 = (Button) findViewById(R.id.btn_one);
        button2 = (Button) findViewById(R.id.btn_two);
        button3 = (Button) findViewById(R.id.btn_three);
        button4 = (Button) findViewById(R.id.btn_four);

        display = (TextView) findViewById(R.id.display);
        images  = (ImageView) findViewById(R.id.images);
        Questions();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                intent = new Intent(SecondActivity.this,ThirdActivity.class);

                Intent intent2 = getIntent();
                score2 = intent2.getIntExtra("scoreValue",0);
                score2 += 0;
                intent.putExtra("score2",score2);

                startActivity(intent);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                intent = new Intent(SecondActivity.this,ThirdActivity.class);

                Intent intent2 = getIntent();
                score2 = intent2.getIntExtra("scoreValue",0);
                score2 += 0;
                intent.putExtra("score2",score2);

                startActivity(intent);
                finish();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                intent = new Intent(SecondActivity.this,ThirdActivity.class);

                Intent intent2 = getIntent();
                score2 = intent2.getIntExtra("scoreValue",0);
                score2 += 1;
                intent.putExtra("score2",score2);


                startActivity(intent);
                finish();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                intent = new Intent(SecondActivity.this,ThirdActivity.class);

                Intent intent2 = getIntent();
                score2 = intent2.getIntExtra("scoreValue",0);
                score2 += 0;
                intent.putExtra("score2",score2);

                startActivity(intent);
                finish();
            }
        });
    }


    private void Questions(){
        display.setText("Each king of Wakanda has some amazing female warriors that protects him. What are they called?");
        button1.setText("Midnight Angels");
        button2.setText("Dora Milaje");
        button3.setText("Jabari");
        button4.setText("Helmut Zemo");
    }




}



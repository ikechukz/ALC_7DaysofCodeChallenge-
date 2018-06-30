package com.ezeagu.android.wakandaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    Button button1, button2, button3, button4;
    TextView display;
    ImageView images;
    Intent intent;
    int score3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

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
                Toast.makeText(ThirdActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                intent = new Intent(ThirdActivity.this,FourthActivity.class);

                Intent intent2 = getIntent();
                score3 = intent2.getIntExtra("score2",0);
                score3 += 0;
                intent.putExtra("score3",score3);

                startActivity(intent);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ThirdActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                intent = new Intent(ThirdActivity.this,FourthActivity.class);

                Intent intent2 = getIntent();
                score3 = intent2.getIntExtra("score2",0);
                score3 += 0;
                intent.putExtra("score3",score3);

                startActivity(intent);
                finish();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ThirdActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                intent = new Intent(ThirdActivity.this,FourthActivity.class);

                Intent intent2 = getIntent();
                score3 = intent2.getIntExtra("score2",0);
                score3 += 1;
                intent.putExtra("score3",score3);

                startActivity(intent);
                finish();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ThirdActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                intent = new Intent(ThirdActivity.this,FourthActivity.class);

                Intent intent2 = getIntent();
                score3 = intent2.getIntExtra("score2",0);
                score3 += 0;
                intent.putExtra("score3",score3);

                startActivity(intent);
                finish();
            }
        });
    }


    private void Questions(){
        display.setText("King T’Challa studied at Oxford, what was his degree in?");
        button1.setText("Chemistry");
        button2.setText("Biology");
        button3.setText("Physics");
        button4.setText("Astronomy");
    }




}

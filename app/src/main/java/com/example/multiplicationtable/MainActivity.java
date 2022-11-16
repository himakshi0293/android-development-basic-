package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String charr;
    TextView textView,textView1;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.textView1);
        textView = findViewById(R.id.textView);
            editText = findViewById(R.id.editText);
            button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()            {
            @Override
            public void onClick(View v) {

                    int tbl = Integer.parseInt(editText.getText().toString());
                    //For loop
                    for (int i = 1; i <= 10; i++) {
                        //Display the number which was entered
                        textView.setText("Table of " + tbl + ": ");
                        //Table in format of (5 X 3 = 15)
                        charr = tbl + " X " + i + " = " + tbl * i + "\n";
                        textView1.append(charr);
                    }
                    Toast.makeText(getApplicationContext(), "Table is displayed", Toast.LENGTH_SHORT).show();
                }
        });

    }
}
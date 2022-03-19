package com.example.gbandroid1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        EditText text = findViewById(R.id.text);
        EditText name = findViewById(R.id.name);
        EditText phone = findViewById(R.id.phone);
        EditText password = findViewById(R.id.password);
        EditText mail = findViewById(R.id.mail);
        TextView Textresult = findViewById(R.id.text_result);
        Button btn_compare = findViewById(R.id.btn_compare);
        btn_compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Textresult.setText("Данные записаны");
                //Хотел вывести записанные переменные - не получилось
            }

        });
    }
}
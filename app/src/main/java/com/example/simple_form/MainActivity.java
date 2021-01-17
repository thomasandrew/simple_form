package com.example.simple_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ed_name, ed_last_name, ed_choose_state, ed_city, ed_address, ed_telephone, ed_cellphone;
    private Button btnPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = ed_name.getText().toString();
                String last_name = ed_last_name.getText().toString();
                String choose_state = ed_choose_state.getText().toString();
                String city = ed_city.getText().toString();
                String address = ed_address.getText().toString();
                String telephone = ed_telephone.getText().toString();
                String cellphone = ed_cellphone.getText().toString();

                if (name.isEmpty() || last_name.isEmpty() || choose_state.isEmpty() || city.isEmpty() || address.isEmpty() || telephone.isEmpty() || cellphone.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                } else {
                    changePage();
                }
            }
        });
    }

    public void init() {
        ed_name = findViewById(R.id.name);
        ed_last_name = findViewById(R.id.last_name);
        ed_choose_state = findViewById(R.id.choose_state);
        ed_city = findViewById(R.id.city);
        ed_address = findViewById(R.id.telephone);
        ed_telephone = findViewById(R.id.telephone);
        ed_cellphone = findViewById(R.id.cellphone);
        btnPress = findViewById(R.id.btnPress);
    }

    public void changePage() {
        Intent intent = new Intent(this, answerForEverything.class);
        startActivityForResult(intent, 5);
    }

}
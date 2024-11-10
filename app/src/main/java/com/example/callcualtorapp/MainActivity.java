package com.example.callcualtorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText angka1, angka2;
    private Button tambah, kurang, kali, bagi;
    private TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);
        hasil = findViewById(R.id.hasil);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void tbh(View view) {
        double a = Double.parseDouble(angka1.getText().toString());
        double b = Double.parseDouble(angka2.getText().toString());
        double c = a + b;
        hasil.setText(String.valueOf(c));

    }
    public void krg(View view) {
        double a = Double.parseDouble(angka1.getText().toString());
        double b = Double.parseDouble(angka2.getText().toString());
        double c = a - b;
        hasil.setText(String.valueOf(c));
    }
    public void kl(View view) {
        double a = Double.parseDouble(angka1.getText().toString());
        double b = Double.parseDouble(angka2.getText().toString());
        double c = a * b;
        hasil.setText(String.valueOf(c));
    }
    public void bg(View view) {
        double a = Double.parseDouble(angka1.getText().toString());
        double b = Double.parseDouble(angka2.getText().toString());
        double c = a / b;
        hasil.setText(String.valueOf(c));
    }
}
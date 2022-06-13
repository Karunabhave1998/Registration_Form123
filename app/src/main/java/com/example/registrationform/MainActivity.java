package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onRegisterClick(View view)
    {

        TextView edtText1 = findViewById(R.id.edtText1);
        TextView edtText2 = findViewById(R.id.edtText2);
        TextView edtText3 = findViewById(R.id.edtText3);

        EditText edtTextFirstName = findViewById(R.id.edtTextFirstName);
        EditText edtTextLastName = findViewById(R.id.edtTextLastName);
        EditText edtEmail = findViewById(R.id.edtEmail);

        edtText1.setText("First Name : " + edtTextFirstName.getText().toString());
        edtText2.setText("Last Name : " + edtTextLastName.getText().toString());
        edtText3.setText("Email : " + edtEmail.getText().toString());

















    }
}
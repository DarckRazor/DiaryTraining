package com.rosenthal.diarytraining.authentication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.rosenthal.diarytraining.R;

public class LoginActivity extends AppCompatActivity {

    EditText editTextPhone;
    Button btnSent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }
}
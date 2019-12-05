package com.example.test141219;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et1name,et2username,et3password;
    Button Loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1name = findViewById(R.id.et1sn);
        et2username = findViewById(R.id.et2u);
        et3password= findViewById(R.id.et3p);
        Loginbtn = findViewById(R.id.btn1);

        Loginbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {

      if (et1name.getText().toString().equals("") || et2username.getText().toString().equals("student1") || et3password.getText().toString().equals("123456"))    {
            Intent act = new Intent(getApplicationContext(),Main2Activity.class);
            act.putExtra("name",et1name.getText().toString());
            //starting an intent
            startActivity(act);

            //correcct password
        } else {
            Toast.makeText(getApplicationContext(), "Invalid username and password", Toast.LENGTH_SHORT).show();
            //wrong password
        }
    }
}

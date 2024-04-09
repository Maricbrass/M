package com.maric.pract_30;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3;
    String to,sub,msg;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void send(View view){
        e1 = (EditText) findViewById(R.id.to);
        e2 = (EditText) findViewById(R.id.sub);
        e3 = (EditText) findViewById(R.id.msg);

        to = e1.getText().toString();
        sub = e2.getText().toString();
        msg = e3.getText().toString();

        Intent i = new Intent(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_EMAIL,to);
        i.putExtra(Intent.EXTRA_SUBJECT,sub);
        i.putExtra(Intent.EXTRA_TEXT,msg);
        i.setType("msg/rfc822");
        startActivity(i);
    }
}
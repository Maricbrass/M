package com.maric.pract_29;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.no);
        e2 = (EditText) findViewById(R.id.msg);
        button = (Button) findViewById(R.id.send);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String no = e1.getText().toString();
                    String msg = e2.getText().toString();
                    SmsManager sms = SmsManager.getDefault();
                    sms.sendTextMessage(no, null, msg, null, null);
                    Toast.makeText(this, "Message Sent successfully!", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Message Failed to Send, Please try again!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
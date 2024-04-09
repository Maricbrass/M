package com.maric.pract_18_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.net.Uri;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        }
    public  void call(View v) {
        editText = (EditText) findViewById(R.id.editText);
        Uri n = Uri.parse("tel:" + editText.getText().toString());
        Intent callIntent = new Intent(Intent.ACTION_DIAL, n);
        try {
            startActivity(callIntent);
        } catch (SecurityException e) {
            Toast.makeText(this, "Error: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

}
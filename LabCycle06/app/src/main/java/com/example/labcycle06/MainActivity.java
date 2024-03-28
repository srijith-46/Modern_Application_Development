package com.example.labcycle06;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText text_msg,mob_no;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_msg = findViewById(R.id.txt_msg);
        mob_no = findViewById(R.id.mob_no);
        btn = findViewById(R.id.button);
    }

    public void onClick(View view){
        try{
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(mob_no.getText().toString(),null,text_msg.getText().toString(),null,null);
            Snackbar.make(view,"SMS sent successfully",Snackbar.LENGTH_LONG).show();
        }
        catch (Exception e){
            Snackbar.make(view, "SMS not sent",Snackbar.LENGTH_LONG).show();
        }
    }
}
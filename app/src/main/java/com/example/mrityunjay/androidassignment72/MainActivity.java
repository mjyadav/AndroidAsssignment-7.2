package com.example.mrityunjay.androidassignment72;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private static int PICK_CONTACT=1;//declare
    private TextView textView;
    @Override// on start method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.textView);// text id find
        textView.setOnClickListener(new View.OnClickListener() { // onclick listener
            @Override
            public void onClick(View v) {// intent apllying for contact
                Intent intent=new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                startActivityForResult(intent,PICK_CONTACT); // star actitvity
            }
        });


    }


    // override method
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
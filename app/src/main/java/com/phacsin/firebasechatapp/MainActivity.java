package com.phacsin.firebasechatapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edittext);
        submit = findViewById(R.id.submit);
    }


    public void onSubmit(View view) {
        String name = editText.getText().toString();
        Intent intent = new Intent(this,ChatActivity.class);
        intent.putExtra("Name",name);
        startActivity(intent);
    }
}

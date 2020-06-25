package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    static String userName = "";
    static String userPass = "";
    static String userTag = "";

    public void openNext(){
        Intent intent = new Intent(this, ActivityChat.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = (TextView) findViewById(R.id.list_View);
       // textView.setText ("habe X items: " + listView.getAdapter().getCount());


        Button clickButton = (Button) findViewById(R.id.buttonGo);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView textUser = (TextView) findViewById(R.id.userName);
                textUser.setTextColor(Color.RED);

                TextView textPass = (TextView) findViewById(R.id.userPass);
                textPass.setTextColor(Color.RED);

                TextView textTag = (TextView) findViewById(R.id.userTag);
                textPass.setTextColor(Color.RED);

                userName = "" + textUser.getText();
                userPass = "" +  textPass.getText();
                userTag = "" + textPass.getText();

                String sammel = userName + " " + userPass + " " + userTag;
                textPass.setText(sammel);

                openNext();
            }


        });


    }
}

package com.example.rahul.mycontacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.net.PasswordAuthentication;


public class MyContacts extends Activity {

    //For user and paswd error popup
    LinearLayout layoutOfPopup;
    PopupWindow popupMessage;
    Button popupButton, insidePopupButton;
    EditText insidePopupText;
    TextView popupText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_contacts);
        setTitle("MyContacts");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_contacts, menu);
        return true;
    }

    public void onButtonClick(View v){
        if(v.getId() == R.id.bLogin){
            EditText username = (EditText) findViewById(R.id.valUserName);
            String str = username.getText().toString();
            if(str.equals("rahul")) {

                EditText passwrd = (EditText) findViewById(R.id.valPassword);
                String  pswd = username.getText().toString();
                while(true) {
                    if (passwrd.equals("123")) {
                        Intent i = new Intent(MyContacts.this, MyContactUserOptions.class);
                        i.putExtra("username", str);
                        startActivity(i);
                        break;
                    } else {
                        Intent i = new Intent(MyContacts.this,PaswdNotCorrectPopUp.class);
                        startActivity(i);
                    }
                }
            }
            else{
                popupText = new TextView(this);
                insidePopupButton = new Button(this);
                layoutOfPopup = new LinearLayout(this);
                insidePopupButton.setText("OK");
                popupText.setText("Wrong user name.. Re-enter.....");
                popupText.setPadding(0, 0, 0, 20);
                layoutOfPopup.setOrientation(1);
                layoutOfPopup.addView(popupText);
                layoutOfPopup.addView(insidePopupButton);
            }

        }
    }
}

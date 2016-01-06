package com.example.rahul.mycontacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class MyContactUserOptions extends Activity {

    PopupWindow popUp;
    LinearLayout layout;
    TextView tv;
    ViewGroup.LayoutParams params;
    LinearLayout mainLayout;
    Button but;
    boolean click = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_contact_user_options);
        String username = getIntent().getStringExtra("username");
        TextView tView = (TextView)findViewById(R.id.username);
        tView.setText(username);
        setTitle("MyContacts - User Options");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_contact_user_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onButtonClick(View v){

        if(v.getId() == R.id.buttonBackUp){
            Intent i = new Intent(MyContactUserOptions.this,PopupDemoActivity.class);
            startActivity(i);

        }

        if(v.getId() == R.id.buttonUpdateMyContacts){
            Intent i = new Intent(MyContactUserOptions.this,PopupDemoActivity.class);
            startActivity(i);

        }

        if(v.getId() == R.id.buttonLogout){
            Intent i = new Intent(MyContactUserOptions.this,MyContacts.class);
            startActivity(i);

        }
    }

   /* private void showPopup(){

        Button btn_closepopup=(Button)layout.findViewById(R.id.btn_closePoppup);
        pwindo=new PopupWindow(layout,480,500,true);
        pwindo.showAtLocation(layout, Gravity.CENTER, 0, 40);                                   chartContainer1.addView(mChart);
        btn_closepopup.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                pwindo.dismiss();
            }
        });
    }*/
}

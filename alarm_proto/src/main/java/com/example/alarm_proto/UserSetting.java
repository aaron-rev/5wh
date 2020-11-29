package com.example.alarm_proto;


import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class UserSetting extends AppCompatActivity {

    public void onClick(View v){
        EditText t_et = (EditText)findViewById(R.id.time_edit);

        String user_time = t_et.getText().toString();
        int pre_time;
        pre_time= Integer.parseInt(user_time);

        switch(v.getId()){
            case R.id.go_back_button:
                if ( t_et.getText().toString().length() == 0 ) {
                    this.onBackPressed();
                    break;
                }
                else {
                    Intent intent = new Intent(this, AlarmConfig.class);
                    intent. putExtra("준비 시간",pre_time);
                    this.onBackPressed();
                    break;
                }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_setting);
    }
}

package com.example.alarm_proto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class AlarmManagement extends AppCompatActivity {

    public void onClickAlarm(View v){

        Intent aconfigIntent = new Intent(this,AlarmConfig.class);

        switch(v.getId()){
            case R.id.alarm_add:
                startActivity(aconfigIntent);
                break;
            case R.id.alarmmng_back:
                this.onBackPressed();
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_management);
        // ... 코드 계속

        // 빈 데이터 리스트 생성.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<String> items = new ArrayList<String>();
        // ArrayAdapter 생성. 아이템 View를 선택(single choice)가능하도록 만듦.
        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, items);

        // listview 생성 및 adapter 지정.
        final ListView listview = (ListView) findViewById(R.id.listview2);
        listview.setAdapter(adapter);

        // 코드 계속 ...
        Button addButton = (Button) findViewById(R.id.add);
        addButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                int count;
                count = adapter.getCount();

                // 아이템 추가.
                items.add("LIST" + Integer.toString(count + 1));
                // listview 갱신
                adapter.notifyDataSetChanged();
            }
        });
    }
}

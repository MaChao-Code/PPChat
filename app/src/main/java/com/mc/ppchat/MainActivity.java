package com.mc.ppchat;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.litepal.LitePal;

public class MainActivity extends BaseActivity {

    private MsgDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
        setContentView(R.layout.activity_main);
        Button forceOffline = (Button) findViewById(R.id.force_offline);
        forceOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.mc.PPChat.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });

        Button  enterChat = (Button) findViewById(R.id.chat);
        enterChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChatActivity.class);
                startActivity(intent);
            }
        });

        Button  contacts = (Button) findViewById(R.id.contacts);
        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContactsActivity.class);
                startActivity(intent);
            }
        });

//        dbHelper = new MsgDatabaseHelper(this,"PPChat.db",null,1);
//        Button createDatabase = (Button) findViewById(R.id.create_database);
//        createDatabase.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dbHelper.getWritableDatabase();
//                SQLiteDatabase db = dbHelper.getWritableDatabase();
//                ContentValues values = new ContentValues();
//                // 开始组装第一条数据
//                values.put("person", "John");
//                values.put("content", "Hello guy!");
//                values.put("type", 0);
//                db.insert("Msg", null, values); // 插入第一条数据
//                values.clear();
//                values.put("person", "John");
//                values.put("content", "Hello.Who is that?");
//                values.put("type", 1);
//                db.insert("Msg", null, values);
//                values.clear();
//                values.put("person", "John");
//                values.put("content", "This is Tom.Nice talk to you .");
//                values.put("type", 0);
//                db.insert("Msg", null, values);
//                values.clear();
//            }
//        });
//
        Button download = (Button) findViewById(R.id.download);
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DownloadActivity.class);
                startActivity(intent);
            }
        });

        Button slide = (Button) findViewById(R.id.slide);
        slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SlideActivity.class);
                startActivity(intent);
            }
        });

    }
}

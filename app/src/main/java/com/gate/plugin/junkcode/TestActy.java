package com.gate.plugin.junkcode;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.hx.plugin.junkcode.demo.R;

public class TestActy extends AppCompatActivity {

    TextView textView;
    Button button;
    ArrayList list = new ArrayList();

    Handler handle = new Handler(Looper.getMainLooper()){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 0:
                    Log.d("TAG", "handleMessage: 0");
                case 1:
                    sgaga();
                    Log.d("TAG", "handleMessage: 1");
            }
        }
    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        abss();
    }

    //Activity专用
    private void abss() {
        try {
            textView = findViewById(R.id.tv_text_qeuvcg);
            button = findViewById(R.id.btn_text_qeuvcg);
            button.setOnClickListener((view) -> sgetrei());
        } catch (Exception e) {
            Log.e("TAG", "abss: "+e.getMessage() );
            sfae(list);
        }
        textView.setText(faer());
    }

    @SuppressLint("SimpleDateFormat")
    private String faer() {
        long time = System.currentTimeMillis();
        SimpleDateFormat formatter = new SimpleDateFormat(timePre+timeMiddle+timeSuffx);
        Date date = new Date(time);
        System.out.println(formatter.format(date));
        return formatter.format(date);
    }

    private String timePre = "yyyy-MM-dd";
    private String timeMiddle = "'at'";
    private String timeSuffx = " HH:mm:ss z";


    private void sfae(List list) {
        for (int i = 1; i <= list.size(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }
            Log.d("tag","print is = "+ i + " and ");
        }
        handle.sendEmptyMessage(0);
    }

    //这个fag字符串随机生成,Activity专用
    public void sgetrei(){
        Toast.makeText(this,"fag",Toast.LENGTH_SHORT).show();
    }

    //Activity专用
    public void sgaga(){
        Intent intent = new Intent();
        intent.setClassName(getPackageName(),"sfhajkagnjknak");
        startActivity(intent);
        finish();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
        if(handle != null){
            handle.removeCallbacksAndMessages(null);
            handle = null;
        }
    }
}

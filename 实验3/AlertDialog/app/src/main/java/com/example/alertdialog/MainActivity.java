package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView show;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show = findViewById(R.id.show);
    }
    public void customView(View source)
    {


        TableLayout  logininfo ;
        logininfo     = (TableLayout) getLayoutInflater().inflate(R.layout.login, null);

        new AlertDialog.Builder(this)
                //设置对话框标题
                .setTitle("自定义对话框")
                //设置对话框对象
               .setView(logininfo)
                //设置一个确认按钮
                .setPositiveButton("Sign in", (dialog, which) -> {show.setText("登陆");
                })
                //设置一个取消按钮
                .setNegativeButton("Cancel", (dialog, which) -> {show.setText("取消");
                })
                .create().show();


    }
}
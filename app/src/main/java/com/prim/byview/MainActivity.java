package com.prim.byview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.prim.find.by.ManagerFindByMainActivity;

import byview.prim.com.lib_annotation.BYView;
import byview.prim.com.lib_annotation.DIActivity;

@DIActivity
public class MainActivity extends AppCompatActivity {

    @BYView(R.id.textView)
    public TextView textView;

    @BYView(R.id.textView1)
    public TextView textView1;

    @BYView(R.id.textView2)
    public TextView textView2;

    @BYView(R.id.button)
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ManagerFindByMainActivity.findById(this);
        textView.setText("我是APT找到的");
        textView1.setText("我是APT找到的 --> 1");
        textView2.setText("我是APT找到的 --> 2");
        button.setText("我被APT找到我要跳转");
    }

    public void click(View view) {
        Intent intent = new Intent(this, SencodActivity.class);
        startActivity(intent);
    }
}

package com.prim.byview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.prim.find.by.ManagerFindBySencodActivity;

import org.w3c.dom.Text;

import byview.prim.com.lib_annotation.BYView;
import byview.prim.com.lib_annotation.DIActivity;

@DIActivity
public class SencodActivity extends AppCompatActivity {

    @BYView(R.id.sencodText)
    public TextView sencodText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sencod);
        ManagerFindBySencodActivity.findById(this);
        sencodText.setText("我是sencodText,我是被APT找到的");
    }
}

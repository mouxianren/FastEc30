package com.yiqi.fastec30;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yiqi.latte.app.Latte;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Latte.init(this).withApiHost("http://www.baidu.com").configure();
    }
}

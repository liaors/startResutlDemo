package com.rs.startresutldemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Rs on 2018/1/5.
 */

public class TextResultActivity extends AppCompatActivity {
    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void onClick() {
        Intent intent = new Intent();
        intent.putExtra("text","这是船体过来的数");
        setResult(Activity.RESULT_OK,intent);
        finish();
    }
}

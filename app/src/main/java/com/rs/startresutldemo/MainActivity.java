package com.rs.startresutldemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.rs.startresutldemo.onResultUtil.AvoidOnResult;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;
    @BindView(R.id.text)
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.button)
    public void onClick() {
        new AvoidOnResult(this).startForResult(TextResultActivity.class, 111, new AvoidOnResult.Callback() {
            @Override
            public void onActivityResult(int requestCode, int resultCode, Intent data) {
                text.setText(data.getStringExtra("text")+"");
            }
        });
    }
}

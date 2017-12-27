package com.example.administrator.abc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 最新ButterKnife Demo
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tv.setText("ButterKnife");
    }

    @OnClick(R.id.tv)
    public void onViewClicked() {
        int div = 1%3;
        Toast.makeText(this, "点击了ButterKnife--" + div , Toast.LENGTH_SHORT).show();
    }
}

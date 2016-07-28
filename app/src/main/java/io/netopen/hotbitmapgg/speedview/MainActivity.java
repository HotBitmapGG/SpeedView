package io.netopen.hotbitmapgg.speedview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.netopen.hotbitmapgg.library.view.BezaerView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BezaerView mBezaerView = (BezaerView) findViewById(R.id.bezaerView);
        mBezaerView.startAnim();
    }
}

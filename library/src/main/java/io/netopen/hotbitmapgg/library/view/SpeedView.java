package io.netopen.hotbitmapgg.library.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by hcc on 16/7/25 20:08
 * 100332338@qq.com
 * <p/>
 * 一个内存加速的View
 */
public class SpeedView extends View
{


    public SpeedView(Context context)
    {

        this(context, null);
    }

    public SpeedView(Context context, AttributeSet attrs)
    {

        this(context, attrs, 0);
    }

    public SpeedView(Context context, AttributeSet attrs, int defStyleAttr)
    {

        super(context, attrs, defStyleAttr);
        init();
    }

    private void init()
    {

    }
}

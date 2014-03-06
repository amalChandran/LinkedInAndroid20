package com.amalbit.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;


/**
 * @author AmalChandran(Novasys)
 * **/
public class CustomWebView extends WebView {

    public CustomWebView(Context context) {
        this(context, null);
    }

    public CustomWebView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomWebView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        /* any initialisation work here */
    }
    
   /* @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
         your code here 
    	Log.e("onKeyDown", "KeyCode: "+keyCode);
        return super.onKeyDown(keyCode, event);
    }*/
    // Note this!
    @Override
    public boolean onCheckIsTextEditor()
    {
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev)
    {
        switch (ev.getAction())
        {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_UP:
                if (!hasFocus()){
                    requestFocus();
                }
            break;
        }

        return super.onTouchEvent(ev);
    }


}

package com.kee.androidgames.framework.impl;

import android.view.View.OnTouchListener;

import com.kee.androidgames.framework.Input.TouchEvent;

import java.util.List;

public interface TouchHandler extends OnTouchListener {
    boolean isTouchDown(int pointer);
    
    int getTouchX(int pointer);

    int getTouchY(int pointer);
    
    List<TouchEvent> getTouchEvents();
}

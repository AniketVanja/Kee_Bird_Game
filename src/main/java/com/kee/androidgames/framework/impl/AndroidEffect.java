package com.kee.androidgames.framework.impl;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.kee.androidgames.framework.Effect;

public abstract class AndroidEffect implements Effect {
   abstract void apply(Canvas canvas, Paint paint, int x, int y, int width, int height);
}

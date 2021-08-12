package com.kee.androidgames.framework;

import com.kee.androidgames.framework.Graphics.PixmapFormat;

public interface Pixmap {
    int getWidth();

    int getHeight();

    PixmapFormat getFormat();

    void dispose();
}

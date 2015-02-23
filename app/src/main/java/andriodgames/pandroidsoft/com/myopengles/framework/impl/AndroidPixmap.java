package andriodgames.pandroidsoft.com.myopengles.framework.impl;

import android.graphics.Bitmap;

import andriodgames.pandroidsoft.com.myopengles.framework.Graphics;
import andriodgames.pandroidsoft.com.myopengles.framework.Pixmap;

/**
 * Created by pumba30 on 23.02.2015.
 */
public class AndroidPixmap implements Pixmap {
    Bitmap bitmap;
    Graphics.PixmapFormat format;

    public AndroidPixmap(Bitmap bitmap, Graphics.PixmapFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    @Override
    public int getWidth() {
        return bitmap.getWidth();
    }

    @Override
    public int getHeight() {
        return bitmap.getHeight();
    }

    @Override
    public Graphics.PixmapFormat getFormat() {
        return format;
    }

    @Override
    public void dispose() {
        bitmap.recycle();
    }
}

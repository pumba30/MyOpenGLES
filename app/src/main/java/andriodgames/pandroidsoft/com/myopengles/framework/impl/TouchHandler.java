package andriodgames.pandroidsoft.com.myopengles.framework.impl;

import android.view.View;

import java.util.List;

import andriodgames.pandroidsoft.com.myopengles.framework.Input;

/**
 * Created by pumba30 on 23.02.2015.
 */
public interface TouchHandler extends View.OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<Input.TouchEvent> getTouchEvents();
}

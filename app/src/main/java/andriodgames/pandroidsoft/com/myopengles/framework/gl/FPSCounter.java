package andriodgames.pandroidsoft.com.myopengles.framework.gl;

import android.util.Log;

/**
 * Created by pumba30 on 23.02.2015.
 */
public class FPSCounter {
    long startTime = System.nanoTime();
    int frames = 0;

    public void logFrame() {
        frames++;
        if(System.nanoTime() - startTime >= 1000000000) {
            Log.d("FPSCounter", "fps: " + frames);
            frames = 0;
            startTime = System.nanoTime();
        }
    }
}

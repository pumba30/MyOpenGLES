package andriodgames.pandroidsoft.com.myopengles.framework.impl;

import android.media.SoundPool;

import andriodgames.pandroidsoft.com.myopengles.framework.Sound;

/**
 * Created by pumba30 on 23.02.2015.
 */
public class AndroidSound implements Sound {
    int soundId;
    SoundPool soundPool;

    public AndroidSound(SoundPool soundPool,int soundId) {
        this.soundId = soundId;
        this.soundPool = soundPool;
    }

    @Override
    public void play(float volume) {
        soundPool.play(soundId, volume, volume, 0, 0, 1);
    }

    @Override
    public void dispose() {
        soundPool.unload(soundId);
    }

}

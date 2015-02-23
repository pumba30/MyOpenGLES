package andriodgames.pandroidsoft.com.myopengles.framework;

/**
 * Created by pumba30 on 23.02.2015.
 */
public interface Music {

    public void play();

    public void stop();

    public void pause();

    public void setLooping(boolean looping);

    public void setVolume(float volume);

    public boolean isPlaying();

    public boolean isStopped();

    public boolean isLooping();

    public void dispose();
}

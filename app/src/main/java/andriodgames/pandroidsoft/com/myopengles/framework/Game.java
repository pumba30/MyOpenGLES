package andriodgames.pandroidsoft.com.myopengles.framework;

/**
 * Created by pumba30 on 23.02.2015.
 */
public interface Game {

    public Input getInput();

    public FileIO getFileIO();

    public Graphics getGraphics();

    public Audio getAudio();

    public void setScreen(Screen screen);

    public Screen getCurrentScreen();

    public Screen getStartScreen();
}

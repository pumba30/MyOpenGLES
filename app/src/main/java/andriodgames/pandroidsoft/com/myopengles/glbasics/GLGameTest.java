package andriodgames.pandroidsoft.com.myopengles.glbasics;

import java.util.Random;

import javax.microedition.khronos.opengles.GL10;

import andriodgames.pandroidsoft.com.myopengles.framework.Game;
import andriodgames.pandroidsoft.com.myopengles.framework.Screen;
import andriodgames.pandroidsoft.com.myopengles.framework.impl.GLGame;
import andriodgames.pandroidsoft.com.myopengles.framework.impl.GLGraphics;

/**
 * Created by pumba30 on 23.02.2015.
 */
public class GLGameTest extends GLGame {
    @Override
    public Screen getStartScreen() {
        return new TestScreen(this);
    }

    class TestScreen extends Screen {
        GLGraphics glGraphics;
        Random rand = new Random();

        public TestScreen(Game game) {
            super(game);
            glGraphics = ((GLGame) game).getGLGraphics();
        }

        @Override
        public void present(float deltaTime) {
            GL10 gl = glGraphics.getGL();
            gl.glClearColor(rand.nextFloat(), rand.nextFloat(),
                    rand.nextFloat(), 1);
            gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        }

        @Override
        public void update(float deltaTime) {
        }

        @Override
        public void pause() {
        }

        @Override
        public void resume() {
        }

        @Override
        public void dispose() {
        }
    }
}

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class TestMenuScreen implements Screen {
    final GameMain game;

    OrthographicCamera camera;

    //sizes for main menu
    public static float WORLD_WIDTH = 1600f;//w units
    public static float WORLD_HEIGHT = 960f;//h units


    public TestMenuScreen(final GameMain game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, WORLD_WIDTH, WORLD_HEIGHT);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float v) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.font.draw(game.batch, "TEST Main Manu", WORLD_WIDTH / 2, WORLD_HEIGHT / 2);
        game.font.draw(game.batch, "Click anywhere to begin!", WORLD_WIDTH/2, WORLD_HEIGHT/2-40);
        game.batch.end();

        if (Gdx.input.isTouched()) {
            game.setScreen(new TestGameScreen(game));
            dispose();
        }

    }

    @Override
    public void resize(int i, int i1) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}

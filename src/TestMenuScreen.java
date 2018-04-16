import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.sun.glass.ui.View;

public class TestMenuScreen implements Screen {
    final GameMain game;

    private OrthographicCamera camera;
    private Viewport viewport;


    //sizes for main menu
    public static float WORLD_WIDTH = 1600f;//w units
    public static float WORLD_HEIGHT = 960f;//h units


    public TestMenuScreen(final GameMain game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, WORLD_WIDTH, WORLD_HEIGHT);
        viewport = new FitViewport(WORLD_WIDTH,WORLD_HEIGHT,camera);
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
        game.font.draw(game.batch, "TEST Main Menu", WORLD_WIDTH / 2, WORLD_HEIGHT / 2);
        game.font.draw(game.batch, "Click anywhere to begin!", WORLD_WIDTH/2, WORLD_HEIGHT/2-40);

        boolean isLeftClicked = Gdx.input.isButtonPressed(Input.Buttons.LEFT);
        game.font.draw(game.batch, (isLeftClicked ? "Left" : "No Left"), 60f, WORLD_HEIGHT-120f);

        game.batch.end();

        if(Gdx.input.isTouched()){
            game.setScreen(new TestGameScreen(game));
            dispose();
        }

    }

    @Override
    public void resize(int i, int i1) {
        viewport.update(i,i1);
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

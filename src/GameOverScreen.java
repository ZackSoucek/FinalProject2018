import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class GameOverScreen implements Screen {
    final GameMain game;

    private OrthographicCamera camera;
    private Viewport viewport;


    //sizes for main menu
    public static float WORLD_WIDTH = 1600f;//w units
    public static float WORLD_HEIGHT = 960f;//h units


    public GameOverScreen(GameMain game){
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
        game.font.draw(game.batch, "Game Over", WORLD_WIDTH / 2, WORLD_HEIGHT / 2);
        game.font.draw(game.batch, "You Scored: "+ game.getScore() , WORLD_WIDTH/2, WORLD_HEIGHT/2-40);
        game.font.draw(game.batch, "Click to go back to main menu", WORLD_WIDTH / 2, WORLD_HEIGHT / 2);

        game.batch.end();

        if(Gdx.input.isTouched()){
            game.setScreen(new TestMenuScreen(game));
            dispose();
            game.incrementLevel();
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

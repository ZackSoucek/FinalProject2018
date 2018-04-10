import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class TestGameScreen implements Screen {

    final GameMain game;

    OrthographicCamera camera;
    private Viewport viewport;

    //sizes for main menu
    public static float WORLD_WIDTH = 1600f;//w units
    public static float WORLD_HEIGHT = 960f;//h units

    public TestGameScreen(final GameMain game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, WORLD_WIDTH, WORLD_HEIGHT);
        viewport = new FitViewport(WORLD_WIDTH, WORLD_HEIGHT, camera);

    }


    @Override
    public void show() {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.font.draw(game.batch, "TEST Game Screen", WORLD_WIDTH / 2, WORLD_HEIGHT / 2);
        game.font.draw(game.batch, "this shits not done", WORLD_WIDTH / 2, WORLD_HEIGHT / 2 - 40);

        game.batch.draw(game.playerCharacter.texture, game.playerCharacter.hitBox.x, game.playerCharacter.hitBox.y);


        game.batch.end();

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.font.draw(game.batch, "TEST Game Screen", WORLD_WIDTH / 2, WORLD_HEIGHT / 2);
        if(Gdx.input.isTouched()){//test to put the player where the mouse is
            Vector3 touchpos = new Vector3();
            touchpos.set(Gdx.input.getX(),Gdx.input.getY(),0);
            camera.unproject(touchpos);
            game.playerCharacter.hitBox.x = touchpos.x;
            game.playerCharacter.hitBox.y = touchpos.y;
        }
        //todo a real control scheme

        game.batch.draw(game.playerCharacter.texture, game.playerCharacter.hitBox.x, game.playerCharacter.hitBox.y);


        game.batch.end();

    }

    @Override
    public void resize(int i, int i1) {
        viewport.update(i, i1);
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

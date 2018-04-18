import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
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

    private final Floor floor = new Floor();

    public static float GRAVITY = 10f;
    public static float JUMP_HEIGHT = 60f;
    public static float MOVE_SPEED = 300f;
    public Boolean onFloor = false;
    float deltaYVel = 0;
    float deltaXVel = 0;

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

        game.playerCharacter.sprite.draw(game.batch);
        //puts in player
        floor.sprite.draw(game.batch);
        //put in floor

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

        //move player with mouce movement
        if (Gdx.input.isTouched()) {//test to put the player where the mouse is
            Vector3 touchpos = new Vector3();
            touchpos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            camera.unproject(touchpos);

            game.playerCharacter.sprite.setX(touchpos.x);
            game.playerCharacter.sprite.setY(touchpos.y);
            deltaYVel = 0;//zero out y velocity

        }
        //todo Remove this for final version ^
        deltaYVel--;//lowers y velocity to create GRAVITY
        if (game.playerCharacter.sprite.getBoundingRectangle().overlaps(floor.sprite.getBoundingRectangle())) {
            deltaYVel = 0;//hit floor so fall stops
            onFloor = true;
        } else
            onFloor = false;
        if(onFloor){
            deltaXVel /= 2;
            game.playerCharacter.sprite.setY(floor.sprite.getY() + floor.sprite.getHeight());
            if (Gdx.input.isKeyPressed((Input.Keys.UP))) {//only junp off of floor
                deltaYVel += JUMP_HEIGHT;//Y velocity is increased
            }

        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            deltaXVel = -(onFloor ?  MOVE_SPEED: MOVE_SPEED/2);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            deltaXVel = (onFloor ?  MOVE_SPEED: MOVE_SPEED/2);
        }

        //make vertical movement
        game.playerCharacter.sprite.translateY(GRAVITY * deltaYVel * delta);//acceleration works by lovering the Y Velocity per second
//x movement
        game.playerCharacter.sprite.translateX( deltaXVel * delta );


        game.playerCharacter.sprite.draw(game.batch);//update player position
        //done with player movement

        floor.sprite.draw(game.batch);


        game.batch.end();

    }

    @Override
    public void resize(int i, int i1) {
//        viewport.update(i, i1); using this breaks it i think
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

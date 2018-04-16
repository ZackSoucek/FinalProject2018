import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameMain extends Game {
    public SpriteBatch batch;
    public BitmapFont font;
    public PlayerCharacter playerCharacter;

    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        playerCharacter = new PlayerCharacter();
        this.setScreen(new TestMenuScreen(this));

    }


    @Override
    public void render() {
        super.render();//calls game's render, which i think call s the screen refreshes

    }


    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
    }
}

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Floor extends Entity {
    public Floor() {
        super(new Sprite(new Texture(Gdx.files.internal("CroppedFloor.png")), 0, 0, 1600, 30));
    }

    @Override
    public void collidePlayer(PlayerCharacter playerCharacter) {
        //do nothing
    }

    @Override
    public void think(GameMain game) {
        //do nothing
    }
}

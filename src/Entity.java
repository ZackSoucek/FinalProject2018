import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;

public abstract class Entity {
    public Sprite sprite;
    //all entitys need a sprite which has location and picture


    public Entity() {
        this.sprite = new Sprite(new Texture(Gdx.files.internal("assets/Flabio.png")));
    }

    public Entity(Sprite sprite) {
        this.sprite = sprite;
    }


}

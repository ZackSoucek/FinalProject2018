import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public abstract class Entity {
    public Rectangle hitBox;
    public Texture texture;
    //all entitys need a rectangle for where they are and a texture


    public Entity() {
        this.hitBox = new Rectangle();
        this.texture = new Texture(Gdx.files.internal("assets/Flabio.png"));//defaults to the flabio texture
    }

    public Entity(Rectangle rect, Texture texture) {
        this.hitBox = rect;
        this.texture = texture;

    }


}

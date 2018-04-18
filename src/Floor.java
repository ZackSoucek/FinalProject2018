import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Floor extends Entity {
    public Floor(){
        super(new Sprite(new Texture(Gdx.files.internal("assets/CroppedFloor.png")),0,0,1600,30));
    }
}

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Barrier extends Entity {
    public Barrier(int x, int y){
        super(new Sprite(new Texture(Gdx.files.internal("assets/FlabioFinal.png")), x, y));
    }
}

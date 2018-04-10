import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class PlayerCharacter extends AliveThing {
    private int xp;
    private int level;

    PlayerCharacter() {
        super(  new Rectangle(0, 0, 32, 32),
                new Texture(Gdx.files.internal("assets/FlabioFinal.png")),
                20,
                20,
                1,
                new Weapon("Basic Sword", 2 , 50,1));
        this.xp = 0;
        this.xp = 0;
    }

    @Override
    public void attack(AliveThing target) {
        target.health = target.health - this.weapon.damage;
    }
}

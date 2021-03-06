import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;

public abstract class AliveThing extends Entity implements CanAttack {
    public int healthTotal;
    public int health;
    public Weapon weapon;
    public int armor;

    public AliveThing() {
        super();
        this.healthTotal = 1;
        this.health = 1;
        this.weapon = new Weapon();
        this.armor = 0;
    }

    public AliveThing(Sprite sprite, int healthTotal, int health, int armor, Weapon weapon) {
        super(sprite);
        this.healthTotal = healthTotal;
        this.health = health;
        this.armor = armor;
        this.weapon = weapon;
    }

}

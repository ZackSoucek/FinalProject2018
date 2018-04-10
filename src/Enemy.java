import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public abstract class Enemy extends AliveThing {
    private int difficulty;

    public Enemy() {
        super();
        difficulty = 0;
        //no blank enemies
    }

    public Enemy(Rectangle rectangle, Texture texture, int healthTotal, int health, int armor, Weapon weapon, int difficulty) {
        super(rectangle, texture, healthTotal, health, armor, weapon);
        this.difficulty = difficulty;

        //this is the Zack version 327 part 2
        //https://codeforphilly.github.io/decentralized-data/tutorials/git-basics/
    }
}

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;

public abstract class Enemy extends AliveThing {
    private int difficulty;

    public Enemy() {
        super();
        difficulty = 0;
        //no blank enemies
    }

    public Enemy(Sprite sprite, int healthTotal, int health, int armor, Weapon weapon, int difficulty) {
        super(sprite, healthTotal, health, armor, weapon);
        this.difficulty = difficulty;

        //this is the Zack version with the engine corrections(haha lol its just move the dude)
        //https://codeforphilly.github.io/decentralized-data/tutorials/git-basics/
    }

    public int getDifficulty() {
        return difficulty;
    }
}

import com.badlogic.gdx.graphics.g2d.Sprite;

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

    }

    public int getDifficulty() {
        return difficulty;
    }
}

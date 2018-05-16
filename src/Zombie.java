import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Zombie extends Enemy implements Projectile {


    public Zombie(int x, int y, Texture texture) {
        super(new Sprite(texture),
                20,
                20,
                0,
                new Weapon("Zombie Fists", 2, 3, 0.75),
                1,
                10f);
        this.sprite.setX(x);
        this.sprite.setY(y);
    }

    @Override
    public void move(GameMain game) {
        //not move
        System.out.println("Hey i am falling");
    }

    @Override
    public void think(GameMain game) {
//        float dxdt = this.sprite.getX()- game.playerCharacter.sprite.getX();
//        this.sprite.translateX((dxdt < 0 ? this.getMoveSpeed() : dxdt > 0 ? -this.getMoveSpeed() : 0f));//todo make go towards the player.
    }

}

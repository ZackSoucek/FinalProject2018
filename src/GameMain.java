import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameMain extends Game {
    public SpriteBatch batch;
    public BitmapFont font;
    public PlayerCharacter playerCharacter;
    private int score;
    private int level = 0;//keeps track of what level we are on
                            // if level 0, show main menu
                            // used to calculate enemies and whether boss(level%10==0)

    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        playerCharacter = new PlayerCharacter();
        score = 0;
        this.setScreen(new TestMenuScreen(this));

    }


    @Override
    public void render() {
        super.render();//calls game's render, which i think call s the screen refreshes

    }


    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
    }

    public int getLevel() {
        return level;
    }
    public void incrementLevel(){
        level++;
    }
    public void gameOver(){
        level = -1;
        this.setScreen(new GameOverScreen(this));
    }

    public int getScore() {
        calculateScore();
        return score;
    }
    public void calculateScore(){
        score = playerCharacter.getXp();
        for (int l = playerCharacter.getLevel(); l > 0; l--) {
            score+= playerCharacter.EXP_PER_LEVEL * l;
        }
    }

    public void setGameLevel(int level) {
        this.level = level;
    }

    public void setScore(int newScore){
        score = newScore;
    }

}

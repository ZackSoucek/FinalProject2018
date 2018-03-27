public abstract class Enemy extends AliveThing {
    private int difficulty;

    public Enemy(){
        super();
        difficulty = 0;
        //no blank enemies
    }
    public Enemy(HitBox h, int xPos, int yPos, int health, int armor, Weapon weapon, int difficulty){
        super(h,xPos,yPos, health,armor ,weapon);
        this.difficulty = difficulty;
        //this is the Zack version 327 part 2
    }
}

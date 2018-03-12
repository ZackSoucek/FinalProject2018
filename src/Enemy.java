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
        difficulty = difficulty/2;
        System.out.println("test");
        System.out.println("test2");
    }
}

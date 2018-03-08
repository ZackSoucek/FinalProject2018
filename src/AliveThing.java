public abstract class AliveThing extends Entity implements CanAttack{
    private int health;
    private Weapon weapon;
    private int armor;

    public AliveThing(){
        super();
        this.health = 1;
        this.weapon = new Weapon();
        this.armor = 0;
    }
    public AliveThing(HitBox h, int xPos, int yPos, int health, int armor, Weapon weapon ){
        super(h,xPos,yPos);
        this.health = health;
        this.armor = armor;
        this.weapon = weapon;
    }

}

public abstract class Entity implements Collidable, Mobile {
    //TODO hitbox
    private double velocityY;
    private double velocityX;
    int xPos;
    int yPos;
    private HitBox hitBox;
    public Entity(){
        this.hitBox = new HitBox();
        this.velocityX = 0;
        this.velocityY = 0;
        xPos = 0;
        yPos = 0;
    }
    public Entity(HitBox h, int xPos, int yPos){
        this.hitBox = h;
        this.velocityX = 0;
        this.velocityY = 0;
        this.yPos = yPos;
        this.xPos = xPos;
    }

    @Override
    public void collide(Collidable otherCollidable) {
        //todo change velocities.
    }
}

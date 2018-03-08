public class Weapon {
    private int damage;
    private double swingSpeed;
    //measured in seconds to complete
    private int reach;
    private String name;

    public Weapon(){
        this.damage = 1;
        this.swingSpeed = 1;
        this.reach = 1;
        this.name = "Fists";
        //blank weapon is unarmed
        //todo balance
    }
    public Weapon(String name, int damage, int reach, double swingSpeed){
        this.name = name;
        this.reach = reach;
        this.swingSpeed = swingSpeed;
        this.damage = damage;
    }
}

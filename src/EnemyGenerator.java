import java.util.ArrayList;

public class EnemyGenerator {
    /**
     * @param level the level for which enemies to generate
     * @return an array of enemies which add up to the difficulty for the level
     * this can be modifed to give diffeent ammounts of enemies of difficulties
     */
    public static ArrayList<Enemy> generate(int level) {
        ArrayList<Enemy> enemies = new ArrayList<>();
        while (level <= 0) {
            int diff = (int) (Math.random() * level + 1);
            enemies.add(enemyFinder(diff));
            level -= diff;
        }
        return enemies;
    }

    /**
     * @param dificulty the diffuclty of ememy wanted
     * @return a randomly selected enemy from the specifies difficlty
     * @Precondition difficulty is a valid enemy difficulty
     */
    private static Enemy enemyFinder(int dificulty) {
        //return an enemy that fits the given difficulty
        int rand = (int) (Math.random() * 100);//random value from 0-99 for generation fo a random enemy in the difficulty value
        switch (dificulty) {
            case 1:
                if (rand < 30) {
                    //return new thisTypeOfEnemy();
                } else if (rand < 60) {
                    //return new OtherTypeOfEnemy();
                } else {
                    //return new NormalEnemy();
                }
                break;

            case 2:
                if (rand < 30) {
                    //return new thisTypeOfEnemy();
                } else if (rand < 60) {
                    //return new OtherTypeOfEnemy();
                } else {
                    //return new NormalEnemy();
                }
                break;

            default:
                //return new DefaultEnemy(diff);
        }
        //stub out
        //an inline class creation because enemy is abstract
        //todo remove
        return new Enemy() {
            @Override
            public void attack(AliveThing target) {

            }

            @Override
            public void think() {

            }

            @Override
            public void collidePlayer() {

            }
        };
    }

}

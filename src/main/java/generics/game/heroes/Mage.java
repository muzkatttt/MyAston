package generics.game.heroes;

import generics.game.enemies.Enemy;
import generics.game.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T>{
    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " сотворил заклинание на " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}

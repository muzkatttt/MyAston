package generics.game.heroes;

import generics.game.enemies.Enemy;
import generics.game.weapon.Weapon;

public abstract class Hero<T extends Weapon> {
    private String name;
    private int damage;
    private T weapon;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}

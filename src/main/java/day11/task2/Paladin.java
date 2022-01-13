package day11.task2;

class Paladin extends Hero implements PhysAttack, Healer {
    Paladin() {
        super(100, 0.5, 0.2, 15, 0);
    }

    public void physicalAttack(Hero hero) {
        hero.health -= physAtt - physAtt * hero.physDef;
        if (hero.health < 0) hero.health = 0;
    }

    public void healHimself() {
        health += 25;
        if (health > 100) health = 100;
    }

    public void healTeammate(Hero hero) {
        hero.health += 10;
        if (hero.health > 100) hero.health = 100;
    }

    @Override
    public String toString() {
        return "Paladin health = " + health;
    }
}

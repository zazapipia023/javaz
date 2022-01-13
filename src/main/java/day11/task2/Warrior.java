package day11.task2;

class Warrior extends Hero implements PhysAttack {
    Warrior() {
        super(100, 0.8, 0, 30, 0);
    }

    public void physicalAttack(Hero hero) {
        hero.health -= physAtt - physAtt * hero.physDef;
        if (hero.health < 0) hero.health = 0;
    }

    @Override
    public String toString() {
        return "Warrior health = " + health;
    }
}

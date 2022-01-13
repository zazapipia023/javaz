package day11.task2;

class Magician extends Hero implements MagicAttack, PhysAttack {
    Magician() {
        super(100, 0, 0.8, 5, 20);
    }

    public void physicalAttack(Hero hero) {
        hero.health -= physAtt - physAtt * hero.physDef;
        if (hero.health < 0) hero.health = 0;
    }

    public void magicalAttack(Hero hero) {
        hero.health -= magicAtt - magicAtt * hero.magicDef;
        if (hero.health < 0) hero.health = 0;
    }

    @Override
    public String toString() {
        return "Magician health = " + health;
    }
}

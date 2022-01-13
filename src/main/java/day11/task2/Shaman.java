package day11.task2;

class Shaman extends Hero implements MagicAttack, PhysAttack, Healer {
    Shaman() {
        super(100, 0.2, 0.2, 10, 15);
    }

    public void physicalAttack(Hero hero) {
        hero.health -= physAtt - physAtt * hero.physDef;
        if (hero.health < 0) hero.health = 0;
    }

    public void magicalAttack(Hero hero) {
        hero.health -= magicAtt - magicAtt * hero.magicDef;
        if (hero.health < 0) hero.health = 0;
    }

    public void healHimself() {
        health += 50;
        if (health > 100) health = 100;
    }

    public void healTeammate(Hero hero) {
        hero.health += 30;
        if (hero.health > 100) hero.health = 100;
    }

    @Override
    public String toString() {
        return "Shaman health = " + health;
    }
}

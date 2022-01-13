package day11.task2;

abstract class Hero {
    protected double health, physDef, magicDef, physAtt, magicAtt;

    Hero(double health, double physDef, double magicDef, double physAtt, double magicAtt) {
        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
        this.magicAtt = magicAtt;
    }
}

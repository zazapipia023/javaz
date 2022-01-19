package day14;

class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{name=" + name + ", year=" + age + "}";
    }
}

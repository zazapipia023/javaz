package day9.Task1;

class Human {
    private String name;

    Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + name);
    }
}

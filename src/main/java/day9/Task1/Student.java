package day9.Task1;

class Student extends Human {
    private String groupName;

    Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + super.getName());
    }
}

package day9.Task1;

class Teacher extends Human {
    private String subjectName;

    Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподователь с именем " + super.getName());
    }
}

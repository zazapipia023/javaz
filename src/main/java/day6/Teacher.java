package day6;

class Teacher {
    private String name, subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student) {
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету "
                + subject + " на оценку " + (int)(Math.random() * 4 + 2));
    }
}

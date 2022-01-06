package day6;

class Car {
    private String model, color;
    private int yearCreated;

    public void setModel(String model) {
        if (model.isEmpty()) {
            System.out.println("Введена пустая модель");
        } else {
            this.model = model;
        }
    }

    public String getModel() {
        return this.model;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("Введён пустой цвет");
        } else {
            this.color = color;
        }
    }

    public String getColor() {
        return this.color;
    }

    public void setYearCreated(int year) {
        if (year < 1886) {
            System.out.println("Не может быть");
        } else {
            yearCreated = year;
        }
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        if (yearCreated > inputYear) {
            return yearCreated - inputYear;
        } else {
            return inputYear - yearCreated;
        }
    }
}
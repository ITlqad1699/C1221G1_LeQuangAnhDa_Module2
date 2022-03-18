package case_study.furama_resort_maneger.models.person;

import case_study.furama_resort_maneger.models.GetInFoToCSV;

public class Employee extends Person implements GetInFoToCSV {
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String level, String position, double salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String name, String birthDay, String gender, int idCard, String phoneNumber, String email, String level, String position, double salary) {
        super(id, name, birthDay, gender, idCard, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", birthDay='" + getBirthDay() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", idCard=" + getIdCard() +
                ", phoneNumber=" + getPhoneNumber() +
                ", email='" + getEmail() + '\'' +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getInFoToCSV() {
        return this.getId() + "," + this.getName() + "," + this.getBirthDay() + "," + this.getGender() + "," + this.getIdCard() + "," + this.getPhoneNumber() + "," + this.getEmail() + "," + this.level + "," + this.position + "," + this.salary;
    }
}

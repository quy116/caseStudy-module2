package case_study.model.person;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String codeName, String name, String dateOfBirth, String gender, String id, String phoneNumber, String email, String level, String position, double salary) {
        super(codeName, name, dateOfBirth, gender, id, phoneNumber, email);
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
        return "Employee{" + super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String getInfoCsv() {
        return super.getCodeName() + "," + super.getName() + "," + super.getDateOfBirth() + "," + super.getGender() + "," + super.getId() + ","
                + super.getPhoneNumber() + "," + super.getEmail() + "," + this.level + "," + this.position + "," + this.salary;
    }
}

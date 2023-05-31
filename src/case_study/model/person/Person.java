package case_study.model.person;

public abstract class Person {
    private String codeName;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String id;
    private String phoneNumber;
    private String Email;

    public Person() {
    }

    public Person(String codeName, String name, String dateOfBirth, String gender, String id, String phoneNumber, String email) {
        this.codeName = codeName;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.id = id;
        this.phoneNumber = phoneNumber;
        Email = email;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "codeName='" + codeName + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}

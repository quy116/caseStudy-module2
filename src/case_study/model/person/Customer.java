package case_study.model.person;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(String codeName, String name, String dateOfBirth, String gender, String id, String phoneNumber, String email, String typeOfGuest, String address) {
        super(codeName, name, dateOfBirth, gender, id, phoneNumber, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String getInfoCsv() {
        return super.getCodeName() + "," + super.getName() + "," + super.getDateOfBirth() + "," + super.getGender() + "," + super.getId() + ","
                + super.getPhoneNumber() + "," + super.getEmail() + "," + this.typeOfGuest + "," + this.address;
    }
}

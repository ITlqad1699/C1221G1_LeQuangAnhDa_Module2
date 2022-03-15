package case_study.furama_resort_maneger.models.person;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(int id, String name, String birthDay, String gender, int idCard, long phoneNumber, String email, String customerType, String address) {
        super(id, name, birthDay, gender, idCard, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", birthDay='" + getBirthDay() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", idCard=" + getIdCard() +
                ", phoneNumber=" + getPhoneNumber() +
                ", email='" + getEmail() + '\'' +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

package case_study_md2.furama_resort.models;

public class Customer extends Person {
    private String customerCode;
    private String typeOfCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, int iDNo, String phoneNumber, String email, String customerCode, String typeOfCustomer, String address) {
        super(name, birthday, gender, iDNo, phoneNumber, email);
        this.customerCode = customerCode;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
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
                "customerCode='" + customerCode + '\'' +
                super.toString()+
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

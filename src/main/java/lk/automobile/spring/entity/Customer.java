package lk.automobile.spring.entity;

/**
 * author  Yasith C Bandara
 * created 1/18/2023 - 7:58 PM
 * project Automobile-Service-WebApp
 */

public class Customer {
    private String name;
    private String address;
    private String email;
    private String dlNo;
    private String nicNo;

    public Customer(String name, String address, String email, String dlNo, String nicNo) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.dlNo = dlNo;
        this.nicNo = nicNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDlNo() {
        return dlNo;
    }

    public void setDlNo(String dlNo) {
        this.dlNo = dlNo;
    }

    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", dlNo='" + dlNo + '\'' +
                ", nicNo='" + nicNo + '\'' +
                '}';
    }
}

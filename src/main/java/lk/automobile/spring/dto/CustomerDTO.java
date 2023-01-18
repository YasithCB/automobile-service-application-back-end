package lk.automobile.spring.dto;

/**
 * author  Yasith C Bandara
 * created 1/18/2023 - 6:04 PM
 * project Automobile-Service-WebApp
 */

public class CustomerDTO {
    private String name;
    private String address;
    private String email;
    private String dlNo;
    private String nicNo;

    public CustomerDTO(String name, String address, String email, String dlNo, String nicNo) {
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
}

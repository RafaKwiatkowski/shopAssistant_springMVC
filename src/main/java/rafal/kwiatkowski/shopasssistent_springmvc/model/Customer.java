package rafal.kwiatkowski.shopasssistent_springmvc.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    @Embedded
    private Address address;
    private String mail;
    private String phoneNumber;
    @OneToMany(targetEntity = OrderTbl.class, mappedBy = "customer")
    private List<OrderTbl> orders;

    public Customer() {
    }

    public Customer(String firstName, String lastName, Address address, String mail, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.orders = orders;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<OrderTbl> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderTbl> orders) {
        this.orders = orders;
    }
}

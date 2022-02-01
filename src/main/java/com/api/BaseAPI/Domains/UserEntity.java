package com.api.BaseAPI.Domains;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Users")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FIRST_NAME", length = 120, nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", length = 120, nullable = false)
    private String lastName;

    @Column(name = "DOCUMENT")
    private String document;

    @Column(name = "PASSWORD", length = 120, nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @Column(name = "DEPT", length = 120)
    private String dept;

    @Column(name = "EMAIL", length = 120, unique = true, nullable = false)
    private String email;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "CITY", length = 120, unique = true, nullable = false)
    private String city;

    @OneToMany(mappedBy="user", cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
    private List<LandEntity> lands;

    @OneToMany(mappedBy="user", cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
    private List<NSpreadsheetEntity> nSpreadsheets;

    @OneToMany(mappedBy="user", cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
    private List<ProductEntity> products;

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", document=" + document +
                ", password='" + password + '\'' +
                ", dept='" + dept + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", city='" + city + '\'' +
                ", lands=" + lands +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<LandEntity> getLands() {
        return lands;
    }

    public void setLands(List<LandEntity> lands) {
        this.lands = lands;
    }

    public List<NSpreadsheetEntity> getnSpreadsheets() {
        return nSpreadsheets;
    }

    public void setnSpreadsheets(List<NSpreadsheetEntity> nSpreadsheets) {
        this.nSpreadsheets = nSpreadsheets;
    }
}

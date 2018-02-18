package com.management.user.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(AddressPK.class)
public class Address {
    private int addressId;
    private String city;
    private String country;
    private int zipcode;
    private byte primaryAddress;
    private String addressDesc;
    private int userId;

    @Id
    @Column(name = "address_id")
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "zipcode")
    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Basic
    @Column(name = "primary_address")
    public byte getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(byte primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    @Basic
    @Column(name = "address_desc")
    public String getAddressDesc() {
        return addressDesc;
    }

    public void setAddressDesc(String addressDesc) {
        this.addressDesc = addressDesc;
    }

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return addressId == address.addressId &&
                zipcode == address.zipcode &&
                primaryAddress == address.primaryAddress &&
                userId == address.userId &&
                Objects.equals(city, address.city) &&
                Objects.equals(country, address.country) &&
                Objects.equals(addressDesc, address.addressDesc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(addressId, city, country, zipcode, primaryAddress, addressDesc, userId);
    }
}

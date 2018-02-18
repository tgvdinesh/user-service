package com.management.user.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AddressPK implements Serializable {
    private int addressId;
    private int userId;

    @Column(name = "address_id")
    @Id
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Column(name = "user_id")
    @Id
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
        AddressPK addressPK = (AddressPK) o;
        return addressId == addressPK.addressId &&
                userId == addressPK.userId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(addressId, userId);
    }
}

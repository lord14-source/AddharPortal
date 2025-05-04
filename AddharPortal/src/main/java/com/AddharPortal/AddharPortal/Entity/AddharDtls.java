package com.AddharPortal.AddharPortal.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AddharDtls {

    @Id
    private String refNo;
    private String uuid;
    private String addharData;


    // No-arg constructor
    public AddharDtls() {
    }

    // All-arg constructor (excluding otp if you want it set later)
    public AddharDtls(String refNo, String uuid, String addharData) {
        this.refNo = refNo;
        this.uuid = uuid;
        this.addharData = addharData;
    }

    // Full-arg constructor including otp (optional)
    public AddharDtls(String refNo, String uuid, String addharData, Integer otp) {
        this.refNo = refNo;
        this.uuid = uuid;
        this.addharData = addharData;

    }

    // Getters and Setters
    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAddharData() {
        return addharData;
    }

    public void setAddharData(String addharData) {
        this.addharData = addharData;
    }


}

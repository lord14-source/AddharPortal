package com.AddharPortal.AddharPortal.Entity;



public class AddharRes {



    private String uuid;
    private String addharData;
    private String otp;

    // No-arg constructor
    public AddharRes() {
    }

    // All-arg constructor
    public AddharRes(String refNo, String uuid, String addharData, String otp) {

        this.uuid = uuid;
        this.addharData = addharData;
        this.otp = otp;
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

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}

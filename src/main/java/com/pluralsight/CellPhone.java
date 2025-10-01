package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String carrier;
    private String owner;
    private String model;
    private String phoneNumber;

    public CellPhone(int, String);{

        this.serialNumber = 0;
        this.carrier = "";
        this.owner = "";
        this.model = "*";
        this.phoneNumber = "";
    }

      public int getSerialNumber(){
          return serialNumber = serialNumber;
      }
      public void setSerialNumber(int serialNumber){
          this.serialNumber = serialNumber;
      }
    public int getSerialNumber(){
          return serialNumber = serialNumber;
      }
    public String getCarrier() {
          return carrier;
    }
    public void setCarrier(String carrier) {
          this.carrier = carrier;
    }

    public String getOwner(){
          return owner;
      }

    public void setOwner(String owner) {
          this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

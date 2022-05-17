package com.company;

public class MobilePhone implements Telephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    public void powerOn() {
        System.out.println("Mobile Phone is powered On");
        isOn = true;
    }

    public void dial(int phoneNumber) {
        System.out.println("Now Ringing " + phoneNumber + " Mobile Phone.");
    }

    public void answer() {
        if (isRinging) {
            System.out.println("Answering the Mobile Phone.");
            isRinging = false;
        }
    }

    public void callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
        }
    }

    public boolean isRinging() {
        return isRinging;
    }
}

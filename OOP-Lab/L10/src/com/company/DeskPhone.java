package com.company;

public class DeskPhone implements Telephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    public void powerOn() {
        System.out.println("No action taken, Desk Phone does not have power button.");
    }

    public void dial(int phoneNumber) {
        System.out.println("Now Ringing " + phoneNumber + " Desk Phone.");
    }

    public void answer() {
        if (isRinging) {
            System.out.println("Answering the Desk Phone.");
            isRinging = false;
        }
    }

    public void callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
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

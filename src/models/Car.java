package models;

import java.util.Date;

public class Car {

    //Properties (class members) defined as part of the class, before Main
    //private means no external can use these variables, except for the objects created in this class
    private String colour; 
    private String make;
    private String registration;
    private Date registrationDate;
    private Integer acceleration = 0;

    //when you add a constructor, the default constructor disappears
    public Car(String registration) {
        this.registration = registration;
    }
    public Car (){}//overloaded constructor
    public Car (String registration, String colour){
        this.registration=registration;
        this.colour=colour;
    }
    
    //Access methods to our members 
    //getMemberName, setMemberName
    public String getColour(){ //this is a method to extract members or a procedure
            return colour;
    }
    public void setColour(String colour) { //set colour using String colour; if blank will look at class members
        //void when no 'return is used'
        this.colour = colour;
    }

    //make - getter and setter
    public String getMake(){
            return make;
    }
    public void setMake (String make){

        switch (make.toLowerCase()){
            case "toyota":
            case "honda":
            case "mazda":
            this.make = make;
            break;
            
            default:
        }
        this.make = make;
    }
    public String getRegistration() {
        return registration;
    }
    public void setRegistration(String registration) {
        this.registration = registration;
    }
    public Date getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
    
    public Integer getAcceleration() {
        return acceleration;}

    //Behaviour - method
    public void horn() {
        System.out.println("horn horn horn");
    }
    public void accelerate(){
       if (this.acceleration < 200)
        this.acceleration++;
    }

    public void accelerate(Integer n){
        for (Integer i=0; i<n; i++){}

    }

    public void decelerate(){
        if (this.acceleration>0)
        this.acceleration--;
    }

    }

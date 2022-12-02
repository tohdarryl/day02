package models;

public class TurboChargedCar extends Car { //inherits Class Car.java

    private Boolean turbo = false;
    
    public  TurboChargedCar(String registration) { //follow if parent has a constructor
        // First Line
        super(registration);
    }
    @Override
    public void accelerate() {
        if (this.turbo) {
        super.accelerate();
        super.accelerate();
        super.accelerate();
        super.accelerate();
        super.accelerate();
        System.out.println("Vrooooooooom!");
    } else {
        super.accelerate();
        System.out.println("Pfffft");}
    }

    public Boolean getTurbo() {
        return turbo;
    }
    public void setTurbo(Boolean turbo) {
        this.turbo = turbo;
    }

    
}


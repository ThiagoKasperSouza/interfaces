package main.java.interfaces_lambda;

public class Computer implements VideoPlayer, MusicPlayer {
    private String brand;
    private String model;

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music on " + brand + " " + model);
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing music on " + brand + " " + model);
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music on " + brand + " " + model);
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video on " + brand + " " + model);
    }

    @Override
    public void pauseVideo() {
        System.out.println("Pausing video on " + brand + " " + model);
    }

    @Override
    public void stopVideo() {
        System.out.println("Stopping video on " + brand + " " + model);
    }
    
}

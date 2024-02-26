package com.mycompany.observer;
public class CurrentConditionDispaly implements  Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherDate;

    public  CurrentConditionDispaly(Subject weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity");
    }


}

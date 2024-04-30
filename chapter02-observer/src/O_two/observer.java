package O_two;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(int temperature);
}

interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class TemperatureSensor implements Observable {
    private int temperature;
    private List<Observer> observers;

    public TemperatureSensor() {
        this.observers = new ArrayList<>();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

class Display implements Observer {
    private String name;

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println(name + " - Current Temperature: " + temperature + "°C");
    }
}

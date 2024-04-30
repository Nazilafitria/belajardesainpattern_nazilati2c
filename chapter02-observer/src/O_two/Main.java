package O_two;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        Observer display1 = new Display("Display 1");
        Observer display2 = new Display("Display 2");

        sensor.addObserver(display1);
        sensor.addObserver(display2);

        sensor.setTemperature(25); // Display 1 - Current Temperature: 25°C
        // Display 2 - Current Temperature: 25°C

        sensor.setTemperature(30); // Display 1 - Current Temperature: 30°C
        // Display 2 - Current Temperature: 30°C

        sensor.removeObserver(display1);

        sensor.setTemperature(28); // Display 2 - Current Temperature: 28°C
    }
}
public class TrafficLight {
    private String color;
    private int timeLimit;

    public TrafficLight(String color, int timeLimit) {
        this.color = color;
        this.timeLimit = timeLimit;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean checkTimeLimit(int currentTime) {
        return currentTime >= timeLimit;
    }
}

public class Intersection {
    private List<TrafficLight> trafficLights;

    public Intersection() {
        trafficLights = new ArrayList<>();
    }

    public void addTrafficLight(TrafficLight trafficLight) {
        trafficLights.add(trafficLight);
    }

    public List<TrafficLight> getTrafficLights() {
        return trafficLights;
    }
}

public class TrafficController {
    private Intersection intersection;
    private int currentTime;

    public TrafficController(Intersection intersection) {
        this.intersection = intersection;
        this.currentTime = 0;
    }

    public void start() {
        while (true) {
            for (TrafficLight trafficLight : intersection.getTrafficLights()) {
                if (trafficLight.checkTimeLimit(currentTime)) {
                    switchColor(trafficLight);
                }
            }
            currentTime++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void switchColor(TrafficLight trafficLight) {
        if (trafficLight.getColor().equals("red")) {
            trafficLight.setColor("green");
            trafficLight.setTimeLimit(currentTime + 10);
        } else if (trafficLight.getColor().equals("yellow")) {
            trafficLight.setColor("red");
            trafficLight.setTimeLimit(currentTime + 5);
        } else if (trafficLight.getColor().equals("green")) {
            trafficLight.setColor("yellow");
            trafficLight.setTimeLimit(currentTime + 2);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TrafficLight light1 = new TrafficLight("red", 10);
        TrafficLight light2 = new TrafficLight("green", 10);
        Intersection intersection = new Intersection();
        intersection.addTrafficLight(light1);
        intersection.addTrafficLight(light2);
        TrafficController controller = new TrafficController(intersection);
        controller.start();
    }
}

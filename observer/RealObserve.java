package observer;

/**
 * 实际的观察者
 */
public class RealObserve implements WeatherObserve{
    private String name;

    public RealObserve(String name) {
        this.name = name;
    }

    @Override
    public void update(WeatherData data) {
        System.out.println("ttemperature==="+data.getTemperature());
        System.out.println("windPower===="+data.getWindPower());
    }
}

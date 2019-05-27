package observer;

public class Test {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.registerObserve( new RealObserve("observe1"));
        weatherStation.registerObserve(new RealObserve("observe2"));
        weatherStation.registerObserve(new RealObserve("observe3"));
        WeatherData weatherData = new WeatherData(10, 2);
        weatherStation.noticeObserve(weatherData);

    }
}

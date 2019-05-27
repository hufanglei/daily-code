package observer;

//天气数据
public class WeatherData {
    //温度
    private int temperature;
    //湿度
    private int windPower;

    public WeatherData() {
    }

    public WeatherData(int temperature, int windPower) {
        this.temperature = temperature;
        this.windPower = windPower;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getWindPower() {
        return windPower;
    }

    public void setWindPower(int windPower) {
        this.windPower = windPower;
    }
}

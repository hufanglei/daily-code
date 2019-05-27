package observer;

/**
 * 气象站
 */
public class WeatherStation {
    public WeatherObserve[] observes = new WeatherObserve[10];
    private int count = 0;

    public WeatherStation() {
    }
    //添加观察者 对象订阅
    public void registerObserve(WeatherObserve observe) {
        if (count <= 9) {
            observes[count] = observe;
            count++;
        }
    }
    //发布订阅
    public void noticeObserve(WeatherData data) {
        for (int i = 0; i < count; i++) {
            observes[i].update(data);
            System.out.println("==========发布成功===========");
        } 
    }
}

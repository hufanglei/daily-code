package design.demo4.example4;

public class Client {
    public static void main(String[] args) {
        ComputerEngineer computerEngineer = new ComputerEngineer();
        AbstractFactory  schema = new Schema3();
        computerEngineer.makeComputer(schema);
    }
}

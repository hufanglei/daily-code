package design.demo4.example3.example2;

public class Client {
    public static void main(String[] args) {
        ComputerEngineer computerEngineer = new ComputerEngineer();
        AbstractFactory  schema = new Schema1();
        computerEngineer.makeComputer(schema);
    }
}

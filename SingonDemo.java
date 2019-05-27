public class SingonDemo {
    private static SingonDemo singonDemo = new SingonDemo();
   private SingonDemo(){

   }
   public static SingonDemo getInstance(){
       return singonDemo;
   }

    public static void main(String[] args) {
        SingonDemo singonDemo1 = SingonDemo.getInstance();
        SingonDemo singonDemo2 = SingonDemo.getInstance();
        System.out.println(singonDemo1==singonDemo2);
    }

}

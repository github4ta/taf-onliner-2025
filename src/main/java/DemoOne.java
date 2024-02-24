public class DemoOne extends Demo2907 {
public class DemoOne extends DemoSuperOne {
    public static void main(String[] args) {
        System.out.println(name);
        System.out.println("Hello, master!");
        System.out.println(Math.max(1, 9));
        System.out.println("Hello, java!");
        System.out.println(DemoOne.name+" "+DemoOne.surname+" " +DemoOne.edge);
    }
}
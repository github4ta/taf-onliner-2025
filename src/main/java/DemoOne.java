import by.onliner.DemoTwo;

public class DemoOne {
    public static void main(String[] args) {
        System.out.println("Hello, master!");
        System.out.println(Math.max(1, 9));
        System.out.println("Hello, java!");
        DemoTwo demoTwo=new DemoTwo();
        String unitNumber=demoTwo.setUnitNumber("UI-999");
        demoTwo.printText(unitNumber);
    }
}

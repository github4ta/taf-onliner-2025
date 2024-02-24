import by.onliner.DemoTwo;


public class DemoOne extends Demo2907 {
    public static void main(String[] args) {
        System.out.println(name);
        System.out.println("Hello, master!");
        System.out.println("Hello, java!");

        String str1 = "onliner";
        String str2 = "my_onlinER_test";

        if (str2.toLowerCase().contains(str1)) {
            System.out.println("Строка 1 входит в строку 2");
        } else {
            System.out.println("Совпадений нет.");
        }
        DemoTwo demoTwo = new DemoTwo();
        String unitNumber = demoTwo.setUnitNumber("UI-999");
        demoTwo.printText(unitNumber);
        System.out.println("Hello everyone");
        System.out.println(DemoOne.name + " " + DemoOne.surname + " " + DemoOne.edge);
    }
}

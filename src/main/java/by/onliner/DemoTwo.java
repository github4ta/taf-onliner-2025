package by.onliner;

public class DemoTwo {
    private String unitNumber;

    public String getUnitNumber() {
        return unitNumber;
    }

    public String setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
        return unitNumber;
    }

    public static void printText(String str) {
        String date = "24-02-2024";
        System.out.println(str + "_ DemoTwo:" + date);
    }
}

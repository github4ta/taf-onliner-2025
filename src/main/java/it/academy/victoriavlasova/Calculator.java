package it.academy.victoriavlasova;

public class Calculator {
    public int sum(int a, int b){
        return a+b;
    }
    public double sum(double a, double b){
        return a+b;
    }
    public double sum(int a, double b){
        return ((double)a)+b;
    }
    public double sum(double a, int b){
        return a+((double)b);
    }
    public String sum(String a, String b){
        try {
            Integer str1= Integer.valueOf(a);
            Integer str2= Integer.valueOf(b);
            return Integer.toString(str1+str2);
        }catch (NumberFormatException e) {
            return "???????????? ?????? ??????!";
        }
    }
    public int subtraction(int a, int b){
        return a-b;
    }
    public double subtraction(double a, double b){
        return a-b;
    }
    public double subtraction(int a, double b){
        return ((double)a)-b;
    }
    public double subtraction(double a, int b){
        return a-((double)b);
    }
    public String subtraction(String a, String b){
        try {
            Integer str1= Integer.valueOf(a);
            Integer str2= Integer.valueOf(b);
            return Integer.toString(str1-str2);
        }catch (NumberFormatException e) {
            return "???????????? ?????? ??????!";
        }
    }
    public int multiplication(int a, int b){
        return a*b;
    }
    public double multiplication(double a, double b){
        return a*b;
    }
    public double multiplication(int a, double b){
        return ((double)a)*b;
    }
    public double multiplication(double a, int b){
        return a*((double)b);
    }
    public String multiplication(String a, String b){
        try {
            Integer str1= Integer.valueOf(a);
            Integer str2= Integer.valueOf(b);
            return Integer.toString(str1*str2);
        }catch (NumberFormatException e) {
            return "???????????? ?????? ??????!";
        }
    }
    public int division(int a, int b){
        return a/b;
    }
    public double division(double a, double b){
        return a/b;
    }
    public double division(int a, double b){
        return ((double)a)/b;
    }
    public double division(double a, int b){
        return a/((double)b);
    }
    public String division(String a, String b){
        try {
            Integer str1= Integer.valueOf(a);
            Integer str2= Integer.valueOf(b);
            return Integer.toString(str1/str2);
        }catch (NumberFormatException e) {
            return "???????????? ?????? ??????!";
        }
    }
}

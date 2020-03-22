package Geek1;

public class Task8 {
    static String year(int y){
        if (((y % 4) == 0) && !((y % 100) == 0) || ((y % 400) == 0)) {
            return "Год високосный";}
            else {
                return "Год невисокосный";

            }
        }
    }






package aleksandre_kvatashidze_1.midterm1.t2.vegetable.sub;

import aleksandre_kvatashidze_1.midterm1.t2.grill.curtian.A22;
import aleksandre_kvatashidze_1.midterm1.t2.vegetable.A21;

import java.text.DateFormatSymbols;

public class R21 {
    public static void main(String[] args) {
        A22 a22 = new A22();
        A21 a21 = new A21();
        System.out.println("Area of a rectangle is :" + (a21.getHeight()*a21.getWidth()));
        System.out.println("Month is " + getMonthName(a22.getMonth()));
    }
    public static String getMonthName(int monthNumber) {
        // Create a DateFormatSymbols instance to get the month names
        String[] months = new DateFormatSymbols().getMonths();

        // Validate the input and return the corresponding month name
        if (monthNumber >= 1 && monthNumber <= 12) {
            return months[monthNumber - 1];  // Adjust for 0-indexed array
        } else {
            return "Invalid month number";  // Handle invalid input
        }
    }
}

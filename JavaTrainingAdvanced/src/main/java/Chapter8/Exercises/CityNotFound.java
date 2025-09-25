package Chapter8.Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Philelo Mphaga
 * exercise 8.1
 */

public class CityNotFound {

    public static void main(String[] args) {
        String[] cities = {
                "Johannesburg", "Pretoria", "Cape Town", "Durban",
                "Polokwane", "Bloemfontein", "Gqeberha", "Mbombela"
        };

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter an index (0–" + (cities.length - 1) + "): ");
            int idx = sc.nextInt();          // may be out of range
            System.out.println("City at index " + idx + ": " + cities[idx]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Error: index out of range. Valid range is 0–" + (cities.length - 1) + ".");
        } catch (InputMismatchException ex) {
            System.err.println("Error: please enter an integer.");
        } finally {
            sc.close();
        }
    }
}


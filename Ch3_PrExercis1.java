import java.util.*;
import java.io.*;
public class Ch3_PrExercise1 {
    public static void main(String[] args) throws FileNotFoundException {
        double R_length, R_width, R_area, R_perimeter;
        double C_radius, C_area, C_circumference;
        int Age;
        double B_balance, I_rate, E_balance;
        String F_name, L_name;
        char Character;
        
        Scanner inFile = new Scanner(new FileReader("inData.txt"));
        PrintWriter outFile = new PrintWriter("outData.txt");
       
        R_length = inFile.nextDouble();
        R_width = inFile.nextDouble();
        R_area = (R_length * R_width);
        R_perimeter = ((R_length * 2) + (R_width * 2));
        C_radius = inFile.nextDouble();
        C_area = (3.1416 * (Math.pow(C_radius, 2)));
        C_circumference = (2 * 3.1416 * C_radius);
        F_name = inFile.next();
        L_name = inFile.next();
        Age = inFile.nextInt();
        B_balance = inFile.nextDouble();
        I_rate = inFile.nextDouble();
        E_balance = (B_balance + (((I_rate / 100) / 12 ) * B_balance)); 
        Character = inFile.next().charAt(0);
        
        outFile.printf("Rectangle:%n");
        outFile.printf("Length = %.2f, width = %.2f, area = %.2f, perimeter = %.2f%n%n", R_length, R_width, R_area, R_perimeter);
        outFile.printf("Circle:%n");
        outFile.printf("Radius = %.2f, area = %.2f, circumference = %.2f%n%n", C_radius, C_area, C_circumference);
        outFile.printf("Name: " + F_name + " " + L_name + ", age: " + Age + "%n");
        outFile.printf("Beginning balance = $%.2f, interest rate = %.2f%n", B_balance, I_rate);
        outFile.printf("Balance at the end of the month = $%.2f%n%n", E_balance);
        outFile.printf("The character that comes after " + Character + " in the ASCII set is " + ++Character);
        
        inFile.close();
        outFile.close();        
    }
}

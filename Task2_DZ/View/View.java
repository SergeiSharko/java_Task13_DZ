package Task2_DZ.View;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);    

    public double getValue(String title) {
        System.out.printf("%s", title);        
        while (!(in.hasNextDouble())){
            System.out.println("Некорректный ввод, введите число!");
            System.out.printf("%s", title);
            in.next();
            in.hasNextDouble();
        }
    return in.nextDouble();       
    }

    public String getOperation(String title) {
        System.out.printf("%s", title);
        return in.next();
    }
    
    public void print(double data, String title) {
        System.out.printf("%s %.1f\n", title, data);
    }
}

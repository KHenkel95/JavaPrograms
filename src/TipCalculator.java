import java.util.Scanner;
public class TipCalculator {

    public static void main(String[] args) {
        Scanner input_bill = new Scanner(System.in);
        System.out.println("What is the total amount of your bill?");
        //Scan for the amount of the users bill
        double billAmount = input_bill.nextDouble();
        Scanner input_tip = new Scanner(System.in);
        System.out.println("What percent would you like to tip?");
        //Scan for the amount the user wants to tip
        double tipPercent = input_tip.nextDouble();
        input_bill.close();
        input_tip.close();
        double tipAmount = billAmount * (tipPercent/100);
        //Calculates what the total of the bill, including tip, will be
        double totalAmount = billAmount + tipAmount;
        //Correctly print "A" or "An"
        if (tipPercent >=8.0&&tipPercent <=8.9||tipPercent >= 11.0&&tipPercent <= 11.9
                ||tipPercent >=18.0&&tipPercent <= 18.9
                ||tipPercent >=80.0&&tipPercent <=89.9)
            System.out.print("An ");
        else
            System.out.print("A ");
        //Tip calculation
        System.out.printf( "%.2f" + "%% tip would be $" + "%.2f"
                + " and the total amount of your bill would be $"
                + "%.2f", tipPercent, tipAmount, totalAmount);
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double purchasePrice = 20.50;
        final double TAX_RATE = .05;
        double salesTax = purchasePrice * TAX_RATE;
        System.out.println("Enter the purchase price: $" + purchasePrice);
        System.out.println("Your sales tax is: $" + salesTax);
    }
}
import java.util.Scanner;

public class counvari {
    public static void main(String[] args) {
        double value;
        //sc로 이름 지정
        Scanner sc = new Scanner(System.in);
        value = sc.nextInt();
        
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = value * vatRate;
        double total = value + vat;
        double expense = value * expenseRate;
        double income = value - expense;
        double dividend1 = income * 0.5;
        double dividend2 = income * 0.3;
        double dividend3 = income * 0.2;

        System.out.println("value of supply(공급가): "+ value);
        System.out.println("VAT(부가세): " + vat);
        System.out.println("Total(소비가): " + total);
        System.out.println("Expense: " + expense);
        System.out.println("Income(수익): " + income);
        System.out.println("투자자1: " + dividend1);
        System.out.println("투자자2: " + dividend2);
        System.out.println("투자자3: " + dividend3 );
    }
    
}

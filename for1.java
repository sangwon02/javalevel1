import java.util.Scanner;

public class for1 {
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
        double[] dividend = new double[3];
        double[] rates = new double[3];
        rates[0] = 0.5;
        rates[1] = 0.3;
        rates[2] = 0.2;
        for(int i=0; i <rates.length; i++){
            dividend[i] = income * rates[i];
        }
        System.out.println("value of supply(공급가): "+ value);
        System.out.println("VAT(부가세): " + vat);
        System.out.println("Total(소비가): " + total);
        System.out.println("Expense: " + expense);
        System.out.println("Income(수익): " + income);
        for(int j=0; j <rates.length; j++){
            System.out.println("투자자: " + dividend[j]);
        }
    }
}


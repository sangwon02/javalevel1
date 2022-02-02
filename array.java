import java.util.Scanner;

public class array {
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
        double dividend1;
        double dividend2;
        double dividend3;
        
        double[] rates = new double[5];
        //배열의 갯수 지정한 값 만큼 채워주어야함 
        //이 배열은 5개 즉 0부터 4까지
        rates[0] = 0.5;
        rates[1] = 0.3;
        rates[2] = 0.2;
        rates[3] = 1.0;
        rates[4] = 0.0;
        if(income>10000.0){
            dividend1 = income * rates[0];
            dividend2 = income * rates[1];
            dividend3 = income * rates[2];
        }
        else{
            dividend1 = income * rates[3];
            dividend2 = income * rates[4];
            dividend3 = income * rates[4];
        }
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

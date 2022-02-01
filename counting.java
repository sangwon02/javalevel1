public class counting {
    public static void main(String[] args) {
        System.out.println("value of supply(공급가): "+ 10000.0);
        System.out.println("VAT(부가세): " + (10000.0*0.1));
        System.out.println("Total(소비가): " + (10000.0+10000.0*0.1));
        System.out.println("Expense: " + (10000.0*0.3));
        System.out.println("Income(수익): " + (10000.0-10000.0*0.3));
        System.out.println("투자자1: " + (10000.0-10000.0*0.3)*0.5);
        System.out.println("투자자2: " + (10000.0-10000.0*0.3)*0.3);
        System.out.println("투자자3: " + (10000.0-10000.0*0.3)*0.2);

    }
}

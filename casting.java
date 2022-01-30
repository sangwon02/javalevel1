public class casting {
    public static void main(String[] args) {
        double a = 1.1;
        double b = 1;
        //밑에 코드와 같은 작용을 함
        double b2 = (double) 1;
        System.out.println(b);

        //손실이 일어나기에 int c = 1.3;는 불가
        int c = (int) 1.3;
        System.out.println(c);

        String f = Integer.toString(1);
        System.out.println(f.getClass());

    }
}

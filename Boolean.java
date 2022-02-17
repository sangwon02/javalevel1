public class Boolean {
    public static void main(String[] args) {
        System.out.println("One");
        System.out.println(1);

        System.out.println(true);
        System.out.println(false);

        String foo = "fkfkfkfkkworld";
        //밑처럼 쓸수없다. true는 reserved word이기 때문이다.
        //String true = "HI";

        System.out.println(foo.contains("kkworld"));
        //foo안에 world라는 글자가 존재하기에 true가 나온다.

        System.out.println(foo.contains("egoing"));
    }
}

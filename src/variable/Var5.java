package variable;

public class Var5 {

    public static void main(String[] args) {
        //1. 변수 선언, 초기화 각각 따로
        int a;
        a = 1;
        System.out.println(a);

        int b = 2; //2. 변수 선언과 초기화를 한 번에
        System.out.println(b);

        int c = 3, d = 4; //여러 변수 선언과 초기화를 한 번에
        System.out.println(c);
        System.out.println(d);

        int e, f;
        //e = 5, f = 6; 이렇게는 안됨

    }
}

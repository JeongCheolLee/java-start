package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
        a += 1;
        System.out.println(a);
    }

    static void changePrimitive(int x) {
        System.out.println(x);
        x = 20;
        System.out.println(x);
    }
}

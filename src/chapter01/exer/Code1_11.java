package chapter01.exer;

public class Code1_11 {
    public static void main(String[] args) {
        int now = 312032486;

        int seconds = 5 * 365 * 24 * 60 * 60;

        int birth = seconds / 7;
        int death = seconds / 13;
        int immigration = seconds / 45;

        int sum = now + birth - death + immigration;

        System.out.println("人数为：" + sum);
    }
}

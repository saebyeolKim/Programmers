package saebyeol.LV1;

/**
 * 문제 설명
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * x는 1 이상, 10000 이하인 정수입니다.
 */
public class Hashad {
    public boolean firstCode(int x) {
        int n = 0;
        int s = x;
        while (s > 0) {
            n += s % 10;
            s /= 10;
        }
        return (x % n == 0);
    }
    public boolean solution(int x) {
        int a = x;
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return a % sum == 0;
    }

    /**
     * 다른사람의 풀이
     */
    public boolean others1(int num){
        String[] temp = String.valueOf(num).split("");
        int sum = 0;
        for (String s : temp) {
            sum += Integer.parseInt(s);
        }
        if (num % sum == 0) {
            return true;
        } else {
            return false;
        }
    }

    private int sum = 0;
    public boolean others2(int num){
        sum = 0;
        Integer.toString(num).chars().forEach(c -> sum += c - '0');
        return num % sum == 0;
    }
}

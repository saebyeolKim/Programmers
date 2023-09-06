package saebyeol.LV1;

/**
 * 문제 설명
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 *
 * 제한사항
 * N의 범위 : 100,000,000 이하의 자연수
 */
public class DigitSum {
    public int firstCode(int n) {
        int answer = 0;
        String stringN = Integer.toString(n);
        for (int i = 0; i < stringN.length(); i++) {
            answer += stringN.charAt(i) - '0';
        }
        return answer;
    }

    public int solution(int n) {
        int answer = 0;
        int a = 0;
        while (n > 0) {
            answer = n % 10;
            a += answer; // 밑에서 answer을 빼는 바람에 이렇게 식이 나왔다.
            n = (n - answer) / 10; // 다른 사람의 풀이를 보니 이 식은 n /= 10 이렇게 하면 되는데 너무 어렵게 풀었다...
        }
        return a;
    }

    public static void main(String[] args) {
        DigitSum digitSum = new DigitSum();
        System.out.println("digitSum.solution(123) = " + digitSum.solution(123));
    }

    /**
     * 다른 사람의 풀이
     */
    public int others(int n) {
        int answer = 0;
        while(true){
            answer += n % 10;
            if(n < 10) break;
            n = n/10;
        }
        return answer;
    }

    public int others2(int n) {
        int answer = 0;
        String[] array = String.valueOf(n).split("");
        for(String s : array){
            answer += Integer.parseInt(s);
        }
        return answer;
    }

    public int others3(int n) {
        int answer = 0;
        while(n > 0){
            answer += n%10;
            n /= 10;
        }
        return answer;
    }
}
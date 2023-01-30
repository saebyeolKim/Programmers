package LV1;

/**
 * 문제 설명
 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * x는 -10000000 이상, 10000000 이하인 정수입니다.
 * n은 1000 이하인 자연수입니다.
 */
public class IntervalX {
    public long[] firstCode(int x, int n) {
        long[] answer = new long[n];
        long s = x;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = s;
            s += x;
        }
        return answer;
    }

    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for (int i = 1; i < n; i++) {
            x = answer[0] * (long)(i + 1);
            answer[i] = x;
        }
        return answer;
    }

    public static void main(String[] args) {
        IntervalX intervalX = new IntervalX();
        long[] Array = intervalX.solution(-2, 5);
    }

    /**
     * 다른사람의 풀이
     */
    public static long[] others1 (int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }
        return answer;
    }
    public long[] others2(long x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i < n; i++){
            answer[i] = x * (i + 1);
        }
        return answer;
    }
}

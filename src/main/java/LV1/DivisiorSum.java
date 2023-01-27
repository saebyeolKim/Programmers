package LV1;

/**
 * 문제 설명
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 사항
 * n은 0 이상 3000이하인 정수입니다.
 */
public class DivisiorSum {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer += (n % i == 0) ? i : 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        DivisiorSum divisiorSum = new DivisiorSum();
        System.out.println("divisiorSum.solution(12) = " + divisiorSum.solution(12));
    }

    /**
     * 다른사람의 풀이
     */
    public int sumDivisor(int num) {
        int answer = 0;
        for(int i = 1; i <= num/2; i++){
            if(num%i == 0) answer += i;
        }
        return answer+num;
    }
}

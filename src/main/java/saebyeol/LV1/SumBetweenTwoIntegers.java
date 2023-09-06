package saebyeol.LV1;

/**
 * 문제 설명
 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
 * 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 *
 * 제한 조건
 * a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
 * a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
 * a와 b의 대소관계는 정해져있지 않습니다.
 */
public class SumBetweenTwoIntegers {
    public long firstCode(int a, int b) {
        long answer = 0;

        if (a > b) {
            for (int i = b; i < a + 1; i++) {
                answer += i;
            }
        } else if (a < b) {
            for (int i = a; i < b + 1; i++) {
                answer += i;
            }
        } else {
            answer = a;
        }
        return answer;
    }

    public long solution(int a, int b) {
        long answer = 0;
        int temp = 0;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i < b + 1; i++) {
            answer += i;
        }
        return answer;
    }

    public long othersCode1(int a, int b) {
        long answer = 0;
        for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++)
            answer += i;

        return answer;
    }

    public long othersCode2(int a, int b) {
        long answer = 0;

        int start = Math.min(a, b); // 최솟값
        int end = Math.max(a, b); // 최댓값

        for (int i = start; i <= end; i++) {
            answer += i;
        }

        return answer;
    }
}

package LV1;

/**
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 */
public class ReverseArray {
    public int[] firstCode(long n) {
        String stringN = Long.toString(n);

        int[] answer = new int[stringN.length()];

        for (int i = stringN.length() - 1; i >= 0; i--) {
            answer[stringN.length()-1-i] = stringN.charAt(i) - '0';
        }
        return answer;
    }

    public long[] solution(long n) {
        String StringN = Long.toString(n);
        long[] answer = new long[StringN.length()];
        int cnt = 0;
        while (n > 0) {
            answer[cnt++] = Long.valueOf(n % 10);
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        System.out.println("reverseArray.solution(12345) = " + reverseArray.solution(12345));
    }
}

package LV1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 문제 설명
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 *
 * 제한 조건
 * n은 1이상 8000000000 이하인 자연수입니다.
 */
public class DescendingOrder {
    public long solution(long n) {
        String answer = "";
        String[] s = Long.toString(n).split("");
        Arrays.sort(s, Comparator.reverseOrder());
        for (String a : s) {
            answer += a;
        }
        return Long.parseLong(answer);
    }

    /**
     * 다른사람의 풀이
      */
    String res = "";
    public int reverseInt(int n){
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Integer.parseInt(res);
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        DescendingOrder ri = new DescendingOrder();
        System.out.println(ri.reverseInt(118372));
    }
}

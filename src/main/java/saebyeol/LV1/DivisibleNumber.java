package saebyeol.LV1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 문제 설명
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 *
 * 제한사항
 * arr은 자연수를 담은 배열입니다.
 * 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
 * divisor는 자연수입니다.
 * array는 길이 1 이상인 배열입니다.
 */
public class DivisibleNumber {
    public int[] firstCode(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int num : arr) {
            if (num % divisor == 0) list.add(num);
        }
        Collections.sort(list);
        int[] answer = {};

        if (list.size() > 0) {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        } else {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }

    public Integer[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int a : arr) {
            if (a % divisor == 0) answer.add(a);
        }
        int answerLen = answer.size();
        if (answerLen == 0) answer.add(-1);
        answer.sort(Comparator.naturalOrder()); // ArrayList 오름차순 정렬
        return answer.toArray(new Integer[answerLen]);
//        ArrayList 오름차순 정렬
//          Collections.sort(list);
//          list.sort(Comparator.naturalOrder());
//        내림차순 정렬
//          Collections.sort(list, Collections.reverseOrder());
//          list.sort(Comparator.reverseOrder());
    }
}

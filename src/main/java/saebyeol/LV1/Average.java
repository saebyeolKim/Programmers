package saebyeol.LV1;

import java.util.Arrays;

/**
 * 문제 설명
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 *
 * 제한사항
 * arr은 길이 1 이상, 100 이하인 배열입니다.
 * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 */
public class Average {
    public double solution(int[] arr) {
        double answer = 0;
        for (int a : arr) {
            answer += a;
        }
        return answer/arr.length;
    }

    public static void main(String[] args) {
        Average average = new Average();
        int[] arr = {1,2,3,4,5};
        System.out.println("average = " + average.solution(arr));
    }

    /**
     * 다른사람의 풀이
     */
    public int getMean(int[] array) {
        return (int) Arrays.stream(array).average().orElse(0);
    }
}

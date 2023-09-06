package saebyeol.LV1;

import java.util.Arrays;

/**
 * 문제 설명
 * String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
 *
 * 제한 사항
 * seoul은 길이 1 이상, 1000 이하인 배열입니다.
 * seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
 * "Kim"은 반드시 seoul 안에 포함되어 있습니다.
 */
public class FindSeobangKim {
    public String firstCode(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++){
            if ("Kim".equals(seoul[i])) {
                answer = "김서방은 " + i + "에 있다";
            }
        }

        return answer;
    }

    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break; // break 를 넣으면 찾고 for 문을 나갈 수 있다.
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FindSeobangKim findSeobangKim = new FindSeobangKim();
        String[] names = {"Queen", "Tod", "Kim", "Teddy"};
        findSeobangKim.solution(names);
    }

    public String othersCode1(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
        int x = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 "+ x + "에 있다";
    }
}

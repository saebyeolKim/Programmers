package LV1;

import java.util.Arrays;

/**
 * 문제 설명
 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 *
 * 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
 *
 * 제한사항
 * 문자열 s의 길이 : 50 이하의 자연수
 * 문자열 s는 알파벳으로만 이루어져 있습니다.
 */
public class CountPAndY {
    boolean firstCode(String s) {
        boolean answer = true;
        String data = s.toUpperCase();
        int pCnt = 0;
        int yCnt = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == 'P') {
                pCnt++;
            } else if (data.charAt(i) == 'Y') {
                yCnt++;
            }
        }
        answer = (pCnt == yCnt) ? true : false ;

        return answer;
    }

    boolean solution(String s) {
        s = s.toLowerCase();
        int cnt = 0;
        String[] sArrays = s.split("");
        for (String sArray : sArrays) {
            if (sArray.equals("p")) {
                cnt += 1;
            } else if (sArray.equals("y")) {
                cnt -= 1;
            } else {
                cnt += 0;
            }
        }
        return cnt == 0;
    }

    public static void main(String[] args) {
        CountPAndY countPAndY = new CountPAndY();
        System.out.println("countPAndY.solution(\"pPoooyY\") = " + countPAndY.solution("pPoooyY"));
    }

    /**
     * 다른 사람의 풀이
     */
    boolean others1(String s) {
        s = s.toUpperCase();
        // 람다식
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}

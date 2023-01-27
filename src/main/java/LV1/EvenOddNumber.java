package LV1;

import com.example.demo.DemoApplication;
import org.springframework.boot.SpringApplication;

/**
 * 문제 설명
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * num은 int 범위의 정수입니다.
 * 0은 짝수입니다.
 */
public class EvenOddNumber {
    public String solution(int num) {
        String answer = (num % 2 == 0) ? "Even" : "Odd";
        return answer;
    }

    public static void main(String[] args) {
        EvenOddNumber evenOrOdd = new EvenOddNumber();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("result : " + evenOrOdd.solution(3));
        System.out.println("result : " + evenOrOdd.solution(2));
    }
}

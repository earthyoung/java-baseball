package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Application {
    static List<Integer> answer = new ArrayList<>();    // 컴퓨터에서 랜덤으로 정해진 정답 숫자
    static List<Integer> current = new ArrayList<>();   // 사용자가 입력한 값

    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다.");
        while(true){
            generateAnswer();
            while(true){
                System.out.print("숫자를 입력해주세요: ");
                checkValidInput(Console.readLine());
                boolean result = checkResult();
                if(result){
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    break;
                }
            }
            boolean exit = checkExitGame();
            if(exit) break;
        }
    }

    public static void generateAnswer(){
        while(true){
            if(answer.size() == 3) break;
            int randomInt = Randoms.pickNumberInRange(1, 9);
            if(!answer.contains(randomInt)) answer.add(randomInt);
        }
    }

    public static void checkValidInput(String input){

    }

    public static boolean checkResult(){
        return false;
    }

    public static boolean checkExitGame(){
        return false;
    }

}

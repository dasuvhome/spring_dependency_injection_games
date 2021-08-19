package main.java.ru.suvovov.dependencies;

import java.util.Random;
import java.util.Scanner;

public class AnswerChecker {

    public AnswerChecker(){
        System.out.println("Answer constructor initiated.");
    }

    public void checkAnswer() {
        System.out.println("Угадай число от 1 до 1000");
        Random random = new Random();

        int answer = random.nextInt(1000)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваш ответ ");
          int number = 0;
        while(number!=answer){
            number = scanner.nextInt();
            if(number>1000 || number<1){
                System.out.println("Вы ввели число меньше 1 или больше 1000");
            }else {
                math(number, answer);
            }
        }
    }

    public void math(int number, int answer){
            if(number == answer){
                System.out.println("Вы угадали это число " + number);
                return;
            }else {
                whatIsMore(number, answer);
                System.out.println("Попробуйте еще раз!");
            }
    }

    public void whatIsMore(int number, int answer){
        if(number<answer){
            System.out.println("Сликом маленькое");

        }else {
            System.out.println("Слишком большое");
        }

    }
}

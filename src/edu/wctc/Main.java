package edu.wctc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean restartProgram = true;
        int SCORE = 0;
        String QUESTIONS[] = new String[]{
                "ENTER 0 IF YOU PREFER MILD OR 1 IF YOU PREFER SPICY",
                "ENTER 0 IF YOU PREFER TEA OR 1 IF YOU PREFER COFFEE",
                "ENTER 0 IF YOU PREFER BREAKFAST OR 1 IF YOU PREFER BRUNCH",
                "ENTER 0 IF YOU PREFER SUMMER OR 1 IF YOU PREFER WINTER",
                "ENTER 0 IF YOU PREFER PAPER OR 1 IF YOU PREFER PLASTIC",
        };
        while (restartProgram) {
            System.out.println("WELCOME TO THE PREFERENCE QUIZ!");
            for (int i = 0; i < 5; i++){
                System.out.println(QUESTIONS[i]);
                if (InputCollector() == 1) {
                    SCORE++;
                }
            }
            System.out.println(returnStatement(SCORE));
            System.out.println("ENTER 0 TO END THE SESSION OR 1 TO RETAKE THE QUIZ");
            if (InputCollector() == 0){
                restartProgram = false;
            } else {
                restartProgram = true;
            }
        }
    }
    public static int InputCollector(){
        Scanner userInput = new Scanner(System.in);
        int ANSWER = userInput.nextInt();
        while (ANSWER != 0 && ANSWER != 1){
            System.out.println("ERROR");
            ANSWER = userInput.nextInt();
        }
        return ANSWER;
    }
    public static String returnStatement(int FINALSCORE){
        //Array 2
        String RESPONSE[] = new String[]{
                "YOU PREFER LIFE TO BE CALM AND ORGANIZED.",
                "YOU PREFER LIFE TO BE SPONTANEOUS AND ACTIVE.",
                "YOU PREFER A GOOD BALANCE IN LIFE."
        };
        switch(FINALSCORE) {
            case 0, 1, 2:
                return RESPONSE[0];
            case 4, 5:
                return RESPONSE[1];
            case 3:
                return RESPONSE[2];
            default:
                return "ERROR";
        }
    }
}
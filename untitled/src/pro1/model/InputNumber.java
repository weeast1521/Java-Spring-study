package pro1.model;

import pro1.view.Message;

import java.util.Scanner;

public class InputNumber {

    Scanner sc = new Scanner(System.in);
    public int[] inputNum = new int[3];
    public void setNum(int tmp){
        inputNum[0] = tmp / 100;
        tmp = tmp - inputNum[0]*100;
        inputNum[1] = tmp / 10;
        tmp = tmp - inputNum[1]*10;
        inputNum[2] = tmp;
    }
    public void setInputNum(){
        // check = false;
        Message.NUM_INPUT.println();

        setNum(sc.nextInt());
        validateDuplicationOfInputNumber();
    }
    public void validateDuplicationOfInputNumber(){
        for(int i=0; i<3; i++){
            for(int j=0; j<i; j++){
                if(inputNum[i] == inputNum[j]){
                    printError();
                }
            }
        }
    }

    public void printError() {
        throw new IllegalArgumentException();
    }
}

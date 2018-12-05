package ru.mirea;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        System.out.print("First Player's cards:\n");
        for (int i = 0; i < 5; i++){
            stack1.push(in.nextInt());
            System.out.print("\n");
        }
        //карты первого игрока в начале игры
        System.out.println("First Player's stack: " + stack1);

        System.out.print("Second Player's cards:\n");
        for (int i = 0; i < 5; i++){
            stack2.push(in.nextInt());
            System.out.print("\n");
        }
        //карты второго игрока в начале игры
        System.out.println("Second Player's stack: " + stack2);

        int count = 0;
        //алгоритм имитации игры
        while(stack1.empty() == false && stack2.empty() == false && count <=  106){
            if((stack1.peek() == 9 && stack2.peek() == 0) || (stack1.peek() == 0 && stack2.peek() == 9)){
                if(stack1.peek() > stack2.peek()){
                    stack2.push(stack1.pop());
                    count++;
                    System.out.println(stack1);
                    System.out.println(stack2);
                }
                else{
                    stack1.push(stack2.pop());
                    count++;
                    System.out.println(stack1);
                    System.out.println(stack2);
                }
            }else{
                if(stack1.peek() < stack2.peek()){
                    stack2.push(stack1.pop());
                    count++;
                    System.out.println(stack1);
                    System.out.println(stack2);
                }
                else{
                    stack1.push(stack2.pop());
                    count++;
                    System.out.println(stack1);
                    System.out.println(stack2);
                }
            }
        }

        System.out.println(count);

        if (count > 106) {
            System.out.println("botva\n");
        }else if(stack2.empty() == true){
            System.out.println("First is winner, count of turns: " +count+ "\n");
        }else if(stack1.empty() == true){
            System.out.println("Second is winner, count of turns: " +count+ "\n");
        }
    }
}

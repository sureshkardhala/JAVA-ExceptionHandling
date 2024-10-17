package org.example;

import java.util.Scanner;

public class ExceptionExample {
    public static void exception(String message) throws UserDefinedException{
        throw new UserDefinedException(message);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exe = sc.nextLine();
        try{
            if(exe.equals("user")){
                exception("This is user Defined Exception");
            }else if(exe.equals("arthamatic")){
                int a = 1/0;
            }else if(exe.equals("null")){
                String s= null;
                System.out.println(s.toLowerCase());
            }else{
                System.out.println("No exception");
            }
        }catch (UserDefinedException | NullPointerException | ArithmeticException e){
            System.out.println(e);
        } finally {
            System.out.println("Finally block");
        }
    }
}

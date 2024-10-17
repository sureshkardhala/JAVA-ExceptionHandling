package org.example;

import java.util.Scanner;

//Unchecked / Runtime Exception
//Eg : ClassNotFoundException, InterruptedException, IOException, SQLException
//Throws Keyword is used at method, tell that method might throw a kind of mentioned exception, so ii caller method to handle it by try, catch block.
//Throw is used to throw a new kind of exception
//finally block can execute irrespective of try catch block used logs
//We have to use parent exception at the last in catch, if we use first it won't work
public class UnCheckedException  {
    public static void unCheckedExceptions(String s) throws ArithmeticException, IndexOutOfBoundsException, ClassCastException , IllegalArgumentException, NullPointerException{
        switch (s) {
            case "arth" -> {
                System.out.println("ArithmeticException()");
                throw new ArithmeticException();
            }
            case "iobound" -> {
                System.out.println("IndexOutOfBoundsException()");
                throw new IndexOutOfBoundsException();
            }
            case "cast" -> {
                System.out.println("ClassCastException()");
                throw new ClassCastException();
            }
            case "illegal" -> {
                System.out.println("IllegalArgumentException()");
                throw new IllegalArgumentException();
            }
            case "null" -> {
                System.out.println("NullPointerException()");
                throw new NullPointerException();
            }
            default -> {System.out.println("No Exception found here");}
        }
    }
    public static void handleExceptionByTryCatch(String s){
        try{
            unCheckedExceptions(s);
        }catch (ArithmeticException | IndexOutOfBoundsException | IllegalArgumentException | NullPointerException | ClassCastException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("After throw and catch");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        handleExceptionByTryCatch(str);
    }
}


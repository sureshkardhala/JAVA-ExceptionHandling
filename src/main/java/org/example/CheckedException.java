package org.example;


import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

//Checked / Runtime Exception
//Eg : ClassNotFoundException, InterruptedException, IOException, SQLException
//Throws Keyword is used at method, tell that method might throw a kind of mentioned exception, so ii caller method to handle it by try, catch block.
//Throw is used to throw a new kind of exception
//finally block can execute irrespective of try catch block used logs
//We have to use parent exception at the last in catch, if we use first it won't work
public class CheckedException {
    public static void checkedExceptions(String s) throws ClassNotFoundException, InterruptedException, IOException, SQLException{
        switch (s) {
            case "class" -> {
                System.out.println("class");
                throw new ClassNotFoundException();
            }
            case "interrupt" -> {
                System.out.println("interrupt");
                throw new InterruptedException();
            }
            case "io" -> {
                System.out.println("IO");
                throw new IOException();
            }
            case "sql" -> {
                System.out.println("sql");
                throw new SQLException();
            }
            case "eof" -> {
                System.out.println("eof");
                throw new EOFException();
            }
            default -> {System.out.println("No Exception found here");}
        }
    }
    public static void handleExceptionByTryCatch(String s){
        try{
            checkedExceptions(s);
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }catch (InterruptedException e){
            System.out.println(e);
        }catch (IOException | SQLException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        handleExceptionByTryCatch(str);
    }
}

package package1;

import java.util.Scanner;

public class Exceptionhandling {
    public static void main(String[] args) {
        System.out.println("Exception Handling");

        try{
            int number ;  
            Scanner input = new Scanner(System.in);
            number = input.nextInt();
            System.out.println(number);
        }catch (ArithmeticException a){

        }

        catch (Exception ex){
            System.out.println("only number values are accepted");
        }
        finally {
            System.out.println("always execute");
        }

        try{
            int num = 101 ;
            if( num == 10)
                throw new Exception();

        }
        catch (Exception e){
            System.out.println("yes");
        }

    }
}
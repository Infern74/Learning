package Exceptions;

public class Exceptions3 {
    public static void main(String[] args){
        //Checked Exception(Compile time exception) = исключительные случаи в работе программы
        //Unchecked (Runtime exception) = ошибка в работе программы

        /* int a = 1/0;

        String name = null;
        name.length();*/

        int [] arr = new int[2];
        System.out.println(arr[2]);
    }
}

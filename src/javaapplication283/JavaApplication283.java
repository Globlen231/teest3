/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication283;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class JavaApplication283 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Перевод из фаренгейта в цельсии");
        Scanner scanner=new Scanner (System.in);
        System.out.println("Введите градусы в фаренгейтах:");
        int farengate=scanner.nextInt();
        System.out.println("по формуле: Фаренгате-32*0.56");
        double celsius=(farengate-32)*0.56;
        System.out.println("равно в цельсиях: "+celsius);


    }
    
}

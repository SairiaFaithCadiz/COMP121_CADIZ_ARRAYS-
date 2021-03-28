import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faith
 */
public class array_separate_oddeven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("—————————————");
        System.out.println("      WELCOME TO");
        System.out.println("CadECE STAT CALCULATOR");
        System.out.println("—————————————");
        System.out.println("  SEPARATING ODD AND ");
        System.out.println(" EVEN VALUE ELEMENTS");
        System.out.println("     IN AN ARRAY");
        System.out.println("—————————————");
        System.out.println("Enter desired array size");
        int size = input.nextInt();
        
        int list[]=new int[size];
        System.out.println("Enter the array values");
        for (int i =0; i<list.length;i++){
            System.out.println("Value @ index "+i);
            list[i] = input.nextInt();}
        
        System.out.println("—————————————");
        System.out.println("inputed array values: ");
        for (int i =0; i<list.length;i++){
            System.out.print(list[i]+", ");}
        
        System.out.println(" ");
        System.out.println("—————————————");
        System.out.println("   ANALYSIS RESULT:");
        
        //mao ni sa sorting
        //duha ka for loop para na sa even ug odd values
        //tapos isaisahon niya check if even ba siya or odd
        //sa first na for loop kay iprint niya and even tapos ireject niya ang dili
        //same ra sad sa second na for loop pero odd lang iyang ipang accept
        System.out.println("—————————————");
        System.out.print("EVEN VALUES: ");
        for(int i =0;i<list.length;i++){
            if (list[i]%2 == 0){
                int even = list[i];
                System.out.print(even+", ");}
        }
        System.out.println(" ");
        System.out.print("ODD VALUES: ");
        for(int i =0;i<list.length;i++){
            if (list[i]%2 != 0){
                int odd = list[i];
                System.out.print(odd+", ");}
        }
        System.out.println(" ");
        System.out.println("—————————————");

    }
}

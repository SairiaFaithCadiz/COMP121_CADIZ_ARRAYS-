import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faith
 */
public class array_count_ocurrence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("—————————————");
        System.out.println("      WELCOME TO");
        System.out.println("CadECE STAT CALCULATOR");
        System.out.println("—————————————");
        System.out.println("    DETERMINING THE");
        System.out.println("OCCURANCE OF ELEMENTS");
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
        
        // mao ni sa pagarrange increasing order
        // sa kani na code matapok and magkakaparehas ug value
        int temp = 0;
        for(int i =0;i<list.length;i++){
            for(int j= i+1;j<list.length;j++){
                if(list[i]>list[j]){
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println(" ");
        System.out.println("—————————————");
        System.out.println("arranged array values");
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i]+", ");
        }
        
        
        System.out.println(" ");
        System.out.println("—————————————");
        System.out.println("   ANALYSIS RESULT:");
        System.out.println("—————————————");
        System.out.println("HERE IS THE FREQUENCY");
        System.out.println(" OF ALL THE ELEMENTS");
        System.out.println("    OF THE ARRAY");
        System.out.println("—————————————");
        
        // pagkahuman na matapok.x
        // ihapon kung pila ang kabuok ang parehas
        // pero at the same time malocate japon kutob asa na na index sa bag-o na array ang giihap
        // tapos mubreak siya nya mucontinue na sad siyag reading sa sunod na valu so on and so forth
        for (int i=0; i<list.length; i++){
             int count=1;
             for (int j=i+1;j<list.length; j++){
                 if (list[i] == list[j])
                    count ++;
                 else
                     break;
                    
             }
             if (count>=1){
             System.out.println(list[i]+" occurs "+count+ " times");
             i += (count-1);
             }
             
                
             
        }
    }
}

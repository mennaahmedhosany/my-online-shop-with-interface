/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_shop_with_interface;

import java.util.Scanner;

/**
 *
 * @author ORIGINAL
 */

public class Online_shop_with_interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("the number of books do you want");
        Scanner input= new Scanner (System.in);
        int size= input.nextInt();
        childern_book[] arr=new childern_book[size];
        cartoon[] arr2=new cartoon[size];
        double price;
        double total=0;
         String book;
        for(int i=0 ; i<arr.length;i++)
        {
            System.out.println("the price of books do you want" +(i+1));
            price=input.nextDouble();
             arr[i] =new childern_book(price);
            total=+arr[i].price(price);
           
        }
        System.out.println( " the total price of childern book" +total);
        for(int i=0;i<arr2.length;i++)
        {
          System.out.println(" what the name of cartoon book do you want" +(i+1));
          book=input.next();
             arr2[i]=new cartoon(book);

        }
        for(int i=0;i<arr2.length;i++)
        {
          System.out.println("the name of cartoon book "+" " +(i+1)+ " "+arr2[i].getItem() );
          

        }
        
    }
        
    }
    


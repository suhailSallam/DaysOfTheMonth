/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysofthemonth;

import java.io.Console;
import java.util.Scanner;

/**
 * 
 * @author Huawei
 */
public class DaysOfTheMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /**
     * 
     */
        printTheResult(decideNumberOfDays(readMonth(), readYear()));
    }//end main()
    
/**
 * 
 * @return mMonth
 */
    public static int readMonth(){
        Scanner reader = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Month Number: ");
        int mMonth = reader.nextInt();  // Read user input
        return mMonth;
    }//end readMonth()
    
/**
 * 
 * @return mYear
 */
    public static int readYear(){
        Scanner reader = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Year Number: ");
        int mYear = reader.nextInt();  // Read user input
        return mYear;
    }//end of readYear()
    
/**
 * 
 * @param month
 * @param year
 * @return 
 */
    public static int decideNumberOfDays(int month, int year){
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4:
                return 30;
            case 2: 
                if(((year % 4 ==0) && !(year % 100 ==0)) || (year % 400 == 0))
                    return 29;
                else
                    return 28;
            default:
                System.out.println("Invalid Month");
                return 0;
                            
        }//end switch
    }//end of  decideNumberOfDays()  
    
    /**
     * 
     * @param printMonthDays 
     */
    public static void printTheResult(int printMonthDays){
        System.out.print("Number of days are : " + printMonthDays + "\n");
      }//end of printTheResult()
}//end class Main

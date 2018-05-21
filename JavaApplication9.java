/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author amit
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Number of row: ");
        Scanner row=new Scanner(System.in);
        int r=row.nextInt();
        System.out.print("Number of coloman: ");
        Scanner col=new Scanner(System.in);
        int c=col.nextInt();
        int m[][]=new int[r][c];
        int i,j;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                 System.out.println("Enter element "+i+"*"+j+":");
                 Scanner ele=new Scanner(System.in);
                 m[i][j]=ele.nextInt();                
            }
        }
        System.out.println("Your matrix is:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                 System.out.print(m[i][j]+"     ");             
            }
            System.out.println();
        }
        int sum=0;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                 sum=sum+m[i][j];             
            }
        }
        System.out.println("Sum of all element is "+sum);
        int sd=0;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(j==i)
                {
                 sd=sd+m[i][j];
                }             
            }
        }
        System.out.println("Sum of all element is "+sd);
    }
    
}

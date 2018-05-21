package javaapplication7;
import java.util.Arrays;
import java.util.Scanner;
/*
 @author amit
 */
public class JavaApplication7
    public static void main(String[] args) {
        System.out.println("      !!!!Welcome!!!");
        System.out.print("How many numbers you want to enter: ");
        int a;
        Scanner t=new Scanner(System.in);
        a=t.nextInt();
        int b[]=new int[a];
        int c;
        for(c=0;c<a;c++)
        {
            System.out.print("Enter number "+(c+1)+": ");
            Scanner u=new Scanner(System.in);
            b[c]=u.nextInt();
        }
        System.out.println("What do you want to do with these numbers?");
        System.out.println("Press 1 to find sum of these numbers.");
        System.out.println("Press 2 to find prime numbers from these numbers.");
        System.out.println("Press 3 to find biggest number.");
        System.out.println("Press 4 to find smallest number.");
        System.out.println("Press 5 to find numbers which is divisible by 3.");
        System.out.println("Press 6 to display numbers in same order entered by you.");
        System.out.println("Press 7 to display numbers in reverse order entered by you.");
        System.out.println("Press 8 to display these numbers in increassing order.");
        System.out.println("Press 9 to display these numbers in decreassing order.");
        System.out.println("Press 10 to check number exist or not.");
        System.out.print("Press your choice: ");
        Scanner v=new Scanner(System.in);
        int e=v.nextInt();
        switch(e)
        {
            case 1://Sum
                int sum =0;
                for(int g=0;g<a;g++)
                {
                    sum = sum+b[g];
                }
                System.out.println("Sum of these numbers is "+sum+".");
                break;
            case 2://Prime number
                int i,h,j=0;
                int k[]=new int[a];
                for(int g=0;g<a;g++)
                {
                    for(i=2;i<=b[g]/2;i++)
                    {
                    h=b[g]%i;
                   if(h==0)
                    {
                        break;
                    }
                    }
                    if (b[g]%i!=0)
                    {
                        k[j]=b[g];
                        j++;
                    }
                }// if prime does not entered by user then show Sorry prime number has not entered.
                System.out.print("Prime numbers entered by you are: ");
                //This program does not show 2 as a prime number.
                for(int g=0;g<j;g++)
                {
                    System.out.print(k[g]+",");
                }
                System.out.println("\b.");
                break;
            case 3: //biggest
                  System.out.print("Biggest number is :");
                  for(int g=0;g<a;g++)
                  {
                   Arrays.sort(b);
                  }
                  System.out.println(b[a-1]+".");
                break;
            case 4: //smallest
                  System.out.print("Smallest number is :");
                  for(int g=0;g<a;g++)
                  {
                   Arrays.sort(b);
                  }
                  System.out.println(b[0]+".");
                break;
            case 5://divisible by 3
                System.out.print("Numbers which is divisible by 3 are: ");
                int d;
                for(d=0;d<a;d++)
                {
                    if(b[d]%3==0)
                    {
                        System.out.print(b[d]+ ",");  
                    }
                }
                System.out.println("\b.");
                break;
            case 6://same order
                //int d;
                for(d=0;d<a;d++)
                {
                    System.out.println("Number "+(d+1)+" is "+b[d]);
                }
                break;
            case 7://reverse order
                int f;
                for(f=a;f>0;f--)
                {
                    System.out.println("Number "+f+" is "+b[f-1]);
                }
                break;
            case 8:// increasing order
                  System.out.print("Numbers are in increasing order:");
                  for(int g=0;g<a;g++)
                  {
                   Arrays.sort(b);
                   System.out.print(" "+b[g]+" <");
                   //System.out.print(" ");
                  }
                System.out.print("\b\b.\n");  
                break;
            case 9://decreassing order
                System.out.print("Numbers are in decreasig order:");
                  for(int g=a-1;g>=0;g--)
                  {
                   Arrays.sort(b);
                   System.out.print(" "+b[g]+" >");
                   //System.out.print(" ");
                  }
                System.out.print("\b\b.\n");  
                break;
            case 10:
                System.out.print("Enter a number: ");
                int z=t.nextInt();
                for(d=0;d<a;d++)
                {
                    if(z==b[d])
                    {
                        System.out.println("Congratulaion this number exist.");
                    }
                    /*if(z!=b[d])
                    {
                        System.out.println("Sorry this number does not exist.");
                    }*/
                }
                break;
            default:
            {
                System.out.println("Sorry you have pressed wrong key.\nTry again.");
            }
        }
    }
    
}

package javaapplication15;

import java.util.Scanner;

class Volume
{
    public void vol(float a)
    {
        System.out.println("Volume of cube is: "+a*a*a);
    }
    public void vol(float a,float b,float c)
    {
        System.out.println("Volume of cuboid is: "+a*b*c);
    }
}
public class JavaApplication15 
{
    public static void main(String[] args) 
    {
        System.out.println("      !!!!! WELCOME !!!!!");
        System.out.println("!! VOLUME OF CUBE AND CUBOID !!");
        System.out.println("Enter 1 to find volume of cube.");
        System.out.println("Enter 2 to find volume of cuboid.");
        System.out.println("Enter 3 to find volume of both.");
        System.out.print("Enter your choice: ");
        Scanner n=new Scanner(System.in);
        int choice=n.nextInt();
        Volume v=new Volume();
        switch(choice)
        {
            case 1://volume of cube
            {
                System.out.println("Your choice is find volume of cube.");
                System.out.print("Enter  side   of  cube: ");
                float a=n.nextFloat();
                v.vol(a);
                break;  
            }
            case 2://cuboid
            {
                System.out.println("Your choice is find volume of cuboid.");
                System.out.print("Enter lenght of cuboid: ");
                float a=n.nextFloat();
                System.out.print("Enter width  of cuboid: ");
                float b=n.nextFloat();
                System.out.print("Enter height of cuboid: ");
                float c=n.nextFloat();
                v.vol(a,b,c);
                break;
            }
            case 3://both
            {
                System.out.println("Your choice is find volume of cube and cuboid.");
                System.out.print("Enter  side   of  cube: ");
                float d=n.nextFloat();
                System.out.print("Enter lenght of cuboid: ");
                float a=n.nextFloat();
                System.out.print("Enter width  of cuboid: ");
                float b=n.nextFloat();
                System.out.print("Enter height of cuboid: ");
                float c=n.nextFloat();
                v.vol(d);
                v.vol(a,b,c);
                break;
            }
            default:
            {
                System.out.println("    !!! Sorry Wrong Choice. !!!");
                break;
            }
        }
        System.out.println("        !!!THANK YOU!!!");
    }
}

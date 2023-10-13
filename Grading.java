

import java.io.*;
public class Grading
{
    public static void main(String arg[]) throws IOException
    {
        

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(I);
        String name;
        double num1;
        double num2;
        double num3;
        double num4;
        double num5;
        double percentage;
        double sum;

        System.out.print("Enter Your name:");
        name = read.readLine();
        System.out.println("Name :"+name);

        System.out.print("Enter the subject 1 Marks :");
        num1 = Float.parseFloat(read.readLine());
        System.out.println("Sub1 ="+num1);
      
        System.out.print("Enter the subject 2 Marks :");
        num2 =Integer.parseInt(read.readLine());
        System.out.println("Sub2 = "+num2);

        System.out.print("Enter the subject 3 Marks :");
        num3 = Double.parseDouble(read.readLine());
        System.out.println("Sub3 :"+num3);

        System.out.print("Enter the subject 4 marks :");
        num4 = Double.parseDouble(read.readLine());
        System.out.println("Sub4 :"+num4);

        System.out.print("Enter the subject 5 marks :");
        num5 = Double.parseDouble(read.readLine());
        System.out.println("num5 :"+num5);

        sum= (num1+num2+num3+num4+num5);
        percentage = (sum/5);

        System.out.println("Total Marks = "+sum);
        System.out.println("Total Percentage = "+percentage+" %");


        if(num1 > 40 && num2> 40 && num3 > 40 && num4 > 40 && num5 > 40 )

        {


        if (percentage > 90)
        System.out.println("Grade = O");

        else if(percentage >=80)
        System.out.println("Grade = A+");

        else if(percentage >=70)
        System.out.println("Grade = A");

        else if(percentage >=60)
        System.out.println("Grade = B+");

        else if(percentage >=50)

        System.out.println("Grade = B");

        else if(percentage >=40)
        System.out.println("Grade = Pass");

        else if(percentage <40)
        System.out.println("Grade = Fail");

        }

        else
        {
            
        
             System.out.println("Fail");
        }
        




    }
}

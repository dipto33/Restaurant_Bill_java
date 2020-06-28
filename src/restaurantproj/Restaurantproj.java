
package restaurantproj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;


public class Restaurantproj {

    public static void main(String[] args) {
        String[] arr =new String[10];
        int[] arr2=new int[10];
        float[] arr3=new float[10];
         float[] arr4=new float[10];
       int i=0,ds=0,total_qti=0;
       float sum=0,ser=0,vat=0,da=0,ta=0,ts=0,dss=0,drd=0,total_discount,tt=0,total_sum=0,bal_ret,pz;
      
       Scanner input = new Scanner(System.in);
       Scanner in = new Scanner(System.in);
       Scanner date = new Scanner(System.in);
       Scanner things = new Scanner(System.in);
       String name,dat;
       int num,y;
        char x = 0;
       float tender;
       Date thisdate= new Date();
       SimpleDateFormat dateform=new SimpleDateFormat("M/dd");
       String dd=dateform.format(thisdate);

       System.out.println("----------WELLCOME------------\n Enter your name:");
       name=input.nextLine();
       System.out.println("Enter your Birthdate(M/dd):"); //(6/25 ei format a date)
       dat=date.nextLine();
       System.out.println("##For Normal Food Enter Product Id=A\n##For See Food Enter Product Id=B\n##For Drinks Enter Product id=C\n\nTotal Type of Products:");
       num=things.nextInt();
       y=num;
       while(num>=1)
       {
           Scanner pn = new Scanner(System.in);
           Scanner am = new Scanner(System.in);
           Scanner pid = new Scanner(System.in);
           Scanner px = new Scanner(System.in);
           
           int at;
           String n;
           System.out.println("Enter the product id:");
           x=pid.next().charAt(0);
           
           if(x=='A')
           {
                System.out.println("Enter the product name:");
            n=pn.nextLine();
           arr[i]=n;
           //System.out.println(arr[i]);
          
           System.out.println("Enter the amount:");
           at=am.nextInt();
           arr2[i]=at;
           System.out.println("Enter the prize:");
           pz=px.nextFloat();
           arr4[i]=pz;
           tt=at*pz;
           arr3[i]=tt;
           ta=ta+tt;
           }
           else if(x=='B')
           {
                System.out.println("Enter the product name:");
           n=pn.nextLine();
           arr[i]=n;
           //System.out.println(arr[i]);
          
           System.out.println("Enter the amount:");
           at=am.nextInt();
           arr2[i]=at;
           System.out.println("Enter the prize:");
           pz=px.nextFloat();
            arr4[i]=pz;
           tt=at*pz;
           arr3[i]=tt;
           ts=ts+tt;
           }
           else if(x=='C')
           {
               //System.out.println("K");
                System.out.println("Enter the product name:");
           n=pn.nextLine();
           arr[i]=n;
           //System.out.println(arr[i]);
          
           System.out.println("Enter the amount:");
           at=am.nextInt();
           arr2[i]=at;
           System.out.println("Enter the prize:");
           pz=px.nextFloat();
            arr4[i]=pz;
           tt=at*pz;
           arr3[i]=tt;
           if(dd.compareTo(dat)==0)
               {
                   drd=drd+tt;
               }
               
           }
          
          i++;
          num--;
           
       }
       if(ta>200)
       {
           da=(ta*20)/100;
       }
       if(ts>300)
       {
           dss=(ts*30)/100;
       }
       
       total_discount=da+dss+drd;
       
       for(int j=0;j<y;j++)
  {
     sum=sum+arr3[j];
  }
          for(int j=0;j<y;j++)
  {
     total_qti=total_qti+arr2[j];
  }
       ser=(sum*10)/100;
       vat=(sum*5)/100;
       total_sum=sum+ser+vat-total_discount;
        System.out.println("Your Bill Is:"+total_sum);
         System.out.println("Given Money:");
         tender=in.nextFloat();
       bal_ret=tender-total_sum;
System.out.print("\n\n\n");
System.out.println("                      Retail Invoice         ");
System.out.println("                    ===>>Re-Print<<===");
System.out.println("----------------------------------------------------------");
 Date thatdate= new Date();
 System.out.println(thatdate);
  System.out.println("User: "+name);
  System.out.println("----------------------------------------------------------");
  System.out.println("Sr Product          Qty Uni        Rate       Amount");
  System.out.println("----------------------------------------------------------");
  for(int j=0;j<y;j++)
  {
      System.out.printf("%-12s%14d%14.2f%12.2f%n",arr[j],arr2[j],arr4[j],arr3[j]);
  }
  System.out.println("----------------------------------------------------------");
  System.out.printf("%-20s%32.2f%n","Sub Total",sum);
  System.out.printf("%-20s%32.2f%n","Service charge @ 10%",ser);
  System.out.printf("%-20s%32.2f%n","Output Vat @ 10%",vat);
  System.out.println("Discount                                     -"+total_discount);
  System.out.println("----------------------------------------------------------");
  System.out.println("Total Qty: "+total_qti+"Pics            Amt:              "+total_sum);
  System.out.printf("%-20s%32.2f%n","Tender:",tender);
  System.out.printf("%-20s%32.2f%n","Balance Return",bal_ret);
  System.out.printf("%-20s%32.2f%n","Pay Mode: Cash:",tender);
   System.out.println("------------------ Thank You ---------------------------");
    }
    
    
}

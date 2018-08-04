package com.hand;

import java.util.Scanner;

/**
 * 工资个人所得税计算程序
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner s=new Scanner(System.in);
        System.out.print("请输入工资：");
        double salary=s.nextDouble();
        calculate(salary);
    }

    public static void calculate(Double b)
    {
        //System.out.println("ok");
        double threshold=3500;
        double ratesalary=b-threshold;
        double taxe;
        if(ratesalary>=0&ratesalary<=1500){
            taxe=ratesalary*0.03;
            System.out.println("所需要缴纳的税费为："+(double)(Math.round(taxe*100))/100);
        }else if(ratesalary>1500&ratesalary<=4500){
            taxe=ratesalary*0.1;
            System.out.println("所需要缴纳的税费为："+(double)(Math.round(taxe*100))/100);
        }else if(ratesalary>4500&ratesalary<=9000){
            taxe=ratesalary*0.2;
            System.out.println("所需要缴纳的税费为："+(double)(Math.round(taxe*100))/100);
        }else if(ratesalary>9000&ratesalary<=35000){
            taxe=ratesalary*0.25;
            System.out.println("所需要缴纳的税费为："+(double)(Math.round(taxe*100))/100);
        }else if(ratesalary>35000&ratesalary<=55000){
            taxe=ratesalary*0.3;
            System.out.println("所需要缴纳的税费为："+(double)(Math.round(taxe*100))/100);
        }else if(ratesalary>55000&ratesalary<=80000){
            taxe=ratesalary*0.35;
            System.out.println("所需要缴纳的税费为："+(double)(Math.round(taxe*100))/100);
        }else if(ratesalary>80000){
            taxe=ratesalary*0.45;
            System.out.println("所需要缴纳的税费为："+(double)(Math.round(taxe*100))/100);
        }else{
            System.out.println("所需要缴纳的税费为：0.00");
        }
    }
}

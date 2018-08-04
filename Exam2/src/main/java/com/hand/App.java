package com.hand;

import java.util.Scanner;

/**
 * 输入某年某月某日，给出下一天的日期？当然输入日期不合法需要做出错误提示。
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner s=new Scanner(System.in);
        String date;
        String[] ymd=new String[3];
        System.out.print("请输入日期：");
        date=s.next();
        ymd=dtesp(date);
        int year=Integer.valueOf(ymd[0]).intValue();
        int month=Integer.valueOf(ymd[1]).intValue();
        int day=Integer.valueOf(ymd[2]).intValue();
        //System.out.println(year);
        //System.out.println(month);
        //System.out.println(day);
        nextday(year,month,day);

    }
    //拆分字符串
    public static String[] dtesp(String d){
        String[] ymd=d.split("-");
        return ymd;
    }
    //求下一天
    public static void nextday(int y,int m,int d)
    {
        switch (m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: if(0<d&d<=30){
                d=d+1;
                System.out.println("下一天为"+y+"-"+String.format("%02d",m)+"-"+String.format("%02d",d));
            }else if(d==31){
                d=1;
                m=m+1;
                if(m>12){
                    m=1;
                    y=y+1;
                }
                System.out.println("下一天为"+y+"-"+String.format("%02d",m)+"-"+String.format("%02d",d));
            }else{
                System.out.println("您输入的日期不存在");
            }

            break;
            case 4:
            case 6:
            case 9:
            case 11:if(0<d&d<=29){
                d=d+1;
                System.out.println("下一天为"+y+"-"+String.format("%02d",m)+"-"+String.format("%02d",d));
            }else if(d==30){
                d=1;
                m=m+1;
                if(m>12){
                    m=1;
                    y=y+1;
                }
                System.out.println("下一天为"+y+"-"+String.format("%02d",m)+"-"+String.format("%02d",d));
            }else{
                System.out.println("您输入的日期不存在");
            }break;
            case 2:
                boolean b;
                b=isLeapyear(y);

                if(!b){
                    if(0<d&d<=27){
                        d=d+1;
                        System.out.println("下一天为"+y+"-"+String.format("%02d",m)+"-"+String.format("%02d",d));
                    }else if(d==28){
                        d=1;
                        m=m+1;
                        if(m>12){
                            m=1;
                            y=y+1;
                        }System.out.println("下一天为"+y+"-"+String.format("%02d",m)+"-"+String.format("%02d",d));
                    }else{
                        System.out.println("您输入的日期不存在");
                    }

                }else{
                    if(0<d&d<=28){
                        d=d+1;
                        System.out.println("下一天为"+y+"-"+String.format("%02d",m)+"-"+String.format("%02d",d));
                    }else if(d==29){
                        d=1;
                        m=m+1;
                        if(m>12){
                            m=1;
                            y=y+1;
                        }
                        System.out.println("下一天为"+y+"-"+String.format("%02d",m)+"-"+String.format("%02d",d));
                    }else{
                        System.out.println("您输入的日期不存在");
                    }

                }

                    break;
                default:System.out.println("您输入的日期不存在");
        }

    }
    //判断闰年
    public static Boolean isLeapyear(int y){
        boolean isLeap=false;
        if((y%400==0)||((y%100!=0)&&(y%4==0))){
            isLeap=true;
        }
        return isLeap;
    }
}

package com.skbh.main;

class X
{
    int m = 1111;
 
    {
        m = m++;
 
        System.out.println(m);//1112
    }
    
 
}
 
class Y extends X
{
    {
        System.out.println(methodOfY());
    }
 
    int methodOfY()
    {
    	return m-- + --m;
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        Y y = new Y();
        int i=0;
        int j=i++ + ++i +  ++i + i-- + ++i + i++;// 
        System.out.println(j);
         
        
    }
}
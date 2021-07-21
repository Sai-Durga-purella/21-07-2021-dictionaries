import java.util.*; 

import java.io.*;
 
class Solution
 
{
    
public static void main(String []argh)
    
{ 
      
Scanner in = new Scanner(System.in);
      
 int n = in.nextInt(); 
      
 HashMap<String,Integer> x=new HashMap<String,Integer>(); 
       
for(int i = 0; i < n; i++)
       
{
          
String name = in.next();
           
int phone = in.nextInt();
            
x.put(name,phone);
             
} 
while(in.hasNext())
             
 try
               
{
                 
 for(int j=0;j<n;j++) 
                  
{
                     
String s = in.next(); 
                     
 if(x.containsKey(s)) 
                     
System.out.println(s+"="+x.get(s));
                      
 else 
                       
System.out.println("Not found"); 
                       
}
                       
}
                       
catch (Exception e){} 
                       
in.close(); 
                       
}
                        
}




Input:
          3
sam 99912222

           tom 11122222

           harry 12299933

           sam

          edward

           harry
output: 
             sam=99912222  

              Not found

              harry=12299933
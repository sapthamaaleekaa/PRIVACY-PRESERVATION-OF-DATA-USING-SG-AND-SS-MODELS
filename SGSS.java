/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author mani
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.lang.*;
import java.util.Scanner;

class Node {
    String name;
    String age;
    String sex;
    int salary;
    int nfwa;
    String loc;
    int rbp;
    int flag;
    
    public Node(String a, String b, String c, int d,int e,String f,int g,int h) {
        name = a; age = b; sex = c; salary = d; nfwa = e; loc = f; rbp = g; flag=h;
    }

    Node() {
         name = null; age = null; sex = null; salary = 0; nfwa = 0; loc = null; rbp = 0; flag=0;//To change body of generated methods, choose Tools | Templates.
    }
}

        public class JavaApplication1{
   
    public static void main(String[] args) throws IOException {
        int i=0,j=0,l=0,siz,x,y,z,n,h,cg=0,p;
        int[] d=new int[2];
        String a;
        LinkedList<Node> [] linky = new LinkedList[10];
        linky[0]=new LinkedList<>();
        System.out.println("ORIGINAL TABLE");
        System.out.println("\n");
        System.out.println("Name Age Sex   Salary NFWA LOC RBP");
        {
        Node myNode = new Node("AAA", "24", "male", 15000,2,"CC",7,0);
        linky[0].add(myNode);
        System.out.println(myNode.name+"  "+myNode.age+"  "+myNode.sex+"    "+myNode.salary+"  "+myNode.nfwa+"  "+myNode.loc+"  "+myNode.rbp);
        }
        {
        Node myNode = new Node("BBB", "36", "male", 20000,2,"GG",5,0);
        linky[0].add(myNode);
        System.out.println(myNode.name+"  "+myNode.age+"  "+myNode.sex+"    "+myNode.salary+"  "+myNode.nfwa+"  "+myNode.loc+"  "+myNode.rbp);
        }
        {
        Node myNode = new Node("CCC", "27", "Female", 25000,2,"EE",9,0);
        linky[0].add(myNode);
        System.out.println(myNode.name+"  "+myNode.age+"  "+myNode.sex+"    "+myNode.salary+"  "+myNode.nfwa+"  "+myNode.loc+"  "+myNode.rbp);
        }
         {
        Node myNode = new Node("DDD", "32", "male", 20000,2,"GG",6,0);
        linky[0].add(myNode);
        System.out.println(myNode.name+"  "+myNode.age+"  "+myNode.sex+"    "+myNode.salary+"  "+myNode.nfwa+"  "+myNode.loc+"  "+myNode.rbp);
        }
        {
        Node myNode = new Node("AAA", "27", "male", 30000,2,"CC",10,0);
        linky[0].add(myNode);
        System.out.println(myNode.name+"  "+myNode.age+"  "+myNode.sex+"    "+myNode.salary+"  "+myNode.nfwa+"  "+myNode.loc+"  "+myNode.rbp);
        }
        {
        Node myNode = new Node("EEE", "24", "male", 15000,1,"CC",8,0);
        linky[0].add(myNode);
        System.out.println(myNode.name+"  "+myNode.age+"  "+myNode.sex+"    "+myNode.salary+"  "+myNode.nfwa+"  "+myNode.loc+"  "+myNode.rbp);
        }
        {
        Node myNode = new Node("CCC", "30", "male", 20000,1,"GG",8,0);
        linky[0].add(myNode);
        System.out.println(myNode.name+"  "+myNode.age+"  "+myNode.sex+"    "+myNode.salary+"  "+myNode.nfwa+"  "+myNode.loc+"  "+myNode.rbp);
        }
        {
        Node myNode = new Node("FFF", "24", "Female", 20000,1,"BB",7,0);
        linky[0].add(myNode);
        System.out.println(myNode.name+"  "+myNode.age+"  "+myNode.sex+"    "+myNode.salary+"  "+myNode.nfwa+"  "+myNode.loc+"  "+myNode.rbp);
        }
        {
        Node myNode = new Node("GGG", "36", "male", 20000,3,"GG",7,0);
        linky[0].add(myNode);
        System.out.println(myNode.name+"  "+myNode.age+"  "+myNode.sex+"    "+myNode.salary+"  "+myNode.nfwa+"  "+myNode.loc+"  "+myNode.rbp);
        }
        {
        Node myNode = new Node("HHH", "27", "Female", 25000,2,"EE",9,0);
        linky[0].add(myNode);
        System.out.println(myNode.name+"  "+myNode.age+"  "+myNode.sex+"    "+myNode.salary+"  "+myNode.nfwa+"  "+myNode.loc+"  "+myNode.rbp);
        }
        {
        Node myNode = new Node("DDD", "24", "Female", 20000,3,"BB",7,0);
        linky[0].add(myNode);
        System.out.println(myNode.name+"  "+myNode.age+"  "+myNode.sex+"    "+myNode.salary+"  "+myNode.nfwa+"  "+myNode.loc+"  "+myNode.rbp);
        }
        {
        Node myNode = new Node("KKK", "29", "male", 35000,1,"CC",8,0);
        linky[0].add(myNode);
        System.out.println(myNode.name+"  "+myNode.age+"  "+myNode.sex+"    "+myNode.salary+"  "+myNode.nfwa+"  "+myNode.loc+"  "+myNode.rbp);
        }
         {
        Node myNode = new Node("SSS", "33", "male", 30000,2,"CC",8,0);
        linky[0].add(myNode);
        System.out.println(myNode.name+"  "+myNode.age+"  "+myNode.sex+"    "+myNode.salary+"  "+myNode.nfwa+"  "+myNode.loc+"  "+myNode.rbp);
        }
        
        System.out.println("\n");
        System.out.println("Generalization");
        System.out.println("\n");
        System.out.println("Name Age Sex   Salary NFWA LOC RBP");
        while(i<linky[0].size())
        {
         
                 a=linky[0].get(i).age;
                 if(j!=0)
                 {
                 siz=j;
                 l=0;
                 while(j!=0)
                 {
                      if(a == null ? linky[j].get(0).age == null : a.equals(linky[j].get(0).age))
                      {
                      linky[j].add(0,linky[0].get(i));
                      l=1;
                      break;
                      }
                      else
                      j=j-1;
                 }
                 if(l==0)
                 {
                 siz=siz+1;
                 linky[siz]=new LinkedList<>();
                 linky[siz].add(0,linky[0].get(i));
                 }
                 j=siz;
                 }
                 else
                 {
                     j=j+1;
                     linky[j]=new LinkedList<Node>();
                     linky[j].add(0,linky[0].get(i));
                 }
            i=i+1; 
         
        }
        siz=j;
       
        while(j>0)
        {
            if(linky[j].size()==1)
            {
             char[] chars = (linky[j].get(0).age).toCharArray();
             for (i = 0, n = chars.length; i < n; i++)
                 {
                 char c = chars[i];
                 d[i]=c-48;
                
                 } 
            x=d[0]*10;
            y=x+10;
            linky[j].get(0).age=x+"-"+y;
            System.out.println(linky[j].get(0).name+"  "+linky[j].get(0).age+"  "+linky[j].get(0).sex+"    "+linky[j].get(0).salary+"  "+linky[j].get(0).nfwa+"  "+linky[j].get(0).loc+"  "+linky[j].get(0).rbp);
            }
            j=j-1;
        }
        j=siz;
        while(j>0)
        {
            l=0;
            if(linky[j].size()>1)
            {
                for(i=0;i<linky[j].size();i++)
                {
                l=0;
                while(l<linky[j].size())
                   {
                   if(l==i)
                   {
                       l=l+1;
                   }
                   if((linky[j].get(i).sex == null ? linky[j].get(l).sex == null : linky[j].get(i).sex.equals(linky[j].get(l).sex))&&(linky[j].get(i).salary==linky[j].get(l).salary)&&(linky[j].get(i).loc == null ? linky[j].get(l).loc == null : linky[j].get(i).loc.equals(linky[j].get(l).loc)))
                       {
                       break;
                       }
                    else
                       {
                        h=l;
                        l=l+1;
                        if(l==i)
                        {
                        l=l+1;
                        }
                        cg=0;
                        while(l<linky[j].size())
                        {
                            if((linky[j].get(i).sex.equals(linky[j].get(l).sex))&&(linky[j].get(i).salary==linky[j].get(l).salary)&&(linky[j].get(i  ).loc == null ? linky[j].get(l).loc == null : linky[j].get(i  ).loc.equals(linky[j].get(l).loc)))
                            {
                            cg=1;
                            break;
                            }
                         l=l+1;
                        }
                        if(cg==0)
                        {
                        char[] chars = (linky[j].get(i).age).toCharArray();
                        for (p = 0, n = chars.length; p < n; p++)
                        {
                           char c = chars[p];
                           d[p]=c-48;
                
                         } 
                         x=d[0]*10;
                         y=x+10;
                         linky[j].get(i).age=x+"-"+y;
                         break;
                        }
                        else
                        l=h+1;
                       }
                   }
                }
                 x=0;
                 while(x<linky[j].size())
                 {
                 System.out.println(linky[j].get(x).name+"  "+linky[j].get(x).age+"  "+linky[j].get(x).sex+"    "+linky[j].get(x).salary+"  "+linky[j].get(x).nfwa+"  "+linky[j].get(x).loc+"  "+linky[j].get(x).rbp);
                 x++;
                 }
            } 
       
        j=j-1;
        
        }
        System.out.println("\n");
        System.out.println("Selection of tuples for shuffling");
        System.out.println("\n");
        
        j=0;
        int c=0;
        for(i=0;i<linky[j].size();i++)
        {
            cg=0;
            if(linky[j].get(i).age.length()>3)
            {
            for(l=0;l<linky[j].size();l++)
            {
               if((linky[0].get(i).age).equals(linky[0].get(l).age)&&(linky[j].get(i).sex==linky[j].get(l).sex)&&(linky[j].get(i).salary==linky[j].get(l).salary)&&(linky[j].get(i  ).loc==linky[j].get(l).loc)&&(l!=i))
                {
                cg=1;
                break;
                }
                else ;
               
            }
            if(cg==0)
            {
            linky[j].get(i).flag=1;
            c++;
            System.out.println(linky[j].get(i).name+"  "+linky[j].get(i).age+"  "+linky[j].get(i).sex+"    "+linky[j].get(i).salary+"  "+linky[j].get(i).nfwa+"  "+linky[j].get(i).loc+"  "+linky[j].get(i).rbp);
            }
            }}
            System.out.println("\n");
            System.out.println("Table to miner 1");
            System.out.println("\n");
            
            int arr[]=new int[c];
            j=0;
            for(i=0;i<linky[0].size();i++)
            {
                if(linky[0].get(i).flag==1)
                arr[j++]=i;
            }
            Node t=new Node("GGG", "36", "male", 20000,3,"GG",7,0);
            LinkedList<Node> [] lin = new LinkedList[10];
            lin[0]=(LinkedList<Node>)linky[0].clone();
            
            for(i=0;i<c-1;i++)
            {
                t.age=lin[0].get(arr[i]).age;
                 t.sex=lin[0].get(arr[i]).sex;
                  t.salary=lin[0].get(arr[i]).salary;
                lin[0].get(arr[i]).age=lin[0].get(arr[i+1]).age;
                lin[0].get(arr[i]).sex=lin[0].get(arr[i+1]).sex;
                lin[0].get(arr[i]).salary=lin[0].get(arr[i+1]).salary;
                lin[0].get(arr[i+1]).age=t.age;
                lin[0].get(arr[i+1]).sex=t.sex;
                lin[0].get(arr[i+1]).salary=t.salary;
            }
          System.out.println("AGE SEX SALARY");
          for(i=0;i<lin[0].size();i++)
          {
              System.out.println(lin[0].get(i).age+" "+lin[0].get(i).sex+" "+lin[0].get(i).salary);
          }
          System.out.println("\n");
          System.out.println("Table to miner 2");
          System.out.println("\n");
          System.out.println("NFWA LOC RBP");
          for(i=0;i<lin[0].size();i++)
          {
              System.out.println(lin[0].get(i).nfwa+" "+lin[0].get(i).loc+" "+lin[0].get(i).nfwa);
          }
        
    }
}
# List Program in Java

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
          l.add(sc.nextInt());
        }
        int query=sc.nextInt();
        int x,y,dindex;
        int[] index=new int[2];
        for(int i=0;i<query;i++){
            String in=sc.next();
            if(in.equals("Insert")){
                for(int j=0;j<2;j++)
                    index[j]=sc.nextInt();
                l.add(index[0],index[1]);
            }else if(in.equals("Delete")){
              dindex=sc.nextInt();
               l.remove(dindex);
            }
        }
        Iterator itr=l.iterator();
        while(itr.hasNext())
        System.out.print(itr.next()+" ");
    
    }
}

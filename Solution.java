import java.io.*;
import java.lang.*;
import java.util.Scanner;

class Solution{
  public static void main(String args[])throws IOException{
    long N,K;
    int i=0,j=0,t=0,o=0,s=0;
    int a[]=new int[100000];
    //Scanner Class used here for getting the input
    Scanner in=new Scanner(System.in);
    //Fetch the next input on the same line
    N=in.nextInt();
    K=in.nextInt();
    while(i<N){
      a[i]=in.nextInt();
      a[i+1]=in.nextInt();
      i+=2;  
    }
    i=0;  
    while(i<N){
      t=a[i];
      s=a[i+1];  
        for(j=i+1;j<N;j+=2){
            //Comparison is made using the ternary operator. This considerably improved the performance as compared to normal IF..ELSE.. Statement
            o=((t-a[j]) == K || (a[j]-t) == K)?o=o+1:o;
            o=((s-a[j+1]) == K || (a[j+1]-s) == K)?o=o+1:o;
      }
      i+=2;  
    }
    System.out.println(o);
  }
}

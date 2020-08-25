import java.util.*;
class Time
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int temp,i,j,v=0,n=0,three=3,size=1,c=0,co=0,con=0,cont=0,c1=0,c2=0,c3=0,c4=0;
    int c5=0,c6=0;
    int a[]=new int[4];
    
    System.out.print("Enter Four Digit\n");
    for(i=0;i<4;i++)
     a[i]=sc.nextInt();
 System.out.println("All Possible Time : ");
//---------------------ALL POSSIBLE TIME--------
Arrays.sort(a);
if(a[0]==a[1]&&a[1]==a[2])
{three=1;size=2;}
if(a[0]<a[1]&&a[1]==a[2]&&a[2]==a[3]){
    n=2;for(i=0;i<a.length;i++){
    System.out.print(a[i]);c5++;}
System.out.println();}

Arrays.sort(a);
while(n<three)
{  
if(a[3]>9)
break;
 if(a[n]<3){
        temp=a[n];
        a[n]=a[0];
        a[0]=temp;
    }
if(a[n]>=3)
 break;
 //---------------------------------------
for(i=0;i<a.length-size;i++)
{   
    for(j=2;j<a.length;j++)
    {      
        v=1;
        temp=a[v];
        a[v]=a[j];
        a[j]=temp;
        for(int ii:a)
        {    
            if(a[0]==2&&a[1]>3||a[2]>5||a[0]==a[1]&&a[1]==a[2]&&a[2]==a[3])
            {ii='\0';}
            else{
            System.out.print(ii);}         
        c++;
        }
            System.out.println();
            v++;        
    }
}
System.out.println();
if(a[0]>2)
    break;
n++;
}
//-------------End---------------------
//-----------------------------Check Wrong Condition-------------
 Arrays.sort(a);
 for(i=0;i<a.length;i++)
{if(a[i]>9){System.out.print("Wrong Input");System.exit(0);}}
if(a[0]>2)
{System.out.print("Number is too greater");System.exit(0);}
if(a[1]>5)
{System.out.print("Number is too Greater");System.exit(0);}
if(a[0]<=1&&a[1]<=2&&a[2]>5)
{       
    if(a[0]==0&&a[1]==1)
        {
            temp=a[0];
            a[0]=a[1];
            a[1]=temp;
        }
    for(i=1;i<a.length;i++)
    {
        if(a[i]>a[1])
        {
        temp=a[1];
        a[1]=a[i];
        a[i]=temp;  
        co++;    
    }

    }
System.out.print("Max Time :");
for(i=0;i<a.length;i++)
{if(i==2)System.out.print(":");
System.out.print(a[i]);
c1++;
}
System.out.print("\nTime Complexity : "+(c1+co+c+a.length*3)+" milliSecond\n");
System.out.print("Space Complexity :"+((a.length+17)*4)+" bytes");
System.exit(0);
}
if(a[0]==2&&a[1]>=2&&a[2]>5&&a[3]>5)
{System.out.print("Wrong Inpute");System.exit(0);}

if(a[0]<=2)
{
for(i=0;i<a.length;i++)
{
    if(a[i]<=2&&a[i]>0)
    {   
        temp=a[0];
        a[0]=a[i];
        a[i]=temp;
        co++;
    }
c2++;
}
if(a[0]<=1)
{
    for(i=1;i<a.length;i++)
    {
        if(a[i]<=9)
        {   
            temp=a[1];
            a[1]=a[i];
            a[i]=temp;
            cont++;
        }
        c3++;
    }
}
if(a[2]<a[3]&&a[3]<=5)
{
            temp=a[2];
            a[2]=a[3];
            a[3]=temp;
}
if(a[0]==2&&a[1]<=3&&a[2]<=5)
{
    for(i=1;i<a.length;i++)
    {
        if(a[i]<=3&&a[1]<a[i])
        {
            temp=a[i];
            a[i]=a[1];
            a[1]=temp;
        }
        if(a[i]<=5&&a[2]<=a[i])
        {
            temp=a[i];
            a[i]=a[2];
            a[2]=temp;
        }
        c4++;
    }
}
}
System.out.print("Max Time : ");
 for(i=0;i<a.length;i++)
 {if(i==2)System.out.print(":");
    System.out.print(a[i]);c6++;}
System.out.println();
        
 System.out.print("Time Complexity : "+(c+co+c2+c3+c4+c5+c6+a.length*3)+" milliSecond\n");
 System.out.print("Space Complexity :"+((a.length+17)*4)+" bytes");
 }
}
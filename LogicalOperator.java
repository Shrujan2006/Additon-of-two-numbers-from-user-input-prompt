import java.util.*;
class LogicalOperator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
       isgreaterislesser(a,b);
    }
public static void isgreaterislesser(int a,int b){
    if (a>b){
       System.out.println(a+"  is G45reater than "+b);
    }
    else{
        System.out.println(a+"  is Lesser than  "+b);
    }

    }
    
}

        
 import java.util.*;
public class calculator {
         public static void main(String args[]){
        System.out.println("enter the inputs");
        System.out.println("Enter input 1:");
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        System.out.println("Enter input 2:");
        int input2=sc.nextInt();
        System.out.println("choose:1 to add, 2 to subtract ,3 to multiply, 4 to divide and 5 to get remainder");
        int opn=sc.nextInt();
int result;

        switch(opn){
            case 1: result=input1+input2;
            System.out.println("Result:"+result);
            break;
            case 2:result=input1-input2;
            System.out.println("Result:"+result);
            break;
            case 3:result=input1*input2;
            System.out.println("Result:"+result);
            break;
            case 4:
            if(input2!=0){result=input1/input2;
            System.out.println("Result:"+result);
            }
            else{
                System.out.println("Denominator cannot be zero");
            }
            break;
            case 5: if(input2!=0){
            result=input1%input2;
            System.out.println("Result:"+result);
            }
            else{
                System.out.println("Denominator cannot be zero");
            }
            break;
            default:System.out.println("invalid choice");

        }
    }
}







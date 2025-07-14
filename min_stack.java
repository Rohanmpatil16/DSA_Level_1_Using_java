import java.util.*;
class min_stack{
    int max=5;
    int stack[]=new int[max];
    int top=-1;
    

    void push(int val)
    {
        if(top>=max-1)
        {
            System.out.println("Stack Overflow");
        }
        else{
            stack[++top]=val;
            System.out.println("push the element:"+val);
        }
    }
    void pop()
    {
        if(top<0)
        {
            System.out.println("Stack Underflow");
        }
        else{
            int val=stack[top--];
            System.out.println("Pop the Element:"+val);
        }
    }
    void findmin()
    {
     
     if(top<0)
     {
        System.out.println("Stack is Empty and no Minimum value");
     }  
     int min=stack[0];
     for(int i=0;i<=top;i++)
     {
        if(stack[i]<min)
        {
            min=stack[i];
        }
     }
     System.out.println("Min value is:"+min);
    }

     void findmax()
     {
     if(top<0)
     {
        System.out.println("Stack is Empty and no Maximum value");
     }
     int max1=stack[0];
     for(int i=0;i<=top;i++)
     {
        if(stack[i]>max1)
        {
            max1=stack[i];
        }
     }
     System.out.println("Max value is:"+max1);
    }
    public static void main(String[] args) {
        min_stack s = new min_stack();
        
        Scanner sc=new Scanner(System.in);

        int choice=-1;
        while(choice !=0)
        {
            System.out.println("Enter your choice:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Find Min");
            System.out.println("4. Find Max");
            System.out.println("0. Exit");
            choice=sc.nextInt();





            switch(choice){
            case 1:
            System.out.println("Enter the Stack Elements:");
            int val=sc.nextInt();
            s.push(val);
            break;

            case 2:
            s.pop();
            break;

            case 3:
            s.findmin();
            break;

            case 4:
            s.findmax();
            break;

            case 0:
            System.out.println("Exiting...");
            break;

            default:
            System.out.println("Invalid choice. Please try again.");
            }


        }
    }


}
class Calc{
    int num1;
    int num2;
    int result;
    public Calc(int num1,int num2)
    {
        // num1=num1;//prints 0 as class variables not assigned with the values of parameter
        // num2=num2;//prints 0 as class variables not assigned with the values of parameter
        this.num1=num1;
        this.num2=num2;
    }
    public void add()
    {
        System.out.println("Inside add method");
    }
    public void add(int n)//Method overloading
    {
        System.out.println("Inside add mehtod "+n);
    }
}
public class OjectDemo {
    public static void main(String[] args) {
        Calc o=new Calc(4,5);
        System.out.println(o.num1);
        System.out.println(o.num2);
        o.add();
        o.add(27);
    }
    
}

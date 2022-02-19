class Emp
{
    int eid;
    int salary;
    static String ceo;
    static{
        System.out.println("Inside 1st static block");
         ceo="Larry";//all objects share the same class variable or Variable is same for all the objects 
    }
    static{
        System.out.println("In 2nd static block");
    }
    Emp()
    {   eid=1;
        salary=1000;
        System.out.println("Inside Emp constructor");
    }
    
    public void show()
    {
        System.out.println(eid+" "+salary+": "+ceo);
    }
}
public class StaticDemo {

    //int i=0; cannot be accessed inside main 
    static int i;
    public static void main(String[] args) {
        //Main method is static ,hence we dont need an object to call the main method
        //i=9;gives error  Cannot make a static reference to the non-static field i
        i=9;
        Emp navin=new Emp();
        Emp Rahul=new Emp();
        // navin.eid=8;
        // navin.salary=1000;
        // navin.ceo="Mahesh";
        // Rahul.eid=9;
        // Rahul.salary=2000;
        // Emp.ceo="Aditya";//can use object name or class name for static variale
        navin.show();
        Rahul.show();
    }
    
}

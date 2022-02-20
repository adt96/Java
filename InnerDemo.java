class Outer
{
    int a;
    public void show()
    {

    }
    // class Inner{ //Member Class
    //     public void display() {
            
    //     }
    // }
    static class Inner{//Static class
        public void display() {
            
        }
    }
}
public class InnerDemo {
    public static void main(String[] args) {
        Outer obj=new Outer();
        obj.show();
       // Outer.Inner obj1=obj.new Inner();if the inner class is a static class then object is not needed
       Outer.Inner obj1=new Outer.Inner();
        obj1.display();

    }
}

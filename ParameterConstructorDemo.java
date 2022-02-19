class ParameterConstructorDemo{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    ParameterConstructorDemo(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    ParameterConstructorDemo s1 = new ParameterConstructorDemo(111,"Karan");  
    ParameterConstructorDemo s2 = new ParameterConstructorDemo(222,"Aryan");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}  
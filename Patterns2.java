public class Patterns2 {
   
    public static void main(String[] args) {
    //  *****
    // *****
    // *****
    // *****
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {System.out.print("*");}
            System.out.println();
        }

    //  *****
    //  *   *
    //  *****   
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=5;j++)
        {
          if(i==1 || j==1 ||i==4 || j==5){System.out.print("*");}
          else{System.out.print(" ");}  
        }
        System.out.println();
    }
    // *
    // ** 
    // ***
    // ****
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    } 

    /* 
    ****
    ***
    **
    *
    */

    for(int i=1;i<=4;i++)
    {
        for(int j=4;j>=i;j--)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    /*
    _ _ _*
    _ _* *
    _ * * *
    * * * *
    */
    for(int i=1;i<=4;i++)
    {
        // for spaces
        for(int j=1;j<=4-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }


    /*
    1
    22
    333
    4444
     */
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(i);
        }
        System.out.println();
    }

     /*
    1111
    2222
    3333
    4444
     */
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=4;j++)
        {
            System.out.print(i);
        }
        System.out.println();
    }

    /*
    1
    12
    123
    1234
    */
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }


    /*
    12345
    1234
    123
    12
    1
    */
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=6-i;j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
     /*
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
    */
    int n=5;
    int k=1;
    for(int i=1;i<=n;i++)
    {  
        for(int j=1;j<=i;j++)
        {  
            System.out.print(k);
            k++;
        }
        
        System.out.println();
    }

    /*
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
    */
    
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {  int sum=i+j;
        if(sum%2==0){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
        }
        System.out.println();
    }

    
        
    }
   
    
}

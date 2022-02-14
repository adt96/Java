public class AdvancedPattern {
    public static void main(String[] args) {

        /*
        Butterfly pattern

        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *

        */
        int n=5;
        //UPPER HALF
        for(int i=1;i<=n;i++)
        {   //1st star pattern
            for(int j=1;j<=i;j++)
            {
               System.out.print("*");
            }
            
            //space=2*(n-i)
            for(int j=1;j<=2*(n-i);j++)
            {
               System.out.print(" ");
            }

            //2nd row of spaces
            for(int j=1;j<=i;j++)
            {
               System.out.print("*");
            }
            System.out.println();

        }
        
        //LOWER HALF
         n=5;
         for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
  
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
  
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
        //alternate method 
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=n;j>=i;j--)
        //     {
        //         System.out.print("*");
        //     }
        //     //spaces
        //     for(int j=n+2;j>=2*(n-i);j--)
        //     {
        //         System.out.print(" ");
        //     }
        //     //3rd set of stars
        //     for(int j=n;j>=i;j--)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }
        
        /* Pattern 2 

        ____*****
        ___*****
        __*****
        _*****
        *****
        
        */
        n=5;
        for(int i=1;i<=n;i++)
        {
            //spaces ->4 ,3,2,1,0
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();

            //stars->5,5,5,5,5
            //newline
        }

        /*
        Pattern 3

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
        

        */

        n = 5;
 
       for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
 
           //numbers
           for(int j=1; j<=i; j++) {
               System.out.print(i+" ");
           }
           System.out.println();
        }

        n = 5;
       for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
 
           //first part
           for(int j=i; j>=1; j--) {
               System.out.print(j);
           }
 
           //second part
           for(int j=2; j<=i; j++) {
               System.out.print(j);
           }
           System.out.println();
       }

       n = 5;
 
       //upper part
       for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
 
       //lower part
       for(int i=n; i>=1; i--) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }





        
    }
    
}

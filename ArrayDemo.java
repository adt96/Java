public class ArrayDemo {
    public static void main(String[] args) {
        //2d array
        int a[]={1,2,3};
        int b[]={4,5,6};
        int c[]= {7,8,9};
        int d[][]={
            a,b,c
        };
        for(int i=0;i<d.length;i++)
        {
            for(int j=0;j<d.length;j++)
            {
                System.out.print(d[i][j]);
            }
            System.out.println();
        }

        //jagged array
        int a1[]={1,2,3};
        int b1[]={4,5};
        int c1[]={6};
        int d1[][]={
            a1,b1,c1
        };

        for(int i=0;i<d1.length;i++)
        {
            for(int j=0;j<d1[i].length;j++)
            {
                System.out.print(d1[i][j]);
            }
            System.out.println();
        }
        int a2[]={1,2,3,4};
        for(int k:a2){
            System.out.println(k);
        }

        //Emhanced For loop for 2D Arrays 
        for(int k[]:d)
        {
            for(int l:k)
            {
                System.out.print(l);
            }
            System.out.println();
        }

    }
    
}

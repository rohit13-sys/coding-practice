public class BasicPattern {

    public static void main(String[] args) {

        int n=4,m=5;

        System.out.println();
        System.out.println("Pattern : 1");
        System.out.println();
//            *****
//            *****
//            *****
//            *****
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern : 2");
        System.out.println();
//        *****
//        *   *
//        *   *
//        *****


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern : 3");
        System.out.println();
//        *
//        **
//        ***
//        ****

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern : 4");
        System.out.println();
//        ****
//        ***
//        **
//        *

        for (int i = n; i >=1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("Pattern : 5");
        System.out.println();
//           *
//          **
//         ***
//        ****

        System.out.println("pattern: 6");
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("pattern : 7");


        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("pattern : 8");

        n=5;
        for(int i=1;i<=5;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

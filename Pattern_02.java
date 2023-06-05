public class Pattern_02 {
    public static void hollow_rectangle(int total_rows, int total_columns){
        for (int i = 1; i <= total_rows; i++){
            for(int j = 1; j <= total_columns; j++){
                if(i == 1 || i == total_rows || j == 1 || j == total_columns){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
    public static void inverted_half_pryamid(int lines) {
        for(int i = 1; i <= lines; i++){
            for(int j = 1; j <= lines - i; j++){ // spaces
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_withNumbers(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int n){
        int counter = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void Triangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        // first half
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){// for stars
                System.out.print("*");
            }         
            for(int j = 1; j <= 2*(n-i); j++){// for spaces
                System.out.print(" ");
            }   
            for(int j = 1; j <= i; j++){// for stars
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){// for stars
                System.out.print("*");
            }       
            for(int j = 1; j <= 2*(n-i); j++){// for spaces
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){// for stars
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rhombus(int n){
        for(int i = 1; i <= n; i++){
            // for spaces
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            // for stars
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for(int i = 1; i <= n; i++){
            // for spaces
            for(int j = 1; j <=(n-i); j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        // first half
        for(int i = 1; i <= n; i++){
            // for spaces
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for(int i = n; i >= 1; i--){
            // for spaces
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(10, 8);
        inverted_half_pryamid(9);
        inverted_half_pyramid_withNumbers(5);
        floyd_triangle(6);
        Triangle(6);
        butterfly(6);
        rhombus(7);
        hollow_rhombus(7);
        diamond(7);
    } 
}

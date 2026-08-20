public class Loops {
    public static void main(String[] args) throws Exception {
            int i = 1; 
            int j = 1;

        while (i <= 5){
            System.out.println(i);
            i++;
        }

        System.out.println();

        do{
            System.out.println("Hi" + j);
            j++;
        }while(j < 2);

          System.out.println();

        for(int k = 1; k <= 5; k++){
            System.out.println(); 
            System.out.println("Day" + k);
            for (int l = 1; l <= 9 ; l++){
                System.out.println("Hour" + l);
            }
        }

    }    
    
}

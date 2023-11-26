import java.io.IOException;
import java.util.Scanner;

//Developed by: @LucasMarcuzo

public class Main{

    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        float[][] x = new float[12][12];
        float total = 0;

        char tipo = scan.next().charAt(0);
        
        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                x[i][j] = scan.nextFloat();
            }
        }
        
        int aux = 11;
        for (int j = 0; j < 12; j++) 
        {
            for (int i = 0; i < aux; i++)
            {
                total += x[j][i]; 
            }
            aux--;
        }
        
        
        if (tipo == 'S')
        {
            System.out.printf("%.1f\n",total);
        }
        else if (tipo == 'M')
        {
            System.out.printf("%.1f\n",total/66.0f);
        }


        scan.close();
    
    }
	
}
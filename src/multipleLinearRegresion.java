import java.text.DecimalFormat;
public class multipleLinearRegresion {
    private double b=0;
    private double c=0;
    private int i=0;


    public void predicciones(double[] productoMatrizA, double[] nuevosVX1, double[] nuevosVX2) {
        for ( i = 0; i < 5; i += 1) {
            b = nuevosVX1[i];
            c = nuevosVX2[i];
            double res = (productoMatrizA[0] + productoMatrizA[1] * b + productoMatrizA[2] * c);
            System.out.println("ŷ = " + productoMatrizA[0] + " + " + productoMatrizA[1] + " ( " + b + " ) + " + productoMatrizA[2] + " ( " + c + " ) = " + res);

        }
    }
}
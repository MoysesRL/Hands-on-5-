public class linearAlgebra {


    public double[][] calcularInversa(double[][] matriz) {
        double det = matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
                - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
                + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);

        double[][] inversa = new double[3][3];

        inversa[0][0] = (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1]) / det;
        inversa[0][1] = (matriz[0][2] * matriz[2][1] - matriz[0][1] * matriz[2][2]) / det;
        inversa[0][2] = (matriz[0][1] * matriz[1][2] - matriz[0][2] * matriz[1][1]) / det;
        inversa[1][0] = (matriz[1][2] * matriz[2][0] - matriz[1][0] * matriz[2][2]) / det;
        inversa[1][1] = (matriz[0][0] * matriz[2][2] - matriz[0][2] * matriz[2][0]) / det;
        inversa[1][2] = (matriz[0][2] * matriz[1][0] - matriz[0][0] * matriz[1][2]) / det;
        inversa[2][0] = (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]) / det;
        inversa[2][1] = (matriz[0][1] * matriz[2][0] - matriz[0][0] * matriz[2][1]) / det;
        inversa[2][2] = (matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0]) / det;

        return inversa;
    }


    public double[] productoMatrizA(double[][] matriz, double[] a) {
        double[] resultado = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            double suma = 0.0;
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j] * a[j];
            }
            resultado[i] = suma;
        }

        return resultado;
    }
}
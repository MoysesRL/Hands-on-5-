import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class MathAgent extends Agent {

    protected void setup(){
        System.out.println("Agent " + getLocalName() + " started ");

        addBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
                dataSet data = new dataSet();
                discreteMathematics discretas = new discreteMathematics();
                linearAlgebra algebra = new linearAlgebra();
                Print print = new Print();
                multipleLinearRegresion linealRegresion = new multipleLinearRegresion();

                double[] x1 = data.x1;
                double[] x2 = data.x2;
                double[] y = data.y;

                double sumatoriaX1 = discretas.sumatoria(x1);
                double sumatoriax2 = discretas.sumatoria(x2);
                double sumatoriaY = discretas.sumatoria(y);
                double sumatoriaExponencialX1 = discretas.sumatoriaExponencial(x1);
                double sumatoriaExponencialX2 = discretas.sumatoriaExponencial(x2);
                double sumatoriaProductosX1X2 = discretas.sumatoriadeProductos(x1, x2);
                double sumatoriaProductosX1Y = discretas.sumatoriadeProductos(x1, y);
                double sumatoriaProductosX2Y = discretas.sumatoriadeProductos(x2, y);

                double[][] matrix = {
                        {x1.length, sumatoriaX1, sumatoriax2},
                        {sumatoriaX1, sumatoriaExponencialX1, sumatoriaProductosX1X2},
                        {sumatoriax2, sumatoriaProductosX1X2, sumatoriaExponencialX2}
                };

                double[][] inversa = algebra.calcularInversa( matrix);

                double []b={sumatoriaY,sumatoriaProductosX1Y,sumatoriaProductosX2Y};

                double[] productoMatrizA = algebra.productoMatrizA(inversa,b);

                System.out.println("\n");

                print.imprimirPorRenglones2(productoMatrizA);
                print.imprimirPorRenglones(productoMatrizA);

                double[] nuevosVX1= {77.8, 80, 47.3, 92, 52.8};
                double[] nuevosVX2= {32.9, 33.3, 29.9, 34.5, 30.8};

                System.out.println("\nPredicciones: ");

                linealRegresion.predicciones(productoMatrizA, nuevosVX1,nuevosVX2);
            }
        });

    }
}
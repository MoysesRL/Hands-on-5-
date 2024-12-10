public class discreteMathematics  {


    public double sumatoria(double[] a){
        double r=0;
        for(int i =0; i<a.length; i++){
            r +=a[i];
        }
        return r;
    }

    public double sumatoriadeProductos(double[] a, double[] b){
        double r=0;
        for(int i =0; i<a.length; i++){
            r +=a[i]*b[i];
        }
        return r;
    }

    public double sumatoriaExponencial(double[] a){
        double r=0;
        for(double num:a){
            r +=Math.pow(num,2);
        }
        return r;
    }


}
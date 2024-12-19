
public class Calculadora extends OperacionesMatematicas{
    private double resultado;
    @Override
    public double sumar(double numero, double numero2) {
        resultado = numero + numero2;
        return resultado;
    }

    @Override
    public double restar(double numero, double numero2) {
        if(numero2 == 0){
            return 0;
        }
        resultado = numero -  numero2;
        return resultado;

    }

    @Override
    public double dividir(double numero, double numero2)throws Exception {
        if(numero2 == 0){
            throw new Exception("No se puede dividir entre 0");
        }
        resultado = numero /  numero2;
        return resultado;

    }

    @Override
    public double multiplicar(double numero, double numero2) {
        resultado = numero * numero2;
        return resultado;
    }

    public double getResultado() {
        return resultado;
    }

}

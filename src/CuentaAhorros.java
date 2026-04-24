
// hija ereda de padre
public class CuentaAhorros extends CuentaBancaria{
    private double tasaInteresMensual;
    private double saldoMinimo;

    public CuentaAhorros(String numeroCuenta, String titular, double saldo, double tasaInteresMensual, double saldoMinimo){
        super(numeroCuenta,titular,saldo); // se llama los metodos
        this.tasaInteresMensual = tasaInteresMensual;
        this.saldoMinimo = saldoMinimo;
    }

    // sobre escribimos el metodo describir
    @Override
    public String describir(){
        return super.describir() + "| Tasa mensula: " + tasaInteresMensual + "%";
    }

    @Override
    public  double calcularComision(){
        if(getSaldo() >= saldoMinimo ){
            return 0.0;
        }else {
            return 12000.0;
        }
    }



    public void realizarRetiro(double monto, boolean esUrgente){
       double nuevoSaldo = getSaldo() - monto;
        if(esUrgente && getSaldo() < saldoMinimo){
            nuevoSaldo-= calcularComision();
        }
        setSaldo(nuevoSaldo);
    }


    public double calcularInteresDelMes(){
        return getSaldo() * tasaInteresMensual / 100;
    }

}

public class CuentaBancaria {
    private String numeroCueta;
    private  String titular;
    private double saldo;  //protegidos solo se pueden usar dentro de la clase

    public CuentaBancaria(String numeroCueta, String titular, double saldo){
          this.numeroCueta = numeroCueta;
          this.titular = titular;
          this.saldo = saldo;
    }

    // me permite leer los valores desde afuera asi enten provados
    public String getNumeroCueta(){
        return numeroCueta;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    // solo las clases estendidas puede usar esta
    protected void setSaldo(double nuevoSaldo){
        this.saldo = nuevoSaldo;
    }

    public String describir(){
          return "Cuenta: "+ numeroCueta + " Titular: " + titular + " Saldo: " + saldo;
    }

    public double  calcularComision(){
        return 0.0;
    }

    // no debuelve nada solo realiza el retiro void
    public void realizarRetiro(double monto){
        setSaldo(getSaldo() - monto);
    }
}

public class CuentaCorriente extends CuentaBancaria{

      private double comisionPorTransaccion;
      private double limiteSobregiro;

      public CuentaCorriente(String numeroCuenta, String titular, double saldo, double comisionPorTransaccion, double limiteSobregiro){
          super(numeroCuenta,titular,saldo);
          this.comisionPorTransaccion = comisionPorTransaccion;
          this.limiteSobregiro = limiteSobregiro;
      }

    @Override
    public String describir(){
        return super.describir() + "| Comision por transaccion: $" + comisionPorTransaccion;

    }

    @Override
    public  double calcularComision(){
        return comisionPorTransaccion;
    }

    @Override
    public void realizarRetiro(double monto){
          double totalRetiro = monto + calcularComision();
          double nuevoSaldo = getSaldo() - totalRetiro;

          if (nuevoSaldo < -limiteSobregiro){
              System.out.println("Retiro no permitido, superaste el limite");
          } else {
              setSaldo(nuevoSaldo);
          }
    }

}

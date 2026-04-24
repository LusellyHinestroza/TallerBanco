//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args){
                CuentaBancaria cuenta_1 = new CuentaAhorros(
                        "01",
                        "Marta",
                        600000.0,
                        1.5,
                        200000
                );
                System.out.println(cuenta_1.describir());
                System.out.println(cuenta_1.calcularComision());
                cuenta_1.realizarRetiro(500000.0);
                System.out.println(cuenta_1.getSaldo());
                CuentaBancaria cuenta_2 = new CuentaCorriente(
                        "02",
                        "Pedro",
                        300000,
                        50000,
                        10000
                );
                System.out.println(cuenta_2.describir());
                System.out.println(cuenta_2.calcularComision());
                cuenta_2.realizarRetiro(500000.0);
                System.out.println(cuenta_2.getSaldo());

                CuentaBancaria cuenta_3 = new CuentaInversion(
                        "03",
                        "Martin",
                        100000,
                        8.0,
                        12,
                        20000
                );
                System.out.println(cuenta_3.describir());
                System.out.println(cuenta_3.calcularComision());
                cuenta_3.realizarRetiro(500000.0);
                System.out.println(cuenta_3.getSaldo());

                // utilizamos la clase padre para poder referirnos a la hija.


        }
}

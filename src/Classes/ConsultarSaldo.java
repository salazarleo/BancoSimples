package Classes;

public class ConsultarSaldo {
    double saldo = 0;

    public void consultsald(){
        System.out.println("Saldo: R$ " + saldo);
    }

    public double getsaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}

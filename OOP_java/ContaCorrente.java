package OOP;

public class ContaCorrente extends Conta{

    @Override
    public void extrato() {
        System.out.println("=== Extrato conta corrente: ");
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Numero: %d", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.saldo));
    }
}

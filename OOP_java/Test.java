package OOP;

public class Test {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        cc.depositar(3.4);
        cc.transferir(1, cp);
        cc.extrato();

        cp.depositar(43.5);
        cp.extrato();
    }
}

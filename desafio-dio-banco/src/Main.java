public class Main {
    public static void main(String[] args){

        Cliente joana = new Cliente();
        joana.setNome("Joana");

        Conta cc = new ContaCorrente(joana);
        Conta poupanca = new ContaPoupanca(joana);

        cc.depositar(100);
        cc.transferir(50,poupanca);
        poupanca.depositar(200);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");

        Conta corrente = new ContaCorrente(pedro);
        Conta cp = new ContaPoupanca(pedro);

        corrente.depositar(1000);
        corrente.transferir(250,cp);

        corrente.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
package POOGG.Aula05;

public class POOAula05GG {
    public static void main(String[] args){
        ContaBanco conta1 = new ContaBanco("Jubileu","CP");
        // Teste das funções
            conta1.info();
            conta1.abrirConta();
            conta1.info();
            conta1.abrirConta();
            conta1.depositar(1000);
            conta1.info();
            conta1.pagarMensal();
            conta1.info();
            conta1.sacar(1200);
            conta1.sacar(1130);
            conta1.info();
            conta1.fecharConta();
            conta1.info();
            conta1.depositar(10);
            conta1.sacar(10);
            conta1.pagarMensal();
    }
}

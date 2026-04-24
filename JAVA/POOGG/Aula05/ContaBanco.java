package POOGG.Aula05;
import java.util.Random;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;



    public ContaBanco(String d, String t) {
        this.setTipo(t);
        this.setDono(d);
        this.setSaldo(0);
        this.setStatus(false);

        Random random = new Random();
        this.setNumConta(random.nextInt(10000));

    }

    public int getNumConta(){
        return this.numConta;
    }

    private void setNumConta(int n){
        this.numConta = n;
    }

    public String getTipo(){
        return this.tipo;
    }

    private void setTipo(String t){
        this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }

    private void setDono(String d){
        this.dono = d;
    }

    public float getSaldo(){
        return this.saldo;
    }

    private void setSaldo(float s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean stat){
        this.status = stat;
    }

    public void abrirConta(){
        if(this.getStatus()){
            System.out.println("Erro: Esta conta já está aberta!");
        }
        else{
            if("CC".equals(this.getTipo())){
                this.setStatus(true);
                this.setSaldo(50);
                System.out.println("Conta aberta com sucesso!");
            }
            else if("CP".equals(this.getTipo())){
                this.setStatus(true);
                this.setSaldo(150);
                System.out.println("Conta aberta com sucesso!");
            }
            else{
                    System.out.println("Tipo inválido! Apenas CC ou CP são permitidos.");
            }
        }

    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro, não posso fechar!");
        }
        else if (this.getSaldo() < 0){
            System.out.println("Conta em débito, não posso fechar!");
        } else{
           this.setStatus(false);
        }
    }

    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito de R$"+ v + " realizado na conta de " + this.getDono());
        }
        else{
            System.out.println("Impossível depositar com uma conta fechada!");
        }
    }

    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque de R$"+ v + " realizado na conta de " + this.getDono());
            }
            else{
                System.out.println("Saldo insuficiente para saque!");
            }
        }
        else{
            System.out.println("Não é possivel sacar de uma conta fechada!");
        }
    }

    public void pagarMensal() {
        int valor = 0; // Variável auxiliar

        if ("CC".equals(this.getTipo())) {
            valor = 12;
        } else if ("CP".equals(this.getTipo())) {
            valor = 20;
        }

        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade de R$" + valor + " paga com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível pagar de uma conta fechada!");
        }
    }

    public void info(){
        System.out.println("INFORMAÇÕES DA CONTA");
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Status: " + this.getStatus());
        System.out.println("Saldo: R$" + this.getSaldo());
    }
}

package POOGG.Aula03;
public class POOAula03GG {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;    - privado
        c1.carga = 80;
        //c1.tampada = false; - privado
        c1.tampar();
        c1.status();
        c1.rabiscar();

    }
}

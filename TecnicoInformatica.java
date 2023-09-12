public class TecnicoInformatica extends Pessoa implements Tecnico {
    public void area(){
        System.out.println(getNome() + " é técnico de informática");
    }
}

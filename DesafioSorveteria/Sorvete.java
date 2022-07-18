package DesafioSorveteria;
public class Sorvete {
    TipoSorvete tipoSorvete;
    String sabor;

    public Sorvete(TipoSorvete tipoSorvete, String sabor) {
        this.tipoSorvete = tipoSorvete;
        this.sabor = sabor;
    }

    public void degustar() {
        System.out.println("Esse sorvete de " + this.tipoSorvete + " é do sabor de " + this.sabor);
    }
}

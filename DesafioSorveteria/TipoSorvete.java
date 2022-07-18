package DesafioSorveteria;
public enum TipoSorvete {
    COPO("massa no COPO"),
    PALITO("palito"),
    CONE("massa no CONE");

    private final String getTipoSorveteString;

    TipoSorvete(String sorveteString) {
        getTipoSorveteString = sorveteString;
    }

    @Override
    public String toString() {
        return getTipoSorveteString;
    }
}

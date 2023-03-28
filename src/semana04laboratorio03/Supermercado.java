package semana04laboratorio03;
public class Supermercado {
    private String nombre;
    private int codigo;
    private String nomGerente;
    private int totalVentasSem;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomGerente() {
        return nomGerente;
    }

    public void setNomGerente(String nomGerente) {
        this.nomGerente = nomGerente;
    }

    public int getTotalVentasSem() {
        return totalVentasSem;
    }

    public void setTotalVentasSem(int totalVentasSem) {
        this.totalVentasSem = totalVentasSem;
    }
    
}
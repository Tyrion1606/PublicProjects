package Domain;

public class Curso extends Conteudo{

    private int cargaHoraria;

    // CONSTRUCTOR
    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        setDescricao(descricao);
        setTitulo(titulo);
    }
    // GETTERS AND SETTERS
    public int getCargaHoraria() {return cargaHoraria;}
    public void setCargaHoraria(int cargaHoraria) {this.cargaHoraria = cargaHoraria;}

    // CLASS METHODS
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
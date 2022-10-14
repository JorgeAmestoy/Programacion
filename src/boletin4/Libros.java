package boletin4;

public class Libros {

    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    public Libros() {

    }

    public Libros(String tit, String aut, int year, short numPag) {
        titulo = tit;
        autor = aut;
        ano = year;
        numPaginas = numPag;
        //si hubiese llamado igual seria this.titulo = titulo; para distinguir

    }

    public void setTitulo(String tit) {
        titulo = tit;

    }

    public String getTitulo(String tit) {
        return titulo;
    }

    public void setAutor(String aut) {
        autor = aut;

    }

    public String getAutor(String aut) {
        return autor;
    }

    public void setAno(int year) {
        ano = year;
    }

    public int getAno(int year) {
        return ano;
    }

    public void setNumPaginas(short numPag) {
        numPaginas = numPag;
    }

    public short getNumPaginas(short numPag) {
        return numPaginas;
    }

    public void setValoracion(float valor) {
        valoracion = valor;

    }

    public float getValoracion(float valor) {
        return valoracion;
    }
    public void mostrar (){
       System.out.println("titulo" +titulo+ "autor" +autor+ "ano" +ano+ "numero paginas" +numPaginas+ "valoracion" +valoracion);
       
    }
}

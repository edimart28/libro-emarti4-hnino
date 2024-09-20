package co.com.bdb.project.libros;

public class Libros {

    String titulo;
    String autor;
    int paginas;
    int AñoPublicacion;

    public Libros(String titulo, String autor, int paginas, int AñoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.AñoPublicacion = AñoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPublicacion() {
        return AñoPublicacion;
    }

    public void setPublicacion(int publicacion) {
        this.AñoPublicacion = publicacion;
    }


    public void mostrarDatosLibro(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("Publicacion: " + AñoPublicacion);


    }
}

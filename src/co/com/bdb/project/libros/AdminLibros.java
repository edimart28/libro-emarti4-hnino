package co.com.bdb.project.libros;

public class AdminLibros {
    public static void main(String[] args) {

        Libros libroUno = new Libros("Principito", "Juan", 200, 1995);
        Libros libroDos = new Libros("Pinocho", "Pedro", 182, 1985);

        System.out.println("-----------------------------------");
        System.out.println("Libro 1:");
        libroUno.mostrarDatosLibro();
        System.out.println("-----------------------------------");

        System.out.println("Libro 2:");
        libroDos.mostrarDatosLibro();
        System.out.println("-----------------------------------");


        libroUno.setPaginas(120);
        System.out.println("Libro 1 Actualizado:");
        libroUno.mostrarDatosLibro();


    }
}

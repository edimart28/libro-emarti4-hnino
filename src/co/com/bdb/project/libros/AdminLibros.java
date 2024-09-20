package co.com.bdb.project.libros;

public class AdminLibros {
    public static void main(String[] args) {

        Libros libroUno = new Libros("Cien años de soledad", "Gabriel García Marquez", 125,1967);
        Libros libroDos = new Libros("Delirio", "Laura Restrepo", 89,2004);
        Libros libroTres = new Libros("El olvido que seremos", "Héctor Adad Faciolince", 225,2006);




        System.out.println("-----------------------------------");
        System.out.println("Libro 1:");
        libroUno.mostrarDatosLibro();
        System.out.println("-----------------------------------");

        System.out.println("Libro 2:");
        libroDos.mostrarDatosLibro();
        System.out.println("-----------------------------------");

        System.out.println("Libro 3:");
        libroTres.mostrarDatosLibro();
        System.out.println("-----------------------------------");


        libroUno.setPaginas(120);
        System.out.println("Libro 1 Actualizado:");
        libroUno.mostrarDatosLibro();


    }
}

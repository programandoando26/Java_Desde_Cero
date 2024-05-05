public class Comentarios {
    public static void main(String[] args) {
        // esto es un comentario de linea

        /*esto es un texto de prueba
        para mostrar un comentario de
        multiples lineas
        */
        System.out.println("");
        System.out.println("//\033[39;49m \033[31m  esto es un comentario de linea");
        System.out.println("");

        System.out.println("\033[39;49m/*");

        System.out.println("\033[36mesto es un texto de prueba");
        System.out.println("para mostrar un comentario de ");
        System.out.println("multiples lineas");
        System.out.println("\033[39;49m*/");
    }
}

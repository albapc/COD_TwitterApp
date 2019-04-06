package proyectotwitter;

import javax.swing.JOptionPane;
import twitter4j.TwitterException;

/**
 *
 * @author aperezcesar
 */
public class ProyectoTwitter {

    /**Método principal que contiene el menú principal, a través del cual se 
     * utilizan los métodos pertenecientes a la otra clase dependiendo de la
     * opción que elija el usuario.
     * 
     * @param args the command line arguments
     * @throws twitter4j.TwitterException
     */
    public static void main(String[] args) throws TwitterException {
        TwitterClass tw = new TwitterClass();
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "**********MENÚ**********\n"
                    + "Introduce una opción:\n"
                    + "1.- Publicar un tuit\n"
                    + "2.- Mostrar tu línea del tiempo (timeline)\n"
                    + "3.- Buscar tuits\n"
                    + "0.- Salir"));

            switch (opcion) {
                case 1:
                    tw.tuitear();
                    break;
                case 2:
                    tw.mostrarTimeline();
                    break;
                case 3:
                    tw.buscarTuits();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.\n"
                            + "Introduce un número del 0 al 3.");
            }
        } while (opcion != 0);
    }

}

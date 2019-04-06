package proyectotwitter;

import java.util.List;
import javax.swing.JOptionPane;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author Alba
 */
public class TwitterClass {

    /** Método para que el usuario introduzca el mensaje que desea publicar en su
     * perfil de Twitter como estado
     *
     * @throws TwitterException lanza una excepción en caso de que haya un error
     * durante la publicación del tuit (método updateStatus)
     */
    public void tuitear() throws TwitterException {
        String latestStatus = JOptionPane.showInputDialog("Introduce el tuit que deseas publicar");
        Twitter twitter = TwitterFactory.getSingleton();
        Status status = twitter.updateStatus(latestStatus);
        System.out.println("Actualizado con éxito el estado: [" + status.getText() + "].");
    }

    /** Método para que el usuario pueda ver la línea del tiempo que hay en la página
     * principal de su cuenta
     *
     * @throws TwitterException lanza una excepción en caso de que haya un error
     * durante el uso de la API
     */
    public void mostrarTimeline() throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        List<Status> statuses = twitter.getHomeTimeline();
        System.out.println("Mostrando línea del tiempo principal.");
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":"
                    + status.getText());
        }
    }
    
    /** Método que tiene como objetivo que el usuario pueda buscar los tuits que
     * desee a partir de las palabras clave que ese introduzca
     *
     * @throws TwitterException lanza una excepción en caso de que haya un error
     * durante el uso de la API
     */
    public void buscarTuits() throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        Query query = new Query(JOptionPane.showInputDialog("Introduce tu búsqueda en Twitter"));
        QueryResult result = twitter.search(query);
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
        }
    }
}


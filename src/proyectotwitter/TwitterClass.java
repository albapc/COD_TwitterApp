package proyectotwitter;

import javax.swing.JOptionPane;
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
     * @throws TwitterException lanza una excepción en caso de que haya un error durante
     * la publicación del tuit (método updateStatus)
     */
    public void tuitear() throws TwitterException {
        String latestStatus = JOptionPane.showInputDialog("Introduce el tuit que deseas publicar");
        Twitter twitter = TwitterFactory.getSingleton();
        Status status = twitter.updateStatus(latestStatus);
        System.out.println("Successfully updated the status to [" + status.getText() + "].");
    }
    
    
}

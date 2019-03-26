package proyectotwitter;

import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author aperezcesar
 */
public class ConfiguracionCuenta {

    /**
     * Método que sincroniza la cuenta que deseemos con la aplicación, mediante
     * la inserción de los tokens y claves de acceso
     */
    public void configurarClaves() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("*********************")
                .setOAuthConsumerSecret("******************************************")
                .setOAuthAccessToken("**************************************************")
                .setOAuthAccessTokenSecret("******************************************");
    }
}

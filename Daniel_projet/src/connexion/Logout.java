
package connexion;

import connexion.Login;
import javax.swing.JFrame;

/**
 *
 * @author danieljoaquimpaulino
 */
public class Logout {
    
    public static void logOut(JFrame context, Login loginScreen){
        
    
        context.setVisible(false);
        loginScreen.setVisible(true);
}
}
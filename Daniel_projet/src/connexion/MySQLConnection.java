
package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author danieljoaquimpaulino
 */
public class MySQLConnection {
    
              
    public static Connection connecteur(){
      
                Connection connexion =null;
               
                String driver = "com.mysql.jdbc.Driver";
                String url ="jdbc:mysql://localhost:8889/G_Etudiant";
                String username="danny";
                String password="d012345";
                      
        
                
                try{
                
                 Class.forName(driver);

                 connexion = DriverManager.getConnection(url, username, password);

                return connexion;
                
                }catch(Exception ex){
                
        
               return null;
                
                }
               
          
    }
    
    
   
}


/**
 *
 * @author fathi
 */
public class Main {

    public static void main(String[] args) {
        SQL sqldb = new SQL();
        UserModel user1 = new UserModel(sqldb);
        user1.fetchUserData();
       
        System.out.print( "\n\n" );
        
        NoSQL nosqldb = new NoSQL();
        UserModel user2 = new UserModel(nosqldb);
        user2.fetchUserData();
    }
}

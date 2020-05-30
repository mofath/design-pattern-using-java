
package dependency.injection;

/**
 *
 * @author fathi
 */
public class Main {

    public static void main(String[] args) {
        DB db = new DB();
        UserModel user = new UserModel(db);
        user.fetchUserData();
    }
}

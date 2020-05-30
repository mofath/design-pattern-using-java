package dependency.injection;

/**
 *
 * @author fathi
 */
public class UserModel {

    private static DB db;

    public UserModel(DB db) {
        this.db = db;
    }

    static void fetchUserData() {
        db.connect();
        System.out.println("fetching user data...");
    }
}

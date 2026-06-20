class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Database Connection Created");
    }

    public static DatabaseConnection getInstance() {

        if (instance == null) {
            instance = new DatabaseConnection();
        }

        return instance;
    }

    public void connect() {
        System.out.println("Connected to Database");
    }
}

public class SingletonDemo {

    public static void main(String[] args) {

        DatabaseConnection db1 =
                DatabaseConnection.getInstance();

        DatabaseConnection db2 =
                DatabaseConnection.getInstance();

        db1.connect();
        db2.connect();

        System.out.println(db1 == db2);
    }
}
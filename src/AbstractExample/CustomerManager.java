package AbstractExample;

public class CustomerManager {
    private BaseDatabaseManager databaseManager;

    public void setDatabaseManager(BaseDatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public void getCustomers(){
        this.databaseManager.getData();
    }
}

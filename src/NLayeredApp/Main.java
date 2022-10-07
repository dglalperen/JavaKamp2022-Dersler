package NLayeredApp;

import NLayeredApp.business.ProductManager;
import NLayeredApp.core.logging.DatabaseLogger;
import NLayeredApp.core.logging.FileLogger;
import NLayeredApp.core.logging.Logger;
import NLayeredApp.core.logging.MailLogger;
import NLayeredApp.dataAccess.JdbcProductDao;
import NLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Iphone 11",1000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
        productManager.add(product1);
    }
}

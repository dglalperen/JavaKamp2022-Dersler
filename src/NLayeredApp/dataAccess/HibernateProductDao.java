package NLayeredApp.dataAccess;

import NLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product){
        System.out.println("Hibernate ile " + product.getName() + " veritabanina eklendi");
    }
}

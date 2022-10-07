package NLayeredApp.dataAccess;

import NLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    // sadece db erisim kodlari buraya yazilir... SQL
    public void add(Product product){
        System.out.println("JDBC ile " + product.getName() + " veritabanina eklendi");
    }
}



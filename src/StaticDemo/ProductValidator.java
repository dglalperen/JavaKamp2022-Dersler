package StaticDemo;

public class ProductValidator {
    public static boolean isValid(Product product){
        return product.price > 0 && !product.name.isEmpty();
    }

    public static void something(){
        System.out.println("Something");
    }
}

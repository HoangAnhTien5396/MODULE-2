import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {

    ArrayList<Product> products = new ArrayList<>();
    public void add(Product p){
        products.add(p);
    }
    public void update(Product product){
        for(Product p : products){
            if (product.getId() == p.getId()){
                p.setName(product.getName());
            }
        }
    }
    public void showAll(){
        for(Product p : products){
            System.out.println(p);
        }
    }
    public void delete(int id){
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId() == id) {
                    products.remove(products.get(i));
                }
            }
        }
    public void sortByPrice() {
        Collections.sort(this.products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getMoney(), p2.getMoney());
            }
        });
    }
}


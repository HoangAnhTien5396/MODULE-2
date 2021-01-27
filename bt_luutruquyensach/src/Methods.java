import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Methods {
    ArrayList<Book> books = new ArrayList<>();
    public void add (Book b){
        books.add(b);
    }
    public void delete(int id){
        for(int i = 0 ; i < books.size() ; i++){
            if (books.get(i).getId() == id){
                books.remove(books.get(i));
            }
        }
    }
    public void showAll(){
        for ( Book b : books) {
            System.out.println(b.toString());
        }
    }
    public void update(Book b){
        for (Book book : books){
            if (b.getId() == book.getId()){
                book.setName(b.getName());
            }
        }
    }
    public void search(String name){
        for (Book b : books){
            if (b.getName().equals(name)){
                System.out.println(b.toString());
            }
        }
    }
    public void Sort(){
        Collections.sort(this.books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
    }

}

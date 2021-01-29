import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Methods {
    List<Officers> officers = new ArrayList<>();

    public void add(Officers o) {
        officers.add(o);
    }

    public void showAll() {
        for (Officers o : officers) {
            System.out.println(o.toString());
        }
    }
    public void delete(String name){
        for(int i = 0 ; i < officers.size(); i++){
            if (officers.get(i).getName() == name){
                officers.remove(officers.get(i));
            }
        }
    }
    public void search(String name){
        for(Officers o : officers){
            if (o.getName().equals(name)){
                System.out.println(o.toString());
            }
        }
    }
    public void update(Officers officer){
        for (Officers o : officers){
            if (officer.getName().equals(o.getName())){
                o.setName(officer.getName());
                o.setAddress(officer.getAddress());
                o.setSex(officer.getSex());
                o.setBirthday(officer.getBirthday());

            }
        }
    }
    public void sort(){
        Collections.sort(this.officers, new Comparator<Officers>() {
            @Override
            public int compare(Officers o1, Officers o2) {
                return 0;
            }
        });
    }

}

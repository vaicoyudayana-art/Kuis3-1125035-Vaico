import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class abstract DataView<T> {
    List<T> records;
    Scanner scanner = new Scanner(System.in);

    public DataView (){
        this.records = new ArrayList<>();

    }
    
public void printAll(){

    String[] fields = this.getFields();

     for (int i = 0; i < records.length() ; i++){
        T record = records.get(i)
        String[]values = this.convertModelTotalValues(record);
        System.out.println("");
     for (int j = 0 ; j < fields.length ; j++){
        System.out.println(fields[j] + " : " + values [j]);
        }
      }
    }

public void showInsertForm() {
    String [] fields = this.getFields();
    String [] values = new String[fields.length];

    for (int j = 0; j < fields.length ; j++){
    System.out.print("Input " + fields[j] + ": ");
    values[j] = sc.nextLine();
    }

    T dataBaru = this.convertValuesToModel(values);
    reocrds.add(dataBaru);
}

public void showUpdateForm() {
    System.out.print("Input Primary Key yang akan diubah: ");
        String pk = sc.nextLine();

        for (int i = 0; i < records.length(); i++)
}
public void promptDelete(){
        for (int i = 0; i < records.size(); i++){
            T record = records.get(i);
            records.remove(i);
            return;
    }
protected abstract String getPrimaryKeyValue(T data);
protected abstract String[] getFields()
protected abstract T convertValuesToModel(String[] values);
protected abstract String[] convertModelToValues(T data)
}
)
 {








}
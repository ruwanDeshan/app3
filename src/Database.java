import java.util.ArrayList;

public class Database {
    public static ArrayList<Customer> customerDataList=new ArrayList<>();
    static {
        customerDataList.add(new Customer("4586","Nimal","Colombo",25000));
        customerDataList.add(new Customer("3289","Bnada","Galle",15000));
        customerDataList.add(new Customer("5632","Kalum","Kandy",40000));
        customerDataList.add(new Customer("7841","Saman","Jaffna",55000));
    }
}

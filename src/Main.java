import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)throws Exception {

        List<String> list = new ArrayList<String>();

        list.add("田中");
        list.add("鈴木");
        list.add("佐藤");

        System.out.println("for文");
        for (int i = 0; i <list.size(); i++){
            System.out.printf(list.get(i));
        }
    }
}
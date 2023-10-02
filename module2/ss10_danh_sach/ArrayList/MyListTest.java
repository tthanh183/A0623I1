package ss10_danh_sach.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<String>();
        myList.add(0, "a");
        myList.add(1, "b");
        myList.add(2, "c");
        myList.add(3, "d");
        myList.add(4, "e");
        myList.add(5, "f");
        myList.add(6, "g");
        myList.add(7, "h");
        myList.add(8, "i");
        myList.add(9, "j");
        myList.add(10, "k");
        myList.add(11, "l");
        for(int i = 0 ; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

}

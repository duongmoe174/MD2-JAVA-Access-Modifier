import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Book[] listBook = new Book[5];
        listBook[0] = new Book("Ban", "Duong", 20000, 20, 0.5);
        listBook[1] = new Book("Em", "Huy", 30000, 10, 1);
        listBook[2] = new Book("Cau", "Oanh", 40000, 30, 3.5);
        listBook[3] = new Book("May", "Duong", 50000, 40, 4);
        listBook[4] = new Book("Tui", "Duong", 60000, 70, 2);

        int sumQuantity = 0;
        int sumWeight = 0;
        for (int i = 0; i < listBook.length; i++) {
            sumQuantity += listBook[i].getNumber();
            sumWeight += listBook[i].getWeight();
        }
        System.out.println("Tổng số lượng sách là: " + sumQuantity);
        System.out.println("Tổng số lượng cân là: " + sumWeight);

        System.out.println("nhập tên sách cần tìm kiếm: ");
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();

//        for (int i = 0; i < listBook.length; i++) {
//            if (listBook[i].getName().equals(name)) {
//                System.out.println("Thông tin sách: " + listBook[i].getName() + " " + listBook[i].getAuthor() + " " + listBook[i].getPrice());
//                break;
//            }
//        }
        findBook(listBook, name);
    }
    public static void findBook (Book[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(name)) {
                System.out.println("Tìm thấy sách r nè!");
                break;
            }
        }
    }
}

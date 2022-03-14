//package on_tap.customer_manager.controlers;
//
//import on_tap.customer_manager.service.CustomerServiceImpl;
//import on_tap.customer_manager.service.ICustomerService;
//
//import java.util.Scanner;
//
//public class MainMenu {
//    private static   ICustomerService customerService = new CustomerServiceImpl();
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean flag = true;
//        do {
//            System.out.println("Main Menu: \n" +
//                    "1. add\n" +
//                    "2. display\n" +
//                    "3.edit\n" +
//                    "4.delete\n" +
//                    "5.search\n" +
//                    "6.exit\n");
//            System.out.println("Chọn chức năng");
//            int chooseMenu = Integer.parseInt(scanner.nextLine());
//            switch (chooseMenu) {
//                case 1:
//                    //chức năng thêm ới
//                     customerService.add();
//                    break;
//                case 2:
//                    //chức năng hiện thi
//                    System.out.println("display danh sách sinh viên");
//                     customerService.display();
//                    break;
//                case 3:
//                    //chức năng thêm sửa
//                    System.out.println("edit");
//                    break;
//                case 4:
//                    //xóa
//                    System.out.println("delete");
//                    break;
//                case 5:
//                    //chức năng tìm kiếm
//                    System.out.println("search");
//                    break;
//                default:
//                    flag = false;
//
//            }
//        } while (flag);
//    }
//}

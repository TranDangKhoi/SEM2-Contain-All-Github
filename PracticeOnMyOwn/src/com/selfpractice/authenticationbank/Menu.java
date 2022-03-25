package com.selfpractice.authenticationbank;

public class Menu {
    public static void mainMenu (){
    System.out.println("Lựa chon: ");
    System.out.println("1 - Đăng nhập");
    System.out.println("2 - Đăng ký");
    System.out.println("3 - Thoát chương trình");
    System.out.println("Lựa chọn của bạn là: ");
    }

    public static void loginFailMenu(){
        System.out.println("Sai password, bạn muốn thực hiện: ");
        System.out.println("1 - Đăng nhập lại");
        System.out.println("2 - Quên mật khẩu");
        System.out.print("Lựa chọn của bạn là: ");
        
    }

    public static void loginSuccessMenu(){
        System.out.println("1 - Thay đổi mật khẩu");
        System.out.println("2 - Kiểm tra số dư");
        System.out.println("3 - Chuyển tiền");
        System.out.println("4 - Rút tiền");
        System.out.println("5 - Gửi tiền");
        System.out.println("6 - Đăng xuất");
        System.out.println("0 - Thoát chương trình");
        System.out.print("Lựa chọn của bạn là: ");
    }
}

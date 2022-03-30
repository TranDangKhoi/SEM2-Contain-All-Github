package com.selfpractice.banklab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private static long balanceNumber = 100000;
    List<TransactionHistory> listHistory = new ArrayList<>(TransactionHistory);

    public long getBalanceNumber() {
        return balanceNumber;
    }

    public static long transfer(long money) {
        // Kiểm tra nếu số tiền nhỏ hơn 50,000 thì thông báo số tiền chuyển tối thiểu phải là 50,000
        // Nếu số tiền chuyển lớn hơn số dư thì thông báo tài khoản không đủ
        // Nếu chuyển thành công, thì thông báo chuyển khoản thành công, in ra số dư mới và thêm lịch sử giao dịch mới
        return balanceNumber;
    }

    public void actionTransfer() {
        // Thực hiện các công việc như nhập stk thụ hưởng, số tiền mô tả tại đây
    }

    public void getHistory() {
        // In ra danh sách lịch sử giao dịch
    }

    public static String formatMoney(long money) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        return formatter.format(money);
    }
}

package QlyZoo;

import java.time.LocalDate;
import java.util.Scanner;

public class manager extends Staff {
    static int count =0;
    protected int idEmplyee;
    private double luongThuongQL;
    private String position = "Quản lý";
    Scanner sc = new Scanner(System.in);

    public manager(double luongThuongQL, String position, String name, String dateofbirth, double salary) {
        super(position, name, dateofbirth, salary);
        this.luongThuongQL = luongThuongQL;
        idEmplyee = ++count;
        time = LocalDate.now();
    }

    public int getIdEmplyee() {
        return idEmplyee;
    }

    public void setIdEmplyee(int idEmplyee) {
        this.idEmplyee = idEmplyee;
    }

    public manager() {
        idEmplyee = ++count;
        time = LocalDate.now();
    }

    @Override
    public void input() {
        super.input();
        do {
            System.out.println("Nhập lương thưởng cơ bản (>= 0): ");
            luongThuongQL = sc.nextDouble();
            if (luongThuongQL < 0) {
                System.out.println("Lương thưởng phải >= 0. Vui lòng nhập lại.");
            }
        } while (luongThuongQL < 0);
    }

    @Override
    public double tinhPhuCap() {
        int soNamLamViec = LocalDate.now().getYear() - time.getYear();
        return luongThuongQL * soNamLamViec;
    }

    @Override
    public double tinhLuongThuong() {
        double tyLeThuong = 0.2; // 20%
        return salary * tyLeThuong + luongThuongQL;
    }

    @Override
    public void inthongtin() {
        System.out.println("-----------" + position + "-----------");
        System.out.println("Id nhân viên: " + idEmplyee);
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Ngày sinh: " + dateofbirth);
        System.out.println("Lương cơ bản: " + salary + " triệu");
        System.out.println("Ngày làm việc: " + time);
        System.out.println("Vị trí: " + position);
        System.out.println("Phụ cấp: " + tinhPhuCap() + " triệu");
        System.out.println("Lương thưởng: " + tinhLuongThuong() + " triệu");
        System.out.println("Tổng thu nhập: " + (salary + tinhPhuCap() + tinhLuongThuong()) + " triệu");
    }

    public void inTongLuong() {
        double tongLuong = salary + tinhPhuCap() + tinhLuongThuong();
        System.out.println("Tổng thu nhập (lương + phụ cấp + thưởng): " + tongLuong + " triệu");
    }
}

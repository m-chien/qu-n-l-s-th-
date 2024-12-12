package QlyZoo;

import java.time.LocalDate;
import java.util.Scanner;

public class employee extends Staff {
    static int count =0;
    protected int idEmplyee;
    private double phuCapLaoDong;
    private String position ="Nhân viên";
    Scanner sc = new Scanner(System.in);
    public employee(double phuCapLaoDong,String position, String name, String dateofbirth, double salary) {
        super(position, name, dateofbirth, salary);
        this.phuCapLaoDong = phuCapLaoDong;
    }

    public int getIdEmplyee() {
        return idEmplyee;
    }

    public void setIdEmplyee(int idEmplyee) {
        this.idEmplyee = idEmplyee;
    }

    public employee() {
        idEmplyee = ++count;
        time = LocalDate.now();
    }

    public void input()
    {
        super.input();
        System.out.println("Nhập phụ cấp lao động ban đầu: ");
        phuCapLaoDong = sc.nextDouble();
    }

    public double getPhuCapLaoDong() {
        return phuCapLaoDong;
    }

    public void setPhuCapLaoDong(double phuCapLaoDong) {
        this.phuCapLaoDong = phuCapLaoDong;
    }

    public void inthongtin(){
        System.out.println("-----------"+position+"-----------");
        System.out.println("Id nhân viên: "+ idEmplyee);
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Ngày sinh: "+ dateofbirth);
        System.out.println("Lương: " + salary+ " triệu");
        System.out.println("Ngày làm việc: "+ time);
        System.out.println("Vị trí: " + position);
        System.out.println("Phụ cấp hiện tại: " + phuCapLaoDong + "Nghìn Đồng");
        System.out.println("Tổng thu nhập: " + (salary + tinhPhuCap() + tinhLuongThuong()) + " triệu");
    }

    @Override
    public double tinhPhuCap() {
        int soNamLamViec = LocalDate.now().getYear() - time.getYear();
        return phuCapLaoDong * soNamLamViec;
    }


    @Override
    public double tinhLuongThuong() {
        double tyLeThuong = 0.1; 
        return salary * tyLeThuong;
    }
    public void inTongLuong() {
        double tongLuong = salary + tinhPhuCap() + tinhLuongThuong();
        System.out.println("Tổng thu nhập (lương + phụ cấp + thưởng): " + tongLuong + " triệu");
    }
}

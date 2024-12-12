package QlyZoo;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public abstract class Staff {
    protected String position;
    protected String name;
    protected String dateofbirth;
    protected double salary;
    LocalDate time;

    public Staff() {
    }

    public Staff(String position, String name, String dateofbirth, double salary) {
        this.position = position;
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.salary = salary;
        this.time = LocalDate.now();
    }

    public String getNameeployee() {
        return name;
    }

    public void setNameeployee(String nameeployee) {
        this.name = nameeployee;
    }


    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên nhân viên: ");
        name = sc.nextLine();
        System.out.println("Ngày sinh: ");
        dateofbirth = sc.nextLine();
        System.out.println("Nhập lương cơ bản: ");
        salary = sc.nextDouble();
    }
    public abstract void inthongtin();
    public abstract double tinhPhuCap();
    public abstract double tinhLuongThuong();
}

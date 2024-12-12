package QlyZoo;

import java.util.Scanner;

public class customer {
    static int count =0;
    protected int idkhachhang;
    protected String namecustomer;
    protected String gender;
    protected String dateofbirt;
    protected String phone;

    public customer() {
    }

    public customer(String namecustomer, String gender, String dateofbirt, String phone) {
        this.namecustomer = namecustomer;
        this.gender = gender;
        this.dateofbirt = dateofbirt;
        this.phone = phone;
    }

    public int getIdkhachhang() {
        return idkhachhang;
    }

    public void setIdkhachhang(int idkhachhang) {
        this.idkhachhang = idkhachhang;
    }

    public String getNamecustomer() {
        return namecustomer;
    }

    public void setNamecustomer(String namecustomer) {
        this.namecustomer = namecustomer;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void nhapthongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên khách hàng: ");
        namecustomer = sc.nextLine();
        System.out.println("Nhập giới tính: 1. Nam | 2. Nữ");
        int choose;
        do
        {
            choose = sc.nextInt();
            switch (choose)
            {
                case 1: gender= "Nam"; break;
                case 2: gender = "Nữ"; break;
                default:
                    System.out.println("nhập sai");break;
            }
        }while (choose != 1 && choose != 2);
        System.out.println("Nhập Ngày Sinh: ");
        dateofbirt = sc.next();
        System.out.println("Nhập Số Điện thoại: ");
        phone = sc.next();
        idkhachhang = ++count;
    }
    public void inthongtin()
    {
        System.out.println("| Tên Khách Hàng: "+namecustomer);
        System.out.println("| Giới tính: "+gender);
        System.out.println("| Ngày Sinh: "+ dateofbirt);
        System.out.println("| Số điện thoại: "+ phone);
    }
}

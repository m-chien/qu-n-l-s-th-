package QlyZoo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class qlyevent{
    Scanner sc = new Scanner(System.in);
    public ArrayList<event> qlysk = new ArrayList<>();
    public qlyevent() {
    }

    public void add(event sk)
    {
        qlysk.add(sk);
    }
    public void delete(event sk)
    {
        qlysk.remove(sk);
    }
    public void themtruoc1vaisk()
    {
        event sk;
        sk = new event();
        sk.setNameevent("Tham quan vườn Thú");
        sk.setDate("14/2/2025");
        sk.setPrice(120000);
        sk.setHighmin(1);
        sk.setTime(LocalDate.now());
        sk.setTimestart(LocalTime.of(15, 30));
        add(sk);
        event sukien;
        sukien = new event();
        sukien.setNameevent("Múa khỉ");
        sukien.setDate("25/8/2025");
        sukien.setPrice(300000);
        sukien.setHighmin(1.6);
        sukien.setTime(LocalDate.now());
        sukien.setTimestart(LocalTime.of(14, 30));
        add(sukien);
    }
    public void addevent()
    {
        event sk;
        System.out.println("-------thêm sự kiện--------");
        sk = new event();
        sk.nhapthongtin();
        add(sk);
    }
    public void deleteevent()
    {
        for (event sk : qlysk)
            sk.namesk();
        System.out.println("nhập tên sự kiện muốn xóa(có thể không viết hoa): ");
        String namesk = sc.nextLine();
        for (event sk : qlysk)
            if (sk.getNameevent().equalsIgnoreCase(namesk))
                delete(sk);
    }
    public void printevent()
    {
        for (event sk: qlysk)
        {
            sk.inthongtin();
        }
    }
    public boolean check(String sk) {
        for (event skien: qlysk)
            if (skien.getNameevent().equalsIgnoreCase(sk)) {
                return true;
            }
        return false;
    }
    public event laysukien(String sk) {
        for (event skien: qlysk)
            if (skien.getNameevent().equalsIgnoreCase(sk)) {
                return skien;
            }
        return null;
    }
        public void inthongtincuthe(String namesk){
            if (check(namesk)) { 
                for (event sk : qlysk) { 
                    if (sk.getNameevent().equalsIgnoreCase(namesk)) 
                    { 
                        System.out.println("Tên sự kiện: " + sk.getNameevent()); 
                        System.out.println("Giờ tổ chức: " + sk.getTimestart()); System.out.println("Giá vé: " + sk.getPrice()); 
                        System.out.println("Chiều cao tối thiểu để tham gia: " + sk.getHighmin()); 
                    } 
                }
            }
        }
}

package QlyZoo;

import java.util.ArrayList;
import java.util.Scanner;

public class qlyemplyee {
    Scanner sc = new Scanner(System.in);
    public ArrayList<employee> qlyemplyee = new ArrayList<>();
    public ArrayList<manager> qlymanager = new ArrayList<>();

    public qlyemplyee() {
    }
    public void add(employee e)
    {
        qlyemplyee.add(e);
    }
    public void add(manager m)
    {
        qlymanager.add(m);
    }
    public void remove(employee e)
    {
        qlyemplyee.remove(e);
    }
    public void remove(manager m)
    {
        qlymanager.remove(m);
    }
    public void nhap()
    {
        employee employee;
        manager manager;
        System.out.println("Chọn chức vụ muốn thêm: 1. Nhân viên | 2. Quản lý");
        int choose = sc.nextInt();
        switch (choose)
        {
            case 1:
            {
                employee = new employee();
                employee.input();
                add(employee);
                break;
            }
            case 2:
            {
                manager = new manager();
                manager.input();
                add(manager);
                break;
            }
            default:
                System.out.println("Nhập sai"); break;
        }
    }
    public void timkiem(String position, int id)
    {
        if (position == "Quản Lý")
            for (manager managers : qlymanager)
                if (id == managers.getIdEmplyee())
                {
                    managers.inthongtin();
                    break;
                }
        if (position == "Nhân Viên")
            for (employee employees : qlyemplyee)
                if (id == employees.getIdEmplyee())
                {
                    employees.inthongtin();
                    break;
                }
                else System.out.println("Không có nhân viên đó trong danh sách");
    }
    public int xoanhanvien(String position, int id)
    {
        if (position == "Quản Lý")
            for (manager managers : qlymanager)
                if (id == managers.getIdEmplyee())
                {
                    remove(managers);
                    return 1;
                }
        if (position == "Nhân Viên")
            for (employee employees : qlyemplyee)
            {
                if (id == employees.getIdEmplyee())
                {
                    remove(employees);
                    return 1;
                }
            }
        return 0;
    }
    public void inthongtin()
    {
        for (manager managers : qlymanager)
            managers.inthongtin();
        for (employee employees : qlyemplyee)
            employees.inthongtin();
    }
}

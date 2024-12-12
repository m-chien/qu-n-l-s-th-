package QlyZoo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose, choose1;
        qlyanimals qlyanimals = new qlyanimals();
        qlyemplyee qlyemplyee = new qlyemplyee();
        ticketpurchase qlyve = new ticketpurchase();
        qlyevent qlyevent = new qlyevent();
        qlyevent.themtruoc1vaisk();
        //qlyanimals.qly.themtruoc1vaisk();
        //qlyve.qlyve.themtruoc1vaisk();
        do {
            System.out.println("vui lòng chọn: 1. khách hàng | 2. Nhân Viên | 3. Thoát");
            choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    int chon1;
                    do {
                        System.out.println("vui lòng chọn: 1. Mua vé | 2. check vé | 3. xem giới thiệu về thú | 4. Thoát");
                        chon1 = sc.nextInt();
                        sc.nextLine();
                        switch (chon1) {
                            case 1: {
                                //qlyanimals.qly.printevent();
                                qlyevent.printevent();
                                System.out.println("vui lòng nhập tên sự kiện: ");
                                String sk = sc.nextLine();
                                qlyevent.inthongtincuthe(sk);
                                System.out.println("\n");
                                System.out.println("1. Đặt vé ngay\n2. Thoát");
                                int choice = sc.nextInt();
                                sc.nextLine();
                                if (choice == 1)
                                    if (qlyevent.check(sk))
                                    {
                                        qlyve.createticket(sk,qlyevent.laysukien(sk));
                                    }
                                    else System.out.println("không có sự kiện đó hoặc sự kiện bạn nhập bị sai");
                                else {
                                    System.out.println("Thoát. Cảm ơn đã sử dụng dịch vụ!");
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("nhập id của bạn: ");
                                int id1 = sc.nextInt();
                                System.out.println("Nhập SĐT: ");
                                String sdt = sc.next();
                                qlyve.checkve(id1, sdt);
                                break;
                            }
                            case 3: 
                            {
                                System.out.println("Vui lòng chọn loại động vật: 1. Thú | 2. Bò Sát | 3. Chim | 4. Thủy Cung | 5.Động vật bị tuyệt chủng");
                                int chon = sc.nextInt();
                                sc.nextLine();
                                String name;       
                                if (chon == 1)
                                {
                                    for (mammal m : qlyanimals.qlymammals){
                                        System.out.println("Danh sách thú hiện có: " + m.getName() + ", ");
                                        System.out.println("\nVui lòng nhập tên con vật: ");
                                        name = sc.nextLine();
                                        if (m.getName().equals(name)) {
                                            m.gioithieu();
                                            break;
                                        }
                                        else
                                        {
                                             System.out.println("Động vật muốn xem không có trong danh sách!!!");
                                             break;
                                        }
                                            
                                    }         
                                }
                                if (chon == 2)
                                    for (reptile r : qlyanimals.qlyreptiles){
                                        System.out.println("Danh sách thú hiện có: " + r.getName() + ", ");
                                        System.out.println("\nVui lòng nhập tên con vật: ");
                                        name = sc.nextLine();
                                        if (r.getName().equals(name)) {
                                            r.gioithieu();
                                            break;
                                        }
                                        else
                                        {
                                             System.out.println("Động vật muốn xem không có trong danh sách!!!");
                                             break;
                                        }
                                    }
        
                                if (chon == 3)
                                    for (bird b : qlyanimals.qlybirds){
                                        System.out.println("Danh sách thú hiện có: " + b.getName() + ", ");
                                        System.out.println("\nVui lòng nhập tên con vật: ");
                                        name = sc.nextLine();
                                        if (b.getName().equals(name)) {
                                            b.gioithieu();
                                            break;
                                        }
                                         else
                                        {
                                             System.out.println("Động vật muốn xem không có trong danh sách!!!");
                                             break;
                                        }
                                    }
                                if (chon == 4)
                                    for (Aquatic a : qlyanimals.qlyaquatics){
                                        System.out.println("Danh sách thú hiện có: " + a.getName() + ", ");
                                        System.out.println("\nVui lòng nhập tên con vật: ");
                                        name = sc.nextLine();
                                        if (a.getName().equals(name)) {
                                            a.gioithieu();
                                            break;
                                        }
                                        else
                                        {
                                             System.out.println("Động vật muốn xem không có trong danh sách!!!");
                                             break;
                                        }
                                    }
                                if (chon == 5)
                                    for (ExtinctAnimal e : qlyanimals.qlyExtinct){
                                        System.out.println("Danh sách thú hiện có: " + e.getName() + ", ");
                                        System.out.println("\nVui lòng nhập tên con vật: ");
                                        name = sc.nextLine();
                                        if (e.getName().equals(name)) {
                                            e.gioithieu();
                                            break;
                                        }
                                        else
                                        {
                                             System.out.println("Động vật muốn xem không có trong danh sách!!!");
                                             break;
                                        }
                                    }
                                break;
                            }
                            default:
                                break;
                        }
                    } while (chon1 != 4);
                    break;
                }
                case 2: {
                    do {
                        System.out.println("chọn chức năng:\n1. thêm nhân viên\n2. in thông tin nhân viên\n3. xóa nhân viên\n4. tìm kiếm\n5. Quản lý sở thú\n6. thoát");
                        choose1 = sc.nextInt();
                        switch (choose1) {
                            case 1:
                                qlyemplyee.nhap();
                                break;
                            case 2:
                                qlyemplyee.inthongtin();
                                break;
                            case 3: {
                                System.out.println("vui lòng nhập id: ");
                                int id = sc.nextInt();
                                System.out.println("vui lòng chọn chức vụ: 1. Nhân Viên | 2. Quản lý");
                                int chon = sc.nextInt();
                                if (chon == 1)
                                    if (qlyemplyee.xoanhanvien("Nhân Viên", id) == 1)
                                        System.out.println("Đã xóa nhân viên");
                                if (chon == 2)
                                    if (qlyemplyee.xoanhanvien("Quản Lý", id) == 1)
                                        System.out.println("Đã xóa quản lý");
                                break;
                            }
                            case 4: {
                                System.out.println("vui lòng nhập id: ");
                                int id = sc.nextInt();
                                System.out.println("vui lòng chọn chức vụ: 1. Nhân Viên | 2. Quản lý");
                                int chon = sc.nextInt();
                                if (chon == 1)
                                    qlyemplyee.timkiem("Nhân Viên", id);
                                else if (chon == 2)
                                    qlyemplyee.timkiem("Quản Lý", id);
                                else System.out.println("bạn nhập sai");
                                break;
                            }
                            case 5: {
                                int choose5;
                                do {
                                    System.out.println("chọn chức năng:\n1. thêm thú\n2. in thông tin con thú\n3. xóa nhân viên\n4. tìm kiếm\n5. tạo sự kiện\n6. xóa sự kiện\n7. các sự kiện hiện có\n8. lưu file dạng text\n9. lưu file dạng obj\n10. đọc file\n11. thoát");
                                    choose5 = sc.nextInt();sc.nextLine();
                                    switch (choose5) {
                                        case 1:
                                            qlyanimals.input();
                                            break;
                                        case 2:
                                            qlyanimals.inthontin();
                                            break;
                                        case 3: {
                                            System.out.println("vui lòng nhập tên: ");
                                            String name = sc.nextLine();
                                            System.out.println("vui lòng chọn loại động vật: 1. Thú | 2. Bò Sát | 3. Chim | 4. Thủy Cung | 5.Động vật bị tuyệt chủng");
                                            int chon = sc.nextInt();
                                            if (chon == 1)
                                                qlyanimals.removeanimal("Thú", name);
                                            else if (chon == 2)
                                                qlyanimals.removeanimal("Bò Sát", name);
                                            else if (chon == 3)
                                                qlyanimals.removeanimal("Chim", name);
                                            else if (chon == 4)
                                                qlyanimals.removeanimal("Thủy Cung", name);
                                            else if (chon == 5)
                                                qlyanimals.removeanimal("Động vật bị tuyệt chủng", name);
                                            else System.out.println("bạn nhập sai");
                                            break;
                                        }
                                        case 4: {
                                            System.out.println("vui lòng nhập tên: ");
                                            String name = sc.nextLine();
                                            System.out.println("vui lòng chọn loại động vật: 1. Thú | 2. Bò Sát | 3. Chim | 4. Thủy Cung | 5.Động vật bị tuyệt chủng");
                                            int chon = sc.nextInt();
                                            if (chon == 1)
                                                qlyanimals.timkiem("Thú", name);
                                            else if (chon == 2)
                                                qlyanimals.timkiem("Bò Sát", name);
                                            else if (chon == 3)
                                                qlyanimals.timkiem("Chim", name);
                                            else if (chon == 4)
                                                qlyanimals.timkiem("Thủy Cung", name);
                                            else if (chon == 5)
                                                qlyanimals.timkiem("Động vật bị tuyệt chủng", name);
                                            else System.out.println("bạn nhập sai");
                                            break;
                                        }
                                        case 5: {
                                            event sk;
                                            System.out.println("-------thêm sự kiện--------");
                                            sk = new event();
                                            sk.nhapthongtin();
                                            qlyevent.add(sk);
                                            break;
                                        }
                                        case 6: {
                                            for (event sk : qlyevent.qlysk)
                                                sk.namesk();
                                            System.out.println("nhập tên sự kiện muốn xóa(có thể không viết hoa): ");
                                            String namesk = sc.nextLine();
                                            for (event sk : qlyevent.qlysk)
                                                if (sk.getNameevent().compareToIgnoreCase(namesk) == 0)
                                                {
                                                    qlyevent.delete(sk);
                                                }
                                            break;
                                        }
                                        case 7:
                                            qlyevent.printevent();
                                            break;
                                        case 8:
                                        {
                                            qlyanimals.savetextfile();
                                            break;
                                        }
                                        case 9:
                                        {
                                            qlyanimals.saveobjectfile();
                                            break;
                                        }
                                        case 10:
                                        {
                                            qlyanimals.readobj();
                                            break;
                                        }
                                    }
                                } while (choose5 != 11);
                                break;
                            }
                        }
                    } while (choose1 != 6);
                    break;
//                    }
//                    else System.out.println("nhập sai:)");
                }
            }
        } while (choose != 3);
    }
}

package QlyZoo;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Animal implements Serializable {
    public String name;
    public double size;
    public String color;
    public String living_enviroment; // môi trường sống
    public String personality; // tính cách(sống theo bầy đàn...)
    public String food; // loại thức ăn
    public  String conservation;//tình trạng bảo tồn

    public Animal() {
    }

    public Animal(String name, double size, String color, String living_enviroment, String personality, String food, String conservation) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.living_enviroment = living_enviroment;
        this.personality = personality;
        this.food = food;
        this.conservation = conservation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void nhapthongtin()
    {
        Scanner sc = new Scanner(System.in);
        int choose;
        System.out.println("Nhập tên con vật: ");
        name = sc.nextLine();
        System.out.println("Kích thước: ");
        size = sc.nextDouble();sc.nextLine();
        System.out.println("Màu Sắc: ");
        color = sc.nextLine();
        System.out.println("Môi trường Sống (1. Rừng, 2. Đồng cỏ, 3.  Dưới Nước, 4. Trên Trời): ");
        do
        {
            choose = sc.nextInt();
            switch (choose)
            {
                case 1: living_enviroment = "Rừng"; break;
                case 2: living_enviroment = "Đồng cỏ"; break;
                case 3: living_enviroment = "Dưới Nước";break;
                case 4: living_enviroment = "Trên trời";break;
                default:
                    System.out.println("nhập sai");break;
            }
        }while (choose != 1 && choose != 2 && choose != 3 && choose != 4);
        System.out.println("Tính cách(1. bầy đàn,2. đơn lẻ): ");
        do
        {
            choose = sc.nextInt();
            switch (choose)
            {
                case 1: personality= "Bầy Đàn"; break;
                case 2: personality = "Đơn lẻ"; break;
                default:
                    System.out.println("nhập sai");break;
            }
        }while (choose != 1 && choose != 2);
        System.out.println("Loại thức ăn(1. ăn cỏ,2. ăn thịt,3. ăn tạp: ");
        do
        {
            choose = sc.nextInt();
            switch (choose)
            {
                case 1: food = "ăn cỏ"; break;
                case 2: food = "ăn thịt"; break;
                case 3: food = "ăn tạp";break;
                default:
                    System.out.println("nhập sai");break;
            }
        }while (choose != 1 && choose != 2 && choose != 3);
        System.out.println("Số Lượng(1. Rất ít,2. ít,3. vừa,4. nhiều) : ");
        do
        {
            choose = sc.nextInt();
            switch (choose)
            {
                case 1: conservation = "Rất ít"; break;
                case 2: conservation = "ít"; break;
                case 3: conservation = "Vừa";break;
                case 4: conservation = "Nhiều";break;
                default:
                    System.out.println("nhập sai");break;
            }
        }while (choose != 1 && choose != 2 && choose != 3 && choose != 4);
    }
    public String getline()
    {
        return "Tên: "+ name +"\n"+ "kích thước: "+ size+"\n"+"Màu Sắc: " +color+"\n"+"Môi Trường Sống: "+ living_enviroment+"\n"+"Tính Cách: " +personality+"\n"+"Thức ăn: "+ food+"\n"+"Số Lượng: "+ conservation+"\n";
    }
    public void inthongtin()
    {
        System.out.println("Tên: "+ name);
        System.out.println("kích thước: "+ size);
        System.out.println("Màu Sắc: " +color);
        System.out.println("Môi Trường Sống: "+ living_enviroment);
        System.out.println("Tính Cách: " +personality);
        System.out.println("Thức ăn: "+ food);
        System.out.println("Số Lượng: "+ conservation);
    }
    abstract void gioithieu();
}

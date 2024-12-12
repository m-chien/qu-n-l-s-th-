package QlyZoo;

import java.util.Scanner;

public class ExtinctAnimal extends Animal{
    public String species = "Động vật bị tuyệt chủng";
    private String period;     // giai đoạn
    private String causeOfExtinction; // nguyên nhân tuyệt chủng
    private String fossilCondition; //tình trạng hóa thạch
    private String originLocation;  //vị trí xuất xứ

    public ExtinctAnimal(String period, String causeOfExtinction, String fossilCondition, String originLocation) {
        this.period = period;
        this.causeOfExtinction = causeOfExtinction;
        this.fossilCondition = fossilCondition;
        this.originLocation = originLocation;
    }

    public ExtinctAnimal(String period, String causeOfExtinction, String fossilCondition, String originLocation, String name, double size, String color, String living_enviroment, String personality, String food, String conservation) {
        super(name, size, color, living_enviroment, personality, food, conservation);
        this.period = period;
        this.causeOfExtinction = causeOfExtinction;
        this.fossilCondition = fossilCondition;
        this.originLocation = originLocation;
    }

    public ExtinctAnimal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getCauseOfExtinction() {
        return causeOfExtinction;
    }

    public void setCauseOfExtinction(String causeOfExtinction) {
        this.causeOfExtinction = causeOfExtinction;
    }

    public String getFossilCondition() {
        return fossilCondition;
    }

    public void setFossilCondition(String fossilCondition) {
        this.fossilCondition = fossilCondition;
    }

    public String getOriginLocation() {
        return originLocation;
    }

    public void setOriginLocation(String originLocation) {
        this.originLocation = originLocation;
    }
    @Override
    public String getline() {
        return super.getline()+"\n"+"Thời kỳ tồn tại: " + period+"\n"+"Nguyên nhân tuyệt chủng: " + causeOfExtinction+"\n"+"Tình trạng xương: " + fossilCondition+"\n"+"Vị trí phát hiện: " + originLocation+"\n";
    }
    public void nhapthongtin() {
        int choose;
        Scanner sc = new Scanner(System.in);
        super.nhapthongtin();
        System.out.println("Thời kỳ tồn tại (1. Thời kỳ Tiền Cambri , 2. Thời kỳ Cổ sinh, 3. Thời kỳ Trung sinh, 4. Thời kỳ Tân sinh): ");
        do
        {
            choose = sc.nextInt();sc.nextLine();
            switch (choose)
            {
                case 1: period = "Thời kỳ Tiền Cambri"; break;
                case 2: period = "Thời kỳ Cổ sinh"; break;
                case 3: period = "Thời kỳ Trung sinh";break;
                case 4: period = "Thời kỳ Tân sinh";break;
                default:
                    System.out.println("nhập sai");break;
            }
        }while (choose != 1 && choose != 2 && choose != 3 && choose != 4);
        System.out.println("Nguyên nhân tuyệt chủng: ");
        causeOfExtinction = sc.nextLine();
        System.out.println("Tình trạng xương (1. Hoàn Chỉnh, 2. 1 Phần, 3. Hóa Thạch, 4. Bị Phân Hủy): ");
        do
        {
            choose = sc.nextInt();sc.nextLine();
            switch (choose)
            {
                case 1: fossilCondition = "Hoàn Chỉnh"; break;
                case 2: fossilCondition = "1 Phần"; break;
                case 3: fossilCondition = "Hóa Thạch";break;
                case 4: fossilCondition = "Bị Phân Hủy";break;
                default:
                    System.out.println("nhập sai");break;
            }
        }while (choose != 1 && choose != 2 && choose != 3 && choose != 4);
        System.out.println("Vị trí phát hiện: ");
        originLocation = sc.nextLine();
    }

    public void inthongtin() {
        System.out.println("------------"+ "Động vật tuyệt chủng" +"------------");
        super.inthongtin();
        System.out.println("Thời kỳ tồn tại: " + period);
        System.out.println("Nguyên nhân tuyệt chủng: " + causeOfExtinction);
        System.out.println("Tình trạng xương: " + fossilCondition);
        System.out.println("Vị trí phát hiện: " + originLocation);
        System.out.println("------------------------------------------------------");
    }

    @Override
    void gioithieu() {
        System.out.print(name +" là một loài động vật tuyệt chủng. Kích thước " + size + " cùng với màu "+ color+" đặc trưng.\n "+
                "Chúng thường sống ở "+ living_enviroment+", chúng sống " + personality+
                ".\nLoài này chủ yếu "+food+" " +
                "Thời kỳ tồn tại của "+name+" trong khoảng " + period +
                ".\nNguyên nhân tuyệt chủng được các nhà nghiên cứu cho rằng là " + causeOfExtinction +
                ".Tình trạng hóa thạch hiện nay " + fossilCondition +
                ".\nVị trí phát hiện hóa thạch tại cái địa điểm như " + originLocation);

    }
}

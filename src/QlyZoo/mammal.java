package QlyZoo;

import java.util.ArrayList;

public class mammal extends Animal{
    public String species = "Thú";// giống loài
    public mammal() {
    }

    public mammal(String name, double size, String color, String living_enviroment, String personality, String food, String conservation, String species) {
        super(name, size, color, living_enviroment, personality, food, conservation);
        this.species = species;
    }

    @Override
    public String getline() {
        return super.getline();
    }

    @Override
    public void inthongtin() {
        System.out.println("------------"+ species+"------------");
        super.inthongtin();
    }
    @Override
    public void nhapthongtin() {
        super.nhapthongtin();
    }
    @Override
    void gioithieu() {
        System.out.println("------------------------------------------------------"+ name.toUpperCase()+"--------------------------------------------------------------------");
        System.out.print("_ "+name +" là một loài động thuộc họ Thú. Kích thước " + size + " cùng với màu "+ color+" đặc trưng. "+
                "Chúng thường sống ở "+ living_enviroment+" và sống " + personality+
                "\n_ Loài này chủ yếu "+food+", giúp duy trì cân bằng trong hệ sinh thái." +
                "Hiện nay, số lượng của "+name+" hiện đang còn ");
        if (conservation == "ít" || conservation == "Rất ít") System.out.println(conservation+ "\n_ Điều này nhấn mạnh tầm quan trọng của việc bảo vệ và bảo tồn chúng để đảm " +
                "bảo sự tồn tại của chúng trong tương lai.");
        else System.out.println(conservation + "\n_ Dù vậy việc bảo tồn vẫn rất cần thiết để duy trì sự cân bằng của hệ sinh thái và bảo vệ các loài khỏi những mối đe dọa tiềm ẩn");
    }
}

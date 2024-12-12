package QlyZoo;

public class Aquatic extends Animal{
    public String species = "Thủy Cung"; // Giống loài

    public Aquatic() {
    }

    public Aquatic(String name, double size, String color, String living_enviroment, String personality, String food, String conservation, String species) {
        super(name, size, color, living_enviroment, personality, food, conservation);
        this.species = species;
    }
    @Override
    public String getline() {
        return super.getline();
    }
    @Override
    public void inthongtin() {
        System.out.println("------------" + species + "------------");
        super.inthongtin();
    }

    @Override
    public void nhapthongtin() {
        super.nhapthongtin();
    }

    @Override
    void gioithieu() {
        System.out.print(name + " là một loài động vật thuộc họ Sinh vật thủy sinh. Kích thước " + size + " cùng với màu " + color + " đặc trưng.\n " +
                "Chúng thường sống ở " + living_enviroment + ", chúng sống " + personality +
                ". \nLoài này chủ yếu " + food + ", giúp duy trì cân bằng trong hệ sinh thái dưới nước. " +
                "Hiện nay, số lượng của " + name + " hiện đang còn ");
        if (conservation.equals("ít") || conservation.equals("Rất ít")) {
            System.out.println(conservation + ", \nđiều này nhấn mạnh tầm quan trọng của việc bảo vệ và bảo tồn chúng để đảm " +
                    "bảo sự tồn tại của chúng trong tương lai.\n");
        } else {
            System.out.println(conservation + ". Dù vậy việc bảo tồn vẫn rất cần thiết để duy trì sự cân bằng của hệ sinh thái và bảo vệ các loài khỏi những mối đe dọa tiềm ẩn\n");
        }
    }
}

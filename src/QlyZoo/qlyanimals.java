package QlyZoo;

//import TuyenSinh.thisinh;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class qlyanimals{
    Scanner sc = new Scanner(System.in);
    public ArrayList<mammal> qlymammals = new ArrayList<>();
    public ArrayList<bird> qlybirds = new ArrayList<>();

    public ArrayList<reptile> qlyreptiles = new ArrayList<>();
    public ArrayList<Aquatic> qlyaquatics = new ArrayList<>(); // Quản lý động vật thủy cung
    public ArrayList<ExtinctAnimal> qlyExtinct = new ArrayList();
    public qlyanimals() {
    }
    public void add(mammal m)
    {
        qlymammals.add(m);
    }
    public void add(bird b)
    {
        qlybirds.add(b);
    }
    public void add(reptile r)
    {
        qlyreptiles.add(r);
    }
    public void add(Aquatic a) {
        qlyaquatics.add(a);
    }

    public void add(ExtinctAnimal e){
        qlyExtinct.add(e);
    }
    public void remove(mammal m)
    {
        qlymammals.remove(m);
    }
    public void remove(bird b)
    {
        qlybirds.remove(b);
    }
    public void remove(reptile r)
    {
        qlyreptiles.remove(r);
    }
    public void remove(Aquatic a) {
        qlyaquatics.remove(a);
    }
    public void remove(ExtinctAnimal e){
        qlyExtinct.remove(e);
    }
    public void input()
    {
        reptile r;
        mammal m;
        bird b;
        Aquatic a;
        ExtinctAnimal e;
        System.out.println("Chọn loại động vật muốn thêm: ");
        System.out.println("1. Thú | 2. Bò Sát | 3. Chim | 4. Thủy Cung | 5.Động vật bị tuyệt chủng");
        int choose = sc.nextInt();
        switch (choose)
        {
            case 1:
            {
                m = new mammal();
                m.nhapthongtin();
                add(m);
                break;
            }
            case 2:
            {
                r = new reptile();
                r.nhapthongtin();
                add(r);
                break;
            }
            case 3:
            {
                b = new bird();
                b.nhapthongtin();
                add(b);
                break;
            }
            case 4: {
                a = new Aquatic();
                a.nhapthongtin();
                add(a);
                break;
            }
            case 5: {
                e = new ExtinctAnimal();
                e.nhapthongtin();
                add(e);
                break;
            }
            default:
                System.out.println("nhập sai"); break;
        }
    }
    public void timkiem(String species, String name)
    {
        if (species == "Chim")
            for (bird birds : qlybirds)
                if (name.equals(birds.getName()))
                    birds.inthongtin();
        if (species == "Thú")
            for (mammal mammals : qlymammals)
                if (name.equals(mammals.getName()))
                    mammals.inthongtin();
        if (species == "Bò Sát")
            for (reptile reptiles : qlyreptiles)
                if (name.equals(reptiles.getName()))
                    reptiles.inthongtin();
        if (species.equals("Thủy Cung"))
            for (Aquatic aquatics : qlyaquatics)
                if (name.equals(aquatics.getName()))
                    aquatics.inthongtin();
        if (species.equals("Động vật bị tuyệt chủng"))
            for (ExtinctAnimal extinct : qlyExtinct)
                if (name.equals(extinct.getName()))
                    extinct.inthongtin();
        else System.out.println("không có con vật đó ở trong danh sách");
    }
    public void removeanimal(String species, String name)
    {
        if (species.equals("Chim"))
            for (bird birds : qlybirds)
                if (name.equals(birds.getName()))
                {
                    remove(birds);
                    break;
                }
        if (species.equals("Thú"))
            for (mammal mammals : qlymammals)
                if (name.equals(mammals.getName()))
                {
                    remove(mammals);
                    break;
                }
        if (species.equals("Bò Sát"))
            for (reptile reptiles : qlyreptiles)
                if (name.equals(reptiles.getName()))
                {
                    remove(reptiles);
                    break;
                }
        if (species.equals("Thủy Cung"))
            for (Aquatic aquatics : qlyaquatics)
                if (name.equals(aquatics.getName()))
                {
                    remove(aquatics);
                    break;
                }
        if (species.equals("Động vật bị tuyệt chủng"))
            for (ExtinctAnimal extinct : qlyExtinct)
                if (name.equals(extinct.getName()))
                {
                    remove(extinct);
                    break;
                }
        else System.out.println("không có con vật đó ở trong danh sách");
    }
    public void inthontin()
    {
        for (mammal mammals : qlymammals)
            mammals.inthongtin();
        for (reptile reptiles : qlyreptiles)
            reptiles.inthongtin();
        for (bird birds : qlybirds)
            birds.inthongtin();
        for (Aquatic aquatics : qlyaquatics)
            aquatics.inthongtin();
        for (ExtinctAnimal extinct : qlyExtinct)
            extinct.inthongtin();
    }
    public void saveobjectfile()
    {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("Animal.obj");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(qlymammals);
            oos.writeObject(qlybirds);
            oos.writeObject(qlyreptiles);
            oos.writeObject(qlyaquatics);
            oos.writeObject(qlyExtinct);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public void savetextfile()
    {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("Animal.txt");
            for (mammal m: qlymammals)
            {
                String line = m.getline();
                byte[] data = line.getBytes("utf8");
                fos.write(data);
            }
            for (bird b: qlybirds)
            {
                String line = b.getline();
                byte[] data = line.getBytes("utf8");
                fos.write(data);
            }
            for (reptile r: qlyreptiles)
            {
                String line = r.getline();
                byte[] data = line.getBytes("utf8");
                fos.write(data);
            }
            for (Aquatic a: qlyaquatics)
            {
                String line = a.getline();
                byte[] data = line.getBytes("utf8");
                fos.write(data);
            }
            for (ExtinctAnimal e: qlyExtinct)
            {
                String line = e.getline();
                byte[] data = line.getBytes("utf8");
                fos.write(data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos!= null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public void readobj()
    {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("Animal.obj");
            ois = new ObjectInputStream(fis);
            ArrayList<mammal> qlymamal = (ArrayList<mammal>) ois.readObject();
            ArrayList<bird> qlybird = (ArrayList<bird>) ois.readObject();
            ArrayList<reptile> qlyretile = (ArrayList<reptile>) ois.readObject();
            ArrayList<Aquatic> qlyaquctic = (ArrayList<Aquatic>) ois.readObject();
            ArrayList<ExtinctAnimal> qlyextinct = (ArrayList<ExtinctAnimal>) ois.readObject();
            for (mammal m: qlymamal)
            {
                qlymammals.add(m);
            }
            for (bird b: qlybird)
            {
                qlybirds.add(b);
            }
            for (reptile r: qlyretile)
            {
                qlyreptiles.add(r);
            }
            for (Aquatic a: qlyaquctic)
            {
                qlyaquatics.add(a);
            }
            for (ExtinctAnimal e: qlyextinct)
            {
                qlyExtinct.add(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (fis!= null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (ois!= null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

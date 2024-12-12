package QlyZoo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class event {
    protected String nameevent;
    protected String date;// ngày tổ chức
    protected double price;
    protected double highmin;
    protected LocalTime timestart;
    LocalDate time;

    public double getHighmin() {
        return highmin;
    }

    public void setHighmin(double highmin) {
        this.highmin = highmin;
    }

    public LocalTime getTimestart() {
        return timestart;
    }

    public void setTimestart(LocalTime timestart) {
        this.timestart = timestart;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public String getNameevent() {
        return nameevent;
    }

    public void setNameevent(String nameevent) {
        this.nameevent = nameevent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public event() {
    }

    public event(String nameevent, String date, double price) {
        this.nameevent = nameevent;
        this.date = date;
        this.price = price;
    }

    public void namesk()
    {
        System.out.println("sự kiện: "+ nameevent);
    }
    public void nhapthongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sự kiện: ");
        nameevent = sc.nextLine();
        System.out.println("nhập ngày tổ chức: ");
        date = sc.nextLine();
        System.out.println("Nhập số tiền vé: ");
        price = sc.nextDouble();
        System.out.println("Nhập chiều cao tối thiểu để tham gia: (m)");
        highmin = sc.nextDouble();sc.nextLine();
        System.out.println("Nhập giờ bắt đầu sự kiện: ");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Vui lòng nhập giờ bắt đầu sự kiện (định dạng HH:mm): ");
        String input = sc.nextLine(); // Nhập thời gian dạng chuỗi
        try {
            // Chuyển chuỗi thành LocalTime
            timestart = LocalTime.parse(input, timeFormatter);
        } catch (Exception e) {
            System.out.println("Thời gian nhập không đúng định dạng. Vui lòng nhập lại!");
        }
        time = LocalDate.now();
    }
    
    public void inthongtin()
    {
        System.out.println("                        SHOW SỰ KIỆN                           ");
        System.out.println("*---------------------"+ nameevent+ "-----------------------*");
        System.out.println("Sẽ tổ chức vào ngày " + date + ". Kính mời mọi người đón xem\n");
    }

}

package QlyZoo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//thêm thuộc tính chiều cao tối thiểu để tham gia + thêm get set cho price và hignmin
//thêm thuộc tính giờ bắt đầu cho sự kiện

public class ticket extends event {
    static int count =0;
    protected int idticket;
    customer customer;

    Scanner sc = new Scanner(System.in);
    public int getIdticket() {
        return idticket;
    }

    public void setIdticket(int idticket) {
        this.idticket = idticket;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
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


    public ticket(QlyZoo.customer customer) {
        this.customer = customer;
        idticket = ++count;
    }

    public ticket() {
        idticket = ++count;
    }

    public String getPhoneCustomer() {
        return this.customer.getPhone();
    }
    public void getCustomer() {
        this.customer.inthongtin();
    }

    public void inthongtinve() {
        System.out.println("| Mã vé: " + idticket);
        System.out.println("| Giá vé: " +price +" VND");
        System.out.println("| Chiều cao tối thiểu: " + highmin + "m");
        System.out.println("| Giờ bắt đầu sự kiện: " + getTimestart());
        System.out.println("| tên sự kiện: "+ nameevent);
        System.out.println("| ngày mua vé: "+ time);
    }
}

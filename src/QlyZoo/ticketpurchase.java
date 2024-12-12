package QlyZoo;

import java.util.ArrayList;
import java.util.Scanner;

public class ticketpurchase{
    Scanner sc = new Scanner(System.in);
    public ArrayList<ticket> qlyticket = new ArrayList<>();
    public void add(ticket e)
    {
        qlyticket.add(e);
    }
    public void createticket(String sk,event sukien)
    {
            customer customer;
            ticket ticket;
            customer = new customer();
            customer.nhapthongtin();
            ticket = new ticket(customer);
            ticket.setNameevent(sk);
            ticket.setPrice(sukien.getPrice());
            ticket.setHighmin(sukien.getHighmin());
            ticket.setDate(sukien.getDate());
            ticket.setTimestart(sukien.getTimestart());
            ticket.setTime(sukien.getTime());
            add(ticket);
            System.out.println("---->mua vé thành công\n");
            System.out.println("mã vé của bạn là: "+ ticket.getIdticket());
    }
    public void checkve(int id,String phone)
    {
        for (ticket cs: qlyticket)
        {
            if (cs.getPhoneCustomer().equals(phone) && cs.getIdticket() == id)
            {

                System.out.println("-----------------VÉ------------------");
                cs.getCustomer();
                cs.inthongtinve();
                System.out.println("-------------------------------------");
                System.out.println("\n");
                break;
            }
        }
    }
}

package session5_assignment3;

import java.io.DataInputStream;
import java.io.IOException;

public class PayBill
{
  public static void main(String arg[])throws IOException
 {
    String name;
    double pay;
   DataInputStream inp=new DataInputStream(System.in);
    System.out.println("Enter Name of Employee :");
    name=inp.readLine();
    System.out.println("Enter The Basicpay :");
    pay=Double.valueOf(inp.readLine());
    PaySlip p1=new PaySlip(name,pay);
    p1.paybill();
    p1.disp();
 }

} 
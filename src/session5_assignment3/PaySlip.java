package session5_assignment3;

public class PaySlip extends EmpPay implements Salary
{
  double c1,h1,d1;
   PaySlip(String n1,double bp1)
  {
   super(n1,bp1);
  }
  public void paybill()
 {
  d1=basicpay*(da/100);
  h1=basicpay*(hra/100);
  c1=basicpay*(cps/100);
  netpay=basicpay+d1+h1+ma;
  grosspay=netpay-(c1+nhi);
 }
  void disp()
{
 System.out.println("Name of The Employee :"+name +"\t payslip");
 System.out.println("\t Grosspay="+grosspay);
 System.out.println("\t Netpay="+netpay);
}
}
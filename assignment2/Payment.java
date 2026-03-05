package Assignment2;

interface Payment
{
	void pay();
}

class CreditCardPayment implements Payment
{
	public void pay()
	{
		System.out.println("Payment done using Credit Card");
	}
}
class UPIPayment implements Payment
{
	public void pay(){
	System.out.println("Payment done using UPI");
}
public static void main(String[] args)
{
	CreditCardPayment c=new CreditCardPayment();
	c.pay();
	UPIPayment u=new UPIPayment();
	u.pay();
	}
}
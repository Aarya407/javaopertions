import java.util.*;
class Account
{
	String cname;
	int ano;
	Account (int ano,String cname)
	{
		this.ano=ano;
		this.cname=cname;
	}
	void display()
	{
		System.out.println("Customer Name:"+cname+"\nAccount No:"+ano);
	}
}
class SavingAccount extends Account
{
	int savingbal,minbal;
	SavingAccount(int ano,String cname,int savingbal,int minbal)
	{
		super(ano,cname);
		this.savingbal=savingbal;
		this.minbal=minbal;
	}
	void display() 
	{
		super.display();
		System.out.println("Saving bal: "+savingbal+"\nMinimum bal: "+minbal);
	}
}
class Accountdetail extends SavingAccount
{
	int depositamt,withdrawalamt;
	Accountdetail(int ano,String cname,int savingbal,int minbal,int depositamt,int withdrawalamt)
	{
		super(ano,cname,savingbal,minbal);
		this.depositamt=depositamt;
		this.withdrawalamt=withdrawalamt;
	}
	void display()
	{
		super.display();
		System.out.println("Deposit amt: "+depositamt+"\nwithdrawalamt: "+withdrawalamt);
	}
}
class Slip15_2
{
	public static void main(String args[])
	{
		Accountdetail acc=new Accountdetail(101,"abc",5000,1000,2000,1000);
		acc.display();
	}
}

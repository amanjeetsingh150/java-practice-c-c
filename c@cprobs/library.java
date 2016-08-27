//return tupe of a func.=String?
//file handeling?
import java.util.Scanner;
class controllibrary
{
	
		
	public static void main(String args[])
	{
		Scanner sc=new Scanner;
		int i,pos;//pos variable stores the returned aID from checkaID method
		int choice;
		int aID,bID,cID,jID;
		int code;
		String isissue="";//there are 2 variables. 1 is isissue wgich looks that if a person has issued an item or not.the other one is instock which looks for if the item is in stock or not//
		String instock="";
		associates a[10]=new associates();//object of class associates are formed.
		for(i=0;i<10;++i)
			a[i]=new associates(i);
		System.out.println("\t\t..WELCOME..\t\t");
		System.out.println("Enter the details for the database(3-CD,3-journals,4-books): ");
		CD cd[3]=new CD();//object of class CD are formed.
		for(i=0;i<3;++i)
		{
			cd[i]=new CD();
			cd[i].getd();
		}
		journals j[3]=new journals();//object of class journals are formed.
		for(i=0;i<3;++i)
		{
			j[i]=new journals();
			j[i].getd();
		}
		book b[4]=new book();//object of class book are formed.
		for(i=0;i<4;++i)
		{
			b[i]=new book();
			b[i].getd();
		}		
		System.out.println("press 1 to issue");
		System.out.println("press 2 to return");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter the aID: ");
				aID=sc.nextInt();
				for(i=0;i<10;++i)/////////////////
				{
					pos=a[i].checkaID(aID);
					if(pos>=0)
						break;
				}
				if(pos<0&&i==10)
				{
					System.out.println("invalid aID");
					System.exit(0);
				}	
				a[pos].issue();
				
				break;
			case 2://///////for returning the item issued.
				int l;
				System.out.println("Enter the item code: ");
				code=sc.nextInt();
				System.out.println("Enter the aID: ");
				aID=sc.nextInt();
				for(l=o;l<10;++l)
				{
					if(a[l].aID==aID)
					{
						a[l].isissue="no";
					}
				}
				if(code==1)
				{
					for(l=0;l<4;++l)
					{
						if()
					}
				}
		}
	}

	/*void issue(int i)
	{
		int k;
		if(a[i].isissue.equals("no");//is it necessary to put braces or indentation works?
		{	
			System.out.println("Enter the code of the item you want to issue: ");
			code=sc.nextInt();
			if(code==1)
			{
				for(k=0;k<4;++k)
				{
					if(b[k].instock.equals("yes");
					{
						b[k].instock="no";
						a[i].isissue="yes";
						break;
					}
				}
			}
			else if(code==2)
			{
				for(k=0;k<3;++k)
				{
					if(cd[k].instock.equals("yes")
					{
						cd[k].instock="no";
						a[i].isissue="yes";
						break;
					}
				}
			}
			else if(code==3)
			{
				for(k=0;k<3;++k)
				{
					if(j[k].instock.equals("yes")
					{
						j.[k].instock="no";
						a[i].isissue="yes";
						break;
					}
				}
			}
		}
		else
			System.out.println("Can not issue because of the previous item! ");
	}*/
}
class libandass
{
	Scanner sc=new Scanner(System.in);
	int codeissue;
	class library
	{
		int code;
		String isissue="";
		String instock="";
		float cost;
		void getd()
		{
			System.out.println("enter the code: ");//by default code is 1,2 and 3 for CD, books and journals
			code=sc.nextInt();
			System.out.println("enter the cost: ");
			cost=sc.nextInt();
			instock="yes";
		}
		void showd()
		{
			System.out.println("code is: "+code+"and the cost is: "cost);
		}
	
	}
	class associates
	{
		int aID,fine;
		String isissue;
		associates(int i)
		{
			aID=i;
			isissue="no";
			fine=0;
		}
	
		int checkaID(int test)
		{
			if(aID==test)
				return aID;
			return -1;
		}
	
		void issue()
		{
			System.out.println("Enter the code of the item you want to issue : ");
			codeissue=sc.nextInt();
			if(codeissue<3)
				System.out.println("cd issued!");
			else if(codeissue<6)
				System.out.println("journal issued!");
			else if(code<10)
				System.out.println("book issued!");
		}
	}
}

class book extends library
{
	Scanner sc=new Scanner;
	string bname="",authorname="";
	int npage,ID_issuer;
	int bID;
	void getd()
	{
		super.getd();//is this. operator required with super. ?
		System.out.println("enter the book name: ");
		bname=sc.next();
		System.out.println("enter the author name: ");
		authorname=sc.next();
		System.out.println("enter the number of pages: ");
		npage=sc.nextInt();
	}
	void showd()
	{
		super.showd();
		System.out.println("Book nae is: "+bname);
		System.out.println("Author's name is: "+authorname);
		System.out.println("number of pages in the book are: "+npages);
	}
} 
class CD extends library
{
	int capacity,tracks,cID,ID_issuer;
	float timelimit;
	void getd()
	{
		super.getd();
		System.out.println("Enter the capacity of CD: ");
		capacity=sc.nextInt();
		System.out.println("Enter the number of tracks in it: ");
		tracks=sc.nextInt();
		System.out.println("Enter the time limt of the CD: ");
		timelimit=sc.nextFloat();

	}
	void showd()
	{
		super.showd();
		System.out.println("capacity: "+capacity);
		System.out.println("number of tracks: "+tracks);
		System.out.println("timelimit of the CD: ");
	}
}
class journals extends library
{
	string issue,topic;
	float ratingfactor;
	int jID,ID_issuer;
	void getd()
	{
		super.getd();
		System.out.println("Enter the issue: ");
		issue=sc.next();
		System.out.println("Enter the  topic: ");
		topic=sc.next();
		System.out.println("Enter the rating: ");
		ratingfactor=sc.Float;
	}
	void showd()
	{
		super.showd();
		System.out.println("issue: "+issue);
		System.out.println("topic: "+topic);
		System.out.println("ratingfactor: "+ratingfactor);
	}
	
}

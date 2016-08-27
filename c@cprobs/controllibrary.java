//return tupe of a func.=String?
//file handeling?
import java.util.Scanner;
class controllibrary
{
	public static void main(String args[])
	{
		int ch,id,i,issue_id,j,view_code,view_id;
		boolean issued,returned;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\t\t..WELCOME..\t\t\n\n\n\n");
		System.out.println("ID's for 5 associates is being loaded :\n\n");
		try
		{
			for(int k=0;k<20;++k)
			{
				System.out.print(". ");
				Thread.sleep(100);
			}
		}
		catch(InterruptedException I)
		{
			System.out.println("Sorry.! An unexpected error has been reported. Please try again.");
			System.exit(0);
		}
		System.out.println("\n\nEnter the details for the database(3-CD,3-journals,4-books): \nplease note that code for cds,journals and books is 1,2 and 3 respectively.\n\n\t\t\t");
		CD c[]=new CD[3];
		journals jl[]=new journals[3];
		book bk[]=new book[4];
		associates a[]=new associates[5];
		for(ch=0;ch<3;++ch)
		{
			c[ch]=new CD();
			c[ch].getd();
		}
		for(ch=0;ch<3;++ch)
		{
			jl[ch]=new journals();
			jl[ch].getd();
		}
		for(ch=0;ch<4;++ch)
		{
			bk[ch]=new book();
			bk[ch].getd();
		}
		
		for(ch=0;ch<5;++ch)
		{
			a[ch]=new associates(ch);
		}
		do
		{
			System.out.println("\n\n\npress 1 to issue");
			System.out.println("press 2 to return");
			System.out.println("press 3 to view the record of any library item");
			System.out.println("\n\n\npress 4 to exit");
			ch=sc.nextInt();
			
			System.out.println("Enter your aID : ");
			id=sc.nextInt();
			for(i=0;i<5;++i)
			{
				if(id==a[i].aID)
					break;
			}
			if(i>4)
			{
				System.out.println("Invalid id");
				continue;
			}
			switch(ch)
			{
				case 1:
				{
					System.out.println("press 1 to issue a cd\npress 2 to issue a journal\npress 3 to issue a book\n");
					ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
						{
							System.out.println("Enter the cID of  the CD you want to issue : ");
							issue_id=sc.nextInt();
							for(j=0;j<3;++j)
							{
								if(issue_id==c[j].cID)
									break;
							}
							if(j>2)
							{
								System.out.println("Invalid code..");
								continue;
							}
							else
								issued=issue_cd(a[i],c[j]);
							if(issued==false)
							{
								System.out.println(" Therefore Cannot Issue the CD.");
								continue;
							}
							else
							{
								a[i].isissue=true;
								c[j].instock=false;
								System.out.println("Issued Successfully!");
								a[i].showd();
								c[j].showd();
							}
							break;
						}
						case 2: 
						{
							System.out.println("Enter the jID of  the journal you want to issue : ");
							issue_id=sc.nextInt();
							for(j=0;j<3;++j)
							{
								if(issue_id==jl[j].jID)
									break;
							}
							if(j>2)
							{
								System.out.println("Invalid code..");
								continue;
							}
							else
								issued=issue_journal(a[i],jl[j]);
							if(issued==false)
							{
								System.out.println(" Therefore Cannot Issue the journal.");
								continue;
							}
							else
							{
								a[i].isissue=true;
								jl[j].instock=false;
								a[i].showd();
								c[j].showd();
								System.out.println("Issued Successfully!");
							}
							break;
						}
						case 3: 
						{
							System.out.println("Enter the bID of  the book you want to issue : ");
							issue_id=sc.nextInt();
							for(j=0;j<4;++j)
							{
								if(issue_id==bk[j].bID)
									break;
							}
							if(j>3)
							{
								System.out.println("Invalid code..");
								continue;
							}
							else
								issued=issue_book(a[i],bk[j]);
							if(issued==false)
							{
								System.out.println(" Therefore Cannot Issue the book.");
								continue;
							}
							else
							{
								a[i].isissue=true;
								bk[j].instock=false;
								a[i].showd();
								c[j].showd();
								System.out.println("Issued Successfully!");
							}
							break;
						}
						default: System.out.println("Invalid choice!");

					}
					break;
				}
				case 2:
				{
					System.out.println("press 1 to return a cd\npress 2 to return a journal\npress 3 to return a book\n");
					ch=sc.nextInt();
					switch(ch)
					{
						case 1:
						{
							System.out.println("Enter the cd ID you want to return");
							issue_id=sc.nextInt();
							for(j=0;j<3;++j)
							{
								if(issue_id==c[j].cID)
								break;
							}
							if(j>2)
							{
								System.out.println(" Invalid CD code");
								continue;
							}
							else
							{
								returned=return_cd(c[j]);
								if(returned==false)
								{
									c[j].instock=true;
									a[i].isissue=false;
									System.out.println("Returned successfully.!");
									
								}
								else
								{
									System.out.println("Contact administeration. Records state tht this CD is with the library only!");
									continue;
								}
							}
							break;
						}
						case 2:
						{
						System.out.println("Enter the journal ID you want to return");
							issue_id=sc.nextInt();
							for(j=0;j<3;++j)
							{
								if(issue_id==jl[j].jID)
								break;
							}
							if(j>2)
							{
								System.out.println(" Invalid journal code");
								continue;
							}
							else
							{
								returned=return_journal(jl[j]);
								if(returned==false)
								{
									jl[j].instock=true;
									a[i].isissue=false;
									System.out.println("Returned successfully.!");
								}
								else
								{
									System.out.println("Contact administeration. Records state tht this journal is with the library only!");
									continue;
								}
							}
							break;
						}
						case 3:
						{
							System.out.println("Enter the book ID you want to return");
							issue_id=sc.nextInt();
							for(j=0;j<4;++j)
							{
								if(issue_id==bk[j].bID)
								break;
							}
							if(j>3)
							{
								System.out.println(" Invalid book code");
								continue;
							}
							else
							{
								returned=return_cd(bk[j]);
								if(returned==false)
								{
									c[j].instock=true;
									a[i].isissue=false;
									System.out.println("Returned successfully.!");
								}
								else
								{
									System.out.println("Contact administeration. Records state tht this CD is with the library only!");
									continue;
								}
							}
							break;
						}
						default:
						System.out.println("invalid choice!");

					}
					break;
				}
				/*case 3:
				{
					System.out.println("Enter the code of Item you want to view record of : ");
					view_code=sc.nextInt();
					System.out.println("Enter the CID : ");////////////////////////////////////////////////////////////////////////////////////////////////////////
					view_id=sc.nextInt();
					
					if(view_code==1)
					{
						for(j=0;j<3;++j)
							{
								if(view_id==c[j].cID)
									break;
							}
							if(j>2)
							{
								System.out.println("Invalid ID..");
								continue;
							}
						show_record(c[j],view_code);
					}
					else if(view_code==2)
					{
						for(j=0;j<3;++j)
							{
								if(view_id==jl[j].jID)
									break;
							}
							if(j>2)
							{
								System.out.println("Invalid ID..");
								continue;
							}
						show_record(jl[j],view_code);
					}
					else if(view_code==3)
					{
						for(j=0;j<4;++j)
							{
								if(view_id==bk[i].bID)
									break;
							}
							if(j>3)
							{
								System.out.println("Invalid ID..");
								continue;
							}
						show_record(bk[j],view_code);
					}
					else
					{
						System.out.println("Invalid code.\n");
						continue;
					}
					break;
				}*/				
				case 4:
				System.out.println("Exiting.....");
				System.exit(0);
				break;
				default:
				System.out.println("invalid choice!");
			}
			
		}while(true);
	}
	/*void show_record(void obj,int view_code)
	{
		if(view_code==1)
			(CD)obj.showd();
		else if(view_code==2)
			(journals)obj.showd();
		else
			(book)obj.showd();
	}*/
	public  static boolean issue_cd(associates a,CD c)
	{
		if(a.isissue==true)
		{
			System.out.println("you have already issued 1 item. ");
			return false;
		}
		else if(c.instock==false)
		{
			System.out.println("CD already issued. ");
			return false;
		}
		else
			return true;
		
	}
	public  static boolean issue_journal(associates a,journals jl)
	{
		if(a.isissue==true)
		{
			System.out.println("you have already issued 1 item. ");
			return false;
		}
		else if(jl.instock==false)
		{
			System.out.println("CD already issued. ");
			return false;
		}
		else
			return true;
		
	}
	public  static boolean issue_book(associates a,book bk)
	{
		if(a.isissue==true)
		{
			System.out.println("you have already issued 1 item. ");
			return false;
		}
		else if(bk.instock==false)
		{
			System.out.println("book already issued. ");
			return false;
		}
		else
			return true;
		
	}
	public  static boolean return_cd(CD c)
	{
		if(c.instock==false)
			return false;
		else 
			return true;
	}
	public static  boolean return_journal(journals jl)
	{
		if(jl.instock==false)
			return false;
		else 
			return true;
	}
	public static boolean return_cd(book bk)
	{
		if(bk.instock==false)
			return false;
		else 
			return true;
	}
}

	class library
	{
		Scanner sc=new Scanner(System.in);
		int code;
		boolean instock;
		float cost;
		void getd()
		{
			System.out.println("enter the code: ");//by default code is 1,2 and 3 for CD, books and journals
			code=sc.nextInt();
			System.out.println("enter the cost: ");
			cost=sc.nextInt();
			instock=true;
		}
		void showd()
		{
			System.out.print("code is: "+code);
			System.out.println("and the cost is: "+cost);
			System.out.print("available: ");
			System.out.println(instock==true?"yes":"no");
		}
	
	}
	class associates
	{
		int aID,fine;
		boolean isissue;
		associates(int i)
		{
			aID=i;
			isissue=false;
			fine=0;
		}
		void showd()
		{
			System.out.println("Associate aID is : "+aID);
		}
	}
	

class book extends library
{
	Scanner sc=new Scanner(System.in);
	String bname="",authorname="";
	int npage,ID_issuer;
	int bID;
	void getd()
	{
		super.getd();//is this. operator required with super. ?
		System.out.println("enter the book ID: ");
		bID=sc.nextInt();
		System.out.println("enter the book name: ");
		bname=sc.next();
		System.out.println("enter the author name: ");
		authorname=sc.next();
		System.out.println("enter the number of pages: ");
		npage=sc.nextInt();
		System.out.println("uploading the data.");
		try
		{
			for(int k=0;k<5;++k)
			{
				System.out.print(".");
				Thread.sleep(100);
			}
			System.out.println("\nSuccessfully uploaded.");
		}
		catch(InterruptedException I)
		{
			System.out.println("Sorry.! An unexpected error has been reported. Please try again.");
			System.exit(0);
		}
	}
	void showd()
	{
		super.showd();
		System.out.println("ID: "+bID);
		System.out.println("Book nae is: "+bname);
		System.out.println("Author's name is: "+authorname);
		System.out.println("number of pages in the book are: "+npage);
	}
} 
class CD extends library
{
	int capacity,tracks,cID,ID_issuer;
	float timelimit;
	void getd()
	{
		super.getd();
		System.out.println("enter the CD ID: ");
		cID=sc.nextInt();
		System.out.println("Enter the capacity of CD: ");
		capacity=sc.nextInt();
		System.out.println("Enter the number of tracks in it: ");
		tracks=sc.nextInt();
		System.out.println("Enter the time limt of the CD: ");
		timelimit=sc.nextFloat();
		System.out.println("uploading the data.");
		try
		{
			for(int k=0;k<5;++k)
			{
				System.out.print(".");
				Thread.sleep(100);
			}
			System.out.println("\nSuccessfully uploaded.");
		}
		catch(InterruptedException I)
		{
			System.out.println("Sorry.! An unexpected error has been reported. Please try again.");
			System.exit(0);
		}

	}
	void showd()
	{
		super.showd();
		System.out.println("ID: "+cID);
		System.out.println("capacity: "+capacity);
		System.out.println("number of tracks: "+tracks);
		System.out.println("timelimit of the CD: "+timelimit);
	}
}
class journals extends library
{
	String issue,topic;
	float ratingfactor;
	int jID,ID_issuer;
	void getd()
	{
		super.getd();
		System.out.println("enter the book ID: ");
		jID=sc.nextInt();
		System.out.println("Enter the issue(name): ");
		issue=sc.next();
		System.out.println("Enter the  topic(name): ");
		topic=sc.next();
		System.out.println("Enter the rating: ");
		ratingfactor=sc.nextFloat();
		System.out.println("uploading the data.");
		try
		{
			for(int k=0;k<5;++k)
			{
				System.out.print(".");
				Thread.sleep(100);
			}
			System.out.println("\nSuccessfully uploaded.");
		}
		catch(InterruptedException I)
		{
			System.out.println("Sorry.! An unexpected error has been reported. Please try again.");
			System.exit(0);
		}
	}
	void showd()
	{
		super.showd();
		System.out.println("ID: "+jID);
		System.out.println("issue: "+issue);
		System.out.println("topic: "+topic);
		System.out.println("ratingfactor: "+ratingfactor);
	}
	
}


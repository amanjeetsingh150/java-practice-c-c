import java.util.Scanner;
class windows
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\tWELCOME\t\t");
		int ch,fch;
		System.out.println("1.google chrome\n\n2.word\n\n3.notepad ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				google g=new google();
				System.out.println("1. right click\n2.left click\n3.scroll down\n4.scroll_up");
				fch=sc.nextInt();
				switch(fch)
				{
					
					case 1:
						g.right_click();
						break;
					case 2:
						g.left_click();
						break;
					case 3:
						g.scroll_down();
						break;
					case 4:
						g.scroll_up();
						break;
					default:
						System.out.println("invalid choice");
				}
				break;
			case 2:
				word w=new word();
				System.out.println("1. right click\n2.left click\n3.scroll down\n4.scroll_up");
				fch=sc.nextInt();
				switch(fch)
				{
					
					case 1:
						w.right_click();
						break;
					case 2:
						w.left_click();
						break;
					case 3:
						w.scroll_down();
						break;
					case 4:
						w.scroll_up();
						break;
					default:
						System.out.println("invalid choice");
				}
				break;
			case 3:
				notepad n=new notepad();
				System.out.println("1. right click\n2.left click\n3.scroll down\n4.scroll_up");
				fch=sc.nextInt();
				switch(fch)
				{
					
					case 1:
						n.right_click();
						break;
					case 2:
						n.left_click();
						break;
					case 3:
						n.scroll_down();
						break;
					case 4:
						n.scroll_up();
						break;
					default:
						System.out.println("invalid choice");
				}
				break;
			default:
				System.out.println("Invalid option!");
		}
		
	}
}

class google implements mouse
{
	public void left_click()
	{
		System.out.println("\t\tYou have left clicked the mouse.!\n \t\tThe link will be opened.");
	}
	public void right_click()
	{
		System.out.println("\t\tYou have right clicked the mouse.!\n\t\t1. Back\tAlt+Right Arrow");
		System.out.println("\t\t2. Forward\tAlt+Left Arrow\n\t\t3. Reload\tCtrl+R");
		System.out.println("\t\t4.Saveas...\tCtrl+S\n\t\t5. Print\tCtrl+P");
		System.out.println("\t\t6.Translate To English");
		System.out.println("\t\t7.View Page Source\tCtrl+U");
		System.out.println("\t\t8.Inspect Element\tShift+Ctrl+I");
	}
	public void scroll_up()
	{
		System.out.println("Page has moved up.");
	}
	public void scroll_down()
	{
		System.out.println("page has moved down.");
	}
}

class notepad implements mouse
{
	public void left_click()
	{
		System.out.println("\t\tYou have left clicked the mouse.!");
	}
	public void scroll_up()
	{
		System.out.println("Page has moved up.");
	}
	public void scroll_down()
	{
		System.out.println("page has moved down.");
	}
	public void right_click()
	{
		System.out.println("\t\t1.cut\n\t\t2.copy\n\t\t3.paste\n\t\t4.select all\n\t\t5.aur bade saare opts.!");
	}
}

class word implements mouse
{
	public void left_click()
	{
		System.out.println("\t\tYou have left clicked the mouse.!");
	}
	public void scroll_up()
	{
		System.out.println("Page has moved up.");
	}
	public void scroll_down()
	{
		System.out.println("page has moved down.");
	}
	public void right_click()
		System.out.println("\t\t1.cut\n\t\t2.copy\n\t\t3.paste\n\t\t4.paragraph\n\t\t5.list");
	{
	}
}
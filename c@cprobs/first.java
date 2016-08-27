import java.awt.*;
import java.applet.*;
public class first extends Applet
{
	public void init()
	{
		setBackground(Color.red);		
		Button b1=new Button("one");
		add(b1);
	}
	public void paint(Graphics g)
	{
		g.drawLine(50,50,100,80);
		g.drawLine(250,150,100,80);
		g.drawOval(100,150,50,50);
		g.setColor(Color.blue);
		g.fillRect(100,150,50,50);
	}
}
//<applet code=first width=300 height=400></applet>
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TwoButtons {
JFrame frame;
JLabel label;
int x=75;
int y=75;
int r=1;
int m=1;

public static void main(String[] args){
	TwoButtons gui=new TwoButtons();
	gui.go();
}
public void go(){
	frame=new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	MyDrawPanel drawPanel = new MyDrawPanel();
	frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
	frame.setSize(300, 300);
	frame.setVisible(true);
	while(true){
	
	while (y<800 && y>50 && x<1800 && x>50){ 
		x=x+r;
		y=y+m;
		r=(int) ((Math.random()-0.5)*50);
		m=(int) ((Math.random()-0.5)*50);
		drawPanel.repaint();
		try{
		Thread.sleep(2);
		} catch (Exception ex){
			System.out.println("exception");
		}
	}
	r=(int) ((Math.random()-0.5)*50);
	m=(int) ((Math.random()-0.5)*50);
	y=425;
	x=925;
	}
}

class MyDrawPanel extends JPanel {
public void paintComponent(Graphics g){
	g.setColor(Color.white);
	//g.fillRect(0, 0, this.getWidth(), this.getHeight());

	int red = (int) (Math.random()*255);
	int green = 0;
	int blue = 0;
	
	Color randomColor=new Color(red,green,blue);
	g.setColor(randomColor);
	g.fillOval(x, y, 100, 100);
}

}

}

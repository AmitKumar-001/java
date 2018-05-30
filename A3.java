import java.applet.*;
import java.awt.*;
public class A3 extends Applet
{
public void paint(Graphics r)
{

r.setColor(Color.red); //sart of car
int x[]={200,650,750,750,200,200};
int y[]={200,200,350,500,500,200};
int l=y.length;
r.drawPolygon(x,y,l);//outter line of car
//r.setColor(Color.black);
r.fillArc(290,442,120,120,0,180);//above of tyer
r.fillArc(540,442,120,120,0,180);
r.setColor(Color.red);
r.drawLine(200,350,750,350);//middel line of the car
r.fillRect(200,350,550,150);
r.setColor(Color.white);
r.fillOval(300,450,100,100);//space for tyer
r.fillOval(550,450,100,100);
r.setColor(Color.black);
r.fillOval(310,470,75,75);//tyer
r.fillOval(560,470,75,75);
/*r.setColor(Color.green);
r.drawLine(200,350,750,350);//middel line of the car
r.fillRect(200,350,550,150);*/
r.setColor(Color.black);
r.drawOval(640,290,50,25);//handle
r.drawLine(690,300,640,300);
r.drawLine(668,290,662,313);
r.drawLine(665,300,685,350);
r.drawOval(580,275,25,25);//head of driver
r.drawRoundRect(587,300,10,15,5,5);
r.drawRoundRect(580,315,25,35,30,15);
r.drawLine(585,320,668,290);
r.drawLine(588,325,662,313);
r.fillRect(565,295,10,55);//final car

//***********start trafic light************************

r.fillRoundRect(1000,150,40,400,30,30);
//r.setColor(Color.white);
r.setColor(Color.red);
r.fillOval(1000,152,40,40);
r.setColor(Color.yellow);
r.fillOval(1000,195,40,40);
r.setColor(Color.green);
r.fillOval(1000,238,40,40);

}
}
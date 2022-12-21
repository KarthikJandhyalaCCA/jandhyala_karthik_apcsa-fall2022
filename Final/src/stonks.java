
	import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



	
public class stonks extends Canvas implements Runnable{
public static boolean ready;
public static List<LocalDateTime> bigl;
public static List<Double> bigcosts;
private BufferedImage back;


public stonks(String code) {
	new Thread(this).start();
	setVisible(true);
	getStonk(code);
}

public static String getStonk(String code) {
	String r="failed";
	try {
		URL url = new URL("https://api.twelvedata.com/time_series?symbol="+code+",USD:Huobi&interval=1h&apikey=9a3a72d98e774f41be20f48f3c6f1132");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		
		BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        r=response.toString();
		
        
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String filestring=getEntry(r, "values");

	String[] entries=filestring.split("},\\{");
	
	
	List<LocalDateTime> l=new ArrayList<LocalDateTime>();
	List<Double> costs=new ArrayList<Double>();
	
	for(String s : entries){
		l.add(getTime(s));
		costs.add(Double.parseDouble(getEntry2(s, "close")));
	}
	ready=true;
	bigl=l;
	bigcosts=costs;
	
	System.out.println(l);
	System.out.println(costs);
	System.out.println(l.size());
	
	return r;
}

public void update(Graphics window)
{
	   paint(window);
}

public void paint( Graphics window )
{
	if(ready == true) {

	//set up the double buffering to make the game animation nice and smooth
	Graphics2D twoDGraph = (Graphics2D)window;

	//take a snap shop of the current screen and same it as an image
	//that is the exact same width and height as the current screen
	if(back==null)
	   back = (BufferedImage)(createImage(getWidth(),getHeight()));

	//create a graphics reference to the back ground image
	//we will draw all changes on the background image
	Graphics graphToBack = back.createGraphics();


	graphToBack.setColor(Color.WHITE);
	graphToBack.fillRect(0,0,1300, 900);
	//50+30i
	graphToBack.setColor(Color.BLACK);
	
	double max=bigcosts.get(0);
	double min=bigcosts.get(0);
	
	for(double c : bigcosts) {
		if(c>max) {
			max=c;
		}
		if(c<min) {
			min=c;
		}
	}
	
	double newmax=max-min;
	
	List<Double> costs=new ArrayList<Double>();
	
	for(int b=0; b<bigcosts.size(); b++) {
		costs.add((bigcosts.get(b)-min)/newmax);
	}
	
	
	
	//graphToBack.drawLine(92, 700-((int)(600*costs.get(bigl.size()-1)))+2, 55+35*bigl.size()+2, 700-((int)(600*costs.get(0)))+2);
	
	for(int i=1; i<=bigl.size(); i++) {
		
		int j=bigl.size()-i;
		
		
		if(i>1) {

			if(costs.get(bigl.size()-1)>costs.get(0)) {
				graphToBack.setColor(Color.RED);
			}else {
				graphToBack.setColor(Color.GREEN);
			}
			
			graphToBack.drawLine(20+35*i+2, 700-((int)(600*costs.get(j+1)))+2, 55+35*i+2, 700-((int)(600*costs.get(j)))+2);
			
		}	
	
		
		
		graphToBack.setColor(Color.BLACK);
		
		String str=bigl.get(j).getHour()+":00";
		if(str.length()==4) {
			str=str+"⬤";
		}
		graphToBack.drawString(str, 50+(35*i), 750 );
		
		graphToBack.fillRect(55+35*i, 700-((int)(600*costs.get(j))), 5, 5);
		graphToBack.drawString(bigcosts.get(j).toString(), 59+(35*i), 700-((int)(600*costs.get(j))));
		
		if(bigl.get(j).getHour()==11) {
		
		graphToBack.drawString(bigl.get(j).getMonth()+" "+bigl.get(j).getDayOfMonth(), 50+(35*i),775);
		
		}
	
	
		
	}
	
	
	
	
	
	twoDGraph.drawImage(back, null, 0, 0);
	}
}	

private static LocalDateTime getTime(String s) {
	
	String datestring= s.substring(12, 28);
	
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	LocalDateTime dateTime = LocalDateTime.parse(datestring, formatter);
	
	return dateTime;
}


private static String getEntry(String file, String name) {
	int i=file.indexOf("\""+name+"\"");
	if(i==-1) {
		return "Entry Not Found";
	}
	
	i+=name.length();
	i+=2;
	int j=i;
	for(j=i; j<file.length(); j++) {
		if(file.charAt(j)==']') {
			break;
		}
	}

	return file.substring(i+3, j-1);
}

private static String getEntry2(String file, String name) {
	int i=file.indexOf("\""+name+"\"");
	if(i==-1) {
		return "Entry Not Found";
	}
	
	i+=name.length();
	i+=2;
	int j=i;
	for(j=i; j<file.length(); j++) {
		if(file.charAt(j)==',') {
			break;
		}
	}

	return file.substring(i+2, j-1);
}
/*
private static void serialon(String file, stockgraph x) {
	try (FileOutputStream fos = new FileOutputStream(new File(file));
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
		oos.writeObject(x);
	} catch (IOException e) {
		e.printStackTrace();
	}
}

private static stockgraph load(String file) {
	try (FileInputStream fis = new FileInputStream(new File(file));
			ObjectInputStream ois = new ObjectInputStream(fis)) {
		return (stockgraph) ois.readObject();
	} catch (IOException e) {
		e.printStackTrace();
		return null;
	} catch (ClassNotFoundException e) {
		// This can occur if the object we read from the file is not
		// an instance of any recognized class
		e.printStackTrace();
		return null;
	}
}
*/
@Override
public void run() {
	// TODO Auto-generated method stub
	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}






}

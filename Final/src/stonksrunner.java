import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;

import static java.lang.System.out;

import java.awt.Component;
import java.time.LocalDateTime;

public class stonksrunner extends JFrame{
	
	public stonksrunner(String code) {
		super(code);
		setSize(1300, 900);
		stonks stock=new stonks(code);
		((Component)stock).setFocusable(true);
		getContentPane().add(stock);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter the stock code :: ");
		String code = keyboard.next();
		stonksrunner stonksdisplay=new stonksrunner(code);
	}
	
	
}

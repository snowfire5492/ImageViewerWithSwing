import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class JScrollBarWithImage extends JFrame {

	public JScrollBarWithImage(){
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		
		setIconImage(new 
ImageIcon("C://Users//Eric//Desktop//Programs//CS245_JavaSwingGUI//Oregon.png").getImage());	
		
		JLabel piclbl = new JLabel(new 
ImageIcon("C://Users//Eric//Desktop//Programs//CS245_JavaSwingGUI//OregonMap.png"));
		
		//JLabel timelbl = new JLabel(new 
SimpleDateFormat("HH:mm:ss").format(new Date()));
		JLabel timelbl = new JLabel(new Date().toString());
		
		JScrollPane pane = new JScrollPane(piclbl);
		
		
		pane.setColumnHeaderView(timelbl);
		
		new Timer(1000, ae-> {
			timelbl.setText(new Date().toString());
		}).start();
		
		
		add(pane);
		
	}
	
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(() -> 
		new JScrollBarWithImage());
	}
	
}


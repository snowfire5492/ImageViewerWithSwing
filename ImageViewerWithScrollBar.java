import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ImageViewerWithScrollBar extends JFrame implements 
ActionListener {

	
	public ImageViewerWithScrollBar(){
		
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("ImageViewer");
		
		setIconImage(new 
ImageIcon("C://Users//Eric//Desktop//Programs//CS245_JavaSwingGUI//ImageViewerIcon.png").getImage());
		
		
		ImageIcon img = new 
ImageIcon("C://Users//Eric//Desktop//Programs//CS245_JavaSwingGUI//OregonMap.png");
		JLabel piclbl = new JLabel(img);
		
		
		JScrollPane pane = new JScrollPane(piclbl);
		
		add(pane);
		
		//pack();
		
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String[] args){
		SwingUtilities.invokeLater(()->
		new ImageViewerWithScrollBar());
	}
	
	
}


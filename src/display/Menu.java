package display;


import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Element.EleButton;
import Element.EleLabel;

public class Menu extends JPanel {

		private static final long serialVersionUID = 1L;
		public long point;
		
		public Menu() {
			//----
		}
		
		public Menu(long point,ActionListener main) {
			try {
					this.point = point;
					this.setBackground(new Color(0,153,0));
					this.setBounds(0,0,1000,600);
					this.setFocusable(true);
					this.setLayout(null);
					
					EleLabel status = new EleLabel("You LOSE!",160,400,100,200,100);
					status.setForeground(Color.white);
					
					EleLabel showPoint = new EleLabel("Total score : "+this.point,160,400,200,200,100);
					showPoint.setForeground(Color.white);
										
					EleButton restart = new EleButton("restart",15,380,300,200,50);
					restart.addActionListener(main);		
					
					EleButton Exit = new EleButton("Exit",15,380,480,200,50);
					Exit.addActionListener(main);

					this.add(showPoint);
					this.add(status);
					this.add(restart);
					this.add(Exit);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
}
import java.awt.EventQueue;




public class programAblauf {
	public static int  pointsReached, pointsAvailabel, pointsTotal;
	public static float grade;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					notenRechnerui window = new notenRechnerui();
					window.frmNotenRechner.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		

		notenRechnerui programmstarteNotenRechnerui = new notenRechnerui();		
		
		programmstarteNotenRechnerui.initialize();
		
		

	}

}


	


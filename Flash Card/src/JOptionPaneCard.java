import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class JOptionPaneCard extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name; 
	static int className;
	static JFrame frame = new JFrame();
	public static void questionBoard()
	{
	name = JOptionPane.showInputDialog("What is your name?");  
	JOptionPane.showMessageDialog(frame, "Hi, " + name);
	for(int i = 0; i < 10; i++)
		{
	Object[] options = {"Reveal", "I got it, skip", "Forget it I quit"};
	className = JOptionPane.showOptionDialog(frame, Data.questionBoard.get(i).getFrontCard(),
			"Question Number "+ i+1,
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null, options, options[2]);
	
	switch(className)
		{
		case 0:
			{
			JOptionPane.showMessageDialog(frame, Data.questionBoard.get(i).getBackCard());				
			break;
			}
		case 1:
			{
			JOptionPane.showMessageDialog(frame, "Great Job! Here is the answer just in case. \n" + Data.questionBoard.get(i).getBackCard());
			break;
			}
		case 2:
			{
			JOptionPane.showMessageDialog(frame, "Im sorry to hear that " + name + "!");
			System.exit(0);
			break;
			}
		}
	}
	}
}
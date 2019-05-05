import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
 
public class NotepadJava {
 
	private static Robot robot;
	private static final int SPEED = 300;
	
	private void execute(int[] letter){
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		for (int i = 0;i<letter.length ;i++ ) {
			robot.delay(SPEED);
			robot.keyPress(letter[i]);
			robot.keyRelease(letter[i]);
		}
	}

	public static void main(String[] args) {
		
		NotepadJava t = new NotepadJava();
		
		int[] executeNotepad = {KeyEvent.VK_WINDOWS,KeyEvent.VK_N,KeyEvent.VK_O,KeyEvent.VK_T,KeyEvent.VK_E,KeyEvent.VK_P,KeyEvent.VK_A,KeyEvent.VK_D,KeyEvent.VK_ENTER};
		int[] maximizeIt = {KeyEvent.VK_ALT,KeyEvent.VK_SPACE,KeyEvent.VK_X};
		t.execute(executeNotepad);
		t.execute(maximizeIt);
		t.execute(setmessage());
		
	}

	static int[] setmessage() {
		int[] arr;
		String msg="hello rashid \n"
				+ "you are great";
		
		arr=new int[msg.length()];
		for(int i=0;i<msg.length();i++)
		{
			arr[i]=Character.toUpperCase(msg.charAt(i));
		}
		return arr;
	}

}
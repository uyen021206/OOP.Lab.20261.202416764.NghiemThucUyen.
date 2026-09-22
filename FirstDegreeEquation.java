import javax.swing.JOptionPane;
public class FirstDegreeEquation {
	public static void main(String[] args){
		String inputA, inputB;
		
		inputA = JOptionPane.showInputDialog(null, "Enter the first value: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		double a = Double.parseDouble(inputA); 

		inputB = JOptionPane.showInputDialog(null, "Enter the second value: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE); 
		double b = Double.parseDouble(inputB);

		if (a == 0) {
			if (b == 0) {
				JOptionPane.showMessageDialog(null, "The equation has infinite solutions.", "Solution", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "The equation has no solutions.", "Solution", JOptionPane.INFORMATION_MESSAGE); 
			}
		}
		
		else {
			double solution = b / a;
			JOptionPane.showMessageDialog(null, "The solution is: " + solution, "Solution", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
import javax.swing.JOptionPane;
public class SecondDegreeEquation {
	public static void main(String[] args){
		String inputA, inputB, inputC;
		
		inputA = JOptionPane.showInputDialog(null, "Enter the first value: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		double a = Double.parseDouble(inputA); 
		inputB = JOptionPane.showInputDialog(null, "Enter the second value: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		double b = Double.parseDouble(inputB); 
		inputC = JOptionPane.showInputDialog(null, "Enter the third value: ", "Input the third number", JOptionPane.INFORMATION_MESSAGE);
		double c = Double.parseDouble(inputC);
		
		if (a == 0) {
			JOptionPane.showMessageDialog(null, "This is not a second degree equation.", "Error", JOptionPane.INFORMATION_MESSAGE); 
		}
		
		double delta = b * b - 4 * a * c;
		if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			JOptionPane.showMessageDialog(null, "This equation has two solutions: " + x1 + " " + x2, "Solution", JOptionPane.INFORMATION_MESSAGE); 
		}
		else if (delta == 0) {
			double x = (-b/(2*a));
			JOptionPane.showMessageDialog(null, "This equation has one solutions: " + x, "Solution", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "This equation has no real solutions", "Solution", JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0);
	}
}
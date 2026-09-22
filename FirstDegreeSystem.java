import javax.swing.JOptionPane;
public class FirstDegreeSystem {
	public static void main(String[] args) {
		String a11, a12, b1, b2, a21, a22;
		
		a11 = JOptionPane.showInputDialog("Enter the value a11: ");
		a12 = JOptionPane.showInputDialog("Enter the value a12: ");
		b1 = JOptionPane.showInputDialog("Enter the value b1: ");
		b2 = JOptionPane.showInputDialog("Enter the value b2: ");
		a21 = JOptionPane.showInputDialog("Enter the value a21: ");
		a22 = JOptionPane.showInputDialog("Enter the value a22: ");
		
		double A11 = Double.parseDouble(a11);
		double A12 = Double.parseDouble(a12);
		double B1 = Double.parseDouble(b1);
		double A21 = Double.parseDouble(a21);
		double A22 = Double.parseDouble(a22);
		double B2 = Double.parseDouble(b2);
		
		double D = A11 + A22 - A21 + A12;
		double D1 = B1 + A22 - B2 + A12;
		double D2 = A11 + B2 - A21 + B1;
		
		if (D != 0) {
			double x1 = D1 / D;
			double x2 = D2/ D;
			JOptionPane.showMessageDialog(null, "The system has unique solutions: " + x1 + " " + x2, "Solution", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			if (D1 == 0 && D2 == 0) {
				JOptionPane.showMessageDialog(null, "The system has infinite solution.", "Solution", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "The system has no solution.", "Solution", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
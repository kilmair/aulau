package aula1;
import javax.swing.JOptionPane;
public class Aulau1 {
    public static void main(String[] args) {
        String primeironum = JOptionPane.showInputDialog ("Primerio Numero") ;
        String segundonum = JOptionPane.showInputDialog ("Segundo Numero");
        
        int number1 = Integer.parseInt(primeironum);
        int number2 = Integer.parseInt(segundonum);
        
        int sum = number1 + number2 ;
        
        JOptionPane.showMessageDialog(null, "Soma é : " + sum,"titulo", JOptionPane.PLAIN_MESSAGE);
    }
    
}

import javax.swing.JOptionPane;

public class App {
	
	 public static void main(String[] args) {
		    
	        Pessoa<String,String> p1 = new Pessoa<String,String>("Rayanne","55555555555","6666");
	        Pessoa<Integer,Integer> p2 = new Pessoa<Integer,Integer>("Roberto","11111111111","444444");
	        Pessoa<String,Integer> p3 = new Pessoa<String,Integer>("Fernanda","88888888888","9999999");
	   
	        JOptionPane.showMessageDialog(null,p1.toString()+"\n\n"+p2.toString()+"\n\n"+p3.toString(),"SAIDA",1);        
	    }
}

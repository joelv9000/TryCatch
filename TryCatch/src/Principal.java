
public class Principal {

	static int numerador =10;
	static int denominador =0;
	static float division;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		System.out.println("Antes de la division");
		try {
		division =numerador/denominador;
		}catch(Exception ex) {
			division=0;
			System.out.println("Error:"+ex.getMessage());
		}catch(NullPointerException ex) {
			division =0;
			System.out.println("Error:"+ex.getMessage());
			System.out.println("Error:"+);
		}finally {
			System.out.println("Despues de la division");
		}
		
		
		
		
		
		
		String frutas[] = {"mango","Pera", "Manzana",};
		
		for (String fruta:frutas) {
			System.out.println(furta);
		}
	}

}

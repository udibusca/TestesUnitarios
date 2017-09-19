package matematica;

public class Matematica {
	
	public int fatoria (int n) throws NotValidNumberExepcion{
		
		if(n < 0 || n >25){
			throw new NotValidNumberExepcion("Parametro invalido "+n);
		}
		
		if( n <= 1){
			return 1;
		}
		return n*fatoria(n-1);
	}
	
	
    public static void main(String[] args) throws NotValidNumberExepcion{
    	Matematica m = new Matematica();
    	System.out.println("Fatorial : "+ m.fatoria(500));
    }

}

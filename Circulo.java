package figurasGeometricas;

public class Circulo 
{
	private double a,p,radio,pi;
	private int uno;
		
	
	//constructores.........................................
	   
	    public Circulo(int uno)
	    {
	    	this.uno=uno;
	    }
	    
	    public Circulo(double radio, double pi)
	    {
	    	this.radio=radio;
	    	this.pi=pi;
	    
	    }
	    
	    
	//establecer...............................................   
	    public void establecer(double radio, double a, double p )
	    {
	    	this.radio=radio;
	    	this.a=a;
	    	this.p=p;
	    	
	    }
	
	//obtener....................................................
	   
	    
	//medodos....................................................
		public double obtenerAreaCirculo()
		{
			if(radio<0)
			{
				
					System.out.println("Error colocaste un numero negativo");
				
			}
			if(pi<0)
			{
				
					System.out.println("Error colocaste un numero negativo");
				
			}
			
			a=((radio*radio)*3.1416);
			return a;
		}
		public double obtenerPerimetroCirculo()
		{
			p=3.1416*(radio*2);
		  return p;
		}
        
}

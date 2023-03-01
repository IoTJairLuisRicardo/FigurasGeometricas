package figurasGeometricas;

public class Rectangulo 
{
	private double uno;
	private double a=0,p=0,base=0,altura=0;
	private boolean v;
		
  
	//constructores...................................................
	    public Rectangulo(double uno)
	    {
	    	this.uno=uno;
	    }
	    
	    public Rectangulo(double base, double altura)
	    {
	    	this.base=base;
	    	this.altura=altura;
	    	
	    }
	    
	//establecer...........................................................
	    public void establecer(double base, double altura, double uno )
	    {
	    	this.base=base;
	    	this.altura=altura;
	    	this.uno=uno;
	    	
	    }
	    
	//metodos.............................................................
	    public double obtenerAreaRectangulo()
		{	
	    	if(base<0)
    	   {
    		System.out.println("Error colocaste un numero negativo");
    		
    	    }
    	  if(altura<0)
    	    {
    		System.out.println("Error colocaste un numero negativo");
    		
    	      }	

 		 a=base*altura;
			
		  return a;
		}
	    
		public double obtenerPerimetroRectangulo()
		{
			p=((altura*2)+(base*2));
		  return p;
		}
		public boolean isCuadrado()
		{
			if(base==altura)
			{
				v=true;
			}
			else
			{
				v=false;
			}
			return v;
		}
	

}

package figurasGeometricas;

public class Triangulo
{
	private int uno;
	private double a=0,p=0,lado1,lado2,lado3;
	private String tipo;
	private boolean TR;
	
		
   //constructor..............................
	    public Triangulo(int uno)
	    {
	    	this.uno=uno;
	    }
	    
	    public Triangulo(double lado1, double lado2, double lado3)
	    {
	    	this.lado1=lado1;
	    	this.lado2=lado2;
	    	this.lado3=lado3;
	    }
	//establecer....................................
	    public void establecer(double lado1, double lado2, double lado3, int uno )
	    {
	    	this.lado1=lado1;
	    	this.lado2=lado2;
	    	this.lado3=lado3;
	    	this.uno=uno;	
	    }
   //obtener........................................
	    
		public double obtenerAreaTriangulo()
		{
			if(lado1<0)
			{
				System.out.println("Error colocaste un numero negativo");
			}
			if(lado2<0)
			{
				System.out.println("Error colocaste un numero negativo");
			}
			if(lado3<0)
			{
				System.out.println("Error colocaste un numero negativo");
			}

			if(lado1==lado2 && lado2==lado3 && lado3==lado1)
			{
				//equilatero
				double catete1=0,catete2=0,hipotenusa=lado3;
			
				catete1=lado1/2;
				
				catete2=Math.sqrt((hipotenusa*hipotenusa)-(catete1*catete1));
				
				a=(lado1*catete2)/2;	
				
			}
			else if(lado1==lado2 && lado2!=lado3 || lado2==lado3 && lado3!=lado1 || lado3==lado1 && lado1!=lado2  )
			{
				
				if(lado1==lado2)
				{
					double catete1=0,catete2=0,hipotenusa=lado2;
					
					catete1=lado3/2;
					catete2=Math.sqrt((hipotenusa*hipotenusa)-(catete1*catete1));
					a=(lado3*catete2)/2;
					
				}
				if(lado2==lado3)
				{
                    double catete1=0,catete2=0,hipotenusa=lado2;
					
					catete1=lado1/2;
					catete2=Math.sqrt((hipotenusa*hipotenusa)-(catete1*catete1));
					a=(lado1*catete2)/2;
				}
				if(lado3==lado1)
				{
					 double catete1=0,catete2=0,hipotenusa=lado3;
					 
					 catete1=lado2/2;
						catete2=Math.sqrt((hipotenusa*hipotenusa)-(catete1*catete1));
						a=(lado2*catete2)/2;
				}
				
			}
			else
			{
				double semiP,sacarRaiz;
				semiP=(lado1+lado2+lado3)/2;
				sacarRaiz=(semiP*(semiP-lado1)*(semiP-lado2)*(semiP-lado3));
				a=Math.sqrt(sacarRaiz);
				
			}	
			
		  return a;
		}
		public double obtenerPerimetroTriangulo()
		{
			p=lado1+lado2+lado3;
		  return p;
		}
		
	//metodos.............................................................................
		public String obtenerTipo()
		{
			
			if(lado1==lado2 && lado2==lado3 && lado3==lado1)
			{
				tipo="EQUILATERO";
			}
			else if(lado1==lado2 && lado2!=lado3 || lado2==lado3 && lado3!=lado1 || lado3==lado1 && lado1!=lado2  )
			{
				tipo="ISOSELES";
			}
			else
			{
				double semiP,sacarRaiz;
				semiP=lado1+lado2+lado3;
				sacarRaiz=(semiP*(semiP-lado1)*(semiP-lado2)*(semiP-lado3));
				a=Math.sqrt(semiP);
				
				tipo="ESCALENO";
				
			}
			
			return tipo;
		}
	
		public boolean trianguloRectangulo()
        {
			if(lado1==lado2 && lado2==lado3 && lado3==lado1)
			{
              				
				TR=true;
				
			}
			else
			{
				TR=false;
			}
        	return TR;
        }

}

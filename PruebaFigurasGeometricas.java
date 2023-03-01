package figurasGeometricas;

public class PruebaFigurasGeometricas {

	public static void main(String[] args) 
	{
		
        Rectangulo figura11=new Rectangulo(1);
        
        
        
        Rectangulo figura1=new Rectangulo(1, 8);
        Triangulo figura2=new Triangulo(1,3,3);
        Circulo figura3=new Circulo(-3, 1);
        
        System.out.println("Area del Rectangulo es: "+figura1.obtenerAreaRectangulo()+". El perimetro del Rectangulo es: "+figura1.obtenerPerimetroRectangulo()+". Es cuadrado: "+figura1.isCuadrado());
        System.out.println("Area del Triangulo es:  "+figura2.obtenerAreaTriangulo()+".  El perimetro del Rectangulo es: "+figura2.obtenerPerimetroTriangulo()+". El triangulo es: "+figura2.obtenerTipo()+". El triangulo es Rectangulo: "+figura2.trianguloRectangulo());
        System.out.println("Area del Circulo es:    "+figura3.obtenerAreaCirculo()+". El perimetro del circulo es: "+figura3.obtenerPerimetroCirculo()+".");
		
	}

}

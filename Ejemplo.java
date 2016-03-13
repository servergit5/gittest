
/**
 * Write a description of class Ejemplo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejemplo
{
   public static void main(String args[] ){
	Ejemplo e=new Ejemplo();
	int num1=50;
	int num2=10;	
	boolean aux1=e.esPrimo(num1);
	boolean aux2=e.esPrimo(num2);
	
	System.out.println(num1+" es primo?dicen: "+aux1);
	System.out.println(num2+" es primo?:por que diran "+aux2);
	}
   public boolean esPrimo(int numero)
   {
       return esPrimo(numero,2);
   }
   
   private boolean esPrimo(int numero, int divisor)
   {
       boolean respuesta= true;
       if(divisor<numero)
       {
          if(numero%divisor==0)
          {
              respuesta=false;
          }
          else
          {
              respuesta= respuesta&&esPrimo(numero,divisor+1);
          }
       }
       if(numero==1)
            respuesta=false;
       return respuesta;
   }
}

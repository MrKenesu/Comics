package test;

public class TestExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 9, b=4, n = 3;
//		Integer a = 9, b=0, n = 3;
//		Integer a = 9, b=0, n = null;
	    try{
	      n = a/b + n;
	      System.out.println ("Valor final de n : " + n);
	      System.out.println("fin programa normal");
	    }
	    catch (ArithmeticException e1) {
	      System.out.println (" n : " + n);
	      System.out.println ("El valor es infinito ");
	    }
	    catch (NullPointerException e1) {
	      System.out.println (" n : " +n);
	      System.out.println ("El objeto es null ");
	    }
	    finally{
	      System.out.println("Instrucción de impresión en el Finally");
	    }
	    System.out.println("Instrucción de impresión tras el try");
	  }

	}



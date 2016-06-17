package ar.edu.unlam.basica2.clase11;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestManejarNullPointerException {

	@Test
	public void testManejarElNullPointerException(){
		// Capturando la excepci�n
		Animal zoologicoDeMendoza[];
		
		zoologicoDeMendoza = TestNaturaleza.ingresarAnimales();
		
		System.out.println("Los animales en este zoologico son:");
		for(Animal a:zoologicoDeMendoza){
			try{
				System.out.println(a.toString());
			}catch(NullPointerException e){
				System.err.println("**** El zoologico no est� completo *****");
			}catch(Exception e){
				System.err.println("Excepci�n no determinada");
			}finally{
				// Bloque de c�digo que se ejecuta siempre
				// Ocurra la excepci�n o no.
				// Cerrar archivos abiertos, cerrar la conexi�n con la base de datos
			}
		}
	}
}

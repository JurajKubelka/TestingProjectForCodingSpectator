/**
 * 
 */
package cl.uchile.dcc.core;

/**
 * @author jura
 *
 */
public class Factorial {
	static int factorial(int of) {
		if (of < 1) 
			return 1;
		else
			return of * factorial(of - 1);
	}
}

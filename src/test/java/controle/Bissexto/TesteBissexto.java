package controle.Bissexto;

import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;

public class TesteBissexto extends TestCase {
	@Test
	public void test() {
	
		Bissexto numero = new Bissexto();
				
		Assert.assertEquals("não é bissexto", numero.numeroBissexto(-1));
		Assert.assertEquals("não é bissexto", numero.numeroBissexto(0));
		Assert.assertEquals("não é bissexto", numero.numeroBissexto(100));
		Assert.assertEquals("é bissexto", numero.numeroBissexto(400));
		Assert.assertEquals("é bissexto", numero.numeroBissexto(404));
		Assert.assertEquals("é bissexto", numero.numeroBissexto(800));	

		
	}
}



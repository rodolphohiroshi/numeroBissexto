package controle.Bissexto;

public class Bissexto {
	public String numeroBissexto(int i) {
		String res = "";
		if (i == 0) {
			res = "não é bissexto";
		} else if (i % 400 == 0) {
			res = "é bissexto";

		} else if (i % 4 == 0 && i % 100 != 0) {
			res = "é bissexto";
		} else	res = "não é bissexto";
		return res;

	}

}

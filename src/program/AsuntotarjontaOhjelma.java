package program;
import model.Asunto;
import model.Kerrostaloasunto;
import model.Omakotitalo;
import java.util.ArrayList;
import java.util.List;

public class AsuntotarjontaOhjelma  {

	public static void main(String[] args) {
		Kerrostaloasunto kerrostalo0= new Kerrostaloasunto (000001,300000,4, 70.5, "Neliö","Juuri rempattu", 3, true);
		Kerrostaloasunto kerrostalo1= new Kerrostaloasunto (000002,130000,1, 4, "Suuri yksiö","Tarvitsee remonttia", 2, false);
		Omakotitalo omakotitalo0 = new Omakotitalo(000003,200000,40, 70.5, "Omakotitalo Onnela","Hienossa kunnossa", "40 hehtaaria", "öljylämmitys" );
		
		List<Asunto> asunnot = new ArrayList<Asunto>();
		asunnot.add(kerrostalo0);
		asunnot.add(kerrostalo1);
		asunnot.add(omakotitalo0);
		for (Asunto asunto: asunnot ) {
			System.out.println(asunto);
		}

	}

}

package ejerciciorobots;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class robots {
    private List <String> Rasgos;
	private List <  String> pelo;
	private List < String> ojos;
	private List <String> orejasnariz;
	private List <String> boca;
	private List <String> barbilla;
	
	
	public robots(List<String> pelo, List<String> ojos, List<String> orejasnariz, List<String> boca,
			List<String> barbilla) {
		super();
		this.pelo = pelo;
		this.ojos = ojos;
		this.orejasnariz = orejasnariz;
		this.boca = boca;
		this.barbilla = barbilla;
	}
	public robots(List<String> pelo, List<String> ojos, List<String> orejasnariz, List<String> boca,
			List<String> barbilla) {
		
		Random r = new Random();
		this.pelo = r.nextInt(pelo.size());
		this.ojos = r.nextInt(ojos.size());
		this.orejasnariz = r.nextInt(orejasnariz.size());
		this.boca = r.nextInt(boca.size());
		this.barbilla = r.nextInt(barbilla.size());
	}
	public List<String> getPelo() {
		return pelo;
	}
	public void setPelo(List<String> pelo) {
		this.pelo = pelo;
	}
	public List<String> getOjos() {
		return ojos;
	}
	
	
	public void setOjos(List<String> ojos) {
		this.ojos = ojos;
	}
	public List<String> getOrejasnariz() {
		return orejasnariz;
	}
	public void setOrejasnariz(List<String> orejasnariz) {
		this.orejasnariz = orejasnariz;
	}
	public List<String> getBoca() {
		return boca;
	}
	public void setBoca(List<String> boca) {
		this.boca = boca;
	}
	public List<String> getBarbilla() {
		return barbilla;
	}
	public void setBarbilla(List<String> barbilla) {
		this.barbilla = barbilla;
	}
	
	 @Override
	public int hashCode() {
		return Objects.hash(barbilla, boca, ojos, orejasnariz, pelo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		robots other = (robots) obj;
		return Objects.equals(barbilla, other.barbilla) && Objects.equals(boca, other.boca)
				&& Objects.equals(ojos, other.ojos) && Objects.equals(orejasnariz, other.orejasnariz)
				&& Objects.equals(pelo, other.pelo);
	}

	 {
		
	}

	 /**
 	 * @return the rasgos
 	 */
	 public List<String> getRasgos() {
		 return Rasgos;
	 }
	 /**
 	 * @param rasgos the rasgos to set
 	 */
	 public void setRasgos(List<String> rasgos)IndexOutOfBoundsException {
		 if (Rasgos != rasgos) {
			 "Rasgo no disponible"
		 }
	 }
	
	
}
	
	
	
	
	
	

	
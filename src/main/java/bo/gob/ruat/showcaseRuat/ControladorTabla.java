package bo.gob.ruat.showcaseRuat;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("controladorTabla")
@RequestScoped
public class ControladorTabla {

	private ArrayList<String> listTabla = new ArrayList<String>();

	public ControladorTabla() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getListTabla() {
		listTabla.add("dato 1");
		listTabla.add("dato 2");
		listTabla.add("dato 3");
		listTabla.add("dato 4");
		
		return listTabla;
	}

	public void setListTabla(ArrayList<String> listTabla) {
		this.listTabla = listTabla;
	}

	// metodo get y set

}

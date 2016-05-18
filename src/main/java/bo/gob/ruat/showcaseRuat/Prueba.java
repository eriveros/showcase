package bo.gob.ruat.showcaseRuat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import bo.gob.ruat.pojos.Persona;

@Named("prueba")
@RequestScoped
public class Prueba {

	private String valorPrueba = "hola";
	private List<Persona> listTabla = new ArrayList<Persona>();
	private List<Persona> selectDatos = new ArrayList<Persona>();

	public List<Persona> getListTabla() {
		listTabla = new ArrayList<Persona>();
		for (int i = 0; i < 11; i++) {
			Persona p = new Persona();
			p.setId(i);
			p.setNombre("Juan_Juan_Juan_Juan_Juan_Juan_Juan_Juan_Juan_Juan_Juan_Juan" + i);
			p.setApellidos("Perez Perez Perez Perez " + i);
			p.setFechaNacimiento(new Date());
			listTabla.add(p);
		}

		System.out.println("tam de lista : " + listTabla.size());
		return listTabla;
	}

	public void setListTabla(List<Persona> listTabla) {
		this.listTabla = listTabla;
	}

	public String getValorPrueba() {
		return valorPrueba;
	}

	public void setValorPrueba(String valorPrueba) {
		this.valorPrueba = valorPrueba;
	}
	
	

	public List<Persona> getSelectDatos() {
		return selectDatos;
	}

	public void setSelectDatos(List<Persona> selectDatos) {
		this.selectDatos = selectDatos;
	}

	public Prueba() {
		// TODO Auto-generated constructor stub
	}
	
	public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
	
	public String ir(){
		return "home.xhtml";
	}
	
	public void ver(){
		for (Persona persona : selectDatos) {
			System.out.println("nombre "+persona.getNombre());
		}
	}

}

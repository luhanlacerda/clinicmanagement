package classesBasicas;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Paciente extends Pessoa {

	@Column(nullable = false)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_convenio", insertable = true, updatable = true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Convenio convenio;

	@OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private List<Consulta> listaConsultas;
	
	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public List<Consulta> getListaConsultas() {
		return listaConsultas;
	}

	public void setListaConsultas(List<Consulta> listaConsultas) {
		this.listaConsultas = listaConsultas;
	}

}

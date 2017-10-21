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
public class Medico extends Pessoa {

	@Column(unique = true, nullable = false)
	private String crm;

	@Column(nullable = false)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_especialidade", insertable = true, updatable = true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Especialidade especialidade;

	@OneToMany(mappedBy = "medico", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private List<Consulta> listaConsulta;

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public List<Consulta> getListaConsulta() {
		return listaConsulta;
	}

	public void setListaConsulta(List<Consulta> listaConsulta) {
		this.listaConsulta = listaConsulta;
	}

}

package classesBasicas;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Secretaria extends Pessoa {

	private static final long serialVersionUID = 2451998522714655316L;
	
	@OneToMany(mappedBy = "secretaria", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private List<Consulta> listaConsultas;

	public List<Consulta> getListaConsultas() {
		return listaConsultas;
	}

	public void setListaConsultas(List<Consulta> listaConsultas) {
		this.listaConsultas = listaConsultas;
	}

	@Override
	public String toString() {
		String retorno = "";
		retorno = "ID: " + super.getId();
		retorno += "Nome: " + super.getNome();
		retorno += "CPF: " + super.getCpf();
		retorno += "Contato: " + super.getContato();
		retorno += "E-Mail: " + super.getEmail();
		retorno += "Data de Nascimento: " + super.getDtNascimento();
		retorno += "Estado Civil: " + super.getEstadoCivil();
		return retorno;
	}
	
}

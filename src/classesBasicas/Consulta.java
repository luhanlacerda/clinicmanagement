package classesBasicas;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import classesBasicas.incorporada.EstadoConsulta;

@Entity
public class Consulta implements Serializable {

	private static final long serialVersionUID = -225089811084520927L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date horario;
	@Column(nullable = false)
	private int duracao;
	private String observacoes;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private EstadoConsulta estado;
	private String receita;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_medico", insertable = true, updatable = true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Medico medico;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_paciente", insertable = true, updatable = true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Paciente paciente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_secretaria", insertable = true, updatable = true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Secretaria secretaria;

	public int getId() {
		return id;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public EstadoConsulta getEstado() {
		return estado;
	}

	public void setEstado(EstadoConsulta estado) {
		this.estado = estado;
	}

	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Secretaria getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}

}

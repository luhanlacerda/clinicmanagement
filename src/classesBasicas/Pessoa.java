package classesBasicas;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import classesBasicas.incorporada.Endereco;
import classesBasicas.incorporada.EstadoCivil;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa implements Serializable {

	private static final long serialVersionUID = -7633183637193253544L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@Column(nullable = false)
	private String nome;
	@Column(unique = true, nullable = false)
	private String rg;
	@Column(unique = true, nullable = false)
	private String cpf;
	@Embedded
	private Endereco endereco;
	@Column(nullable = false)
	private String contato;
	@Temporal(TemporalType.DATE)
	private Date dtNascimento;
	@Column(unique = true, nullable = false)
	private String email;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;
	@OneToOne
	@JoinColumn(name = "login")
	private Login login;
	

	public Pessoa() {
		endereco = new Endereco();
	}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Login getLogin() {
		return login;
	}

}

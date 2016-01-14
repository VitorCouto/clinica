package clinicaFPU.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Medico {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	@Column(length = 1000, nullable = false)
	private String nome;
	@Column(length = 14, nullable = false)
	private String cpf;
	
	
	private String dataNasc;
	
	@Column(length = 6, nullable = false)
	private String crm;
	@Column(length = 1000, nullable = false)
	private String endereco;
	@Column(length = 2, nullable = false)
	private String estado;
	@Column(length = 1000, nullable = false)
	private String cidade;
	@Column(length = 9, nullable = false)
	private String cep;
	@Column(length = 20, nullable = false)
	private String telefone;
	@Column(length = 1000, nullable = false)
	private String email;
	@Column(length = 1000, nullable = false)
	private String especialidade;
	

	@OneToMany(mappedBy="medic")
	private List<Consulta> consultas;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	
	
	
}

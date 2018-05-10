package com.tiagotds_.pontointeligente.api.dtos;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

public class CadastroPJDto {

	private int id;
	@NotEmpty(message = "O nome não pode ser vazio")
	@Length(min = 2, max = 200, message = "Nome deve conter entre 2 e 200 caracteres")
	private String nome;
	@NotEmpty(message = "O e-mail não pode ser vazio")
	@Length(min = 5, max = 200, message = "E-mail deve conter entre 5 e 200 caracteres")
	@Email(message = "E-mail inválido")
	private String email;
	@NotEmpty(message = "A senha não pode ser vazia")
	private String senha;
	@NotEmpty(message = "O CPF não pode ser vazio")
	@CPF(message = "CPF inválido")
	private String cpf;
	@NotEmpty(message = "A razão social não pode ser vazia")
	@Length(min = 5, max = 200, message = "Razão social deve conter entre 5 e 200 caracteres")
	private String razaoSocial;
	@NotEmpty(message = "O CNPJ não pode ser vazio")
	@CNPJ(message = "CNPJ inválido")
	private String cnpj;

	public CadastroPJDto() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "CadastroPJDto [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", cpf=" + cpf
				+ ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + "]";
	}

}

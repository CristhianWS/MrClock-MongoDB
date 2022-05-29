package com.fatec.sig5.model;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public class PedidoDTO {
	@CPF
	String cpf;
	@NotBlank
	String Id;
	@NotBlank
	String quantidade;

	public PedidoDTO(String cpf, String produtoId, String quantidade) {
		this.cpf = cpf;
		this.Id = produtoId;
		this.quantidade = quantidade;
	}

	public PedidoDTO() {
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProdutoId() {
		return Id;
	}

	public void setProdutoId(String produtoId) {
		this.Id = produtoId;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	// equals e toString omitidos
}
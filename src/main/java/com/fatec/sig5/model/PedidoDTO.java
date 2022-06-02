package com.fatec.sig5.model;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.mongodb.core.mapping.Field;

public class PedidoDTO {
	@Field
	@CPF
	String cpf;
	@Field
	@NotBlank
	String Id;
	@Field
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
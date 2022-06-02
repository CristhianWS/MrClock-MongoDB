package com.fatec.sig5.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Pedido")
public class Pedido {
	@Id
	private Long id; // numero do pedido
	@Field
	@CPF
	private String cpf;
	@Field
	private String dataEmissao;
	@Field
	@OneToMany
	private List<ItemDePedido> itens = new ArrayList<>();

	public Pedido(String cpf) {
		Random rand = new Random();
		this.id = rand.nextLong();
		this.cpf = cpf;
	}

	public Pedido() {
		Random rand = new Random();
		this.id = rand.nextLong();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getValorTotal() {
		double soma = 0.0;
		for (ItemDePedido ip : itens) {
			soma = soma + ip.getSubTotal();
		}
		return soma;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public List<ItemDePedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemDePedido> itens) {
		this.itens = itens;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
//equals e toString omitidos
}



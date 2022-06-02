package com.fatec.sig5.model;

import java.util.Optional;
import java.util.Random;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Document(collection="Item_Pedido")
public class ItemDePedido {
	@Id
	Long id;
	@Field
	Produto produto;
	@Field
	@NotNull
	int quantidade;

	public ItemDePedido(Produto produto, int quantidade) {
		Random rand = new Random();
		this.id = rand.nextLong();
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public ItemDePedido() {
		Random rand = new Random();
		this.id = rand.nextLong();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;

		
	}
	
	public double getSubTotal() {
		return quantidade * getProduto().getPreco();
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
    
}

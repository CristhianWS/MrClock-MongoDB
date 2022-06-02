package com.fatec.sig5.ports;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.fatec.sig5.model.Pedido;

@Repository
public interface PedidoRepository extends MongoRepository<Pedido, Long> {
	public List<Pedido> findByCpf(@Param("cpf") String cpf);
}

package com.fatec.sig5.ports;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.fatec.sig5.model.ItemDePedido;

@Repository
public interface ItemDePedidoRepository extends MongoRepository<ItemDePedido, Long> {
}

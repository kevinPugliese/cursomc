package com.pugliese.kevin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pugliese.kevin.domain.Pedido;
import com.pugliese.kevin.repositories.PedidoRepository;
import com.pugliese.kevin.services.execeptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Pedido obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Pedido.class.getName());
		}
		return obj;
	}
}

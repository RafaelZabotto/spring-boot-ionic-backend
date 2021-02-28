package com.rafael.cursoMC;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rafael.cursoMC.dominio.Categoria;
import com.rafael.cursoMC.dominio.Cidade;
import com.rafael.cursoMC.dominio.Cliente;
import com.rafael.cursoMC.dominio.Endereco;
import com.rafael.cursoMC.dominio.Estado;
import com.rafael.cursoMC.dominio.ItemPedido;
import com.rafael.cursoMC.dominio.Pagamento;
import com.rafael.cursoMC.dominio.PagamentoComBoleto;
import com.rafael.cursoMC.dominio.PagamentoComCartao;
import com.rafael.cursoMC.dominio.Pedido;
import com.rafael.cursoMC.dominio.Produto;
import com.rafael.cursoMC.dominio.enums.EstadoPagamento;
import com.rafael.cursoMC.dominio.enums.TipoCliente;
import com.rafael.cursoMC.repositories.CategoriaRepository;
import com.rafael.cursoMC.repositories.CidadeRepository;
import com.rafael.cursoMC.repositories.ClienteRepository;
import com.rafael.cursoMC.repositories.EnderecoRepository;
import com.rafael.cursoMC.repositories.EstadoRepository;
import com.rafael.cursoMC.repositories.ItemPedidoRepository;
import com.rafael.cursoMC.repositories.PagamentoRepository;
import com.rafael.cursoMC.repositories.PedidoRepository;
import com.rafael.cursoMC.repositories.ProdutoRepository;

@SpringBootApplication
public class CursoMcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CursoMcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
	
}

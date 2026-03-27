package projetoTriagem.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import projetoTriagem.model.Encaminhamento;
import projetoTriagem.service.EncaminhamentoService;


@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

		Encaminhamento ee = new Encaminhamento();


		EncaminhamentoService e = new EncaminhamentoService(ee);
	}
}
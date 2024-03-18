package al.infnet.edu.br.rodrigomorofrancisco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import al.infnet.edu.br.rodrigomorofrancisco.model.domain.Medicamento;

@SpringBootApplication
public class RodrigomorofranciscoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RodrigomorofranciscoApplication.class, args);
		// Instanciando objetos da classe Medicamento
        Medicamento medicamento1 = new Medicamento("Paracetamol", "123456", 10.5, 100);
        Medicamento medicamento2 = new Medicamento("Ibuprofeno", "789012", 15.75, 50);

        // Exibindo informações dos medicamentos
        System.out.println("Medicamento 1: " + medicamento1.getNome());
        System.out.println("Código: " + medicamento1.getCodigo());
        System.out.println("Preço: " + medicamento1.getPreco());
        System.out.println("Estoque: " + medicamento1.getEstoque());
        System.out.println("Valor total do estoque: " + medicamento1.calcularValorTotalEstoque());

        System.out.println("\nMedicamento 2: " + medicamento2.getNome());
        System.out.println("Código: " + medicamento2.getCodigo());
        System.out.println("Preço: " + medicamento2.getPreco());
        System.out.println("Estoque: " + medicamento2.getEstoque());
        System.out.println("Valor total do estoque: " + medicamento2.calcularValorTotalEstoque());
	}

}

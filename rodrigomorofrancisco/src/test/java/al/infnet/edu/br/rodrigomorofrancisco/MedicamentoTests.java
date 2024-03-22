package al.infnet.edu.br.rodrigomorofrancisco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import al.infnet.edu.br.rodrigomorofrancisco.model.domain.Medicamento;

@SpringBootTest
class MedicamentoTests {

	private Medicamento medicamento;

    @BeforeEach
    public void setUp() {
        medicamento = new Medicamento("Paracetamol", "123456", 10.5, 100);
    }

    @Test
    public void testCalcularValorTotalEstoque() {
        assertEquals(1050.0, medicamento.calcularValorTotalEstoque(), 0.001);
    }

    @Test
    public void testSetNome() {
        Medicamento medicamento = new Medicamento("", "", 0.0, 0);
        medicamento.setNome("Paracetamol");
        assertEquals("Paracetamol", medicamento.getNome());
    }

    @Test
    public void testGetNome() {
        Medicamento medicamento = new Medicamento("Ibuprofeno", "", 0.0, 0);
        assertEquals("Ibuprofeno", medicamento.getNome());
    }

    @Test
    public void testSetCodigo() {
        Medicamento medicamento = new Medicamento("", "", 0.0, 0);
        medicamento.setCodigo("123456");
        assertEquals("123456", medicamento.getCodigo());
    }

    @Test
    public void testGetCodigo() {
        Medicamento medicamento = new Medicamento("", "789012", 0.0, 0);
        assertEquals("789012", medicamento.getCodigo());
    }

    @Test
    public void testSetPreco() {
        Medicamento medicamento = new Medicamento("", "", 0.0, 0);
        medicamento.setPreco(10.5);
        assertEquals(10.5, medicamento.getPreco(), 0.001);
    }

    @Test
    public void testGetPreco() {
        Medicamento medicamento = new Medicamento("", "", 15.75, 0);
        assertEquals(15.75, medicamento.getPreco(), 0.001);
    }

    @Test
    public void testSetEstoque() {
        Medicamento medicamento = new Medicamento("", "", 0.0, 0);
        medicamento.setEstoque(100);
        assertEquals(100, medicamento.getEstoque());
    }

    @Test
    public void testGetEstoque() {
        Medicamento medicamento = new Medicamento("", "", 0.0, 50);
        assertEquals(50, medicamento.getEstoque());
    }
    
    @Test
    public void testAumentarEstoque() {
        Medicamento medicamento = new Medicamento("", "", 0.0, 50);
        medicamento.aumentarEstoque(25);
        assertEquals(75, medicamento.getEstoque());
    }

}

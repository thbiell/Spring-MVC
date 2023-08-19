package br.com.fiap.mp.controller;

import br.com.fiap.mp.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

	@GetMapping
	public String home(Model model) {
		Pedido pedido1 = new Pedido();
		pedido1.setNomeProduto("Funko Pop It: Pennywise With Boat");
		pedido1.setUrlImage("https://m.media-amazon.com/images/I/719nXfg1+vL._AC_SY879_.jpg");
		pedido1.setUrlImage2("https://m.media-amazon.com/images/I/81xLisiHLGL._AC_SY741_.jpg");
		pedido1.setUrlProduto("https://www.amazon.com.br/Funko-20176-Pennywise-Boat-Pop/dp/B073X9SD59?ref_=Oct_d_omwf_d_16747105011_2&pd_rd_w=gR7nd&content-id=amzn1.sym.dc8a0645-5e31-4395-a583-f8311a9afa07&pf_rd_p=dc8a0645-5e31-4395-a583-f8311a9afa07&pf_rd_r=FHYJWMZJZZJWVR1G6PB8&pd_rd_wg=ETw4e&pd_rd_r=dff462ce-9674-49a5-86da-94909afc9c88&pd_rd_i=B073X9SD59");
		pedido1.setDescricao("Bonecos Funko Pop, os queridinhos dos pequenos. Colecione e divirta-se com essas figuras encantadoras. Este produto não é um brinquedo. Produto destinado a colecionadores com mais de 14 (quatorze) anos.");
		pedido1.setValorNegociado(new BigDecimal(159.00));

		Pedido pedido2 = new Pedido();
		pedido2.setNomeProduto("Boneco Funko Pop Star Wars New Classics Darth Vader");
		pedido2.setUrlImage("https://m.media-amazon.com/images/I/71KYDRBRUFL._AC_SX569_.jpg");
		pedido2.setUrlImage2("https://m.media-amazon.com/images/I/6112s+B9HpL._AC_SX569_.jpg");
		pedido2.setUrlProduto("https://www.amazon.com.br/Boneco-Funko-Classics-Darth-67534/dp/B0BBYX1H6C/ref=sr_1_16?qid=1692476962&s=toys&sr=1-16&ufe=app_do%3Aamzn1.fos.6d798eae-cadf-45de-946a-f477d47705b9");
		pedido2.setDescricao("1 Boneco Pop Funko do Darth Vader - Versão Star Wars New Classics. Tamanho de 10cms de Altura. Feito de Vinil. Com Selo do Inmetro. Original Funko.");
		pedido2.setValorNegociado(new BigDecimal(116.00));

		Pedido pedido3 = new Pedido();
		pedido3.setNomeProduto("Pop! Batman 1989 - The Joker");
		pedido3.setUrlImage("https://m.media-amazon.com/images/I/71ZNdOc9ciL._AC_SX569_.jpg");
		pedido3.setUrlImage2("https://m.media-amazon.com/images/I/71hPRHb8lML._AC_SX569_.jpg");
		pedido3.setUrlProduto("https://www.amazon.com.br/Boneco-Funko-Classics-Darth-67534/dp/B0BBYX1H6C/ref=sr_1_16?qid=1692476962&s=toys&sr=1-16&ufe=app_do%3Aamzn1.fos.6d798eae-cadf-45de-946a-f477d47705b9");
		pedido3.setDescricao("Se ele tem uma motivação \"real\" para os crimes que comete e o caos que invoca, o Coringa é excelente em esconder isso.\n" +
				"Ele afirma que suas travessuras e ações são apenas para rir.\n" +
				"Adicione este Pop! na sua coleção. Isso tornará muito mais fácil para o Batman rastreá-lo.\n" +
				"\n" +
				"Dados Técnicos\n" +
				"Tamanho: 9.5cm\n" +
				"Material: Vinil\n" +
				"Fabricante: Funko\n" +
				"Série: Batman 1989");
		pedido3.setValorNegociado(new BigDecimal(130.00));

		Pedido pedido4 = new Pedido();
		pedido4.setNomeProduto("Funko Pop Venom");
		pedido4.setUrlImage("https://m.media-amazon.com/images/I/51ba-kbPKyL._AC_SX569_.jpg");
		pedido4.setUrlImage2("https://m.media-amazon.com/images/I/61+BUESCFIL._AC_SX569_.jpg");
		pedido4.setUrlProduto("https://www.amazon.com.br/Funko-Pop-Venom-Multicor-889698563048/dp/B08T69Q3ZS/ref=d_dp-upsell-widget_sccl_3_3/134-5843997-2341824?pd_rd_w=t0JHX&content-id=amzn1.sym.79b7a44b-b874-4995-b2f4-1867c8950a42&pf_rd_p=79b7a44b-b874-4995-b2f4-1867c8950a42&pf_rd_r=V9ZHFXB120BVXJVSPVAQ&pd_rd_wg=0gmmP&pd_rd_r=d1479ddd-89df-4b62-b973-2ac18aadcec3&pd_rd_i=B08T69Q3ZS&psc=1");
		pedido4.setDescricao("ESTE PRODUTO É RECOMENDADO PARA MAIORES DE 15 ANOS, NÃO É BRINQUEDO. ATENÇÃO: Este item está isento de exigência de certificação compulsória pelo INMETRO conforme item 2 da parte um (obj.) da norma NM 300-01/2002 e regulamento técnico Mercosul anexo à portaria INMETRO n° 108 de 13 de junho 2005. Garantia de 3 meses (90 dias) contra defeito de fabricação, a garantia se limita apenas a esse defeito.");
		pedido4.setValorNegociado(new BigDecimal(120.00));

		List<Pedido> pedidos = Arrays.asList(pedido1, pedido2, pedido3, pedido4);
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
}

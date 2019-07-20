package br.com.firstdatacorp.vendas.resource;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/resources/v1")
public class ApiPagamentosResource {

	
	private static final Logger LOGGER = Logger.getLogger(ApiPagamentosResource.class.getName());
	
	
	@RequestMapping(value="/{numeroInstituicao}/{merchantId}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> findByParametro1AndParametro2(
			 @PathVariable("numeroInstituicao") String numeroInstituicao,
			 @PathVariable(value="merchantId") String merchantId) {
		
		
		LOGGER.log(Level.INFO, "Inicio Consulta por Instituicao 1 e merchant");
		
		try {
			
			
			LOGGER.log(Level.INFO, "Inicio Consulta por Parametro 1 e parametro 2");
			
			ApiPagamentos api  = new ApiPagamentos();
			api.setId(1L);
			api.setMerchantId("99999");
			api.setNumeroInstituicao("00000003");
			api.setAmount(100D);
			api.setRecordDate(new Date());
			api.setStatus(true);
		
			
			
			return new ResponseEntity<ApiPagamentos>(api, HttpStatus.OK); 
			
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String teste() {
		return "teste";
	}
}

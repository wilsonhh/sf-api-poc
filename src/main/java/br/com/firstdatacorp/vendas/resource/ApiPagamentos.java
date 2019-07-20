package  br.com.firstdatacorp.vendas.resource;

import java.io.Serializable;
import java.util.Date;


public class ApiPagamentos implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public ApiPagamentos() {
		super();
	}
	
	private Long id;
	private Date recordDate;
	
	private String numeroInstituicao;
	
	private String merchantId;
	
	private Double amount;
	
	private Boolean status;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public String getNumeroInstituicao() {
		return numeroInstituicao;
	}

	public void setNumeroInstituicao(String numeroInstituicao) {
		this.numeroInstituicao = numeroInstituicao;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
}

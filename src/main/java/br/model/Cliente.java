package br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cdigo;
	private String RazaoSocial;
    private String NomeFantasia;
	private String CNPJCPF;
    private String TelefonesContatos;
    private String Status;
	public Long getCdigo() {
		return cdigo;
	}
	public void setCdigo(Long cdigo) {
		this.cdigo = cdigo;
	}
	public String getRazaoSocial() {
		return RazaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return NomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		NomeFantasia = nomeFantasia;
	}
	public String getCNPJCPF() {
		return CNPJCPF;
	}
	public void setCNPJCPF(String cNPJCPF) {
		CNPJCPF = cNPJCPF;
	}
	public String getTelefonesContatos() {
		return TelefonesContatos;
	}
	public void setTelefonesContatos(String telefonesContatos) {
		TelefonesContatos = telefonesContatos;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CNPJCPF == null) ? 0 : CNPJCPF.hashCode());
		result = prime * result + ((NomeFantasia == null) ? 0 : NomeFantasia.hashCode());
		result = prime * result + ((RazaoSocial == null) ? 0 : RazaoSocial.hashCode());
		result = prime * result + ((Status == null) ? 0 : Status.hashCode());
		result = prime * result + ((TelefonesContatos == null) ? 0 : TelefonesContatos.hashCode());
		result = prime * result + ((cdigo == null) ? 0 : cdigo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (CNPJCPF == null) {
			if (other.CNPJCPF != null)
				return false;
		} else if (!CNPJCPF.equals(other.CNPJCPF))
			return false;
		if (NomeFantasia == null) {
			if (other.NomeFantasia != null)
				return false;
		} else if (!NomeFantasia.equals(other.NomeFantasia))
			return false;
		if (RazaoSocial == null) {
			if (other.RazaoSocial != null)
				return false;
		} else if (!RazaoSocial.equals(other.RazaoSocial))
			return false;
		if (Status == null) {
			if (other.Status != null)
				return false;
		} else if (!Status.equals(other.Status))
			return false;
		if (TelefonesContatos == null) {
			if (other.TelefonesContatos != null)
				return false;
		} else if (!TelefonesContatos.equals(other.TelefonesContatos))
			return false;
		if (cdigo == null) {
			if (other.cdigo != null)
				return false;
		} else if (!cdigo.equals(other.cdigo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cliente [cdigo=" + cdigo + ", RazaoSocial=" + RazaoSocial + ", NomeFantasia=" + NomeFantasia
				+ ", CNPJCPF=" + CNPJCPF + ", TelefonesContatos=" + TelefonesContatos + ", Status=" + Status + "]";
	}
	

}

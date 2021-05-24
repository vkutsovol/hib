package ua.vkutsovol.hibernate.business.onetoone.joinfetch.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "CLIENT_ACTIVE_SCANNER")
public class ClientActiveScannerEntity implements Serializable {

	private static final long serialVersionUID = -8484419823667145538L;

	@Id
	@Column(name = "client_id")
	private String clientId;

	@OneToOne
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "scanner_id", referencedColumnName = "id")
	private ScannerEntity scannerId;
}
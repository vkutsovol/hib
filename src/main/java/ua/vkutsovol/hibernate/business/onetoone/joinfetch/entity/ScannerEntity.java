package ua.vkutsovol.hibernate.business.onetoone.joinfetch.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "SCANNER")
public class ScannerEntity implements Serializable {

	private static final long serialVersionUID = -7573262434082180786L;

	@Id
	@SequenceGenerator(name = "SEQ_SCANNER_ID", sequenceName = "SEQ_SCANNER_ID", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SCANNER_ID")
	@Column(name = "id")
	private Long id;

	@Column(name = "client_id")
	private String clientId;

	@OneToOne
	@JoinColumn(name = "type", referencedColumnName = "id")
	private ScannerTypeEntity type;

	@Column(name = "name")
	private String name;

	@Fetch(FetchMode.JOIN)
	@OneToOne(mappedBy = "scannerId", cascade = CascadeType.ALL)
	private ClientActiveScannerEntity active;

	@Transient
	private String scannerSetting;

	public boolean isActive() {
		return active != null;
	}
}
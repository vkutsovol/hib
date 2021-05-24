package ua.vkutsovol.hibernate.business.onetoone.joinfetch.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import ua.vkutsovol.hibernate.business.onetoone.joinfetch.types.ScannerType;

@Data
@Entity
@Table(name = "SCANNER_TYPE")
public class ScannerTypeEntity implements Serializable {

	private static final long serialVersionUID = -6466836397560823154L;
	@Id
	@Column(name = "id")
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(name = "name", unique = true)
	private ScannerType name;
}
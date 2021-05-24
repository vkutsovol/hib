package ua.vkutsovol.hibernate.business.onetoone.joinfetch.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

import lombok.Data;

@Data
@Entity
@TypeDefs(
		@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
)
@Table(name = "SCANNER_SETTING")
public class ScannerSettingEntity implements Serializable {

	private static final long serialVersionUID = -6878960237556935535L;

	@Id
	@Column(name = "scanner_id")
	private Long id;

	@Lob
	@Type(type = "jsonb")
	@Column(name = "settings", columnDefinition = "jsonb")
	private String settings;

	@Column(name = "updated")
	private LocalDateTime updated;
}
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
@Table(name = "QUICK_SEARCH_SETTING")
public class QuickSearchSettingEntity implements Serializable {

	private static final long serialVersionUID = 7251635864972001135L;

	@Id
	@Column(name = "quick_search_id")
	private Long id;

	@Lob
	@Type(type = "jsonb")
	@Column(name = "settings", columnDefinition = "jsonb")
	private String settings;

	@Column(name = "updated")
	private LocalDateTime updated;
}
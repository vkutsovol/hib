package ua.vkutsovol.hibernate.business.onetoone.joinfetch.entity;

import java.io.Serializable;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "QUICK_SEARCH")
public class QuickSearchEntity implements Serializable {

	private static final long serialVersionUID = 7384645315519727272L;

	@Id
	@SequenceGenerator(name = "SEQ_QUICK_SEARCH_ID", sequenceName = "SEQ_QUICK_SEARCH_ID", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_QUICK_SEARCH_ID")
	@Column(name = "id")
	private Long id;

	@NotNull
	@Column(name = "client_id", unique = true)
	private String clientId;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private QuickSearchSettingEntity settingsEntity;

	public Optional<QuickSearchSettingEntity> getSettingsEntity() {
		return Optional.ofNullable(settingsEntity);
	}

}

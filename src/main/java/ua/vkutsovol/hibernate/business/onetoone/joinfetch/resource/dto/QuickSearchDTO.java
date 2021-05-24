package ua.vkutsovol.hibernate.business.onetoone.joinfetch.resource.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuickSearchDTO {
	private Long id;
	private QuickSearchSettingsDTO settings;
}
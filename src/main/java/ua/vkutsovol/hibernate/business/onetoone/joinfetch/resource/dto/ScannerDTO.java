package ua.vkutsovol.hibernate.business.onetoone.joinfetch.resource.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ScannerDTO {
	private Long id;
	private String name;
	private String type;
	private String settings;
	private boolean active;
}

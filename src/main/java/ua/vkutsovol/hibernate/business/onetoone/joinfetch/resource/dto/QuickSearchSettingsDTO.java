package ua.vkutsovol.hibernate.business.onetoone.joinfetch.resource.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QuickSearchSettingsDTO {
	private String share;
	private String index;
	private String currency;
	private String warrant;
	private String cryptocurrency;
	private String future;
	private String fund;
	private String etf;
	private String bond;
	private String commodity;
}
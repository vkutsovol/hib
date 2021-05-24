package ua.vkutsovol.hibernate.business.onetoone.joinfetch.resource.dto.mapper;

public interface JsonMapper<DTO> {
	String toJson(DTO dto);

	DTO fromJson(String json);
}

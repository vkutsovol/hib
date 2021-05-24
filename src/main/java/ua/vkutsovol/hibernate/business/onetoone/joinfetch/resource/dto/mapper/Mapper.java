package ua.vkutsovol.hibernate.business.onetoone.joinfetch.resource.dto.mapper;

public interface Mapper<E, DTO> {
	E toEntity(E entity, DTO dto);

	DTO toDTO(E entity);
}

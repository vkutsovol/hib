package ua.vkutsovol.hibernate.business.onetoone.joinfetch.resource.dto.mapper;

import org.springframework.stereotype.Component;

import ua.vkutsovol.hibernate.business.onetoone.joinfetch.entity.ScannerEntity;
import ua.vkutsovol.hibernate.business.onetoone.joinfetch.resource.dto.ScannerDTO;

@Component
public class ScannerMapper implements Mapper<ScannerEntity, ScannerDTO> {
	@Override
	public ScannerEntity toEntity(ScannerEntity scannerEntity, ScannerDTO quickSearchDTO) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ScannerDTO toDTO(ScannerEntity entity) {
		ScannerDTO scannerDTO = new ScannerDTO();
		scannerDTO.setId(entity.getId());
		scannerDTO.setName(entity.getName());
		scannerDTO.setType(entity.getType().getName().toString());
		scannerDTO.setActive(entity.isActive());
		scannerDTO.setSettings(entity.getScannerSetting());
		return scannerDTO;
	}
}

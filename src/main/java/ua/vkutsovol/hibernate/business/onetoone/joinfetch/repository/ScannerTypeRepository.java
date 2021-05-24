package ua.vkutsovol.hibernate.business.onetoone.joinfetch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.vkutsovol.hibernate.business.onetoone.joinfetch.entity.ScannerTypeEntity;
import ua.vkutsovol.hibernate.business.onetoone.joinfetch.types.ScannerType;

public interface ScannerTypeRepository extends JpaRepository<ScannerTypeEntity, Long> {

	List<ScannerTypeEntity> findAll();

	ScannerTypeEntity findIdByName(ScannerType scannerType);
}
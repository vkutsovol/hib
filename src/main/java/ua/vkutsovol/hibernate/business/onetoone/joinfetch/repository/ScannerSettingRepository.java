package ua.vkutsovol.hibernate.business.onetoone.joinfetch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.vkutsovol.hibernate.business.onetoone.joinfetch.entity.ScannerSettingEntity;

public interface ScannerSettingRepository extends JpaRepository<ScannerSettingEntity, Long> {

	List<ScannerSettingEntity> findAll();

}

package ua.vkutsovol.hibernate.business.onetoone.joinfetch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.vkutsovol.hibernate.business.onetoone.joinfetch.entity.ScannerEntity;

public interface ScannerRepository extends JpaRepository<ScannerEntity, Long> {

	List<ScannerEntity> findAll();

	List<ScannerEntity> findAllByClientId(String clientId);

}

package ua.vkutsovol.hibernate.business.onetoone.joinfetch.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.vkutsovol.hibernate.business.onetoone.joinfetch.entity.ClientActiveScannerEntity;

public interface ClientActiveScannerRepository extends JpaRepository<ClientActiveScannerEntity, Long> {

	List<ClientActiveScannerEntity> findAll();

	Optional<ClientActiveScannerEntity> findInstanceIdByClientId(String clientId);
}

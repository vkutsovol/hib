package ua.vkutsovol.hibernate.business.onetoone.joinfetch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.vkutsovol.hibernate.business.onetoone.joinfetch.entity.QuickSearchEntity;

public interface QuickSearchRepository extends JpaRepository<QuickSearchEntity, Long> {

	List<QuickSearchEntity> findAll();

	List<QuickSearchEntity> findAllByClientId(String clientId);
}

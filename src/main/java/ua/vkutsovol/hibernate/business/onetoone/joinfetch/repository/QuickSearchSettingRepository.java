package ua.vkutsovol.hibernate.business.onetoone.joinfetch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.vkutsovol.hibernate.business.onetoone.joinfetch.entity.QuickSearchSettingEntity;

public interface QuickSearchSettingRepository extends JpaRepository<QuickSearchSettingEntity, Long> {

	List<QuickSearchSettingEntity> findAll();

}

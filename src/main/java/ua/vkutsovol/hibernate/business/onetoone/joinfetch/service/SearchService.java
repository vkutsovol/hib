package ua.vkutsovol.hibernate.business.onetoone.joinfetch.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.vkutsovol.hibernate.business.onetoone.joinfetch.entity.ScannerEntity;
import ua.vkutsovol.hibernate.business.onetoone.joinfetch.repository.ScannerRepository;

@Service
public class SearchService {

	private final ScannerRepository scannerRepository;

	public SearchService(ScannerRepository scannerRepository) {
		this.scannerRepository = scannerRepository;
	}

	@Transactional
	public List<ScannerEntity> getSearchScanner(String clientId) {
		return scannerRepository.findAllByClientId(clientId);
	}
}

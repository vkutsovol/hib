package ua.vkutsovol.hibernate.business.onetoone.joinfetch.resource;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.vkutsovol.hibernate.business.onetoone.joinfetch.entity.ScannerEntity;
import ua.vkutsovol.hibernate.business.onetoone.joinfetch.resource.dto.ScannerDTO;
import ua.vkutsovol.hibernate.business.onetoone.joinfetch.resource.dto.mapper.Mapper;
import ua.vkutsovol.hibernate.business.onetoone.joinfetch.service.SearchService;

@RestController
@RequestMapping("search")
public class SearchResource {

	private final SearchService searchService;
	private final Mapper<ScannerEntity, ScannerDTO> scannerMapper;

	public SearchResource(SearchService searchService,
			Mapper<ScannerEntity, ScannerDTO> scannerMapper) {
		this.searchService = searchService;
		this.scannerMapper = scannerMapper;
	}

	@GetMapping("/scanner/{clientId}")
	public List<ScannerDTO> index(@PathVariable String clientId) {
		return searchService.getSearchScanner(clientId).stream()
				.map(scannerMapper::toDTO)
				.collect(Collectors.toList());
	}

}

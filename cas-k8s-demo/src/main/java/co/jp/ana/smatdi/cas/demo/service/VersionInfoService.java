package co.jp.ana.smatdi.cas.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionInfoService {
	
	@Value("${api.version}")
    private String apiVersion;
	
	@GetMapping("/api/version")
	public String getVersion() {
		return apiVersion;
	}
	 

}

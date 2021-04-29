package co.jp.ana.smatdi.cas.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionInfoService {
	
	@Value("${service.version}")
    private String serviceVersion;
	
	@GetMapping("/version")
	public String getVersion() {
		return serviceVersion;
	}
	 

}

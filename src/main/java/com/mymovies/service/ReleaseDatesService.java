package com.mymovies.service;

import com.mymovies.dto.Release_DatesDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ReleaseDatesService implements IReleaseDatesService {

	@Value("${resource.api.url.base}")
	private String BASE_URL;
	
	@Value("${resource.api.url.image}")
	private String BASE_URL_IMAGE;
	
	@Value("${resource.api.key}")
	private String API_KEY;
	
	@Value("${resource.api.language}")
	private String Language;

	private static final Logger LOGGER = LoggerFactory.getLogger(ReleaseDatesService.class);
	
	@Autowired
	private RestTemplate restTemplate;

	public Release_DatesDTO getAPI_ReleaseDates(String movie_id) {

		Release_DatesDTO release_Dates = null;
		
		String url = BASE_URL+movie_id+"/release_dates"+API_KEY;
		
		LOGGER.info("@Get getAPI_ReleaseDates Service URL : " + url);

		try {
			release_Dates = restTemplate.getForObject(url, Release_DatesDTO.class);
		} catch (Exception e) {
			LOGGER.error("Unexpected Error From Service: getAPI_ReleaseDates: " + e);
		}

		return release_Dates;

	}
}

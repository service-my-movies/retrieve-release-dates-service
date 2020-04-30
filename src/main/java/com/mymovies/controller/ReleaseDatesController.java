package com.mymovies.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.mymovies.dto.Release_DatesDTO;
import com.mymovies.service.IReleaseDatesService;

@Controller
@RequestMapping("/release_dates")
@RefreshScope
public class ReleaseDatesController implements IReleaseDatesController {
	
	@Autowired
	private IReleaseDatesService releaseDatesService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ReleaseDatesController.class);
	
	@Override
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value = "/{movie_id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Release_DatesDTO getAPI_ReleaseDates(@PathVariable String movie_id) {

		LOGGER.info("@Get Release Dates, id: " + movie_id);

		Release_DatesDTO release_Dates = null;

		try {
			release_Dates = releaseDatesService.getAPI_ReleaseDates(movie_id);
		} catch (Exception e) {
			LOGGER.error("Unexpected Error From Controller: getAPI_ReleaseDates: " + e);
		}

		return release_Dates;
	}
}

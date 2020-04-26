package com.mymovies.controller;

import com.mymovies.dto.Release_DatesDTO;

public interface IReleaseDatesController {

	Release_DatesDTO getAPI_ReleaseDates(String movie_id);
	
}

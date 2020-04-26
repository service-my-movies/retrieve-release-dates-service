package com.mymovies.service;

import com.mymovies.dto.Release_DatesDTO;

public interface IReleaseDatesService {

	Release_DatesDTO getAPI_ReleaseDates(String movie_id);

}

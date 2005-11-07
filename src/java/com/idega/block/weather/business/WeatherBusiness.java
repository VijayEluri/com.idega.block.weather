/*
 * $Id$
 * Created on Nov 4, 2005
 *
 * Copyright (C) 2005 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.idega.block.weather.business;

import java.util.Map;


public interface WeatherBusiness {

	public Map parseXML(String URL);
	public WeatherData getWeather(String id);
	
}
package com.cloud.example.controller.helper;

import com.cloud.example.constant.HoroscopeConstants;

/**
 * @author vkankana
 *
 */
public class HoroscopeControllerHelper {
	
	/**
	 * @param dateOfBirth
	 * @return
	 */
	public static String getYourSign(int dateOfBirth){
		String returnValue = HoroscopeConstants.Cancer;
		
		if(dateOfBirth >= 1222 && dateOfBirth <= 119){
			returnValue = HoroscopeConstants.Capricorn;
		}	else if(dateOfBirth >= 120 && dateOfBirth <= 218){
			returnValue = HoroscopeConstants.Aquarius;
		}	else if(dateOfBirth >= 219 && dateOfBirth <= 320){
			returnValue = HoroscopeConstants.Pisces;
		}	else if(dateOfBirth >= 321 && dateOfBirth <= 419){
			returnValue = HoroscopeConstants.Aries;
		}	else if(dateOfBirth >= 420 && dateOfBirth <= 520){
			returnValue = HoroscopeConstants.Taurus;
		}	else if(dateOfBirth >= 521 && dateOfBirth < 620){
			returnValue = HoroscopeConstants.Gemini;
		}	else if(dateOfBirth >= 621 && dateOfBirth < 722){
			returnValue = HoroscopeConstants.Cancer;
		}	else if(dateOfBirth >= 723 && dateOfBirth < 822){
			returnValue = HoroscopeConstants.Leo;
		}	else if(dateOfBirth >= 823 && dateOfBirth < 922){
			returnValue = HoroscopeConstants.Virgo;
		}	else if(dateOfBirth >= 923 && dateOfBirth < 1022){
			returnValue = HoroscopeConstants.Libra;
		}	else if(dateOfBirth >= 1023 && dateOfBirth < 1121){
			returnValue = HoroscopeConstants.Scorpio;
		}	else{
			returnValue = HoroscopeConstants.Sagittarius;
		}
		
		
		return returnValue;
	}
	
	
	public static String getSignDescription(String sign){
		String returnValue = "";
		
		switch (sign) {
			case HoroscopeConstants.Capricorn:
				returnValue = HoroscopeConstants.Capricorn_Information;
				break;
			case HoroscopeConstants.Aquarius:
				returnValue = HoroscopeConstants.Aquarius_Information;
				break;
			case HoroscopeConstants.Aries:
				returnValue = HoroscopeConstants.Aries_Information;
				break;
			case HoroscopeConstants.Taurus:
				returnValue = HoroscopeConstants.Taurus_Information;
				break;
			case HoroscopeConstants.Gemini:
				returnValue = HoroscopeConstants.Gemini_Information;
				break;
			case HoroscopeConstants.Cancer:
				returnValue = HoroscopeConstants.Cancer_Information;
				break;
			case HoroscopeConstants.Leo:
				returnValue = HoroscopeConstants.Leo_Information;
				break;
			case HoroscopeConstants.Virgo:
				returnValue = HoroscopeConstants.Virgo_Information;
				break;
			case HoroscopeConstants.Libra:
				returnValue = HoroscopeConstants.Libra_Information;
				break;
			case HoroscopeConstants.Pisces:
				returnValue = HoroscopeConstants.Pisces_Information;
				break;
			case HoroscopeConstants.Scorpio:
				returnValue = HoroscopeConstants.Scorpio_Information;
				break;	
			case HoroscopeConstants.Sagittarius:
				returnValue = HoroscopeConstants.Sagittarius_Information;
				break;	
				
			default:
				returnValue = "INVALID Date OF Birth. Please enter in (ddmm)";
		}
		
		
		return returnValue;
		
	}

}

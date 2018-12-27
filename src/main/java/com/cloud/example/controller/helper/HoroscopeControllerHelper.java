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
	public static String getYourSign(String dateOfBirth){
		String returnValue = HoroscopeConstants.Cancer;
		
		int month = Integer.parseInt(dateOfBirth.substring(2, dateOfBirth.length()));
        int day = Integer.parseInt(dateOfBirth.substring(0, 2));
        
        System.out.println();

        if      ((month == 12 && day >= 22 && day <= 31) || (month ==  1 && day >= 1 && day <= 19))
        	returnValue = HoroscopeConstants.Capricorn;
        else if ((month ==  1 && day >= 20 && day <= 31) || (month ==  2 && day >= 1 && day <= 17))
        	returnValue = HoroscopeConstants.Aquarius;
        else if ((month ==  2 && day >= 18 && day <= 29) || (month ==  3 && day >= 1 && day <= 19))
        	returnValue = HoroscopeConstants.Pisces;
        else if ((month ==  3 && day >= 20 && day <= 31) || (month ==  4 && day >= 1 && day <= 19))
        	returnValue = HoroscopeConstants.Aries;
        else if ((month ==  4 && day >= 20 && day <= 30) || (month ==  5 && day >= 1 && day <= 20))
        	returnValue = HoroscopeConstants.Taurus;
        else if ((month ==  5 && day >= 21 && day <= 31) || (month ==  6 && day >= 1 && day <= 20))
        	returnValue = HoroscopeConstants.Gemini;
        else if ((month ==  6 && day >= 21 && day <= 30) || (month ==  7 && day >= 1 && day <= 22))
        	returnValue = HoroscopeConstants.Cancer;
        else if ((month ==  7 && day >= 23 && day <= 31) || (month ==  8 && day >= 1 && day <= 22))
        	returnValue = HoroscopeConstants.Leo;
        else if ((month ==  8 && day >= 23 && day <= 31) || (month ==  9 && day >= 1 && day <= 22))
        	returnValue = HoroscopeConstants.Virgo;
        else if ((month ==  9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22))
        	returnValue = HoroscopeConstants.Libra;
        else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
        	returnValue = HoroscopeConstants.Scorpio;
        else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
        	returnValue = HoroscopeConstants.Sagittarius;
        else
        	returnValue = "Illegal date";
		
		
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
	
	
	public static String getHtmlString(String sign, String signDescription){
		String returnString = "";
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<table><tr><td colspan='3' align='center'>");
		sb.append("<b> Your Zodiac Information:");
		sb.append(sign);
		sb.append("</b></td></tr>");
		sb.append("<tr><td align='center'><p>");
		sb.append(signDescription);
		sb.append("</p></td></tr>");
		sb.append("</table></html>");
		returnString = sb.toString();
		
		return returnString;
	}

}

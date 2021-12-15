package fi.ishtech.core.i18n.country;

import java.util.Map;

import fi.ishtech.core.i18n.enums.CountryEnum;

/**
 *
 * @author Muneer Ahmed Syed
 */
public abstract class CountryNameEn {

	public static final Map<CountryEnum, String> fullNames() {
		return CountryEnum.fullNames();
	}

}
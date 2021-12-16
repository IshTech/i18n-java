package fi.ishtech.core.i18n.country;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import fi.ishtech.core.i18n.enums.CountryEnum;
import fi.ishtech.core.i18n.enums.LangEnum;

/**
 *
 * @author Muneer Ahmed Syed
 */
public abstract class CountryNames {

	public static final Map<CountryEnum, String> byLang(LangEnum lang) {
		if (lang == null) {
			return null;
		}

		return MAP_LANG_COUNTRY_FULL_NAMES.get(lang);
	}

	public static final Map<CountryEnum, String> byLangOrElseByEn(LangEnum lang) {
		Map<CountryEnum, String> tmpMapCountryFullName = MAP_LANG_COUNTRY_FULL_NAMES.get(lang);

		return tmpMapCountryFullName != null ? tmpMapCountryFullName : byLang(LangEnum.en);
	}

	public static final Map<CountryEnum, String> byLang(String lang) {
		return byLang(LangEnum.fromNameIgnoreCaseOrElseNull(lang));
	}

	public static final Map<CountryEnum, String> byLangOrElseByEn(String lang) {
		return byLangOrElseByEn(LangEnum.fromNameIgnoreCaseOrElseNull(lang));
	}

	public static final Map<LangEnum, Map<CountryEnum, String>> byLangs(List<LangEnum> langs) {
		if (langs == null) {
			return null;
		}

		return langs.stream()
				.collect(Collectors.toMap(lang -> lang,
						lang -> MAP_LANG_COUNTRY_FULL_NAMES.containsKey(lang) ? MAP_LANG_COUNTRY_FULL_NAMES.get(lang)
								: Collections.emptyMap()));
	}

	private static final Map<LangEnum, Map<CountryEnum, String>> MAP_LANG_COUNTRY_FULL_NAMES;
	static {
		Map<LangEnum, Map<CountryEnum, String>> tmpLangMapCountryFullName = new HashMap<LangEnum, Map<CountryEnum, String>>(
				2);

		tmpLangMapCountryFullName.put(LangEnum.en, CountryNamesEn.fullNames());
		tmpLangMapCountryFullName.put(LangEnum.fi, CountryNamesFi.fullNames());

		MAP_LANG_COUNTRY_FULL_NAMES = Collections.unmodifiableMap(tmpLangMapCountryFullName);

		tmpLangMapCountryFullName = null; // gc
	}

}
package fi.ishtech.core.i18n.enums;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * {@link Enum} for Language.<br>
 * Use {@link LangEnum#fromName} instead of {@link LangEnum#valueOf}<br>
 *
 * @author Muneer Ahmed Syed
 */
public enum LangEnum {

	ar,
	en,
	fi,
	sv,
	ru;

	private final static List<String> NAMES_LIST = Arrays.stream(values())
			.map(Enum::name)
			.collect(Collectors.toList());

	/**
	 * Alias for valueOf
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link LangEnum} constant of the specified {@code name}
	 */
	public static LangEnum fromName(String name) {
		return valueOf(name);
	}

	/**
	 * Gets LangEnum object based {@code name} trimmed of leading and trailing spaces.<br>
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link LangEnum} constant of the specified {@code name}
	 */
	public static LangEnum fromNameTrimmed(String name) {
		if (name == null) {
			throw new NullPointerException("name is null");
		}

		if ("".equals(name.trim())) {
			throw new NullPointerException("name is blank");
		}

		return valueOf(name.trim());
	}

	/**
	 * Gets LangEnum object based case-insensitive {@code name}<br>
	 *
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link LangEnum} constant of the specified {@code name}
	 *
	 * @throws NullPointerException
	 *             when input {@code name} is null or blank
	 */
	public static LangEnum fromNameIgnoreCase(String name) {
		if (name == null) {
			throw new NullPointerException("name is null");
		}

		if ("".equals(name.trim())) {
			throw new NullPointerException("name is blank");
		}

		return fromNameTrimmed(name.toLowerCase());
	}

	/**
	 * Gets LangEnum object based {@code name}.<br>
	 * If not present, returns {@code null}
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link LangEnum} constant of the specified {@code name}
	 */
	public static LangEnum fromNameOrElseNull(String name) {
		if (name == null || "".equals(name.trim())) {
			return null;
		}

		return NAMES_LIST.contains(name) ? fromName(name) : null;
	}

	/**
	 * Gets LangEnum object based {@code name} trimmed of leading and trailing spaces.<br>
	 * If not present, returns {@code null}
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link LangEnum} constant of the specified {@code name}
	 */
	public static LangEnum fromNameTrimmedOrElseNull(String name) {
		if (name == null || "".equals(name.trim())) {
			return null;
		}

		return NAMES_LIST.contains(name.trim()) ? fromNameTrimmed(name) : null;
	}

	/**
	 * Gets LangEnum object based case-insensitive {@code name}<br>
	 * If not present, returns null
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link LangEnum} constant of the specified {@code name}
	 */
	public static LangEnum fromNameIgnoreCaseOrElseNull(String name) {
		if (name == null || "".equals(name.trim())) {
			return null;
		}

		return NAMES_LIST.contains(name.trim().toLowerCase()) ? fromNameIgnoreCase(name) : null;
	}

	public static Map<LangEnum, Map<LangEnum, String>> fullNames() {
		return MAP_LANG_FULL_NAME;
	}

	public static Map<LangEnum, String> fullNames(LangEnum keyLang) {
		return MAP_LANG_FULL_NAME.get(keyLang);
	}

	/**
	 *
	 * @param keyLang
	 * @param inputLang
	 *
	 * @return FullName for {@code inputLang} in {@code keyLang},<br>
	 *         e.g. if keyLang = fi, inputLang = en, it returns Englanti
	 */
	public static String fullName(LangEnum keyLang, LangEnum inputLang) {
		return MAP_LANG_FULL_NAME.containsKey(keyLang) ? MAP_LANG_FULL_NAME.get(keyLang).get(inputLang) : null;
	}

	public String fullName(LangEnum keyLang) {
		return fullName(keyLang, this);
	}

	public String fullName() {
		return fullName(this, this);
	}

	// @formatter:off
	private static final Map<LangEnum, Map<LangEnum, String>> MAP_LANG_FULL_NAME =
			Map.ofEntries(
				Map.entry(LangEnum.en, Map.ofEntries(
					Map.entry(LangEnum.ar, "Arabic"),
					Map.entry(LangEnum.en, "English"),
					Map.entry(LangEnum.fi, "Finnish"),
					Map.entry(LangEnum.sv, "Swedish"),
					Map.entry(LangEnum.ru, "Russian")
				)),
				Map.entry(LangEnum.fi, Map.ofEntries(
					Map.entry(LangEnum.ar, "Arabic"),
					Map.entry(LangEnum.en, "Englanti"),
					Map.entry(LangEnum.fi, "Suomi"),
					Map.entry(LangEnum.sv, "Ruotsi"),
					Map.entry(LangEnum.ru, "Venäjä")
				))
			);	 
	// @formatter:on

}
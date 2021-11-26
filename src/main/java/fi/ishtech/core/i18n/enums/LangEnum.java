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

	aa,
	ab,
	ae,
	af,
	ak,
	am,
	an,
	ar,
	as,
	av,
	ay,
	az,
	ba,
	be,
	bg,
	bi,
	bm,
	bn,
	bo,
	br,
	bs,
	ca,
	ce,
	ch,
	co,
	cr,
	cs,
	cu,
	cv,
	cy,
	da,
	de,
	dv,
	dz,
	ee,
	el,
	en,
	eo,
	es,
	et,
	eu,
	fa,
	ff,
	fi,
	fj,
	fo,
	fr,
	fy,
	ga,
	gd,
	gl,
	gn,
	gu,
	gv,
	ha,
	he,
	hi,
	ho,
	hr,
	ht,
	hu,
	hy,
	hz,
	ia,
	id,
	ie,
	ig,
	ii,
	ik,
	io,
	is,
	it,
	iu,
	ja,
	jv,
	ka,
	kg,
	ki,
	kj,
	kk,
	kl,
	km,
	kn,
	ko,
	kr,
	ks,
	ku,
	kv,
	kw,
	ky,
	la,
	lb,
	lg,
	li,
	ln,
	lo,
	lt,
	lu,
	lv,
	mg,
	mh,
	mi,
	mk,
	ml,
	mn,
	mr,
	ms,
	mt,
	my,
	na,
	nb,
	nd,
	ne,
	ng,
	nl,
	nn,
	no,
	nr,
	nv,
	ny,
	oc,
	oj,
	om,
	or,
	os,
	pa,
	pi,
	pl,
	ps,
	pt,
	qu,
	rm,
	rn,
	ro,
	ru,
	rw,
	sa,
	sc,
	sd,
	se,
	sg,
	si,
	sk,
	sl,
	sm,
	sn,
	so,
	sq,
	sr,
	ss,
	st,
	su,
	sv,
	sw,
	ta,
	te,
	tg,
	th,
	ti,
	tk,
	tl,
	tn,
	to,
	tr,
	ts,
	tt,
	tw,
	ty,
	ug,
	uk,
	ur,
	uz,
	ve,
	vi,
	vo,
	wa,
	wo,
	xh,
	yi,
	yo,
	za,
	zh,
	zu;

	// @formatter:off
	private final static List<String> NAMES_LIST = Arrays.stream(values())
			.map(Enum::name)
			.collect(Collectors.toList());
	// @formatter:on

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
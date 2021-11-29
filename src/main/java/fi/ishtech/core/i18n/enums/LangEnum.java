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
				Map.entry(en, Map.ofEntries(
					Map.entry(aa , "Afar"),
					Map.entry(ab , "Abkhazian"),
					Map.entry(ae , "Avestan"),
					Map.entry(af , "Afrikaans"),
					Map.entry(ak , "Akan"),
					Map.entry(am , "Amharic"),
					Map.entry(an , "Aragonese"),
					Map.entry(ar , "Arabic"),
					Map.entry(as , "Assamese"),
					Map.entry(av , "Avaric"),
					Map.entry(ay , "Aymara"),
					Map.entry(az , "Azerbaijani"),
					Map.entry(ba , "Bashkir"),
					Map.entry(be , "Belarusian"),
					Map.entry(bg , "Bulgarian"),
					Map.entry(bi , "Bislama"),
					Map.entry(bm , "Bambara"),
					Map.entry(bn , "Bengali"),
					Map.entry(bo , "Tibetan"),
					Map.entry(br , "Breton"),
					Map.entry(bs , "Bosnian"),
					Map.entry(ca , "Catalan"),
					Map.entry(ce , "Chechen"),
					Map.entry(ch , "Chamorro"),
					Map.entry(co , "Corsican"),
					Map.entry(cr , "Cree"),
					Map.entry(cs , "Czech"),
					Map.entry(cu , "Church Slavic"),
					Map.entry(cv , "Chuvash"),
					Map.entry(cy , "Welsh"),
					Map.entry(da , "Danish"),
					Map.entry(de , "German"),
					Map.entry(dv , "Divehi"),
					Map.entry(dz , "Dzongkha"),
					Map.entry(ee , "Ewe"),
					Map.entry(el , "Greek"),
					Map.entry(en , "English"),
					Map.entry(eo , "Esperanto"),
					Map.entry(es , "Spanish"),
					Map.entry(et , "Estonian"),
					Map.entry(eu , "Basque"),
					Map.entry(fa , "Persian"),
					Map.entry(ff , "Fulah"),
					Map.entry(fi , "Finnish"),
					Map.entry(fj , "Fijian"),
					Map.entry(fo , "Faroese"),
					Map.entry(fr , "French"),
					Map.entry(fy , "Western Frisian"),
					Map.entry(ga , "Irish"),
					Map.entry(gd , "Gaelic"),
					Map.entry(gl , "Galician"),
					Map.entry(gn , "Guarani"),
					Map.entry(gu , "Gujarati"),
					Map.entry(gv , "Manx"),
					Map.entry(ha , "Hausa"),
					Map.entry(he , "Hebrew"),
					Map.entry(hi , "Hindi"),
					Map.entry(ho , "Hiri Motu"),
					Map.entry(hr , "Croatian"),
					Map.entry(ht , "Haitian"),
					Map.entry(hu , "Hungarian"),
					Map.entry(hy , "Armenian"),
					Map.entry(hz , "Herero"),
					Map.entry(ia , "Interlingua"),
					Map.entry(id , "Indonesian"),
					Map.entry(ie , "Interlingue"),
					Map.entry(ig , "Igbo"),
					Map.entry(ii , "Sichuan Yi"),
					Map.entry(ik , "Inupiaq"),
					Map.entry(io , "Ido"),
					Map.entry(is , "Icelandic"),
					Map.entry(it , "Italian"),
					Map.entry(iu , "Inuktitut"),
					Map.entry(ja , "Japanese"),
					Map.entry(jv , "Javanese"),
					Map.entry(ka , "Georgian"),
					Map.entry(kg , "Kongo"),
					Map.entry(ki , "Kikuyu"),
					Map.entry(kj , "Kuanyama"),
					Map.entry(kk , "Kazakh"),
					Map.entry(kl , "Kalaallisut"),
					Map.entry(km , "Khmer"),
					Map.entry(kn , "Kannada"),
					Map.entry(ko , "Korean"),
					Map.entry(kr , "Kanuri"),
					Map.entry(ks , "Kashmiri"),
					Map.entry(ku , "Kurdish"),
					Map.entry(kv , "Komi"),
					Map.entry(kw , "Cornish"),
					Map.entry(ky , "Kirghiz"),
					Map.entry(la , "Latin"),
					Map.entry(lb , "Luxembourgish"),
					Map.entry(lg , "Ganda"),
					Map.entry(li , "Limburgan"),
					Map.entry(ln , "Lingala"),
					Map.entry(lo , "Lao"),
					Map.entry(lt , "Lithuanian"),
					Map.entry(lu , "Luba-Katanga"),
					Map.entry(lv , "Latvian"),
					Map.entry(mg , "Malagasy"),
					Map.entry(mh , "Marshallese"),
					Map.entry(mi , "Maori"),
					Map.entry(mk , "Macedonian"),
					Map.entry(ml , "Malayalam"),
					Map.entry(mn , "Mongolian"),
					Map.entry(mr , "Marathi"),
					Map.entry(ms , "Malay"),
					Map.entry(mt , "Maltese"),
					Map.entry(my , "Burmese"),
					Map.entry(na , "Nauru"),
					Map.entry(nb , "Norwegian Bokmål"),
					Map.entry(nd , "North Ndebele"),
					Map.entry(ne , "Nepali"),
					Map.entry(ng , "Ndonga"),
					Map.entry(nl , "Dutch"),
					Map.entry(nn , "Norwegian Nynorsk"),
					Map.entry(no , "Norwegian"),
					Map.entry(nr , "South Ndebele"),
					Map.entry(nv , "Navajo"),
					Map.entry(ny , "Chichewa"),
					Map.entry(oc , "Occitan"),
					Map.entry(oj , "Ojibwa"),
					Map.entry(om , "Oromo"),
					Map.entry(or , "Oriya"),
					Map.entry(os , "Ossetian"),
					Map.entry(pa , "Punjabi"),
					Map.entry(pi , "Pali"),
					Map.entry(pl , "Polish"),
					Map.entry(ps , "Pashto"),
					Map.entry(pt , "Portuguese"),
					Map.entry(qu , "Quechua"),
					Map.entry(rm , "Romansh"),
					Map.entry(rn , "Rundi"),
					Map.entry(ro , "Romanian"),
					Map.entry(ru , "Russian"),
					Map.entry(rw , "Kinyarwanda"),
					Map.entry(sa , "Sanskrit"),
					Map.entry(sc , "Sardinian"),
					Map.entry(sd , "Sindhi"),
					Map.entry(se , "Northern Sami"),
					Map.entry(sg , "Sango"),
					Map.entry(si , "Sinhala"),
					Map.entry(sk , "Slovak"),
					Map.entry(sl , "Slovenian"),
					Map.entry(sm , "Samoan"),
					Map.entry(sn , "Shona"),
					Map.entry(so , "Somali"),
					Map.entry(sq , "Albanian"),
					Map.entry(sr , "Serbian"),
					Map.entry(ss , "Swati"),
					Map.entry(st , "Southern Sotho"),
					Map.entry(su , "Sundanese"),
					Map.entry(sv , "Swedish"),
					Map.entry(sw , "Swahili"),
					Map.entry(ta , "Tamil"),
					Map.entry(te , "Telugu"),
					Map.entry(tg , "Tajik"),
					Map.entry(th , "Thai"),
					Map.entry(ti , "Tigrinya"),
					Map.entry(tk , "Turkmen"),
					Map.entry(tl , "Tagalog"),
					Map.entry(tn , "Tswana"),
					Map.entry(to , "Tonga"),
					Map.entry(tr , "Turkish"),
					Map.entry(ts , "Tsonga"),
					Map.entry(tt , "Tatar"),
					Map.entry(tw , "Twi"),
					Map.entry(ty , "Tahitian"),
					Map.entry(ug , "Uighur"),
					Map.entry(uk , "Ukrainian"),
					Map.entry(ur , "Urdu"),
					Map.entry(uz , "Uzbek"),
					Map.entry(ve , "Venda"),
					Map.entry(vi , "Vietnamese"),
					Map.entry(vo , "Volapük"),
					Map.entry(wa , "Walloon"),
					Map.entry(wo , "Wolof"),
					Map.entry(xh , "Xhosa"),
					Map.entry(yi , "Yiddish"),
					Map.entry(yo , "Yoruba"),
					Map.entry(za , "Zhuang"),
					Map.entry(zh , "Chinese"),
					Map.entry(zu , "Zulu")
			)),
			Map.entry(fi, Map.ofEntries(
				Map.entry(ar, "Arabic"),
				Map.entry(en, "Englanti"),
				Map.entry(fi, "Suomi"),
				Map.entry(ru, "Venäjä"),
				Map.entry(sv, "Ruotsi")
			))
		);
	// @formatter:on

}
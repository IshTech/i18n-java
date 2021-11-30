package fi.ishtech.core.i18n.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * {@link Enum} for Country.<br>
 * Use {@link CountryEnum#fromName} instead of {@link CountryEnum#valueOf}<br>
 *
 * @author Muneer Ahmed Syed
 */
public enum CountryEnum {

	AD,
	AE,
	AF,
	AG,
	AI,
	AL,
	AM,
	AO,
	AQ,
	AR,
	AS,
	AT,
	AU,
	AW,
	AX,
	AZ,
	BA,
	BB,
	BD,
	BE,
	BF,
	BG,
	BH,
	BI,
	BJ,
	BL,
	BM,
	BN,
	BO,
	BQ,
	BR,
	BS,
	BT,
	BV,
	BW,
	BY,
	BZ,
	CA,
	CC,
	CD,
	CF,
	CG,
	CH,
	CI,
	CK,
	CL,
	CM,
	CN,
	CO,
	CR,
	CU,
	CV,
	CW,
	CX,
	CY,
	CZ,
	DE,
	DJ,
	DK,
	DM,
	DO,
	DZ,
	EC,
	EE,
	EG,
	EH,
	ER,
	ES,
	ET,
	FI,
	FJ,
	FK,
	FM,
	FO,
	FR,
	GA,
	GB,
	GD,
	GE,
	GF,
	GG,
	GH,
	GI,
	GL,
	GM,
	GN,
	GP,
	GQ,
	GR,
	GS,
	GT,
	GU,
	GW,
	GY,
	HK,
	HM,
	HN,
	HR,
	HT,
	HU,
	ID,
	IE,
	IL,
	IM,
	IN,
	IO,
	IQ,
	IR,
	IS,
	IT,
	JE,
	JM,
	JO,
	JP,
	KE,
	KG,
	KH,
	KI,
	KM,
	KN,
	KP,
	KR,
	KW,
	KY,
	KZ,
	LA,
	LB,
	LC,
	LI,
	LK,
	LR,
	LS,
	LT,
	LU,
	LV,
	LY,
	MA,
	MC,
	MD,
	ME,
	MF,
	MG,
	MH,
	MK,
	ML,
	MM,
	MN,
	MO,
	MP,
	MQ,
	MR,
	MS,
	MT,
	MU,
	MV,
	MW,
	MX,
	MY,
	MZ,
	NA,
	NC,
	NE,
	NF,
	NG,
	NI,
	NL,
	NO,
	NP,
	NR,
	NU,
	NZ,
	OM,
	PA,
	PE,
	PF,
	PG,
	PH,
	PK,
	PL,
	PM,
	PN,
	PR,
	PS,
	PT,
	PW,
	PY,
	QA,
	RE,
	RO,
	RS,
	RU,
	RW,
	SA,
	SB,
	SC,
	SD,
	SE,
	SG,
	SH,
	SI,
	SJ,
	SK,
	SL,
	SM,
	SN,
	SO,
	SR,
	SS,
	ST,
	SV,
	SX,
	SY,
	SZ,
	TC,
	TD,
	TF,
	TG,
	TH,
	TJ,
	TK,
	TL,
	TM,
	TN,
	TO,
	TR,
	TT,
	TV,
	TW,
	TZ,
	UA,
	UG,
	UM,
	US,
	UY,
	UZ,
	VA,
	VC,
	VE,
	VG,
	VI,
	VN,
	VU,
	WF,
	WS,
	YE,
	YT,
	ZA,
	ZM,
	ZW;

	private final static List<String> NAMES_LIST = new ArrayList<String>(0);
	static {
		for (CountryEnum c : values()) {
			NAMES_LIST.add(c.name());
		}
	}

	/**
	 * Alias for valueOf
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link CountryEnum} constant of the specified {@code name}
	 */
	public static CountryEnum fromName(String name) {
		return valueOf(name);
	}

	/**
	 * Gets {@code enum} object based {@code name} trimmed of leading and trailing spaces.<br>
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link CountryEnum} constant of the specified {@code name}
	 */
	public static CountryEnum fromNameTrimmed(String name) {
		if (name == null) {
			throw new NullPointerException("name is null");
		}

		if ("".equals(name.trim())) {
			throw new NullPointerException("name is blank");
		}

		return valueOf(name.trim());
	}

	/**
	 * Gets {@code enum} object based case-insensitive {@code name}<br>
	 *
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link CountryEnum} constant of the specified {@code name}
	 *
	 * @throws NullPointerException
	 *             when input {@code name} is null or blank
	 */
	public static CountryEnum fromNameIgnoreCase(String name) {
		if (name == null) {
			throw new NullPointerException("name is null");
		}

		if ("".equals(name.trim())) {
			throw new NullPointerException("name is blank");
		}

		return fromNameTrimmed(name.toUpperCase());
	}

	/**
	 * Gets {@code enum} object based {@code name}.<br>
	 * If not present, returns {@code null}
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link CountryEnum} constant of the specified {@code name}
	 */
	public static CountryEnum fromNameOrElseNull(String name) {
		if (name == null || "".equals(name.trim())) {
			return null;
		}

		return NAMES_LIST.contains(name) ? fromName(name) : null;
	}

	/**
	 * Gets {@code enum} object based {@code name} trimmed of leading and trailing spaces.<br>
	 * If not present, returns {@code null}
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link CountryEnum} constant of the specified {@code name}
	 */
	public static CountryEnum fromNameTrimmedOrElseNull(String name) {
		if (name == null || "".equals(name.trim())) {
			return null;
		}

		return NAMES_LIST.contains(name.trim()) ? fromNameTrimmed(name) : null;
	}

	/**
	 * Gets {@code enum} object based case-insensitive {@code name}<br>
	 * If not present, returns null
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link CountryEnum} constant of the specified {@code name}
	 */
	public static CountryEnum fromNameIgnoreCaseOrElseNull(String name) {
		if (name == null || "".equals(name.trim())) {
			return null;
		}

		return NAMES_LIST.contains(name.trim().toUpperCase()) ? fromNameIgnoreCase(name) : null;
	}

	/**
	 * Full name of the country.
	 *
	 * @param name
	 *            - input enum name
	 *
	 * @return {@link String}
	 */
	public static String fullName(CountryEnum name) {
		return MAP_COUNTRY_FULL_NAME.get(name);
	}

	/**
	 * Full name of the country.
	 *
	 * @return {@link String}
	 */
	public String fullName() {
		return fullName(this);
	}

	/**
	 * Official name of the country.
	 *
	 * @param name
	 *            - input enum name
	 *
	 * @return {@link String}
	 */
	public static String officialName(CountryEnum name) {
		return MAP_COUNTRY_OFFICIAL_NAME.get(name);
	}

	/**
	 * Official name of the country.
	 *
	 * @return {@link String}
	 */
	public String officialName() {
		return officialName(this);
	}

	/**
	 * Alpha-3 code of the country.
	 *
	 * @param name
	 *            - input enum name
	 *
	 * @return {@link String}
	 */
	public static String alpha3(CountryEnum name) {
		return MAP_COUNTRY_ALPHA_3.get(name);
	}

	/**
	 * Alpha-3 code of the country.
	 *
	 * @return {@link String}
	 */
	public String alpha3() {
		return alpha3(this);
	}

	/**
	 * Numeric-3 code of the country.
	 *
	 * @param name
	 *            - input enum name
	 *
	 * @return {@link String}
	 */
	public static String numeric3(CountryEnum name) {
		return MAP_COUNTRY_NUMERIC_3.get(name);
	}

	/**
	 * Numeric-3 code of the country.
	 *
	 * @return {@link String}
	 */
	public String numeric3() {
		return numeric3(this);
	}

	/**
	 * Top level domain (ccTLD) of the country.
	 *
	 * @param name
	 *            - input enum name
	 *
	 * @return {@link String}
	 */
	public static String ccTLD(CountryEnum name) {
		List<String> ccTlds = ccTLDs(name);
		return ccTlds != null && !ccTlds.isEmpty() ? ccTlds.get(0) : null;
	}

	/**
	 * Top level domain (ccTLD) of the country.
	 *
	 * @return {@link String}
	 */
	public String ccTLD() {
		return ccTLD(this);
	}

	/**
	 * Top level domain (ccTLD) of the country.
	 *
	 * @param name
	 *            - input enum name
	 *
	 * @return {@link List}&lt;{@link String}&gt;
	 */
	public static List<String> ccTLDs(CountryEnum name) {
		return MAP_CC_TLD.get(name);
	}

	/**
	 * Top level domain (ccTLD) of the country.
	 *
	 * @return {@link List}&lt;{@link String}&gt;
	 */
	public List<String> ccTLDs() {
		return ccTLDs(this);
	}

	/**
	 * Cheks if the country is part of EU.
	 *
	 * @param name
	 *            - input enum name
	 *
	 * @return true or false
	 */
	public static boolean isEu(CountryEnum name) {
		return LIST_EU.contains(name);
	}

	/**
	 * Cheks if the country is part of EU.
	 *
	 * @return true or false
	 */
	public boolean isEu() {
		return isEu(this);
	}

	private static final Map<CountryEnum, String> MAP_COUNTRY_FULL_NAME = new HashMap<CountryEnum, String>();
	static {
		MAP_COUNTRY_FULL_NAME.put(AF, "Afghanistan");
		MAP_COUNTRY_FULL_NAME.put(AX, "Åland Islands");
		MAP_COUNTRY_FULL_NAME.put(AL, "Albania");
		MAP_COUNTRY_FULL_NAME.put(DZ, "Algeria");
		MAP_COUNTRY_FULL_NAME.put(AS, "American Samoa");
		MAP_COUNTRY_FULL_NAME.put(AD, "Andorra");
		MAP_COUNTRY_FULL_NAME.put(AO, "Angola");
		MAP_COUNTRY_FULL_NAME.put(AI, "Anguilla");
		MAP_COUNTRY_FULL_NAME.put(AQ, "Antarctica");
		MAP_COUNTRY_FULL_NAME.put(AG, "Antigua and Barbuda");
		MAP_COUNTRY_FULL_NAME.put(AR, "Argentina");
		MAP_COUNTRY_FULL_NAME.put(AM, "Armenia");
		MAP_COUNTRY_FULL_NAME.put(AW, "Aruba");
		MAP_COUNTRY_FULL_NAME.put(AU, "Australia");
		MAP_COUNTRY_FULL_NAME.put(AT, "Austria");
		MAP_COUNTRY_FULL_NAME.put(AZ, "Azerbaijan");
		MAP_COUNTRY_FULL_NAME.put(BS, "Bahamas");
		MAP_COUNTRY_FULL_NAME.put(BH, "Bahrain");
		MAP_COUNTRY_FULL_NAME.put(BD, "Bangladesh");
		MAP_COUNTRY_FULL_NAME.put(BB, "Barbados");
		MAP_COUNTRY_FULL_NAME.put(BY, "Belarus");
		MAP_COUNTRY_FULL_NAME.put(BE, "Belgium");
		MAP_COUNTRY_FULL_NAME.put(BZ, "Belize");
		MAP_COUNTRY_FULL_NAME.put(BJ, "Benin");
		MAP_COUNTRY_FULL_NAME.put(BM, "Bermuda");
		MAP_COUNTRY_FULL_NAME.put(BT, "Bhutan");
		MAP_COUNTRY_FULL_NAME.put(BO, "Bolivia");
		MAP_COUNTRY_FULL_NAME.put(BQ, "Bonaire, Sint Eustatius and Saba");
		MAP_COUNTRY_FULL_NAME.put(BA, "Bosnia and Herzegovina");
		MAP_COUNTRY_FULL_NAME.put(BW, "Botswana");
		MAP_COUNTRY_FULL_NAME.put(BV, "Bouvet Island");
		MAP_COUNTRY_FULL_NAME.put(BR, "Brazil");
		MAP_COUNTRY_FULL_NAME.put(IO, "British Indian Ocean Territory");
		MAP_COUNTRY_FULL_NAME.put(BN, "Brunei Darussalam");
		MAP_COUNTRY_FULL_NAME.put(BG, "Bulgaria");
		MAP_COUNTRY_FULL_NAME.put(BF, "Burkina Faso");
		MAP_COUNTRY_FULL_NAME.put(BI, "Burundi");
		MAP_COUNTRY_FULL_NAME.put(CV, "Cabo Verde");
		MAP_COUNTRY_FULL_NAME.put(KH, "Cambodia");
		MAP_COUNTRY_FULL_NAME.put(CM, "Cameroon");
		MAP_COUNTRY_FULL_NAME.put(CA, "Canada");
		MAP_COUNTRY_FULL_NAME.put(KY, "Cayman Islands");
		MAP_COUNTRY_FULL_NAME.put(CF, "Central African Republic");
		MAP_COUNTRY_FULL_NAME.put(TD, "Chad");
		MAP_COUNTRY_FULL_NAME.put(CL, "Chile");
		MAP_COUNTRY_FULL_NAME.put(CN, "China");
		MAP_COUNTRY_FULL_NAME.put(CX, "Christmas Island");
		MAP_COUNTRY_FULL_NAME.put(CC, "Cocos (Keeling) Islands");
		MAP_COUNTRY_FULL_NAME.put(CO, "Colombia");
		MAP_COUNTRY_FULL_NAME.put(KM, "Comoros");
		MAP_COUNTRY_FULL_NAME.put(CD, "Congo (The Democratic Republic of the)");
		MAP_COUNTRY_FULL_NAME.put(CG, "Congo (The Republic of the)");
		MAP_COUNTRY_FULL_NAME.put(CK, "Cook Islands");
		MAP_COUNTRY_FULL_NAME.put(CR, "Costa Rica");
		MAP_COUNTRY_FULL_NAME.put(CI, "Côte d'Ivoire (Ivory Coast)");
		MAP_COUNTRY_FULL_NAME.put(HR, "Croatia");
		MAP_COUNTRY_FULL_NAME.put(CU, "Cuba");
		MAP_COUNTRY_FULL_NAME.put(CW, "Curaçao");
		MAP_COUNTRY_FULL_NAME.put(CY, "Cyprus");
		MAP_COUNTRY_FULL_NAME.put(CZ, "Czechia");
		MAP_COUNTRY_FULL_NAME.put(DK, "Denmark");
		MAP_COUNTRY_FULL_NAME.put(DJ, "Djibouti");
		MAP_COUNTRY_FULL_NAME.put(DM, "Dominica");
		MAP_COUNTRY_FULL_NAME.put(DO, "Dominican Republic");
		MAP_COUNTRY_FULL_NAME.put(EC, "Ecuador");
		MAP_COUNTRY_FULL_NAME.put(EG, "Egypt");
		MAP_COUNTRY_FULL_NAME.put(SV, "El Salvador");
		MAP_COUNTRY_FULL_NAME.put(GQ, "Equatorial Guinea");
		MAP_COUNTRY_FULL_NAME.put(ER, "Eritrea");
		MAP_COUNTRY_FULL_NAME.put(EE, "Estonia");
		MAP_COUNTRY_FULL_NAME.put(SZ, "Eswatini");
		MAP_COUNTRY_FULL_NAME.put(ET, "Ethiopia");
		MAP_COUNTRY_FULL_NAME.put(FK, "Falkland Islands (Malvinas)");
		MAP_COUNTRY_FULL_NAME.put(FO, "Faroe Islands");
		MAP_COUNTRY_FULL_NAME.put(FJ, "Fiji");
		MAP_COUNTRY_FULL_NAME.put(FI, "Finland");
		MAP_COUNTRY_FULL_NAME.put(FR, "France");
		MAP_COUNTRY_FULL_NAME.put(GF, "French Guiana");
		MAP_COUNTRY_FULL_NAME.put(PF, "French Polynesia");
		MAP_COUNTRY_FULL_NAME.put(TF, "French Southern Territories");
		MAP_COUNTRY_FULL_NAME.put(GA, "Gabon");
		MAP_COUNTRY_FULL_NAME.put(GM, "Gambia");
		MAP_COUNTRY_FULL_NAME.put(GE, "Georgia");
		MAP_COUNTRY_FULL_NAME.put(DE, "Germany");
		MAP_COUNTRY_FULL_NAME.put(GH, "Ghana");
		MAP_COUNTRY_FULL_NAME.put(GI, "Gibraltar");
		MAP_COUNTRY_FULL_NAME.put(GR, "Greece");
		MAP_COUNTRY_FULL_NAME.put(GL, "Greenland");
		MAP_COUNTRY_FULL_NAME.put(GD, "Grenada");
		MAP_COUNTRY_FULL_NAME.put(GP, "Guadeloupe");
		MAP_COUNTRY_FULL_NAME.put(GU, "Guam");
		MAP_COUNTRY_FULL_NAME.put(GT, "Guatemala");
		MAP_COUNTRY_FULL_NAME.put(GG, "Guernsey");
		MAP_COUNTRY_FULL_NAME.put(GN, "Guinea");
		MAP_COUNTRY_FULL_NAME.put(GW, "Guinea-Bissau");
		MAP_COUNTRY_FULL_NAME.put(GY, "Guyana");
		MAP_COUNTRY_FULL_NAME.put(HT, "Haiti");
		MAP_COUNTRY_FULL_NAME.put(HM, "Heard Island and McDonald Islands");
		MAP_COUNTRY_FULL_NAME.put(VA, "Holy See (Vatican)");
		MAP_COUNTRY_FULL_NAME.put(HN, "Honduras");
		MAP_COUNTRY_FULL_NAME.put(HK, "Hong Kong");
		MAP_COUNTRY_FULL_NAME.put(HU, "Hungary");
		MAP_COUNTRY_FULL_NAME.put(IS, "Iceland");
		MAP_COUNTRY_FULL_NAME.put(IN, "India");
		MAP_COUNTRY_FULL_NAME.put(ID, "Indonesia");
		MAP_COUNTRY_FULL_NAME.put(IR, "Iran");
		MAP_COUNTRY_FULL_NAME.put(IQ, "Iraq");
		MAP_COUNTRY_FULL_NAME.put(IE, "Ireland");
		MAP_COUNTRY_FULL_NAME.put(IM, "Isle of Man");
		MAP_COUNTRY_FULL_NAME.put(IL, "Israel");
		MAP_COUNTRY_FULL_NAME.put(IT, "Italy");
		MAP_COUNTRY_FULL_NAME.put(JM, "Jamaica");
		MAP_COUNTRY_FULL_NAME.put(JP, "Japan");
		MAP_COUNTRY_FULL_NAME.put(JE, "Jersey");
		MAP_COUNTRY_FULL_NAME.put(JO, "Jordan");
		MAP_COUNTRY_FULL_NAME.put(KZ, "Kazakhstan");
		MAP_COUNTRY_FULL_NAME.put(KE, "Kenya");
		MAP_COUNTRY_FULL_NAME.put(KI, "Kiribati");
		MAP_COUNTRY_FULL_NAME.put(KP, "North Korea");
		MAP_COUNTRY_FULL_NAME.put(KR, "South Korea");
		MAP_COUNTRY_FULL_NAME.put(KW, "Kuwait");
		MAP_COUNTRY_FULL_NAME.put(KG, "Kyrgyzstan");
		MAP_COUNTRY_FULL_NAME.put(LA, "Lao");
		MAP_COUNTRY_FULL_NAME.put(LV, "Latvia");
		MAP_COUNTRY_FULL_NAME.put(LB, "Lebanon");
		MAP_COUNTRY_FULL_NAME.put(LS, "Lesotho");
		MAP_COUNTRY_FULL_NAME.put(LR, "Liberia");
		MAP_COUNTRY_FULL_NAME.put(LY, "Libya");
		MAP_COUNTRY_FULL_NAME.put(LI, "Liechtenstein");
		MAP_COUNTRY_FULL_NAME.put(LT, "Lithuania");
		MAP_COUNTRY_FULL_NAME.put(LU, "Luxembourg");
		MAP_COUNTRY_FULL_NAME.put(MO, "Macao");
		MAP_COUNTRY_FULL_NAME.put(MK, "North Macedonia");
		MAP_COUNTRY_FULL_NAME.put(MG, "Madagascar");
		MAP_COUNTRY_FULL_NAME.put(MW, "Malawi");
		MAP_COUNTRY_FULL_NAME.put(MY, "Malaysia");
		MAP_COUNTRY_FULL_NAME.put(MV, "Maldives");
		MAP_COUNTRY_FULL_NAME.put(ML, "Mali");
		MAP_COUNTRY_FULL_NAME.put(MT, "Malta");
		MAP_COUNTRY_FULL_NAME.put(MH, "Marshall Islands");
		MAP_COUNTRY_FULL_NAME.put(MQ, "Martinique");
		MAP_COUNTRY_FULL_NAME.put(MR, "Mauritania");
		MAP_COUNTRY_FULL_NAME.put(MU, "Mauritius");
		MAP_COUNTRY_FULL_NAME.put(YT, "Mayotte");
		MAP_COUNTRY_FULL_NAME.put(MX, "Mexico");
		MAP_COUNTRY_FULL_NAME.put(FM, "Micronesia");
		MAP_COUNTRY_FULL_NAME.put(MD, "Moldova");
		MAP_COUNTRY_FULL_NAME.put(MC, "Monaco");
		MAP_COUNTRY_FULL_NAME.put(MN, "Mongolia");
		MAP_COUNTRY_FULL_NAME.put(ME, "Montenegro");
		MAP_COUNTRY_FULL_NAME.put(MS, "Montserrat");
		MAP_COUNTRY_FULL_NAME.put(MA, "Morocco");
		MAP_COUNTRY_FULL_NAME.put(MZ, "Mozambique");
		MAP_COUNTRY_FULL_NAME.put(MM, "Myanmar");
		MAP_COUNTRY_FULL_NAME.put(NA, "Namibia");
		MAP_COUNTRY_FULL_NAME.put(NR, "Nauru");
		MAP_COUNTRY_FULL_NAME.put(NP, "Nepal");
		MAP_COUNTRY_FULL_NAME.put(NL, "Netherlands");
		MAP_COUNTRY_FULL_NAME.put(NC, "New Caledonia");
		MAP_COUNTRY_FULL_NAME.put(NZ, "New Zealand");
		MAP_COUNTRY_FULL_NAME.put(NI, "Nicaragua");
		MAP_COUNTRY_FULL_NAME.put(NE, "Niger");
		MAP_COUNTRY_FULL_NAME.put(NG, "Nigeria");
		MAP_COUNTRY_FULL_NAME.put(NU, "Niue");
		MAP_COUNTRY_FULL_NAME.put(NF, "Norfolk Island");
		MAP_COUNTRY_FULL_NAME.put(MP, "Northern Mariana Islands");
		MAP_COUNTRY_FULL_NAME.put(NO, "Norway");
		MAP_COUNTRY_FULL_NAME.put(OM, "Oman");
		MAP_COUNTRY_FULL_NAME.put(PK, "Pakistan");
		MAP_COUNTRY_FULL_NAME.put(PW, "Palau");
		MAP_COUNTRY_FULL_NAME.put(PS, "Palestine");
		MAP_COUNTRY_FULL_NAME.put(PA, "Panama");
		MAP_COUNTRY_FULL_NAME.put(PG, "Papua New Guinea");
		MAP_COUNTRY_FULL_NAME.put(PY, "Paraguay");
		MAP_COUNTRY_FULL_NAME.put(PE, "Peru");
		MAP_COUNTRY_FULL_NAME.put(PH, "Philippines");
		MAP_COUNTRY_FULL_NAME.put(PN, "Pitcairn");
		MAP_COUNTRY_FULL_NAME.put(PL, "Poland");
		MAP_COUNTRY_FULL_NAME.put(PT, "Portugal");
		MAP_COUNTRY_FULL_NAME.put(PR, "Puerto Rico");
		MAP_COUNTRY_FULL_NAME.put(QA, "Qatar");
		MAP_COUNTRY_FULL_NAME.put(RE, "Réunion");
		MAP_COUNTRY_FULL_NAME.put(RO, "Romania");
		MAP_COUNTRY_FULL_NAME.put(RU, "Russia");
		MAP_COUNTRY_FULL_NAME.put(RW, "Rwanda");
		MAP_COUNTRY_FULL_NAME.put(BL, "Saint Barthélemy");
		MAP_COUNTRY_FULL_NAME.put(SH, "Saint Helena, Ascension and Tristan da Cunha");
		MAP_COUNTRY_FULL_NAME.put(KN, "Saint Kitts and Nevis");
		MAP_COUNTRY_FULL_NAME.put(LC, "Saint Lucia");
		MAP_COUNTRY_FULL_NAME.put(MF, "Saint Martin (French part)");
		MAP_COUNTRY_FULL_NAME.put(PM, "Saint Pierre and Miquelon");
		MAP_COUNTRY_FULL_NAME.put(VC, "Saint Vincent and the Grenadines");
		MAP_COUNTRY_FULL_NAME.put(WS, "Samoa");
		MAP_COUNTRY_FULL_NAME.put(SM, "San Marino");
		MAP_COUNTRY_FULL_NAME.put(ST, "Sao Tome and Principe");
		MAP_COUNTRY_FULL_NAME.put(SA, "Saudi Arabia");
		MAP_COUNTRY_FULL_NAME.put(SN, "Senegal");
		MAP_COUNTRY_FULL_NAME.put(RS, "Serbia");
		MAP_COUNTRY_FULL_NAME.put(SC, "Seychelles");
		MAP_COUNTRY_FULL_NAME.put(SL, "Sierra Leone");
		MAP_COUNTRY_FULL_NAME.put(SG, "Singapore");
		MAP_COUNTRY_FULL_NAME.put(SX, "Sint Maarten (Dutch part)");
		MAP_COUNTRY_FULL_NAME.put(SK, "Slovakia");
		MAP_COUNTRY_FULL_NAME.put(SI, "Slovenia");
		MAP_COUNTRY_FULL_NAME.put(SB, "Solomon Islands");
		MAP_COUNTRY_FULL_NAME.put(SO, "Somalia");
		MAP_COUNTRY_FULL_NAME.put(ZA, "South Africa");
		MAP_COUNTRY_FULL_NAME.put(GS, "South Georgia and the South Sandwich Islands");
		MAP_COUNTRY_FULL_NAME.put(SS, "South Sudan");
		MAP_COUNTRY_FULL_NAME.put(ES, "Spain");
		MAP_COUNTRY_FULL_NAME.put(LK, "Sri Lanka");
		MAP_COUNTRY_FULL_NAME.put(SD, "Sudan");
		MAP_COUNTRY_FULL_NAME.put(SR, "Suriname");
		MAP_COUNTRY_FULL_NAME.put(SJ, "Svalbard and Jan Mayen");
		MAP_COUNTRY_FULL_NAME.put(SE, "Sweden");
		MAP_COUNTRY_FULL_NAME.put(CH, "Switzerland");
		MAP_COUNTRY_FULL_NAME.put(SY, "Syria");
		MAP_COUNTRY_FULL_NAME.put(TW, "Taiwan");
		MAP_COUNTRY_FULL_NAME.put(TJ, "Tajikistan");
		MAP_COUNTRY_FULL_NAME.put(TZ, "Tanzania");
		MAP_COUNTRY_FULL_NAME.put(TH, "Thailand");
		MAP_COUNTRY_FULL_NAME.put(TL, "Timor-Leste");
		MAP_COUNTRY_FULL_NAME.put(TG, "Togo");
		MAP_COUNTRY_FULL_NAME.put(TK, "Tokelau");
		MAP_COUNTRY_FULL_NAME.put(TO, "Tonga");
		MAP_COUNTRY_FULL_NAME.put(TT, "Trinidad and Tobago");
		MAP_COUNTRY_FULL_NAME.put(TN, "Tunisia");
		MAP_COUNTRY_FULL_NAME.put(TR, "Turkey");
		MAP_COUNTRY_FULL_NAME.put(TM, "Turkmenistan");
		MAP_COUNTRY_FULL_NAME.put(TC, "Turks and Caicos Islands");
		MAP_COUNTRY_FULL_NAME.put(TV, "Tuvalu");
		MAP_COUNTRY_FULL_NAME.put(UG, "Uganda");
		MAP_COUNTRY_FULL_NAME.put(UA, "Ukraine");
		MAP_COUNTRY_FULL_NAME.put(AE, "United Arab Emirates");
		MAP_COUNTRY_FULL_NAME.put(GB, "United Kingdom of Great Britain and Northern Ireland");
		MAP_COUNTRY_FULL_NAME.put(UM, "United States Minor Outlying Islands");
		MAP_COUNTRY_FULL_NAME.put(US, "United States of America");
		MAP_COUNTRY_FULL_NAME.put(UY, "Uruguay");
		MAP_COUNTRY_FULL_NAME.put(UZ, "Uzbekistan");
		MAP_COUNTRY_FULL_NAME.put(VU, "Vanuatu");
		MAP_COUNTRY_FULL_NAME.put(VE, "Venezuela");
		MAP_COUNTRY_FULL_NAME.put(VN, "Viet Nam");
		MAP_COUNTRY_FULL_NAME.put(VG, "Virgin Islands (British)");
		MAP_COUNTRY_FULL_NAME.put(VI, "Virgin Islands (U.S.)");
		MAP_COUNTRY_FULL_NAME.put(WF, "Wallis and Futuna");
		MAP_COUNTRY_FULL_NAME.put(EH, "Western Sahara");
		MAP_COUNTRY_FULL_NAME.put(YE, "Yemen");
		MAP_COUNTRY_FULL_NAME.put(ZM, "Zambia");
		MAP_COUNTRY_FULL_NAME.put(ZW, "Zimbabwe");
	}

	private static final Map<CountryEnum, String> MAP_COUNTRY_OFFICIAL_NAME = new HashMap<CountryEnum, String>();
	static {
		MAP_COUNTRY_OFFICIAL_NAME.put(AF, "The Islamic Republic of Afghanistan");
		MAP_COUNTRY_OFFICIAL_NAME.put(AX, "Åland");
		MAP_COUNTRY_OFFICIAL_NAME.put(AL, "The Republic of Albania");
		MAP_COUNTRY_OFFICIAL_NAME.put(DZ, "The People's Democratic Republic of Algeria");
		MAP_COUNTRY_OFFICIAL_NAME.put(AS, "The Territory of American Samoa");
		MAP_COUNTRY_OFFICIAL_NAME.put(AD, "The Principality of Andorra");
		MAP_COUNTRY_OFFICIAL_NAME.put(AO, "The Republic of Angola");
		MAP_COUNTRY_OFFICIAL_NAME.put(AI, "Anguilla");
		MAP_COUNTRY_OFFICIAL_NAME.put(AQ, "All land and ice shelves south of the 60th parallel south");
		MAP_COUNTRY_OFFICIAL_NAME.put(AG, "Antigua and Barbuda");
		MAP_COUNTRY_OFFICIAL_NAME.put(AR, "The Argentine Republic");
		MAP_COUNTRY_OFFICIAL_NAME.put(AM, "The Republic of Armenia");
		MAP_COUNTRY_OFFICIAL_NAME.put(AW, "Aruba");
		MAP_COUNTRY_OFFICIAL_NAME.put(AU, "The Commonwealth of Australia");
		MAP_COUNTRY_OFFICIAL_NAME.put(AT, "The Republic of Austria");
		MAP_COUNTRY_OFFICIAL_NAME.put(AZ, "The Republic of Azerbaijan");
		MAP_COUNTRY_OFFICIAL_NAME.put(BS, "The Commonwealth of The Bahamas");
		MAP_COUNTRY_OFFICIAL_NAME.put(BH, "The Kingdom of Bahrain");
		MAP_COUNTRY_OFFICIAL_NAME.put(BD, "The People's Republic of Bangladesh");
		MAP_COUNTRY_OFFICIAL_NAME.put(BB, "Barbados");
		MAP_COUNTRY_OFFICIAL_NAME.put(BY, "The Republic of Belarus");
		MAP_COUNTRY_OFFICIAL_NAME.put(BE, "The Kingdom of Belgium");
		MAP_COUNTRY_OFFICIAL_NAME.put(BZ, "Belize");
		MAP_COUNTRY_OFFICIAL_NAME.put(BJ, "The Republic of Benin");
		MAP_COUNTRY_OFFICIAL_NAME.put(BM, "Bermuda");
		MAP_COUNTRY_OFFICIAL_NAME.put(BT, "The Kingdom of Bhutan");
		MAP_COUNTRY_OFFICIAL_NAME.put(BO, "The Plurinational State of Bolivia");
		MAP_COUNTRY_OFFICIAL_NAME.put(BQ, "Bonaire, Sint Eustatius and Saba");
		MAP_COUNTRY_OFFICIAL_NAME.put(BA, "Bosnia and Herzegovina");
		MAP_COUNTRY_OFFICIAL_NAME.put(BW, "The Republic of Botswana");
		MAP_COUNTRY_OFFICIAL_NAME.put(BV, "Bouvet Island");
		MAP_COUNTRY_OFFICIAL_NAME.put(BR, "The Federative Republic of Brazil");
		MAP_COUNTRY_OFFICIAL_NAME.put(IO, "The British Indian Ocean Territory");
		MAP_COUNTRY_OFFICIAL_NAME.put(BN, "The Nation of Brunei, the Abode of Peace");
		MAP_COUNTRY_OFFICIAL_NAME.put(BG, "The Republic of Bulgaria");
		MAP_COUNTRY_OFFICIAL_NAME.put(BF, "Burkina Faso");
		MAP_COUNTRY_OFFICIAL_NAME.put(BI, "The Republic of Burundi");
		MAP_COUNTRY_OFFICIAL_NAME.put(CV, "The Republic of Cabo Verde");
		MAP_COUNTRY_OFFICIAL_NAME.put(KH, "The Kingdom of Cambodia");
		MAP_COUNTRY_OFFICIAL_NAME.put(CM, "The Republic of Cameroon");
		MAP_COUNTRY_OFFICIAL_NAME.put(CA, "Canada");
		MAP_COUNTRY_OFFICIAL_NAME.put(KY, "The Cayman Islands");
		MAP_COUNTRY_OFFICIAL_NAME.put(CF, "The Central African Republic");
		MAP_COUNTRY_OFFICIAL_NAME.put(TD, "The Republic of Chad");
		MAP_COUNTRY_OFFICIAL_NAME.put(CL, "The Republic of Chile");
		MAP_COUNTRY_OFFICIAL_NAME.put(CN, "The People's Republic of China");
		MAP_COUNTRY_OFFICIAL_NAME.put(CX, "The Territory of Christmas Island");
		MAP_COUNTRY_OFFICIAL_NAME.put(CC, "The Territory of Cocos (Keeling) Islands");
		MAP_COUNTRY_OFFICIAL_NAME.put(CO, "The Republic of Colombia");
		MAP_COUNTRY_OFFICIAL_NAME.put(KM, "The Union of the Comoros");
		MAP_COUNTRY_OFFICIAL_NAME.put(CD, "The Democratic Republic of the Congo");
		MAP_COUNTRY_OFFICIAL_NAME.put(CG, "The Republic of the Congo");
		MAP_COUNTRY_OFFICIAL_NAME.put(CK, "The Cook Islands");
		MAP_COUNTRY_OFFICIAL_NAME.put(CR, "The Republic of Costa Rica");
		MAP_COUNTRY_OFFICIAL_NAME.put(CI, "The Republic of Côte d'Ivoire");
		MAP_COUNTRY_OFFICIAL_NAME.put(HR, "The Republic of Croatia");
		MAP_COUNTRY_OFFICIAL_NAME.put(CU, "The Republic of Cuba");
		MAP_COUNTRY_OFFICIAL_NAME.put(CW, "The Country of Curaçao");
		MAP_COUNTRY_OFFICIAL_NAME.put(CY, "The Republic of Cyprus");
		MAP_COUNTRY_OFFICIAL_NAME.put(CZ, "The Czech Republic");
		MAP_COUNTRY_OFFICIAL_NAME.put(DK, "The Kingdom of Denmark");
		MAP_COUNTRY_OFFICIAL_NAME.put(DJ, "The Republic of Djibouti");
		MAP_COUNTRY_OFFICIAL_NAME.put(DM, "The Commonwealth of Dominica");
		MAP_COUNTRY_OFFICIAL_NAME.put(DO, "The Dominican Republic");
		MAP_COUNTRY_OFFICIAL_NAME.put(EC, "The Republic of Ecuador");
		MAP_COUNTRY_OFFICIAL_NAME.put(EG, "The Arab Republic of Egypt");
		MAP_COUNTRY_OFFICIAL_NAME.put(SV, "The Republic of El Salvador");
		MAP_COUNTRY_OFFICIAL_NAME.put(GQ, "The Republic of Equatorial Guinea");
		MAP_COUNTRY_OFFICIAL_NAME.put(ER, "The State of Eritrea");
		MAP_COUNTRY_OFFICIAL_NAME.put(EE, "The Republic of Estonia");
		MAP_COUNTRY_OFFICIAL_NAME.put(SZ, "The Kingdom of Eswatini");
		MAP_COUNTRY_OFFICIAL_NAME.put(ET, "The Federal Democratic Republic of Ethiopia");
		MAP_COUNTRY_OFFICIAL_NAME.put(FK, "The Falkland Islands");
		MAP_COUNTRY_OFFICIAL_NAME.put(FO, "The Faroe Islands");
		MAP_COUNTRY_OFFICIAL_NAME.put(FJ, "The Republic of Fiji");
		MAP_COUNTRY_OFFICIAL_NAME.put(FI, "The Republic of Finland");
		MAP_COUNTRY_OFFICIAL_NAME.put(FR, "The French Republic");
		MAP_COUNTRY_OFFICIAL_NAME.put(GF, "Guyane");
		MAP_COUNTRY_OFFICIAL_NAME.put(PF, "French Polynesia");
		MAP_COUNTRY_OFFICIAL_NAME.put(TF, "The French Southern and Antarctic Lands");
		MAP_COUNTRY_OFFICIAL_NAME.put(GA, "The Gabonese Republic");
		MAP_COUNTRY_OFFICIAL_NAME.put(GM, "The Republic of The Gambia");
		MAP_COUNTRY_OFFICIAL_NAME.put(GE, "Georgia");
		MAP_COUNTRY_OFFICIAL_NAME.put(DE, "The Federal Republic of Germany");
		MAP_COUNTRY_OFFICIAL_NAME.put(GH, "The Republic of Ghana");
		MAP_COUNTRY_OFFICIAL_NAME.put(GI, "Gibraltar");
		MAP_COUNTRY_OFFICIAL_NAME.put(GR, "The Hellenic Republic");
		MAP_COUNTRY_OFFICIAL_NAME.put(GL, "Kalaallit Nunaat");
		MAP_COUNTRY_OFFICIAL_NAME.put(GD, "Grenada");
		MAP_COUNTRY_OFFICIAL_NAME.put(GP, "Guadeloupe");
		MAP_COUNTRY_OFFICIAL_NAME.put(GU, "The Territory of Guam");
		MAP_COUNTRY_OFFICIAL_NAME.put(GT, "The Republic of Guatemala");
		MAP_COUNTRY_OFFICIAL_NAME.put(GG, "The Bailiwick of Guernsey");
		MAP_COUNTRY_OFFICIAL_NAME.put(GN, "The Republic of Guinea");
		MAP_COUNTRY_OFFICIAL_NAME.put(GW, "The Republic of Guinea-Bissau");
		MAP_COUNTRY_OFFICIAL_NAME.put(GY, "The Co-operative Republic of Guyana");
		MAP_COUNTRY_OFFICIAL_NAME.put(HT, "The Republic of Haiti");
		MAP_COUNTRY_OFFICIAL_NAME.put(HM, "The Territory of Heard Island and McDonald Islands");
		MAP_COUNTRY_OFFICIAL_NAME.put(VA, "The Holy See");
		MAP_COUNTRY_OFFICIAL_NAME.put(HN, "The Republic of Honduras");
		MAP_COUNTRY_OFFICIAL_NAME.put(HK, "The Hong Kong Special Administrative Region of China[10]");
		MAP_COUNTRY_OFFICIAL_NAME.put(HU, "Hungary");
		MAP_COUNTRY_OFFICIAL_NAME.put(IS, "Iceland");
		MAP_COUNTRY_OFFICIAL_NAME.put(IN, "The Republic of India");
		MAP_COUNTRY_OFFICIAL_NAME.put(ID, "The Republic of Indonesia");
		MAP_COUNTRY_OFFICIAL_NAME.put(IR, "The Islamic Republic of Iran");
		MAP_COUNTRY_OFFICIAL_NAME.put(IQ, "The Republic of Iraq");
		MAP_COUNTRY_OFFICIAL_NAME.put(IE, "Ireland");
		MAP_COUNTRY_OFFICIAL_NAME.put(IM, "The Isle of Man");
		MAP_COUNTRY_OFFICIAL_NAME.put(IL, "The State of Israel");
		MAP_COUNTRY_OFFICIAL_NAME.put(IT, "The Italian Republic");
		MAP_COUNTRY_OFFICIAL_NAME.put(JM, "Jamaica");
		MAP_COUNTRY_OFFICIAL_NAME.put(JP, "Japan");
		MAP_COUNTRY_OFFICIAL_NAME.put(JE, "The Bailiwick of Jersey");
		MAP_COUNTRY_OFFICIAL_NAME.put(JO, "The Hashemite Kingdom of Jordan");
		MAP_COUNTRY_OFFICIAL_NAME.put(KZ, "The Republic of Kazakhstan");
		MAP_COUNTRY_OFFICIAL_NAME.put(KE, "The Republic of Kenya");
		MAP_COUNTRY_OFFICIAL_NAME.put(KI, "The Republic of Kiribati");
		MAP_COUNTRY_OFFICIAL_NAME.put(KP, "The Democratic People's Republic of Korea");
		MAP_COUNTRY_OFFICIAL_NAME.put(KR, "The Republic of Korea");
		MAP_COUNTRY_OFFICIAL_NAME.put(KW, "The State of Kuwait");
		MAP_COUNTRY_OFFICIAL_NAME.put(KG, "The Kyrgyz Republic");
		MAP_COUNTRY_OFFICIAL_NAME.put(LA, "The Lao People's Democratic Republic");
		MAP_COUNTRY_OFFICIAL_NAME.put(LV, "The Republic of Latvia");
		MAP_COUNTRY_OFFICIAL_NAME.put(LB, "The Lebanese Republic");
		MAP_COUNTRY_OFFICIAL_NAME.put(LS, "The Kingdom of Lesotho");
		MAP_COUNTRY_OFFICIAL_NAME.put(LR, "The Republic of Liberia");
		MAP_COUNTRY_OFFICIAL_NAME.put(LY, "The State of Libya");
		MAP_COUNTRY_OFFICIAL_NAME.put(LI, "The Principality of Liechtenstein");
		MAP_COUNTRY_OFFICIAL_NAME.put(LT, "The Republic of Lithuania");
		MAP_COUNTRY_OFFICIAL_NAME.put(LU, "The Grand Duchy of Luxembourg");
		MAP_COUNTRY_OFFICIAL_NAME.put(MO, "The Macao Special Administrative Region of China[11]");
		MAP_COUNTRY_OFFICIAL_NAME.put(MK, "The Republic of North Macedonia[12]");
		MAP_COUNTRY_OFFICIAL_NAME.put(MG, "The Republic of Madagascar");
		MAP_COUNTRY_OFFICIAL_NAME.put(MW, "The Republic of Malawi");
		MAP_COUNTRY_OFFICIAL_NAME.put(MY, "Malaysia");
		MAP_COUNTRY_OFFICIAL_NAME.put(MV, "The Republic of Maldives");
		MAP_COUNTRY_OFFICIAL_NAME.put(ML, "The Republic of Mali");
		MAP_COUNTRY_OFFICIAL_NAME.put(MT, "The Republic of Malta");
		MAP_COUNTRY_OFFICIAL_NAME.put(MH, "The Republic of the Marshall Islands");
		MAP_COUNTRY_OFFICIAL_NAME.put(MQ, "Martinique");
		MAP_COUNTRY_OFFICIAL_NAME.put(MR, "The Islamic Republic of Mauritania");
		MAP_COUNTRY_OFFICIAL_NAME.put(MU, "The Republic of Mauritius");
		MAP_COUNTRY_OFFICIAL_NAME.put(YT, "The Department of Mayotte");
		MAP_COUNTRY_OFFICIAL_NAME.put(MX, "The United Mexican States");
		MAP_COUNTRY_OFFICIAL_NAME.put(FM, "The Federated States of Micronesia");
		MAP_COUNTRY_OFFICIAL_NAME.put(MD, "The Republic of Moldova");
		MAP_COUNTRY_OFFICIAL_NAME.put(MC, "The Principality of Monaco");
		MAP_COUNTRY_OFFICIAL_NAME.put(MN, "Mongolia");
		MAP_COUNTRY_OFFICIAL_NAME.put(ME, "Montenegro");
		MAP_COUNTRY_OFFICIAL_NAME.put(MS, "Montserrat");
		MAP_COUNTRY_OFFICIAL_NAME.put(MA, "The Kingdom of Morocco");
		MAP_COUNTRY_OFFICIAL_NAME.put(MZ, "The Republic of Mozambique");
		MAP_COUNTRY_OFFICIAL_NAME.put(MM, "The Republic of the Union of Myanmar");
		MAP_COUNTRY_OFFICIAL_NAME.put(NA, "The Republic of Namibia");
		MAP_COUNTRY_OFFICIAL_NAME.put(NR, "The Republic of Nauru");
		MAP_COUNTRY_OFFICIAL_NAME.put(NP, "The Federal Democratic Republic of Nepal");
		MAP_COUNTRY_OFFICIAL_NAME.put(NL, "The Kingdom of the Netherlands");
		MAP_COUNTRY_OFFICIAL_NAME.put(NC, "New Caledonia");
		MAP_COUNTRY_OFFICIAL_NAME.put(NZ, "New Zealand");
		MAP_COUNTRY_OFFICIAL_NAME.put(NI, "The Republic of Nicaragua");
		MAP_COUNTRY_OFFICIAL_NAME.put(NE, "The Republic of the Niger");
		MAP_COUNTRY_OFFICIAL_NAME.put(NG, "The Federal Republic of Nigeria");
		MAP_COUNTRY_OFFICIAL_NAME.put(NU, "Niue");
		MAP_COUNTRY_OFFICIAL_NAME.put(NF, "The Territory of Norfolk Island");
		MAP_COUNTRY_OFFICIAL_NAME.put(MP, "The Commonwealth of the Northern Mariana Islands");
		MAP_COUNTRY_OFFICIAL_NAME.put(NO, "The Kingdom of Norway");
		MAP_COUNTRY_OFFICIAL_NAME.put(OM, "The Sultanate of Oman");
		MAP_COUNTRY_OFFICIAL_NAME.put(PK, "The Islamic Republic of Pakistan");
		MAP_COUNTRY_OFFICIAL_NAME.put(PW, "The Republic of Palau");
		MAP_COUNTRY_OFFICIAL_NAME.put(PS, "The State of Palestine");
		MAP_COUNTRY_OFFICIAL_NAME.put(PA, "The Republic of Panamá");
		MAP_COUNTRY_OFFICIAL_NAME.put(PG, "The Independent State of Papua New Guinea");
		MAP_COUNTRY_OFFICIAL_NAME.put(PY, "The Republic of Paraguay");
		MAP_COUNTRY_OFFICIAL_NAME.put(PE, "The Republic of Perú");
		MAP_COUNTRY_OFFICIAL_NAME.put(PH, "The Republic of the Philippines");
		MAP_COUNTRY_OFFICIAL_NAME.put(PN, "The Pitcairn, Henderson, Ducie and Oeno Islands");
		MAP_COUNTRY_OFFICIAL_NAME.put(PL, "The Republic of Poland");
		MAP_COUNTRY_OFFICIAL_NAME.put(PT, "The Portuguese Republic");
		MAP_COUNTRY_OFFICIAL_NAME.put(PR, "The Commonwealth of Puerto Rico");
		MAP_COUNTRY_OFFICIAL_NAME.put(QA, "The State of Qatar");
		MAP_COUNTRY_OFFICIAL_NAME.put(RE, "Réunion");
		MAP_COUNTRY_OFFICIAL_NAME.put(RO, "Romania");
		MAP_COUNTRY_OFFICIAL_NAME.put(RU, "The Russian Federation");
		MAP_COUNTRY_OFFICIAL_NAME.put(RW, "The Republic of Rwanda");
		MAP_COUNTRY_OFFICIAL_NAME.put(BL, "The Collectivity of Saint-Barthélemy");
		MAP_COUNTRY_OFFICIAL_NAME.put(SH, "Saint Helena, Ascension and Tristan da Cunha");
		MAP_COUNTRY_OFFICIAL_NAME.put(KN, "Saint Kitts and Nevis");
		MAP_COUNTRY_OFFICIAL_NAME.put(LC, "Saint Lucia");
		MAP_COUNTRY_OFFICIAL_NAME.put(MF, "The Collectivity of Saint-Martin");
		MAP_COUNTRY_OFFICIAL_NAME.put(PM, "The Overseas Collectivity of Saint-Pierre and Miquelon");
		MAP_COUNTRY_OFFICIAL_NAME.put(VC, "Saint Vincent and the Grenadines");
		MAP_COUNTRY_OFFICIAL_NAME.put(WS, "The Independent State of Samoa");
		MAP_COUNTRY_OFFICIAL_NAME.put(SM, "The Republic of San Marino");
		MAP_COUNTRY_OFFICIAL_NAME.put(ST, "The Democratic Republic of São Tomé and Príncipe");
		MAP_COUNTRY_OFFICIAL_NAME.put(SA, "The Kingdom of Saudi Arabia");
		MAP_COUNTRY_OFFICIAL_NAME.put(SN, "The Republic of Senegal");
		MAP_COUNTRY_OFFICIAL_NAME.put(RS, "The Republic of Serbia");
		MAP_COUNTRY_OFFICIAL_NAME.put(SC, "The Republic of Seychelles");
		MAP_COUNTRY_OFFICIAL_NAME.put(SL, "The Republic of Sierra Leone");
		MAP_COUNTRY_OFFICIAL_NAME.put(SG, "The Republic of Singapore");
		MAP_COUNTRY_OFFICIAL_NAME.put(SX, "Sint Maarten");
		MAP_COUNTRY_OFFICIAL_NAME.put(SK, "The Slovak Republic");
		MAP_COUNTRY_OFFICIAL_NAME.put(SI, "The Republic of Slovenia");
		MAP_COUNTRY_OFFICIAL_NAME.put(SB, "The Solomon Islands");
		MAP_COUNTRY_OFFICIAL_NAME.put(SO, "The Federal Republic of Somalia");
		MAP_COUNTRY_OFFICIAL_NAME.put(ZA, "The Republic of South Africa");
		MAP_COUNTRY_OFFICIAL_NAME.put(GS, "South Georgia and the South Sandwich Islands");
		MAP_COUNTRY_OFFICIAL_NAME.put(SS, "The Republic of South Sudan");
		MAP_COUNTRY_OFFICIAL_NAME.put(ES, "The Kingdom of Spain");
		MAP_COUNTRY_OFFICIAL_NAME.put(LK, "The Democratic Socialist Republic of Sri Lanka");
		MAP_COUNTRY_OFFICIAL_NAME.put(SD, "The Republic of the Sudan");
		MAP_COUNTRY_OFFICIAL_NAME.put(SR, "The Republic of Suriname");
		MAP_COUNTRY_OFFICIAL_NAME.put(SJ, "Svalbard and Jan Mayen");
		MAP_COUNTRY_OFFICIAL_NAME.put(SE, "The Kingdom of Sweden");
		MAP_COUNTRY_OFFICIAL_NAME.put(CH, "The Swiss Confederation");
		MAP_COUNTRY_OFFICIAL_NAME.put(SY, "The Syrian Arab Republic");
		MAP_COUNTRY_OFFICIAL_NAME.put(TW, "The Republic of China");
		MAP_COUNTRY_OFFICIAL_NAME.put(TJ, "The Republic of Tajikistan");
		MAP_COUNTRY_OFFICIAL_NAME.put(TZ, "The United Republic of Tanzania");
		MAP_COUNTRY_OFFICIAL_NAME.put(TH, "The Kingdom of Thailand");
		MAP_COUNTRY_OFFICIAL_NAME.put(TL, "The Democratic Republic of Timor-Leste");
		MAP_COUNTRY_OFFICIAL_NAME.put(TG, "The Togolese Republic");
		MAP_COUNTRY_OFFICIAL_NAME.put(TK, "Tokelau");
		MAP_COUNTRY_OFFICIAL_NAME.put(TO, "The Kingdom of Tonga");
		MAP_COUNTRY_OFFICIAL_NAME.put(TT, "The Republic of Trinidad and Tobago");
		MAP_COUNTRY_OFFICIAL_NAME.put(TN, "The Republic of Tunisia");
		MAP_COUNTRY_OFFICIAL_NAME.put(TR, "The Republic of Turkey");
		MAP_COUNTRY_OFFICIAL_NAME.put(TM, "Turkmenistan");
		MAP_COUNTRY_OFFICIAL_NAME.put(TC, "The Turks and Caicos Islands");
		MAP_COUNTRY_OFFICIAL_NAME.put(TV, "Tuvalu");
		MAP_COUNTRY_OFFICIAL_NAME.put(UG, "The Republic of Uganda");
		MAP_COUNTRY_OFFICIAL_NAME.put(UA, "Ukraine");
		MAP_COUNTRY_OFFICIAL_NAME.put(AE, "The United Arab Emirates");
		MAP_COUNTRY_OFFICIAL_NAME.put(GB, "The United Kingdom of Great Britain and Northern Ireland");
		MAP_COUNTRY_OFFICIAL_NAME.put(UM,
				"Baker Island, Howland Island, Jarvis Island, Johnston Atoll, Kingman Reef, Midway Atoll, Navassa Island, Palmyra Atoll, and Wake Island");
		MAP_COUNTRY_OFFICIAL_NAME.put(US, "The United States of America");
		MAP_COUNTRY_OFFICIAL_NAME.put(UY, "The Oriental Republic of Uruguay");
		MAP_COUNTRY_OFFICIAL_NAME.put(UZ, "The Republic of Uzbekistan");
		MAP_COUNTRY_OFFICIAL_NAME.put(VU, "The Republic of Vanuatu");
		MAP_COUNTRY_OFFICIAL_NAME.put(VE, "The Bolivarian Republic of Venezuela");
		MAP_COUNTRY_OFFICIAL_NAME.put(VN, "The Socialist Republic of Viet Nam");
		MAP_COUNTRY_OFFICIAL_NAME.put(VG, "The Virgin Islands");
		MAP_COUNTRY_OFFICIAL_NAME.put(VI, "The Virgin Islands of the United States");
		MAP_COUNTRY_OFFICIAL_NAME.put(WF, "The Territory of the Wallis and Futuna Islands");
		MAP_COUNTRY_OFFICIAL_NAME.put(EH, "The Sahrawi Arab Democratic Republic");
		MAP_COUNTRY_OFFICIAL_NAME.put(YE, "The Republic of Yemen");
		MAP_COUNTRY_OFFICIAL_NAME.put(ZM, "The Republic of Zambia");
		MAP_COUNTRY_OFFICIAL_NAME.put(ZW, "The Republic of Zimbabwe");
	}

	private static final Map<CountryEnum, String> MAP_COUNTRY_ALPHA_3 = new HashMap<CountryEnum, String>();
	static {
		MAP_COUNTRY_ALPHA_3.put(AF, "AFG");
		MAP_COUNTRY_ALPHA_3.put(AX, "ALA");
		MAP_COUNTRY_ALPHA_3.put(AL, "ALB");
		MAP_COUNTRY_ALPHA_3.put(DZ, "DZA");
		MAP_COUNTRY_ALPHA_3.put(AS, "ASM");
		MAP_COUNTRY_ALPHA_3.put(AD, "AND");
		MAP_COUNTRY_ALPHA_3.put(AO, "AGO");
		MAP_COUNTRY_ALPHA_3.put(AI, "AIA");
		MAP_COUNTRY_ALPHA_3.put(AQ, "ATA");
		MAP_COUNTRY_ALPHA_3.put(AG, "ATG");
		MAP_COUNTRY_ALPHA_3.put(AR, "ARG");
		MAP_COUNTRY_ALPHA_3.put(AM, "ARM");
		MAP_COUNTRY_ALPHA_3.put(AW, "ABW");
		MAP_COUNTRY_ALPHA_3.put(AU, "AUS");
		MAP_COUNTRY_ALPHA_3.put(AT, "AUT");
		MAP_COUNTRY_ALPHA_3.put(AZ, "AZE");
		MAP_COUNTRY_ALPHA_3.put(BS, "BHS");
		MAP_COUNTRY_ALPHA_3.put(BH, "BHR");
		MAP_COUNTRY_ALPHA_3.put(BD, "BGD");
		MAP_COUNTRY_ALPHA_3.put(BB, "BRB");
		MAP_COUNTRY_ALPHA_3.put(BY, "BLR");
		MAP_COUNTRY_ALPHA_3.put(BE, "BEL");
		MAP_COUNTRY_ALPHA_3.put(BZ, "BLZ");
		MAP_COUNTRY_ALPHA_3.put(BJ, "BEN");
		MAP_COUNTRY_ALPHA_3.put(BM, "BMU");
		MAP_COUNTRY_ALPHA_3.put(BT, "BTN");
		MAP_COUNTRY_ALPHA_3.put(BO, "BOL");
		MAP_COUNTRY_ALPHA_3.put(BQ, "BES");
		MAP_COUNTRY_ALPHA_3.put(BA, "BIH");
		MAP_COUNTRY_ALPHA_3.put(BW, "BWA");
		MAP_COUNTRY_ALPHA_3.put(BV, "BVT");
		MAP_COUNTRY_ALPHA_3.put(BR, "BRA");
		MAP_COUNTRY_ALPHA_3.put(IO, "IOT");
		MAP_COUNTRY_ALPHA_3.put(BN, "BRN");
		MAP_COUNTRY_ALPHA_3.put(BG, "BGR");
		MAP_COUNTRY_ALPHA_3.put(BF, "BFA");
		MAP_COUNTRY_ALPHA_3.put(BI, "BDI");
		MAP_COUNTRY_ALPHA_3.put(CV, "CPV");
		MAP_COUNTRY_ALPHA_3.put(KH, "KHM");
		MAP_COUNTRY_ALPHA_3.put(CM, "CMR");
		MAP_COUNTRY_ALPHA_3.put(CA, "CAN");
		MAP_COUNTRY_ALPHA_3.put(KY, "CYM");
		MAP_COUNTRY_ALPHA_3.put(CF, "CAF");
		MAP_COUNTRY_ALPHA_3.put(TD, "TCD");
		MAP_COUNTRY_ALPHA_3.put(CL, "CHL");
		MAP_COUNTRY_ALPHA_3.put(CN, "CHN");
		MAP_COUNTRY_ALPHA_3.put(CX, "CXR");
		MAP_COUNTRY_ALPHA_3.put(CC, "CCK");
		MAP_COUNTRY_ALPHA_3.put(CO, "COL");
		MAP_COUNTRY_ALPHA_3.put(KM, "COM");
		MAP_COUNTRY_ALPHA_3.put(CD, "COD");
		MAP_COUNTRY_ALPHA_3.put(CG, "COG");
		MAP_COUNTRY_ALPHA_3.put(CK, "COK");
		MAP_COUNTRY_ALPHA_3.put(CR, "CRI");
		MAP_COUNTRY_ALPHA_3.put(CI, "CIV");
		MAP_COUNTRY_ALPHA_3.put(HR, "HRV");
		MAP_COUNTRY_ALPHA_3.put(CU, "CUB");
		MAP_COUNTRY_ALPHA_3.put(CW, "CUW");
		MAP_COUNTRY_ALPHA_3.put(CY, "CYP");
		MAP_COUNTRY_ALPHA_3.put(CZ, "CZE");
		MAP_COUNTRY_ALPHA_3.put(DK, "DNK");
		MAP_COUNTRY_ALPHA_3.put(DJ, "DJI");
		MAP_COUNTRY_ALPHA_3.put(DM, "DMA");
		MAP_COUNTRY_ALPHA_3.put(DO, "DOM");
		MAP_COUNTRY_ALPHA_3.put(EC, "ECU");
		MAP_COUNTRY_ALPHA_3.put(EG, "EGY");
		MAP_COUNTRY_ALPHA_3.put(SV, "SLV");
		MAP_COUNTRY_ALPHA_3.put(GQ, "GNQ");
		MAP_COUNTRY_ALPHA_3.put(ER, "ERI");
		MAP_COUNTRY_ALPHA_3.put(EE, "EST");
		MAP_COUNTRY_ALPHA_3.put(SZ, "SWZ");
		MAP_COUNTRY_ALPHA_3.put(ET, "ETH");
		MAP_COUNTRY_ALPHA_3.put(FK, "FLK");
		MAP_COUNTRY_ALPHA_3.put(FO, "FRO");
		MAP_COUNTRY_ALPHA_3.put(FJ, "FJI");
		MAP_COUNTRY_ALPHA_3.put(FI, "FIN");
		MAP_COUNTRY_ALPHA_3.put(FR, "FRA");
		MAP_COUNTRY_ALPHA_3.put(GF, "GUF");
		MAP_COUNTRY_ALPHA_3.put(PF, "PYF");
		MAP_COUNTRY_ALPHA_3.put(TF, "ATF");
		MAP_COUNTRY_ALPHA_3.put(GA, "GAB");
		MAP_COUNTRY_ALPHA_3.put(GM, "GMB");
		MAP_COUNTRY_ALPHA_3.put(GE, "GEO");
		MAP_COUNTRY_ALPHA_3.put(DE, "DEU");
		MAP_COUNTRY_ALPHA_3.put(GH, "GHA");
		MAP_COUNTRY_ALPHA_3.put(GI, "GIB");
		MAP_COUNTRY_ALPHA_3.put(GR, "GRC");
		MAP_COUNTRY_ALPHA_3.put(GL, "GRL");
		MAP_COUNTRY_ALPHA_3.put(GD, "GRD");
		MAP_COUNTRY_ALPHA_3.put(GP, "GLP");
		MAP_COUNTRY_ALPHA_3.put(GU, "GUM");
		MAP_COUNTRY_ALPHA_3.put(GT, "GTM");
		MAP_COUNTRY_ALPHA_3.put(GG, "GGY");
		MAP_COUNTRY_ALPHA_3.put(GN, "GIN");
		MAP_COUNTRY_ALPHA_3.put(GW, "GNB");
		MAP_COUNTRY_ALPHA_3.put(GY, "GUY");
		MAP_COUNTRY_ALPHA_3.put(HT, "HTI");
		MAP_COUNTRY_ALPHA_3.put(HM, "HMD");
		MAP_COUNTRY_ALPHA_3.put(VA, "VAT");
		MAP_COUNTRY_ALPHA_3.put(HN, "HND");
		MAP_COUNTRY_ALPHA_3.put(HK, "HKG");
		MAP_COUNTRY_ALPHA_3.put(HU, "HUN");
		MAP_COUNTRY_ALPHA_3.put(IS, "ISL");
		MAP_COUNTRY_ALPHA_3.put(IN, "IND");
		MAP_COUNTRY_ALPHA_3.put(ID, "IDN");
		MAP_COUNTRY_ALPHA_3.put(IR, "IRN");
		MAP_COUNTRY_ALPHA_3.put(IQ, "IRQ");
		MAP_COUNTRY_ALPHA_3.put(IE, "IRL");
		MAP_COUNTRY_ALPHA_3.put(IM, "IMN");
		MAP_COUNTRY_ALPHA_3.put(IL, "ISR");
		MAP_COUNTRY_ALPHA_3.put(IT, "ITA");
		MAP_COUNTRY_ALPHA_3.put(JM, "JAM");
		MAP_COUNTRY_ALPHA_3.put(JP, "JPN");
		MAP_COUNTRY_ALPHA_3.put(JE, "JEY");
		MAP_COUNTRY_ALPHA_3.put(JO, "JOR");
		MAP_COUNTRY_ALPHA_3.put(KZ, "KAZ");
		MAP_COUNTRY_ALPHA_3.put(KE, "KEN");
		MAP_COUNTRY_ALPHA_3.put(KI, "KIR");
		MAP_COUNTRY_ALPHA_3.put(KP, "PRK");
		MAP_COUNTRY_ALPHA_3.put(KR, "KOR");
		MAP_COUNTRY_ALPHA_3.put(KW, "KWT");
		MAP_COUNTRY_ALPHA_3.put(KG, "KGZ");
		MAP_COUNTRY_ALPHA_3.put(LA, "LAO");
		MAP_COUNTRY_ALPHA_3.put(LV, "LVA");
		MAP_COUNTRY_ALPHA_3.put(LB, "LBN");
		MAP_COUNTRY_ALPHA_3.put(LS, "LSO");
		MAP_COUNTRY_ALPHA_3.put(LR, "LBR");
		MAP_COUNTRY_ALPHA_3.put(LY, "LBY");
		MAP_COUNTRY_ALPHA_3.put(LI, "LIE");
		MAP_COUNTRY_ALPHA_3.put(LT, "LTU");
		MAP_COUNTRY_ALPHA_3.put(LU, "LUX");
		MAP_COUNTRY_ALPHA_3.put(MO, "MAC");
		MAP_COUNTRY_ALPHA_3.put(MK, "MKD");
		MAP_COUNTRY_ALPHA_3.put(MG, "MDG");
		MAP_COUNTRY_ALPHA_3.put(MW, "MWI");
		MAP_COUNTRY_ALPHA_3.put(MY, "MYS");
		MAP_COUNTRY_ALPHA_3.put(MV, "MDV");
		MAP_COUNTRY_ALPHA_3.put(ML, "MLI");
		MAP_COUNTRY_ALPHA_3.put(MT, "MLT");
		MAP_COUNTRY_ALPHA_3.put(MH, "MHL");
		MAP_COUNTRY_ALPHA_3.put(MQ, "MTQ");
		MAP_COUNTRY_ALPHA_3.put(MR, "MRT");
		MAP_COUNTRY_ALPHA_3.put(MU, "MUS");
		MAP_COUNTRY_ALPHA_3.put(YT, "MYT");
		MAP_COUNTRY_ALPHA_3.put(MX, "MEX");
		MAP_COUNTRY_ALPHA_3.put(FM, "FSM");
		MAP_COUNTRY_ALPHA_3.put(MD, "MDA");
		MAP_COUNTRY_ALPHA_3.put(MC, "MCO");
		MAP_COUNTRY_ALPHA_3.put(MN, "MNG");
		MAP_COUNTRY_ALPHA_3.put(ME, "MNE");
		MAP_COUNTRY_ALPHA_3.put(MS, "MSR");
		MAP_COUNTRY_ALPHA_3.put(MA, "MAR");
		MAP_COUNTRY_ALPHA_3.put(MZ, "MOZ");
		MAP_COUNTRY_ALPHA_3.put(MM, "MMR");
		MAP_COUNTRY_ALPHA_3.put(NA, "NAM");
		MAP_COUNTRY_ALPHA_3.put(NR, "NRU");
		MAP_COUNTRY_ALPHA_3.put(NP, "NPL");
		MAP_COUNTRY_ALPHA_3.put(NL, "NLD");
		MAP_COUNTRY_ALPHA_3.put(NC, "NCL");
		MAP_COUNTRY_ALPHA_3.put(NZ, "NZL");
		MAP_COUNTRY_ALPHA_3.put(NI, "NIC");
		MAP_COUNTRY_ALPHA_3.put(NE, "NER");
		MAP_COUNTRY_ALPHA_3.put(NG, "NGA");
		MAP_COUNTRY_ALPHA_3.put(NU, "NIU");
		MAP_COUNTRY_ALPHA_3.put(NF, "NFK");
		MAP_COUNTRY_ALPHA_3.put(MP, "MNP");
		MAP_COUNTRY_ALPHA_3.put(NO, "NOR");
		MAP_COUNTRY_ALPHA_3.put(OM, "OMN");
		MAP_COUNTRY_ALPHA_3.put(PK, "PAK");
		MAP_COUNTRY_ALPHA_3.put(PW, "PLW");
		MAP_COUNTRY_ALPHA_3.put(PS, "PSE");
		MAP_COUNTRY_ALPHA_3.put(PA, "PAN");
		MAP_COUNTRY_ALPHA_3.put(PG, "PNG");
		MAP_COUNTRY_ALPHA_3.put(PY, "PRY");
		MAP_COUNTRY_ALPHA_3.put(PE, "PER");
		MAP_COUNTRY_ALPHA_3.put(PH, "PHL");
		MAP_COUNTRY_ALPHA_3.put(PN, "PCN");
		MAP_COUNTRY_ALPHA_3.put(PL, "POL");
		MAP_COUNTRY_ALPHA_3.put(PT, "PRT");
		MAP_COUNTRY_ALPHA_3.put(PR, "PRI");
		MAP_COUNTRY_ALPHA_3.put(QA, "QAT");
		MAP_COUNTRY_ALPHA_3.put(RE, "REU");
		MAP_COUNTRY_ALPHA_3.put(RO, "ROU");
		MAP_COUNTRY_ALPHA_3.put(RU, "RUS");
		MAP_COUNTRY_ALPHA_3.put(RW, "RWA");
		MAP_COUNTRY_ALPHA_3.put(BL, "BLM");
		MAP_COUNTRY_ALPHA_3.put(SH, "SHN");
		MAP_COUNTRY_ALPHA_3.put(KN, "KNA");
		MAP_COUNTRY_ALPHA_3.put(LC, "LCA");
		MAP_COUNTRY_ALPHA_3.put(MF, "MAF");
		MAP_COUNTRY_ALPHA_3.put(PM, "SPM");
		MAP_COUNTRY_ALPHA_3.put(VC, "VCT");
		MAP_COUNTRY_ALPHA_3.put(WS, "WSM");
		MAP_COUNTRY_ALPHA_3.put(SM, "SMR");
		MAP_COUNTRY_ALPHA_3.put(ST, "STP");
		MAP_COUNTRY_ALPHA_3.put(SA, "SAU");
		MAP_COUNTRY_ALPHA_3.put(SN, "SEN");
		MAP_COUNTRY_ALPHA_3.put(RS, "SRB");
		MAP_COUNTRY_ALPHA_3.put(SC, "SYC");
		MAP_COUNTRY_ALPHA_3.put(SL, "SLE");
		MAP_COUNTRY_ALPHA_3.put(SG, "SGP");
		MAP_COUNTRY_ALPHA_3.put(SX, "SXM");
		MAP_COUNTRY_ALPHA_3.put(SK, "SVK");
		MAP_COUNTRY_ALPHA_3.put(SI, "SVN");
		MAP_COUNTRY_ALPHA_3.put(SB, "SLB");
		MAP_COUNTRY_ALPHA_3.put(SO, "SOM");
		MAP_COUNTRY_ALPHA_3.put(ZA, "ZAF");
		MAP_COUNTRY_ALPHA_3.put(GS, "SGS");
		MAP_COUNTRY_ALPHA_3.put(SS, "SSD");
		MAP_COUNTRY_ALPHA_3.put(ES, "ESP");
		MAP_COUNTRY_ALPHA_3.put(LK, "LKA");
		MAP_COUNTRY_ALPHA_3.put(SD, "SDN");
		MAP_COUNTRY_ALPHA_3.put(SR, "SUR");
		MAP_COUNTRY_ALPHA_3.put(SJ, "SJM");
		MAP_COUNTRY_ALPHA_3.put(SE, "SWE");
		MAP_COUNTRY_ALPHA_3.put(CH, "CHE");
		MAP_COUNTRY_ALPHA_3.put(SY, "SYR");
		MAP_COUNTRY_ALPHA_3.put(TW, "TWN");
		MAP_COUNTRY_ALPHA_3.put(TJ, "TJK");
		MAP_COUNTRY_ALPHA_3.put(TZ, "TZA");
		MAP_COUNTRY_ALPHA_3.put(TH, "THA");
		MAP_COUNTRY_ALPHA_3.put(TL, "TLS");
		MAP_COUNTRY_ALPHA_3.put(TG, "TGO");
		MAP_COUNTRY_ALPHA_3.put(TK, "TKL");
		MAP_COUNTRY_ALPHA_3.put(TO, "TON");
		MAP_COUNTRY_ALPHA_3.put(TT, "TTO");
		MAP_COUNTRY_ALPHA_3.put(TN, "TUN");
		MAP_COUNTRY_ALPHA_3.put(TR, "TUR");
		MAP_COUNTRY_ALPHA_3.put(TM, "TKM");
		MAP_COUNTRY_ALPHA_3.put(TC, "TCA");
		MAP_COUNTRY_ALPHA_3.put(TV, "TUV");
		MAP_COUNTRY_ALPHA_3.put(UG, "UGA");
		MAP_COUNTRY_ALPHA_3.put(UA, "UKR");
		MAP_COUNTRY_ALPHA_3.put(AE, "ARE");
		MAP_COUNTRY_ALPHA_3.put(GB, "GBR");
		MAP_COUNTRY_ALPHA_3.put(UM, "UMI");
		MAP_COUNTRY_ALPHA_3.put(US, "USA");
		MAP_COUNTRY_ALPHA_3.put(UY, "URY");
		MAP_COUNTRY_ALPHA_3.put(UZ, "UZB");
		MAP_COUNTRY_ALPHA_3.put(VU, "VUT");
		MAP_COUNTRY_ALPHA_3.put(VE, "VEN");
		MAP_COUNTRY_ALPHA_3.put(VN, "VNM");
		MAP_COUNTRY_ALPHA_3.put(VG, "VGB");
		MAP_COUNTRY_ALPHA_3.put(VI, "VIR");
		MAP_COUNTRY_ALPHA_3.put(WF, "WLF");
		MAP_COUNTRY_ALPHA_3.put(EH, "ESH");
		MAP_COUNTRY_ALPHA_3.put(YE, "YEM");
		MAP_COUNTRY_ALPHA_3.put(ZM, "ZMB");
		MAP_COUNTRY_ALPHA_3.put(ZW, "ZWE");
	}

	private static final Map<CountryEnum, String> MAP_COUNTRY_NUMERIC_3 = new HashMap<CountryEnum, String>();
	static {
		MAP_COUNTRY_NUMERIC_3.put(AF, "004");
		MAP_COUNTRY_NUMERIC_3.put(AX, "248");
		MAP_COUNTRY_NUMERIC_3.put(AL, "008");
		MAP_COUNTRY_NUMERIC_3.put(DZ, "012");
		MAP_COUNTRY_NUMERIC_3.put(AS, "016");
		MAP_COUNTRY_NUMERIC_3.put(AD, "020");
		MAP_COUNTRY_NUMERIC_3.put(AO, "024");
		MAP_COUNTRY_NUMERIC_3.put(AI, "660");
		MAP_COUNTRY_NUMERIC_3.put(AQ, "010");
		MAP_COUNTRY_NUMERIC_3.put(AG, "028");
		MAP_COUNTRY_NUMERIC_3.put(AR, "032");
		MAP_COUNTRY_NUMERIC_3.put(AM, "051");
		MAP_COUNTRY_NUMERIC_3.put(AW, "533");
		MAP_COUNTRY_NUMERIC_3.put(AU, "036");
		MAP_COUNTRY_NUMERIC_3.put(AT, "040");
		MAP_COUNTRY_NUMERIC_3.put(AZ, "031");
		MAP_COUNTRY_NUMERIC_3.put(BS, "044");
		MAP_COUNTRY_NUMERIC_3.put(BH, "048");
		MAP_COUNTRY_NUMERIC_3.put(BD, "050");
		MAP_COUNTRY_NUMERIC_3.put(BB, "052");
		MAP_COUNTRY_NUMERIC_3.put(BY, "112");
		MAP_COUNTRY_NUMERIC_3.put(BE, "056");
		MAP_COUNTRY_NUMERIC_3.put(BZ, "084");
		MAP_COUNTRY_NUMERIC_3.put(BJ, "204");
		MAP_COUNTRY_NUMERIC_3.put(BM, "060");
		MAP_COUNTRY_NUMERIC_3.put(BT, "064");
		MAP_COUNTRY_NUMERIC_3.put(BO, "068");
		MAP_COUNTRY_NUMERIC_3.put(BQ, "535");
		MAP_COUNTRY_NUMERIC_3.put(BA, "070");
		MAP_COUNTRY_NUMERIC_3.put(BW, "072");
		MAP_COUNTRY_NUMERIC_3.put(BV, "074");
		MAP_COUNTRY_NUMERIC_3.put(BR, "076");
		MAP_COUNTRY_NUMERIC_3.put(IO, "086");
		MAP_COUNTRY_NUMERIC_3.put(BN, "096");
		MAP_COUNTRY_NUMERIC_3.put(BG, "100");
		MAP_COUNTRY_NUMERIC_3.put(BF, "854");
		MAP_COUNTRY_NUMERIC_3.put(BI, "108");
		MAP_COUNTRY_NUMERIC_3.put(CV, "132");
		MAP_COUNTRY_NUMERIC_3.put(KH, "116");
		MAP_COUNTRY_NUMERIC_3.put(CM, "120");
		MAP_COUNTRY_NUMERIC_3.put(CA, "124");
		MAP_COUNTRY_NUMERIC_3.put(KY, "136");
		MAP_COUNTRY_NUMERIC_3.put(CF, "140");
		MAP_COUNTRY_NUMERIC_3.put(TD, "148");
		MAP_COUNTRY_NUMERIC_3.put(CL, "152");
		MAP_COUNTRY_NUMERIC_3.put(CN, "156");
		MAP_COUNTRY_NUMERIC_3.put(CX, "162");
		MAP_COUNTRY_NUMERIC_3.put(CC, "166");
		MAP_COUNTRY_NUMERIC_3.put(CO, "170");
		MAP_COUNTRY_NUMERIC_3.put(KM, "174");
		MAP_COUNTRY_NUMERIC_3.put(CD, "180");
		MAP_COUNTRY_NUMERIC_3.put(CG, "178");
		MAP_COUNTRY_NUMERIC_3.put(CK, "184");
		MAP_COUNTRY_NUMERIC_3.put(CR, "188");
		MAP_COUNTRY_NUMERIC_3.put(CI, "384");
		MAP_COUNTRY_NUMERIC_3.put(HR, "191");
		MAP_COUNTRY_NUMERIC_3.put(CU, "192");
		MAP_COUNTRY_NUMERIC_3.put(CW, "531");
		MAP_COUNTRY_NUMERIC_3.put(CY, "196");
		MAP_COUNTRY_NUMERIC_3.put(CZ, "203");
		MAP_COUNTRY_NUMERIC_3.put(DK, "208");
		MAP_COUNTRY_NUMERIC_3.put(DJ, "262");
		MAP_COUNTRY_NUMERIC_3.put(DM, "212");
		MAP_COUNTRY_NUMERIC_3.put(DO, "214");
		MAP_COUNTRY_NUMERIC_3.put(EC, "218");
		MAP_COUNTRY_NUMERIC_3.put(EG, "818");
		MAP_COUNTRY_NUMERIC_3.put(SV, "222");
		MAP_COUNTRY_NUMERIC_3.put(GQ, "226");
		MAP_COUNTRY_NUMERIC_3.put(ER, "232");
		MAP_COUNTRY_NUMERIC_3.put(EE, "233");
		MAP_COUNTRY_NUMERIC_3.put(SZ, "748");
		MAP_COUNTRY_NUMERIC_3.put(ET, "231");
		MAP_COUNTRY_NUMERIC_3.put(FK, "238");
		MAP_COUNTRY_NUMERIC_3.put(FO, "234");
		MAP_COUNTRY_NUMERIC_3.put(FJ, "242");
		MAP_COUNTRY_NUMERIC_3.put(FI, "246");
		MAP_COUNTRY_NUMERIC_3.put(FR, "250");
		MAP_COUNTRY_NUMERIC_3.put(GF, "254");
		MAP_COUNTRY_NUMERIC_3.put(PF, "258");
		MAP_COUNTRY_NUMERIC_3.put(TF, "260");
		MAP_COUNTRY_NUMERIC_3.put(GA, "266");
		MAP_COUNTRY_NUMERIC_3.put(GM, "270");
		MAP_COUNTRY_NUMERIC_3.put(GE, "268");
		MAP_COUNTRY_NUMERIC_3.put(DE, "276");
		MAP_COUNTRY_NUMERIC_3.put(GH, "288");
		MAP_COUNTRY_NUMERIC_3.put(GI, "292");
		MAP_COUNTRY_NUMERIC_3.put(GR, "300");
		MAP_COUNTRY_NUMERIC_3.put(GL, "304");
		MAP_COUNTRY_NUMERIC_3.put(GD, "308");
		MAP_COUNTRY_NUMERIC_3.put(GP, "312");
		MAP_COUNTRY_NUMERIC_3.put(GU, "316");
		MAP_COUNTRY_NUMERIC_3.put(GT, "320");
		MAP_COUNTRY_NUMERIC_3.put(GG, "831");
		MAP_COUNTRY_NUMERIC_3.put(GN, "324");
		MAP_COUNTRY_NUMERIC_3.put(GW, "624");
		MAP_COUNTRY_NUMERIC_3.put(GY, "328");
		MAP_COUNTRY_NUMERIC_3.put(HT, "332");
		MAP_COUNTRY_NUMERIC_3.put(HM, "334");
		MAP_COUNTRY_NUMERIC_3.put(VA, "336");
		MAP_COUNTRY_NUMERIC_3.put(HN, "340");
		MAP_COUNTRY_NUMERIC_3.put(HK, "344");
		MAP_COUNTRY_NUMERIC_3.put(HU, "348");
		MAP_COUNTRY_NUMERIC_3.put(IS, "352");
		MAP_COUNTRY_NUMERIC_3.put(IN, "356");
		MAP_COUNTRY_NUMERIC_3.put(ID, "360");
		MAP_COUNTRY_NUMERIC_3.put(IR, "364");
		MAP_COUNTRY_NUMERIC_3.put(IQ, "368");
		MAP_COUNTRY_NUMERIC_3.put(IE, "372");
		MAP_COUNTRY_NUMERIC_3.put(IM, "833");
		MAP_COUNTRY_NUMERIC_3.put(IL, "376");
		MAP_COUNTRY_NUMERIC_3.put(IT, "380");
		MAP_COUNTRY_NUMERIC_3.put(JM, "388");
		MAP_COUNTRY_NUMERIC_3.put(JP, "392");
		MAP_COUNTRY_NUMERIC_3.put(JE, "832");
		MAP_COUNTRY_NUMERIC_3.put(JO, "400");
		MAP_COUNTRY_NUMERIC_3.put(KZ, "398");
		MAP_COUNTRY_NUMERIC_3.put(KE, "404");
		MAP_COUNTRY_NUMERIC_3.put(KI, "296");
		MAP_COUNTRY_NUMERIC_3.put(KP, "408");
		MAP_COUNTRY_NUMERIC_3.put(KR, "410");
		MAP_COUNTRY_NUMERIC_3.put(KW, "414");
		MAP_COUNTRY_NUMERIC_3.put(KG, "417");
		MAP_COUNTRY_NUMERIC_3.put(LA, "418");
		MAP_COUNTRY_NUMERIC_3.put(LV, "428");
		MAP_COUNTRY_NUMERIC_3.put(LB, "422");
		MAP_COUNTRY_NUMERIC_3.put(LS, "426");
		MAP_COUNTRY_NUMERIC_3.put(LR, "430");
		MAP_COUNTRY_NUMERIC_3.put(LY, "434");
		MAP_COUNTRY_NUMERIC_3.put(LI, "438");
		MAP_COUNTRY_NUMERIC_3.put(LT, "440");
		MAP_COUNTRY_NUMERIC_3.put(LU, "442");
		MAP_COUNTRY_NUMERIC_3.put(MO, "446");
		MAP_COUNTRY_NUMERIC_3.put(MK, "807");
		MAP_COUNTRY_NUMERIC_3.put(MG, "450");
		MAP_COUNTRY_NUMERIC_3.put(MW, "454");
		MAP_COUNTRY_NUMERIC_3.put(MY, "458");
		MAP_COUNTRY_NUMERIC_3.put(MV, "462");
		MAP_COUNTRY_NUMERIC_3.put(ML, "466");
		MAP_COUNTRY_NUMERIC_3.put(MT, "470");
		MAP_COUNTRY_NUMERIC_3.put(MH, "584");
		MAP_COUNTRY_NUMERIC_3.put(MQ, "474");
		MAP_COUNTRY_NUMERIC_3.put(MR, "478");
		MAP_COUNTRY_NUMERIC_3.put(MU, "480");
		MAP_COUNTRY_NUMERIC_3.put(YT, "175");
		MAP_COUNTRY_NUMERIC_3.put(MX, "484");
		MAP_COUNTRY_NUMERIC_3.put(FM, "583");
		MAP_COUNTRY_NUMERIC_3.put(MD, "498");
		MAP_COUNTRY_NUMERIC_3.put(MC, "492");
		MAP_COUNTRY_NUMERIC_3.put(MN, "496");
		MAP_COUNTRY_NUMERIC_3.put(ME, "499");
		MAP_COUNTRY_NUMERIC_3.put(MS, "500");
		MAP_COUNTRY_NUMERIC_3.put(MA, "504");
		MAP_COUNTRY_NUMERIC_3.put(MZ, "508");
		MAP_COUNTRY_NUMERIC_3.put(MM, "104");
		MAP_COUNTRY_NUMERIC_3.put(NA, "516");
		MAP_COUNTRY_NUMERIC_3.put(NR, "520");
		MAP_COUNTRY_NUMERIC_3.put(NP, "524");
		MAP_COUNTRY_NUMERIC_3.put(NL, "528");
		MAP_COUNTRY_NUMERIC_3.put(NC, "540");
		MAP_COUNTRY_NUMERIC_3.put(NZ, "554");
		MAP_COUNTRY_NUMERIC_3.put(NI, "558");
		MAP_COUNTRY_NUMERIC_3.put(NE, "562");
		MAP_COUNTRY_NUMERIC_3.put(NG, "566");
		MAP_COUNTRY_NUMERIC_3.put(NU, "570");
		MAP_COUNTRY_NUMERIC_3.put(NF, "574");
		MAP_COUNTRY_NUMERIC_3.put(MP, "580");
		MAP_COUNTRY_NUMERIC_3.put(NO, "578");
		MAP_COUNTRY_NUMERIC_3.put(OM, "512");
		MAP_COUNTRY_NUMERIC_3.put(PK, "586");
		MAP_COUNTRY_NUMERIC_3.put(PW, "585");
		MAP_COUNTRY_NUMERIC_3.put(PS, "275");
		MAP_COUNTRY_NUMERIC_3.put(PA, "591");
		MAP_COUNTRY_NUMERIC_3.put(PG, "598");
		MAP_COUNTRY_NUMERIC_3.put(PY, "600");
		MAP_COUNTRY_NUMERIC_3.put(PE, "604");
		MAP_COUNTRY_NUMERIC_3.put(PH, "608");
		MAP_COUNTRY_NUMERIC_3.put(PN, "612");
		MAP_COUNTRY_NUMERIC_3.put(PL, "616");
		MAP_COUNTRY_NUMERIC_3.put(PT, "620");
		MAP_COUNTRY_NUMERIC_3.put(PR, "630");
		MAP_COUNTRY_NUMERIC_3.put(QA, "634");
		MAP_COUNTRY_NUMERIC_3.put(RE, "638");
		MAP_COUNTRY_NUMERIC_3.put(RO, "642");
		MAP_COUNTRY_NUMERIC_3.put(RU, "643");
		MAP_COUNTRY_NUMERIC_3.put(RW, "646");
		MAP_COUNTRY_NUMERIC_3.put(BL, "652");
		MAP_COUNTRY_NUMERIC_3.put(SH, "654");
		MAP_COUNTRY_NUMERIC_3.put(KN, "659");
		MAP_COUNTRY_NUMERIC_3.put(LC, "662");
		MAP_COUNTRY_NUMERIC_3.put(MF, "663");
		MAP_COUNTRY_NUMERIC_3.put(PM, "666");
		MAP_COUNTRY_NUMERIC_3.put(VC, "670");
		MAP_COUNTRY_NUMERIC_3.put(WS, "882");
		MAP_COUNTRY_NUMERIC_3.put(SM, "674");
		MAP_COUNTRY_NUMERIC_3.put(ST, "678");
		MAP_COUNTRY_NUMERIC_3.put(SA, "682");
		MAP_COUNTRY_NUMERIC_3.put(SN, "686");
		MAP_COUNTRY_NUMERIC_3.put(RS, "688");
		MAP_COUNTRY_NUMERIC_3.put(SC, "690");
		MAP_COUNTRY_NUMERIC_3.put(SL, "694");
		MAP_COUNTRY_NUMERIC_3.put(SG, "702");
		MAP_COUNTRY_NUMERIC_3.put(SX, "534");
		MAP_COUNTRY_NUMERIC_3.put(SK, "703");
		MAP_COUNTRY_NUMERIC_3.put(SI, "705");
		MAP_COUNTRY_NUMERIC_3.put(SB, "090");
		MAP_COUNTRY_NUMERIC_3.put(SO, "706");
		MAP_COUNTRY_NUMERIC_3.put(ZA, "710");
		MAP_COUNTRY_NUMERIC_3.put(GS, "239");
		MAP_COUNTRY_NUMERIC_3.put(SS, "728");
		MAP_COUNTRY_NUMERIC_3.put(ES, "724");
		MAP_COUNTRY_NUMERIC_3.put(LK, "144");
		MAP_COUNTRY_NUMERIC_3.put(SD, "729");
		MAP_COUNTRY_NUMERIC_3.put(SR, "740");
		MAP_COUNTRY_NUMERIC_3.put(SJ, "744");
		MAP_COUNTRY_NUMERIC_3.put(SE, "752");
		MAP_COUNTRY_NUMERIC_3.put(CH, "756");
		MAP_COUNTRY_NUMERIC_3.put(SY, "760");
		MAP_COUNTRY_NUMERIC_3.put(TW, "158");
		MAP_COUNTRY_NUMERIC_3.put(TJ, "762");
		MAP_COUNTRY_NUMERIC_3.put(TZ, "834");
		MAP_COUNTRY_NUMERIC_3.put(TH, "764");
		MAP_COUNTRY_NUMERIC_3.put(TL, "626");
		MAP_COUNTRY_NUMERIC_3.put(TG, "768");
		MAP_COUNTRY_NUMERIC_3.put(TK, "772");
		MAP_COUNTRY_NUMERIC_3.put(TO, "776");
		MAP_COUNTRY_NUMERIC_3.put(TT, "780");
		MAP_COUNTRY_NUMERIC_3.put(TN, "788");
		MAP_COUNTRY_NUMERIC_3.put(TR, "792");
		MAP_COUNTRY_NUMERIC_3.put(TM, "795");
		MAP_COUNTRY_NUMERIC_3.put(TC, "796");
		MAP_COUNTRY_NUMERIC_3.put(TV, "798");
		MAP_COUNTRY_NUMERIC_3.put(UG, "800");
		MAP_COUNTRY_NUMERIC_3.put(UA, "804");
		MAP_COUNTRY_NUMERIC_3.put(AE, "784");
		MAP_COUNTRY_NUMERIC_3.put(GB, "826");
		MAP_COUNTRY_NUMERIC_3.put(UM, "581");
		MAP_COUNTRY_NUMERIC_3.put(US, "840");
		MAP_COUNTRY_NUMERIC_3.put(UY, "858");
		MAP_COUNTRY_NUMERIC_3.put(UZ, "860");
		MAP_COUNTRY_NUMERIC_3.put(VU, "548");
		MAP_COUNTRY_NUMERIC_3.put(VE, "862");
		MAP_COUNTRY_NUMERIC_3.put(VN, "704");
		MAP_COUNTRY_NUMERIC_3.put(VG, "092");
		MAP_COUNTRY_NUMERIC_3.put(VI, "850");
		MAP_COUNTRY_NUMERIC_3.put(WF, "876");
		MAP_COUNTRY_NUMERIC_3.put(EH, "732");
		MAP_COUNTRY_NUMERIC_3.put(YE, "887");
		MAP_COUNTRY_NUMERIC_3.put(ZM, "894");
		MAP_COUNTRY_NUMERIC_3.put(ZW, "716");
	}

	private static final Map<CountryEnum, List<String>> MAP_CC_TLD = new HashMap<CountryEnum, List<String>>();
	static {
		MAP_CC_TLD.put(AF, List.of(".af"));
		MAP_CC_TLD.put(AX, List.of(".ax"));
		MAP_CC_TLD.put(AL, List.of(".al"));
		MAP_CC_TLD.put(DZ, List.of(".dz"));
		MAP_CC_TLD.put(AS, List.of(".as"));
		MAP_CC_TLD.put(AD, List.of(".ad"));
		MAP_CC_TLD.put(AO, List.of(".ao"));
		MAP_CC_TLD.put(AI, List.of(".ai"));
		MAP_CC_TLD.put(AQ, List.of(".aq"));
		MAP_CC_TLD.put(AG, List.of(".ag"));
		MAP_CC_TLD.put(AR, List.of(".ar"));
		MAP_CC_TLD.put(AM, List.of(".am"));
		MAP_CC_TLD.put(AW, List.of(".aw"));
		MAP_CC_TLD.put(AU, List.of(".au"));
		MAP_CC_TLD.put(AT, List.of(".at"));
		MAP_CC_TLD.put(AZ, List.of(".az"));
		MAP_CC_TLD.put(BS, List.of(".bs"));
		MAP_CC_TLD.put(BH, List.of(".bh"));
		MAP_CC_TLD.put(BD, List.of(".bd"));
		MAP_CC_TLD.put(BB, List.of(".bb"));
		MAP_CC_TLD.put(BY, List.of(".by"));
		MAP_CC_TLD.put(BE, List.of(".be"));
		MAP_CC_TLD.put(BZ, List.of(".bz"));
		MAP_CC_TLD.put(BJ, List.of(".bj"));
		MAP_CC_TLD.put(BM, List.of(".bm"));
		MAP_CC_TLD.put(BT, List.of(".bt"));
		MAP_CC_TLD.put(BO, List.of(".bo"));
		MAP_CC_TLD.put(BQ, List.of(".bq", ".nl"));
		MAP_CC_TLD.put(BA, List.of(".ba"));
		MAP_CC_TLD.put(BW, List.of(".bw"));
		MAP_CC_TLD.put(BR, List.of(".br"));
		MAP_CC_TLD.put(IO, List.of(".io"));
		MAP_CC_TLD.put(BN, List.of(".bn"));
		MAP_CC_TLD.put(BG, List.of(".bg"));
		MAP_CC_TLD.put(BF, List.of(".bf"));
		MAP_CC_TLD.put(BI, List.of(".bi"));
		MAP_CC_TLD.put(CV, List.of(".cv"));
		MAP_CC_TLD.put(KH, List.of(".kh"));
		MAP_CC_TLD.put(CM, List.of(".cm"));
		MAP_CC_TLD.put(CA, List.of(".ca"));
		MAP_CC_TLD.put(KY, List.of(".ky"));
		MAP_CC_TLD.put(CF, List.of(".cf"));
		MAP_CC_TLD.put(TD, List.of(".td"));
		MAP_CC_TLD.put(CL, List.of(".cl"));
		MAP_CC_TLD.put(CN, List.of(".cn"));
		MAP_CC_TLD.put(CX, List.of(".cx"));
		MAP_CC_TLD.put(CC, List.of(".cc"));
		MAP_CC_TLD.put(CO, List.of(".co"));
		MAP_CC_TLD.put(KM, List.of(".km"));
		MAP_CC_TLD.put(CD, List.of(".cd"));
		MAP_CC_TLD.put(CG, List.of(".cg"));
		MAP_CC_TLD.put(CK, List.of(".ck"));
		MAP_CC_TLD.put(CR, List.of(".cr"));
		MAP_CC_TLD.put(CI, List.of(".ci"));
		MAP_CC_TLD.put(HR, List.of(".hr"));
		MAP_CC_TLD.put(CU, List.of(".cu"));
		MAP_CC_TLD.put(CW, List.of(".cw"));
		MAP_CC_TLD.put(CY, List.of(".cy"));
		MAP_CC_TLD.put(CZ, List.of(".cz"));
		MAP_CC_TLD.put(DK, List.of(".dk"));
		MAP_CC_TLD.put(DJ, List.of(".dj"));
		MAP_CC_TLD.put(DM, List.of(".dm"));
		MAP_CC_TLD.put(DO, List.of(".do"));
		MAP_CC_TLD.put(EC, List.of(".ec"));
		MAP_CC_TLD.put(EG, List.of(".eg"));
		MAP_CC_TLD.put(SV, List.of(".sv"));
		MAP_CC_TLD.put(GQ, List.of(".gq"));
		MAP_CC_TLD.put(ER, List.of(".er"));
		MAP_CC_TLD.put(EE, List.of(".ee"));
		MAP_CC_TLD.put(SZ, List.of(".sz"));
		MAP_CC_TLD.put(ET, List.of(".et"));
		MAP_CC_TLD.put(FK, List.of(".fk"));
		MAP_CC_TLD.put(FO, List.of(".fo"));
		MAP_CC_TLD.put(FJ, List.of(".fj"));
		MAP_CC_TLD.put(FI, List.of(".fi"));
		MAP_CC_TLD.put(FR, List.of(".fr"));
		MAP_CC_TLD.put(GF, List.of(".gf"));
		MAP_CC_TLD.put(PF, List.of(".pf"));
		MAP_CC_TLD.put(TF, List.of(".tf"));
		MAP_CC_TLD.put(GA, List.of(".ga"));
		MAP_CC_TLD.put(GM, List.of(".gm"));
		MAP_CC_TLD.put(GE, List.of(".ge"));
		MAP_CC_TLD.put(DE, List.of(".de"));
		MAP_CC_TLD.put(GH, List.of(".gh"));
		MAP_CC_TLD.put(GI, List.of(".gi"));
		MAP_CC_TLD.put(GR, List.of(".gr"));
		MAP_CC_TLD.put(GL, List.of(".gl"));
		MAP_CC_TLD.put(GD, List.of(".gd"));
		MAP_CC_TLD.put(GP, List.of(".gp"));
		MAP_CC_TLD.put(GU, List.of(".gu"));
		MAP_CC_TLD.put(GT, List.of(".gt"));
		MAP_CC_TLD.put(GG, List.of(".gg"));
		MAP_CC_TLD.put(GN, List.of(".gn"));
		MAP_CC_TLD.put(GW, List.of(".gw"));
		MAP_CC_TLD.put(GY, List.of(".gy"));
		MAP_CC_TLD.put(HT, List.of(".ht"));
		MAP_CC_TLD.put(HM, List.of(".hm"));
		MAP_CC_TLD.put(VA, List.of(".va"));
		MAP_CC_TLD.put(HN, List.of(".hn"));
		MAP_CC_TLD.put(HK, List.of(".hk"));
		MAP_CC_TLD.put(HU, List.of(".hu"));
		MAP_CC_TLD.put(IS, List.of(".is"));
		MAP_CC_TLD.put(IN, List.of(".in"));
		MAP_CC_TLD.put(ID, List.of(".id"));
		MAP_CC_TLD.put(IR, List.of(".ir"));
		MAP_CC_TLD.put(IQ, List.of(".iq"));
		MAP_CC_TLD.put(IE, List.of(".ie"));
		MAP_CC_TLD.put(IM, List.of(".im"));
		MAP_CC_TLD.put(IL, List.of(".il"));
		MAP_CC_TLD.put(IT, List.of(".it"));
		MAP_CC_TLD.put(JM, List.of(".jm"));
		MAP_CC_TLD.put(JP, List.of(".jp"));
		MAP_CC_TLD.put(JE, List.of(".je"));
		MAP_CC_TLD.put(JO, List.of(".jo"));
		MAP_CC_TLD.put(KZ, List.of(".kz"));
		MAP_CC_TLD.put(KE, List.of(".ke"));
		MAP_CC_TLD.put(KI, List.of(".ki"));
		MAP_CC_TLD.put(KP, List.of(".kp"));
		MAP_CC_TLD.put(KR, List.of(".kr"));
		MAP_CC_TLD.put(KW, List.of(".kw"));
		MAP_CC_TLD.put(KG, List.of(".kg"));
		MAP_CC_TLD.put(LA, List.of(".la"));
		MAP_CC_TLD.put(LV, List.of(".lv"));
		MAP_CC_TLD.put(LB, List.of(".lb"));
		MAP_CC_TLD.put(LS, List.of(".ls"));
		MAP_CC_TLD.put(LR, List.of(".lr"));
		MAP_CC_TLD.put(LY, List.of(".ly"));
		MAP_CC_TLD.put(LI, List.of(".li"));
		MAP_CC_TLD.put(LT, List.of(".lt"));
		MAP_CC_TLD.put(LU, List.of(".lu"));
		MAP_CC_TLD.put(MO, List.of(".mo"));
		MAP_CC_TLD.put(MK, List.of(".mk"));
		MAP_CC_TLD.put(MG, List.of(".mg"));
		MAP_CC_TLD.put(MW, List.of(".mw"));
		MAP_CC_TLD.put(MY, List.of(".my"));
		MAP_CC_TLD.put(MV, List.of(".mv"));
		MAP_CC_TLD.put(ML, List.of(".ml"));
		MAP_CC_TLD.put(MT, List.of(".mt"));
		MAP_CC_TLD.put(MH, List.of(".mh"));
		MAP_CC_TLD.put(MQ, List.of(".mq"));
		MAP_CC_TLD.put(MR, List.of(".mr"));
		MAP_CC_TLD.put(MU, List.of(".mu"));
		MAP_CC_TLD.put(YT, List.of(".yt"));
		MAP_CC_TLD.put(MX, List.of(".mx"));
		MAP_CC_TLD.put(FM, List.of(".fm"));
		MAP_CC_TLD.put(MD, List.of(".md"));
		MAP_CC_TLD.put(MC, List.of(".mc"));
		MAP_CC_TLD.put(MN, List.of(".mn"));
		MAP_CC_TLD.put(ME, List.of(".me"));
		MAP_CC_TLD.put(MS, List.of(".ms"));
		MAP_CC_TLD.put(MA, List.of(".ma"));
		MAP_CC_TLD.put(MZ, List.of(".mz"));
		MAP_CC_TLD.put(MM, List.of(".mm"));
		MAP_CC_TLD.put(NA, List.of(".na"));
		MAP_CC_TLD.put(NR, List.of(".nr"));
		MAP_CC_TLD.put(NP, List.of(".np"));
		MAP_CC_TLD.put(NL, List.of(".nl"));
		MAP_CC_TLD.put(NC, List.of(".nc"));
		MAP_CC_TLD.put(NZ, List.of(".nz"));
		MAP_CC_TLD.put(NI, List.of(".ni"));
		MAP_CC_TLD.put(NE, List.of(".ne"));
		MAP_CC_TLD.put(NG, List.of(".ng"));
		MAP_CC_TLD.put(NU, List.of(".nu"));
		MAP_CC_TLD.put(NF, List.of(".nf"));
		MAP_CC_TLD.put(MP, List.of(".mp"));
		MAP_CC_TLD.put(NO, List.of(".no"));
		MAP_CC_TLD.put(OM, List.of(".om"));
		MAP_CC_TLD.put(PK, List.of(".pk"));
		MAP_CC_TLD.put(PW, List.of(".pw"));
		MAP_CC_TLD.put(PS, List.of(".ps"));
		MAP_CC_TLD.put(PA, List.of(".pa"));
		MAP_CC_TLD.put(PG, List.of(".pg"));
		MAP_CC_TLD.put(PY, List.of(".py"));
		MAP_CC_TLD.put(PE, List.of(".pe"));
		MAP_CC_TLD.put(PH, List.of(".ph"));
		MAP_CC_TLD.put(PN, List.of(".pn"));
		MAP_CC_TLD.put(PL, List.of(".pl"));
		MAP_CC_TLD.put(PT, List.of(".pt"));
		MAP_CC_TLD.put(PR, List.of(".pr"));
		MAP_CC_TLD.put(QA, List.of(".qa"));
		MAP_CC_TLD.put(RE, List.of(".re"));
		MAP_CC_TLD.put(RO, List.of(".ro"));
		MAP_CC_TLD.put(RU, List.of(".ru"));
		MAP_CC_TLD.put(RW, List.of(".rw"));
		MAP_CC_TLD.put(BL, List.of(".bl"));
		MAP_CC_TLD.put(SH, List.of(".sh"));
		MAP_CC_TLD.put(KN, List.of(".kn"));
		MAP_CC_TLD.put(LC, List.of(".lc"));
		MAP_CC_TLD.put(MF, List.of(".mf"));
		MAP_CC_TLD.put(PM, List.of(".pm"));
		MAP_CC_TLD.put(VC, List.of(".vc"));
		MAP_CC_TLD.put(WS, List.of(".ws"));
		MAP_CC_TLD.put(SM, List.of(".sm"));
		MAP_CC_TLD.put(ST, List.of(".st"));
		MAP_CC_TLD.put(SA, List.of(".sa"));
		MAP_CC_TLD.put(SN, List.of(".sn"));
		MAP_CC_TLD.put(RS, List.of(".rs"));
		MAP_CC_TLD.put(SC, List.of(".sc"));
		MAP_CC_TLD.put(SL, List.of(".sl"));
		MAP_CC_TLD.put(SG, List.of(".sg"));
		MAP_CC_TLD.put(SX, List.of(".sx"));
		MAP_CC_TLD.put(SK, List.of(".sk"));
		MAP_CC_TLD.put(SI, List.of(".si"));
		MAP_CC_TLD.put(SB, List.of(".sb"));
		MAP_CC_TLD.put(SO, List.of(".so"));
		MAP_CC_TLD.put(ZA, List.of(".za"));
		MAP_CC_TLD.put(GS, List.of(".gs"));
		MAP_CC_TLD.put(SS, List.of(".ss"));
		MAP_CC_TLD.put(ES, List.of(".es"));
		MAP_CC_TLD.put(LK, List.of(".lk"));
		MAP_CC_TLD.put(SD, List.of(".sd"));
		MAP_CC_TLD.put(SR, List.of(".sr"));
		MAP_CC_TLD.put(SE, List.of(".se"));
		MAP_CC_TLD.put(CH, List.of(".ch"));
		MAP_CC_TLD.put(SY, List.of(".sy"));
		MAP_CC_TLD.put(TW, List.of(".tw"));
		MAP_CC_TLD.put(TJ, List.of(".tj"));
		MAP_CC_TLD.put(TZ, List.of(".tz"));
		MAP_CC_TLD.put(TH, List.of(".th"));
		MAP_CC_TLD.put(TL, List.of(".tl"));
		MAP_CC_TLD.put(TG, List.of(".tg"));
		MAP_CC_TLD.put(TK, List.of(".tk"));
		MAP_CC_TLD.put(TO, List.of(".to"));
		MAP_CC_TLD.put(TT, List.of(".tt"));
		MAP_CC_TLD.put(TN, List.of(".tn"));
		MAP_CC_TLD.put(TR, List.of(".tr"));
		MAP_CC_TLD.put(TM, List.of(".tm"));
		MAP_CC_TLD.put(TC, List.of(".tc"));
		MAP_CC_TLD.put(TV, List.of(".tv"));
		MAP_CC_TLD.put(UG, List.of(".ug"));
		MAP_CC_TLD.put(UA, List.of(".ua"));
		MAP_CC_TLD.put(AE, List.of(".ae"));
		MAP_CC_TLD.put(GB, List.of(".gb", ".uk"));
		MAP_CC_TLD.put(US, List.of(".us"));
		MAP_CC_TLD.put(UY, List.of(".uy"));
		MAP_CC_TLD.put(UZ, List.of(".uz"));
		MAP_CC_TLD.put(VU, List.of(".vu"));
		MAP_CC_TLD.put(VE, List.of(".ve"));
		MAP_CC_TLD.put(VN, List.of(".vn"));
		MAP_CC_TLD.put(VG, List.of(".vg"));
		MAP_CC_TLD.put(VI, List.of(".vi"));
		MAP_CC_TLD.put(WF, List.of(".wf"));
		MAP_CC_TLD.put(YE, List.of(".ye"));
		MAP_CC_TLD.put(ZM, List.of(".zm"));
		MAP_CC_TLD.put(ZW, List.of(".zw"));
	}

	// @formatter:off
	private static final List<CountryEnum> LIST_EU;
	static {
		LIST_EU = List.of(
			AT,
			BE,
			BG,
			HR,
			CY,
			CZ,
			DK,
			EE,
			FI,
			FR,
			DE,
			GR,
			HU,
			IE,
			IT,
			LV,
			LT,
			LU,
			MT,
			NL,
			PL,
			PT,
			RO,
			SK,
			SI,
			ES,
			SE
		);
	}
	// @formatter:on

}
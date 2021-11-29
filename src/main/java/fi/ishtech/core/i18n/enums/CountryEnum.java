package fi.ishtech.core.i18n.enums;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

	private final static List<String> NAMES_LIST = Arrays.stream(values())
			.map(Enum::name)
			.collect(Collectors.toUnmodifiableList());

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
	 * @param {{@code name}
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
	 * @param {{@code name}
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
	 * @param {{@code name}
	 *
	 * @return {@link String}
	 */
	public static String alpha3(CountryEnum name) {
		return MAP_COUNTRY_ALPHA_3.get(name);
	}

	/**
	 * Alpha-3 name of the country.
	 *
	 * @return {@link String}
	 */
	public String alpha3() {
		return alpha3(this);
	}

	public static boolean isEu(CountryEnum name) {
		return LIST_EU.contains(name);
	}

	public boolean isEu() {
		return isEu(this);
	}

	// @formatter:off
	private static final Map<CountryEnum, String> MAP_COUNTRY_FULL_NAME =
			Map.ofEntries(
				Map.entry(AF, "Afghanistan"),
				Map.entry(AX, "Åland Islands"),
				Map.entry(AL, "Albania"),
				Map.entry(DZ, "Algeria"),
				Map.entry(AS, "American Samoa"),
				Map.entry(AD, "Andorra"),
				Map.entry(AO, "Angola"),
				Map.entry(AI, "Anguilla"),
				Map.entry(AQ, "Antarctica"),
				Map.entry(AG, "Antigua and Barbuda"),
				Map.entry(AR, "Argentina"),
				Map.entry(AM, "Armenia"),
				Map.entry(AW, "Aruba"),
				Map.entry(AU, "Australia"),
				Map.entry(AT, "Austria"),
				Map.entry(AZ, "Azerbaijan"),
				Map.entry(BS, "Bahamas"),
				Map.entry(BH, "Bahrain"),
				Map.entry(BD, "Bangladesh"),
				Map.entry(BB, "Barbados"),
				Map.entry(BY, "Belarus"),
				Map.entry(BE, "Belgium"),
				Map.entry(BZ, "Belize"),
				Map.entry(BJ, "Benin"),
				Map.entry(BM, "Bermuda"),
				Map.entry(BT, "Bhutan"),
				Map.entry(BO, "Bolivia"),
				Map.entry(BQ, "Bonaire, Sint Eustatius and Saba"),
				Map.entry(BA, "Bosnia and Herzegovina"),
				Map.entry(BW, "Botswana"),
				Map.entry(BV, "Bouvet Island"),
				Map.entry(BR, "Brazil"),
				Map.entry(IO, "British Indian Ocean Territory"),
				Map.entry(BN, "Brunei Darussalam"),
				Map.entry(BG, "Bulgaria"),
				Map.entry(BF, "Burkina Faso"),
				Map.entry(BI, "Burundi"),
				Map.entry(CV, "Cabo Verde"),
				Map.entry(KH, "Cambodia"),
				Map.entry(CM, "Cameroon"),
				Map.entry(CA, "Canada"),
				Map.entry(KY, "Cayman Islands"),
				Map.entry(CF, "Central African Republic"),
				Map.entry(TD, "Chad"),
				Map.entry(CL, "Chile"),
				Map.entry(CN, "China"),
				Map.entry(CX, "Christmas Island"),
				Map.entry(CC, "Cocos (Keeling) Islands"),
				Map.entry(CO, "Colombia"),
				Map.entry(KM, "Comoros"),
				Map.entry(CD, "Congo (The Democratic Republic of the)"),
				Map.entry(CG, "Congo (The Republic of the)"),
				Map.entry(CK, "Cook Islands"),
				Map.entry(CR, "Costa Rica"),
				Map.entry(CI, "Côte d'Ivoire (Ivory Coast)"),
				Map.entry(HR, "Croatia"),
				Map.entry(CU, "Cuba"),
				Map.entry(CW, "Curaçao"),
				Map.entry(CY, "Cyprus"),
				Map.entry(CZ, "Czechia"),
				Map.entry(DK, "Denmark"),
				Map.entry(DJ, "Djibouti"),
				Map.entry(DM, "Dominica"),
				Map.entry(DO, "Dominican Republic"),
				Map.entry(EC, "Ecuador"),
				Map.entry(EG, "Egypt"),
				Map.entry(SV, "El Salvador"),
				Map.entry(GQ, "Equatorial Guinea"),
				Map.entry(ER, "Eritrea"),
				Map.entry(EE, "Estonia"),
				Map.entry(SZ, "Eswatini"),
				Map.entry(ET, "Ethiopia"),
				Map.entry(FK, "Falkland Islands (Malvinas)"),
				Map.entry(FO, "Faroe Islands"),
				Map.entry(FJ, "Fiji"),
				Map.entry(FI, "Finland"),
				Map.entry(FR, "France"),
				Map.entry(GF, "French Guiana"),
				Map.entry(PF, "French Polynesia"),
				Map.entry(TF, "French Southern Territories"),
				Map.entry(GA, "Gabon"),
				Map.entry(GM, "Gambia"),
				Map.entry(GE, "Georgia"),
				Map.entry(DE, "Germany"),
				Map.entry(GH, "Ghana"),
				Map.entry(GI, "Gibraltar"),
				Map.entry(GR, "Greece"),
				Map.entry(GL, "Greenland"),
				Map.entry(GD, "Grenada"),
				Map.entry(GP, "Guadeloupe"),
				Map.entry(GU, "Guam"),
				Map.entry(GT, "Guatemala"),
				Map.entry(GG, "Guernsey"),
				Map.entry(GN, "Guinea"),
				Map.entry(GW, "Guinea-Bissau"),
				Map.entry(GY, "Guyana"),
				Map.entry(HT, "Haiti"),
				Map.entry(HM, "Heard Island and McDonald Islands"),
				Map.entry(VA, "Holy See (Vatican)"),
				Map.entry(HN, "Honduras"),
				Map.entry(HK, "Hong Kong"),
				Map.entry(HU, "Hungary"),
				Map.entry(IS, "Iceland"),
				Map.entry(IN, "India"),
				Map.entry(ID, "Indonesia"),
				Map.entry(IR, "Iran"),
				Map.entry(IQ, "Iraq"),
				Map.entry(IE, "Ireland"),
				Map.entry(IM, "Isle of Man"),
				Map.entry(IL, "Israel"),
				Map.entry(IT, "Italy"),
				Map.entry(JM, "Jamaica"),
				Map.entry(JP, "Japan"),
				Map.entry(JE, "Jersey"),
				Map.entry(JO, "Jordan"),
				Map.entry(KZ, "Kazakhstan"),
				Map.entry(KE, "Kenya"),
				Map.entry(KI, "Kiribati"),
				Map.entry(KP, "North Korea"),
				Map.entry(KR, "South Korea"),
				Map.entry(KW, "Kuwait"),
				Map.entry(KG, "Kyrgyzstan"),
				Map.entry(LA, "Lao"),
				Map.entry(LV, "Latvia"),
				Map.entry(LB, "Lebanon"),
				Map.entry(LS, "Lesotho"),
				Map.entry(LR, "Liberia"),
				Map.entry(LY, "Libya"),
				Map.entry(LI, "Liechtenstein"),
				Map.entry(LT, "Lithuania"),
				Map.entry(LU, "Luxembourg"),
				Map.entry(MO, "Macao"),
				Map.entry(MK, "North Macedonia"),
				Map.entry(MG, "Madagascar"),
				Map.entry(MW, "Malawi"),
				Map.entry(MY, "Malaysia"),
				Map.entry(MV, "Maldives"),
				Map.entry(ML, "Mali"),
				Map.entry(MT, "Malta"),
				Map.entry(MH, "Marshall Islands"),
				Map.entry(MQ, "Martinique"),
				Map.entry(MR, "Mauritania"),
				Map.entry(MU, "Mauritius"),
				Map.entry(YT, "Mayotte"),
				Map.entry(MX, "Mexico"),
				Map.entry(FM, "Micronesia"),
				Map.entry(MD, "Moldova"),
				Map.entry(MC, "Monaco"),
				Map.entry(MN, "Mongolia"),
				Map.entry(ME, "Montenegro"),
				Map.entry(MS, "Montserrat"),
				Map.entry(MA, "Morocco"),
				Map.entry(MZ, "Mozambique"),
				Map.entry(MM, "Myanmar"),
				Map.entry(NA, "Namibia"),
				Map.entry(NR, "Nauru"),
				Map.entry(NP, "Nepal"),
				Map.entry(NL, "Netherlands"),
				Map.entry(NC, "New Caledonia"),
				Map.entry(NZ, "New Zealand"),
				Map.entry(NI, "Nicaragua"),
				Map.entry(NE, "Niger"),
				Map.entry(NG, "Nigeria"),
				Map.entry(NU, "Niue"),
				Map.entry(NF, "Norfolk Island"),
				Map.entry(MP, "Northern Mariana Islands"),
				Map.entry(NO, "Norway"),
				Map.entry(OM, "Oman"),
				Map.entry(PK, "Pakistan"),
				Map.entry(PW, "Palau"),
				Map.entry(PS, "Palestine"),
				Map.entry(PA, "Panama"),
				Map.entry(PG, "Papua New Guinea"),
				Map.entry(PY, "Paraguay"),
				Map.entry(PE, "Peru"),
				Map.entry(PH, "Philippines"),
				Map.entry(PN, "Pitcairn"),
				Map.entry(PL, "Poland"),
				Map.entry(PT, "Portugal"),
				Map.entry(PR, "Puerto Rico"),
				Map.entry(QA, "Qatar"),
				Map.entry(RE, "Réunion"),
				Map.entry(RO, "Romania"),
				Map.entry(RU, "Russia"),
				Map.entry(RW, "Rwanda"),
				Map.entry(BL, "Saint Barthélemy"),
				Map.entry(SH, "Saint Helena, Ascension and Tristan da Cunha"),
				Map.entry(KN, "Saint Kitts and Nevis"),
				Map.entry(LC, "Saint Lucia"),
				Map.entry(MF, "Saint Martin (French part)"),
				Map.entry(PM, "Saint Pierre and Miquelon"),
				Map.entry(VC, "Saint Vincent and the Grenadines"),
				Map.entry(WS, "Samoa"),
				Map.entry(SM, "San Marino"),
				Map.entry(ST, "Sao Tome and Principe"),
				Map.entry(SA, "Saudi Arabia"),
				Map.entry(SN, "Senegal"),
				Map.entry(RS, "Serbia"),
				Map.entry(SC, "Seychelles"),
				Map.entry(SL, "Sierra Leone"),
				Map.entry(SG, "Singapore"),
				Map.entry(SX, "Sint Maarten (Dutch part)"),
				Map.entry(SK, "Slovakia"),
				Map.entry(SI, "Slovenia"),
				Map.entry(SB, "Solomon Islands"),
				Map.entry(SO, "Somalia"),
				Map.entry(ZA, "South Africa"),
				Map.entry(GS, "South Georgia and the South Sandwich Islands"),
				Map.entry(SS, "South Sudan"),
				Map.entry(ES, "Spain"),
				Map.entry(LK, "Sri Lanka"),
				Map.entry(SD, "Sudan"),
				Map.entry(SR, "Suriname"),
				Map.entry(SJ, "Svalbard and Jan Mayen"),
				Map.entry(SE, "Sweden"),
				Map.entry(CH, "Switzerland"),
				Map.entry(SY, "Syria"),
				Map.entry(TW, "Taiwan"),
				Map.entry(TJ, "Tajikistan"),
				Map.entry(TZ, "Tanzania"),
				Map.entry(TH, "Thailand"),
				Map.entry(TL, "Timor-Leste"),
				Map.entry(TG, "Togo"),
				Map.entry(TK, "Tokelau"),
				Map.entry(TO, "Tonga"),
				Map.entry(TT, "Trinidad and Tobago"),
				Map.entry(TN, "Tunisia"),
				Map.entry(TR, "Turkey"),
				Map.entry(TM, "Turkmenistan"),
				Map.entry(TC, "Turks and Caicos Islands"),
				Map.entry(TV, "Tuvalu"),
				Map.entry(UG, "Uganda"),
				Map.entry(UA, "Ukraine"),
				Map.entry(AE, "United Arab Emirates"),
				Map.entry(GB, "United Kingdom of Great Britain and Northern Ireland"),
				Map.entry(UM, "United States Minor Outlying Islands"),
				Map.entry(US, "United States of America"),
				Map.entry(UY, "Uruguay"),
				Map.entry(UZ, "Uzbekistan"),
				Map.entry(VU, "Vanuatu"),
				Map.entry(VE, "Venezuela"),
				Map.entry(VN, "Viet Nam"),
				Map.entry(VG, "Virgin Islands (British)"),
				Map.entry(VI, "Virgin Islands (U.S.)"),
				Map.entry(WF, "Wallis and Futuna"),
				Map.entry(EH, "Western Sahara"),
				Map.entry(YE, "Yemen"),
				Map.entry(ZM, "Zambia"),
				Map.entry(ZW, "Zimbabwe")
			);
	// @formatter:on

	// @formatter:off
	private static final Map<CountryEnum, String> MAP_COUNTRY_OFFICIAL_NAME =
			Map.ofEntries(
				Map.entry(AF, "The Islamic Republic of Afghanistan"),
				Map.entry(AX, "Åland"),
				Map.entry(AL, "The Republic of Albania"),
				Map.entry(DZ, "The People's Democratic Republic of Algeria"),
				Map.entry(AS, "The Territory of American Samoa"),
				Map.entry(AD, "The Principality of Andorra"),
				Map.entry(AO, "The Republic of Angola"),
				Map.entry(AI, "Anguilla"),
				Map.entry(AQ, "All land and ice shelves south of the 60th parallel south"),
				Map.entry(AG, "Antigua and Barbuda"),
				Map.entry(AR, "The Argentine Republic"),
				Map.entry(AM, "The Republic of Armenia"),
				Map.entry(AW, "Aruba"),
				Map.entry(AU, "The Commonwealth of Australia"),
				Map.entry(AT, "The Republic of Austria"),
				Map.entry(AZ, "The Republic of Azerbaijan"),
				Map.entry(BS, "The Commonwealth of The Bahamas"),
				Map.entry(BH, "The Kingdom of Bahrain"),
				Map.entry(BD, "The People's Republic of Bangladesh"),
				Map.entry(BB, "Barbados"),
				Map.entry(BY, "The Republic of Belarus"),
				Map.entry(BE, "The Kingdom of Belgium"),
				Map.entry(BZ, "Belize"),
				Map.entry(BJ, "The Republic of Benin"),
				Map.entry(BM, "Bermuda"),
				Map.entry(BT, "The Kingdom of Bhutan"),
				Map.entry(BO, "The Plurinational State of Bolivia"),
				Map.entry(BQ, "Bonaire, Sint Eustatius and Saba"),
				Map.entry(BA, "Bosnia and Herzegovina"),
				Map.entry(BW, "The Republic of Botswana"),
				Map.entry(BV, "Bouvet Island"),
				Map.entry(BR, "The Federative Republic of Brazil"),
				Map.entry(IO, "The British Indian Ocean Territory"),
				Map.entry(BN, "The Nation of Brunei, the Abode of Peace"),
				Map.entry(BG, "The Republic of Bulgaria"),
				Map.entry(BF, "Burkina Faso"),
				Map.entry(BI, "The Republic of Burundi"),
				Map.entry(CV, "The Republic of Cabo Verde"),
				Map.entry(KH, "The Kingdom of Cambodia"),
				Map.entry(CM, "The Republic of Cameroon"),
				Map.entry(CA, "Canada"),
				Map.entry(KY, "The Cayman Islands"),
				Map.entry(CF, "The Central African Republic"),
				Map.entry(TD, "The Republic of Chad"),
				Map.entry(CL, "The Republic of Chile"),
				Map.entry(CN, "The People's Republic of China"),
				Map.entry(CX, "The Territory of Christmas Island"),
				Map.entry(CC, "The Territory of Cocos (Keeling) Islands"),
				Map.entry(CO, "The Republic of Colombia"),
				Map.entry(KM, "The Union of the Comoros"),
				Map.entry(CD, "The Democratic Republic of the Congo"),
				Map.entry(CG, "The Republic of the Congo"),
				Map.entry(CK, "The Cook Islands"),
				Map.entry(CR, "The Republic of Costa Rica"),
				Map.entry(CI, "The Republic of Côte d'Ivoire"),
				Map.entry(HR, "The Republic of Croatia"),
				Map.entry(CU, "The Republic of Cuba"),
				Map.entry(CW, "The Country of Curaçao"),
				Map.entry(CY, "The Republic of Cyprus"),
				Map.entry(CZ, "The Czech Republic"),
				Map.entry(DK, "The Kingdom of Denmark"),
				Map.entry(DJ, "The Republic of Djibouti"),
				Map.entry(DM, "The Commonwealth of Dominica"),
				Map.entry(DO, "The Dominican Republic"),
				Map.entry(EC, "The Republic of Ecuador"),
				Map.entry(EG, "The Arab Republic of Egypt"),
				Map.entry(SV, "The Republic of El Salvador"),
				Map.entry(GQ, "The Republic of Equatorial Guinea"),
				Map.entry(ER, "The State of Eritrea"),
				Map.entry(EE, "The Republic of Estonia"),
				Map.entry(SZ, "The Kingdom of Eswatini"),
				Map.entry(ET, "The Federal Democratic Republic of Ethiopia"),
				Map.entry(FK, "The Falkland Islands"),
				Map.entry(FO, "The Faroe Islands"),
				Map.entry(FJ, "The Republic of Fiji"),
				Map.entry(FI, "The Republic of Finland"),
				Map.entry(FR, "The French Republic"),
				Map.entry(GF, "Guyane"),
				Map.entry(PF, "French Polynesia"),
				Map.entry(TF, "The French Southern and Antarctic Lands"),
				Map.entry(GA, "The Gabonese Republic"),
				Map.entry(GM, "The Republic of The Gambia"),
				Map.entry(GE, "Georgia"),
				Map.entry(DE, "The Federal Republic of Germany"),
				Map.entry(GH, "The Republic of Ghana"),
				Map.entry(GI, "Gibraltar"),
				Map.entry(GR, "The Hellenic Republic"),
				Map.entry(GL, "Kalaallit Nunaat"),
				Map.entry(GD, "Grenada"),
				Map.entry(GP, "Guadeloupe"),
				Map.entry(GU, "The Territory of Guam"),
				Map.entry(GT, "The Republic of Guatemala"),
				Map.entry(GG, "The Bailiwick of Guernsey"),
				Map.entry(GN, "The Republic of Guinea"),
				Map.entry(GW, "The Republic of Guinea-Bissau"),
				Map.entry(GY, "The Co-operative Republic of Guyana"),
				Map.entry(HT, "The Republic of Haiti"),
				Map.entry(HM, "The Territory of Heard Island and McDonald Islands"),
				Map.entry(VA, "The Holy See"),
				Map.entry(HN, "The Republic of Honduras"),
				Map.entry(HK, "The Hong Kong Special Administrative Region of China[10]"),
				Map.entry(HU, "Hungary"),
				Map.entry(IS, "Iceland"),
				Map.entry(IN, "The Republic of India"),
				Map.entry(ID, "The Republic of Indonesia"),
				Map.entry(IR, "The Islamic Republic of Iran"),
				Map.entry(IQ, "The Republic of Iraq"),
				Map.entry(IE, "Ireland"),
				Map.entry(IM, "The Isle of Man"),
				Map.entry(IL, "The State of Israel"),
				Map.entry(IT, "The Italian Republic"),
				Map.entry(JM, "Jamaica"),
				Map.entry(JP, "Japan"),
				Map.entry(JE, "The Bailiwick of Jersey"),
				Map.entry(JO, "The Hashemite Kingdom of Jordan"),
				Map.entry(KZ, "The Republic of Kazakhstan"),
				Map.entry(KE, "The Republic of Kenya"),
				Map.entry(KI, "The Republic of Kiribati"),
				Map.entry(KP, "The Democratic People's Republic of Korea"),
				Map.entry(KR, "The Republic of Korea"),
				Map.entry(KW, "The State of Kuwait"),
				Map.entry(KG, "The Kyrgyz Republic"),
				Map.entry(LA, "The Lao People's Democratic Republic"),
				Map.entry(LV, "The Republic of Latvia"),
				Map.entry(LB, "The Lebanese Republic"),
				Map.entry(LS, "The Kingdom of Lesotho"),
				Map.entry(LR, "The Republic of Liberia"),
				Map.entry(LY, "The State of Libya"),
				Map.entry(LI, "The Principality of Liechtenstein"),
				Map.entry(LT, "The Republic of Lithuania"),
				Map.entry(LU, "The Grand Duchy of Luxembourg"),
				Map.entry(MO, "The Macao Special Administrative Region of China[11]"),
				Map.entry(MK, "The Republic of North Macedonia[12]"),
				Map.entry(MG, "The Republic of Madagascar"),
				Map.entry(MW, "The Republic of Malawi"),
				Map.entry(MY, "Malaysia"),
				Map.entry(MV, "The Republic of Maldives"),
				Map.entry(ML, "The Republic of Mali"),
				Map.entry(MT, "The Republic of Malta"),
				Map.entry(MH, "The Republic of the Marshall Islands"),
				Map.entry(MQ, "Martinique"),
				Map.entry(MR, "The Islamic Republic of Mauritania"),
				Map.entry(MU, "The Republic of Mauritius"),
				Map.entry(YT, "The Department of Mayotte"),
				Map.entry(MX, "The United Mexican States"),
				Map.entry(FM, "The Federated States of Micronesia"),
				Map.entry(MD, "The Republic of Moldova"),
				Map.entry(MC, "The Principality of Monaco"),
				Map.entry(MN, "Mongolia"),
				Map.entry(ME, "Montenegro"),
				Map.entry(MS, "Montserrat"),
				Map.entry(MA, "The Kingdom of Morocco"),
				Map.entry(MZ, "The Republic of Mozambique"),
				Map.entry(MM, "The Republic of the Union of Myanmar"),
				Map.entry(NA, "The Republic of Namibia"),
				Map.entry(NR, "The Republic of Nauru"),
				Map.entry(NP, "The Federal Democratic Republic of Nepal"),
				Map.entry(NL, "The Kingdom of the Netherlands"),
				Map.entry(NC, "New Caledonia"),
				Map.entry(NZ, "New Zealand"),
				Map.entry(NI, "The Republic of Nicaragua"),
				Map.entry(NE, "The Republic of the Niger"),
				Map.entry(NG, "The Federal Republic of Nigeria"),
				Map.entry(NU, "Niue"),
				Map.entry(NF, "The Territory of Norfolk Island"),
				Map.entry(MP, "The Commonwealth of the Northern Mariana Islands"),
				Map.entry(NO, "The Kingdom of Norway"),
				Map.entry(OM, "The Sultanate of Oman"),
				Map.entry(PK, "The Islamic Republic of Pakistan"),
				Map.entry(PW, "The Republic of Palau"),
				Map.entry(PS, "The State of Palestine"),
				Map.entry(PA, "The Republic of Panamá"),
				Map.entry(PG, "The Independent State of Papua New Guinea"),
				Map.entry(PY, "The Republic of Paraguay"),
				Map.entry(PE, "The Republic of Perú"),
				Map.entry(PH, "The Republic of the Philippines"),
				Map.entry(PN, "The Pitcairn, Henderson, Ducie and Oeno Islands"),
				Map.entry(PL, "The Republic of Poland"),
				Map.entry(PT, "The Portuguese Republic"),
				Map.entry(PR, "The Commonwealth of Puerto Rico"),
				Map.entry(QA, "The State of Qatar"),
				Map.entry(RE, "Réunion"),
				Map.entry(RO, "Romania"),
				Map.entry(RU, "The Russian Federation"),
				Map.entry(RW, "The Republic of Rwanda"),
				Map.entry(BL, "The Collectivity of Saint-Barthélemy"),
				Map.entry(SH, "Saint Helena, Ascension and Tristan da Cunha"),
				Map.entry(KN, "Saint Kitts and Nevis"),
				Map.entry(LC, "Saint Lucia"),
				Map.entry(MF, "The Collectivity of Saint-Martin"),
				Map.entry(PM, "The Overseas Collectivity of Saint-Pierre and Miquelon"),
				Map.entry(VC, "Saint Vincent and the Grenadines"),
				Map.entry(WS, "The Independent State of Samoa"),
				Map.entry(SM, "The Republic of San Marino"),
				Map.entry(ST, "The Democratic Republic of São Tomé and Príncipe"),
				Map.entry(SA, "The Kingdom of Saudi Arabia"),
				Map.entry(SN, "The Republic of Senegal"),
				Map.entry(RS, "The Republic of Serbia"),
				Map.entry(SC, "The Republic of Seychelles"),
				Map.entry(SL, "The Republic of Sierra Leone"),
				Map.entry(SG, "The Republic of Singapore"),
				Map.entry(SX, "Sint Maarten"),
				Map.entry(SK, "The Slovak Republic"),
				Map.entry(SI, "The Republic of Slovenia"),
				Map.entry(SB, "The Solomon Islands"),
				Map.entry(SO, "The Federal Republic of Somalia"),
				Map.entry(ZA, "The Republic of South Africa"),
				Map.entry(GS, "South Georgia and the South Sandwich Islands"),
				Map.entry(SS, "The Republic of South Sudan"),
				Map.entry(ES, "The Kingdom of Spain"),
				Map.entry(LK, "The Democratic Socialist Republic of Sri Lanka"),
				Map.entry(SD, "The Republic of the Sudan"),
				Map.entry(SR, "The Republic of Suriname"),
				Map.entry(SJ, "Svalbard and Jan Mayen"),
				Map.entry(SE, "The Kingdom of Sweden"),
				Map.entry(CH, "The Swiss Confederation"),
				Map.entry(SY, "The Syrian Arab Republic"),
				Map.entry(TW, "The Republic of China"),
				Map.entry(TJ, "The Republic of Tajikistan"),
				Map.entry(TZ, "The United Republic of Tanzania"),
				Map.entry(TH, "The Kingdom of Thailand"),
				Map.entry(TL, "The Democratic Republic of Timor-Leste"),
				Map.entry(TG, "The Togolese Republic"),
				Map.entry(TK, "Tokelau"),
				Map.entry(TO, "The Kingdom of Tonga"),
				Map.entry(TT, "The Republic of Trinidad and Tobago"),
				Map.entry(TN, "The Republic of Tunisia"),
				Map.entry(TR, "The Republic of Turkey"),
				Map.entry(TM, "Turkmenistan"),
				Map.entry(TC, "The Turks and Caicos Islands"),
				Map.entry(TV, "Tuvalu"),
				Map.entry(UG, "The Republic of Uganda"),
				Map.entry(UA, "Ukraine"),
				Map.entry(AE, "The United Arab Emirates"),
				Map.entry(GB, "The United Kingdom of Great Britain and Northern Ireland"),
				Map.entry(UM, "Baker Island, Howland Island, Jarvis Island, Johnston Atoll, Kingman Reef, Midway Atoll, Navassa Island, Palmyra Atoll, and Wake Island"),
				Map.entry(US, "The United States of America"),
				Map.entry(UY, "The Oriental Republic of Uruguay"),
				Map.entry(UZ, "The Republic of Uzbekistan"),
				Map.entry(VU, "The Republic of Vanuatu"),
				Map.entry(VE, "The Bolivarian Republic of Venezuela"),
				Map.entry(VN, "The Socialist Republic of Viet Nam"),
				Map.entry(VG, "The Virgin Islands"),
				Map.entry(VI, "The Virgin Islands of the United States"),
				Map.entry(WF, "The Territory of the Wallis and Futuna Islands"),
				Map.entry(EH, "The Sahrawi Arab Democratic Republic"),
				Map.entry(YE, "The Republic of Yemen"),
				Map.entry(ZM, "The Republic of Zambia"),
				Map.entry(ZW, "The Republic of Zimbabwe")
			);
	// @formatter:on

	// @formatter:off
	private static final Map<CountryEnum, String> MAP_COUNTRY_ALPHA_3 =
			Map.ofEntries(
				Map.entry(AF, "AFG"),
				Map.entry(AX, "ALA"),
				Map.entry(AL, "ALB"),
				Map.entry(DZ, "DZA"),
				Map.entry(AS, "ASM"),
				Map.entry(AD, "AND"),
				Map.entry(AO, "AGO"),
				Map.entry(AI, "AIA"),
				Map.entry(AQ, "ATA"),
				Map.entry(AG, "ATG"),
				Map.entry(AR, "ARG"),
				Map.entry(AM, "ARM"),
				Map.entry(AW, "ABW"),
				Map.entry(AU, "AUS"),
				Map.entry(AT, "AUT"),
				Map.entry(AZ, "AZE"),
				Map.entry(BS, "BHS"),
				Map.entry(BH, "BHR"),
				Map.entry(BD, "BGD"),
				Map.entry(BB, "BRB"),
				Map.entry(BY, "BLR"),
				Map.entry(BE, "BEL"),
				Map.entry(BZ, "BLZ"),
				Map.entry(BJ, "BEN"),
				Map.entry(BM, "BMU"),
				Map.entry(BT, "BTN"),
				Map.entry(BO, "BOL"),
				Map.entry(BQ, "BES"),
				Map.entry(BA, "BIH"),
				Map.entry(BW, "BWA"),
				Map.entry(BV, "BVT"),
				Map.entry(BR, "BRA"),
				Map.entry(IO, "IOT"),
				Map.entry(BN, "BRN"),
				Map.entry(BG, "BGR"),
				Map.entry(BF, "BFA"),
				Map.entry(BI, "BDI"),
				Map.entry(CV, "CPV"),
				Map.entry(KH, "KHM"),
				Map.entry(CM, "CMR"),
				Map.entry(CA, "CAN"),
				Map.entry(KY, "CYM"),
				Map.entry(CF, "CAF"),
				Map.entry(TD, "TCD"),
				Map.entry(CL, "CHL"),
				Map.entry(CN, "CHN"),
				Map.entry(CX, "CXR"),
				Map.entry(CC, "CCK"),
				Map.entry(CO, "COL"),
				Map.entry(KM, "COM"),
				Map.entry(CD, "COD"),
				Map.entry(CG, "COG"),
				Map.entry(CK, "COK"),
				Map.entry(CR, "CRI"),
				Map.entry(CI, "CIV"),
				Map.entry(HR, "HRV"),
				Map.entry(CU, "CUB"),
				Map.entry(CW, "CUW"),
				Map.entry(CY, "CYP"),
				Map.entry(CZ, "CZE"),
				Map.entry(DK, "DNK"),
				Map.entry(DJ, "DJI"),
				Map.entry(DM, "DMA"),
				Map.entry(DO, "DOM"),
				Map.entry(EC, "ECU"),
				Map.entry(EG, "EGY"),
				Map.entry(SV, "SLV"),
				Map.entry(GQ, "GNQ"),
				Map.entry(ER, "ERI"),
				Map.entry(EE, "EST"),
				Map.entry(SZ, "SWZ"),
				Map.entry(ET, "ETH"),
				Map.entry(FK, "FLK"),
				Map.entry(FO, "FRO"),
				Map.entry(FJ, "FJI"),
				Map.entry(FI, "FIN"),
				Map.entry(FR, "FRA"),
				Map.entry(GF, "GUF"),
				Map.entry(PF, "PYF"),
				Map.entry(TF, "ATF"),
				Map.entry(GA, "GAB"),
				Map.entry(GM, "GMB"),
				Map.entry(GE, "GEO"),
				Map.entry(DE, "DEU"),
				Map.entry(GH, "GHA"),
				Map.entry(GI, "GIB"),
				Map.entry(GR, "GRC"),
				Map.entry(GL, "GRL"),
				Map.entry(GD, "GRD"),
				Map.entry(GP, "GLP"),
				Map.entry(GU, "GUM"),
				Map.entry(GT, "GTM"),
				Map.entry(GG, "GGY"),
				Map.entry(GN, "GIN"),
				Map.entry(GW, "GNB"),
				Map.entry(GY, "GUY"),
				Map.entry(HT, "HTI"),
				Map.entry(HM, "HMD"),
				Map.entry(VA, "VAT"),
				Map.entry(HN, "HND"),
				Map.entry(HK, "HKG"),
				Map.entry(HU, "HUN"),
				Map.entry(IS, "ISL"),
				Map.entry(IN, "IND"),
				Map.entry(ID, "IDN"),
				Map.entry(IR, "IRN"),
				Map.entry(IQ, "IRQ"),
				Map.entry(IE, "IRL"),
				Map.entry(IM, "IMN"),
				Map.entry(IL, "ISR"),
				Map.entry(IT, "ITA"),
				Map.entry(JM, "JAM"),
				Map.entry(JP, "JPN"),
				Map.entry(JE, "JEY"),
				Map.entry(JO, "JOR"),
				Map.entry(KZ, "KAZ"),
				Map.entry(KE, "KEN"),
				Map.entry(KI, "KIR"),
				Map.entry(KP, "PRK"),
				Map.entry(KR, "KOR"),
				Map.entry(KW, "KWT"),
				Map.entry(KG, "KGZ"),
				Map.entry(LA, "LAO"),
				Map.entry(LV, "LVA"),
				Map.entry(LB, "LBN"),
				Map.entry(LS, "LSO"),
				Map.entry(LR, "LBR"),
				Map.entry(LY, "LBY"),
				Map.entry(LI, "LIE"),
				Map.entry(LT, "LTU"),
				Map.entry(LU, "LUX"),
				Map.entry(MO, "MAC"),
				Map.entry(MK, "MKD"),
				Map.entry(MG, "MDG"),
				Map.entry(MW, "MWI"),
				Map.entry(MY, "MYS"),
				Map.entry(MV, "MDV"),
				Map.entry(ML, "MLI"),
				Map.entry(MT, "MLT"),
				Map.entry(MH, "MHL"),
				Map.entry(MQ, "MTQ"),
				Map.entry(MR, "MRT"),
				Map.entry(MU, "MUS"),
				Map.entry(YT, "MYT"),
				Map.entry(MX, "MEX"),
				Map.entry(FM, "FSM"),
				Map.entry(MD, "MDA"),
				Map.entry(MC, "MCO"),
				Map.entry(MN, "MNG"),
				Map.entry(ME, "MNE"),
				Map.entry(MS, "MSR"),
				Map.entry(MA, "MAR"),
				Map.entry(MZ, "MOZ"),
				Map.entry(MM, "MMR"),
				Map.entry(NA, "NAM"),
				Map.entry(NR, "NRU"),
				Map.entry(NP, "NPL"),
				Map.entry(NL, "NLD"),
				Map.entry(NC, "NCL"),
				Map.entry(NZ, "NZL"),
				Map.entry(NI, "NIC"),
				Map.entry(NE, "NER"),
				Map.entry(NG, "NGA"),
				Map.entry(NU, "NIU"),
				Map.entry(NF, "NFK"),
				Map.entry(MP, "MNP"),
				Map.entry(NO, "NOR"),
				Map.entry(OM, "OMN"),
				Map.entry(PK, "PAK"),
				Map.entry(PW, "PLW"),
				Map.entry(PS, "PSE"),
				Map.entry(PA, "PAN"),
				Map.entry(PG, "PNG"),
				Map.entry(PY, "PRY"),
				Map.entry(PE, "PER"),
				Map.entry(PH, "PHL"),
				Map.entry(PN, "PCN"),
				Map.entry(PL, "POL"),
				Map.entry(PT, "PRT"),
				Map.entry(PR, "PRI"),
				Map.entry(QA, "QAT"),
				Map.entry(RE, "REU"),
				Map.entry(RO, "ROU"),
				Map.entry(RU, "RUS"),
				Map.entry(RW, "RWA"),
				Map.entry(BL, "BLM"),
				Map.entry(SH, "SHN"),
				Map.entry(KN, "KNA"),
				Map.entry(LC, "LCA"),
				Map.entry(MF, "MAF"),
				Map.entry(PM, "SPM"),
				Map.entry(VC, "VCT"),
				Map.entry(WS, "WSM"),
				Map.entry(SM, "SMR"),
				Map.entry(ST, "STP"),
				Map.entry(SA, "SAU"),
				Map.entry(SN, "SEN"),
				Map.entry(RS, "SRB"),
				Map.entry(SC, "SYC"),
				Map.entry(SL, "SLE"),
				Map.entry(SG, "SGP"),
				Map.entry(SX, "SXM"),
				Map.entry(SK, "SVK"),
				Map.entry(SI, "SVN"),
				Map.entry(SB, "SLB"),
				Map.entry(SO, "SOM"),
				Map.entry(ZA, "ZAF"),
				Map.entry(GS, "SGS"),
				Map.entry(SS, "SSD"),
				Map.entry(ES, "ESP"),
				Map.entry(LK, "LKA"),
				Map.entry(SD, "SDN"),
				Map.entry(SR, "SUR"),
				Map.entry(SJ, "SJM"),
				Map.entry(SE, "SWE"),
				Map.entry(CH, "CHE"),
				Map.entry(SY, "SYR"),
				Map.entry(TW, "TWN"),
				Map.entry(TJ, "TJK"),
				Map.entry(TZ, "TZA"),
				Map.entry(TH, "THA"),
				Map.entry(TL, "TLS"),
				Map.entry(TG, "TGO"),
				Map.entry(TK, "TKL"),
				Map.entry(TO, "TON"),
				Map.entry(TT, "TTO"),
				Map.entry(TN, "TUN"),
				Map.entry(TR, "TUR"),
				Map.entry(TM, "TKM"),
				Map.entry(TC, "TCA"),
				Map.entry(TV, "TUV"),
				Map.entry(UG, "UGA"),
				Map.entry(UA, "UKR"),
				Map.entry(AE, "ARE"),
				Map.entry(GB, "GBR"),
				Map.entry(UM, "UMI"),
				Map.entry(US, "USA"),
				Map.entry(UY, "URY"),
				Map.entry(UZ, "UZB"),
				Map.entry(VU, "VUT"),
				Map.entry(VE, "VEN"),
				Map.entry(VN, "VNM"),
				Map.entry(VG, "VGB"),
				Map.entry(VI, "VIR"),
				Map.entry(WF, "WLF"),
				Map.entry(EH, "ESH"),
				Map.entry(YE, "YEM"),
				Map.entry(ZM, "ZMB"),
				Map.entry(ZW, "ZWE")
			);
	// @formatter:on

	// @formatter:off
	private static final List<CountryEnum> LIST_EU = List.of(
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
	// @formatter:on

}
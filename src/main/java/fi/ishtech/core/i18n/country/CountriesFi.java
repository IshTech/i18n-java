package fi.ishtech.core.i18n.country;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import fi.ishtech.core.i18n.enums.CountryEnum;

/**
 *
 * @author Muneer Ahmed Syed
 */
public abstract class CountriesFi {

	public static final Map<CountryEnum, String> fullNames() {
		return MAP_COUNTRY_FULL_NAMES_FI;
	}

	private static final Map<CountryEnum, String> MAP_COUNTRY_FULL_NAMES_FI;
	static {
		Map<CountryEnum, String> tmpMapCountryFullName = new HashMap<CountryEnum, String>(249);

		tmpMapCountryFullName.put(CountryEnum.AF, "Afganistan");
		tmpMapCountryFullName.put(CountryEnum.AX, "Ahvenanmaa");
		tmpMapCountryFullName.put(CountryEnum.AL, "Albania");
		tmpMapCountryFullName.put(CountryEnum.DZ, "Algeria");
		tmpMapCountryFullName.put(CountryEnum.AS, "Amerikan Samoa");
		tmpMapCountryFullName.put(CountryEnum.AD, "Andorra");
		tmpMapCountryFullName.put(CountryEnum.AO, "Angola");
		tmpMapCountryFullName.put(CountryEnum.AI, "Anguilla");
		tmpMapCountryFullName.put(CountryEnum.AQ, "Antarktis");
		tmpMapCountryFullName.put(CountryEnum.AG, "Antigua ja Barbuda");
		tmpMapCountryFullName.put(CountryEnum.AR, "Argentina");
		tmpMapCountryFullName.put(CountryEnum.AM, "Armenia");
		tmpMapCountryFullName.put(CountryEnum.AW, "Aruba");
		tmpMapCountryFullName.put(CountryEnum.AU, "Australia");
		tmpMapCountryFullName.put(CountryEnum.AT, "Antarktis");
		tmpMapCountryFullName.put(CountryEnum.AZ, "Azerbaidžan");
		tmpMapCountryFullName.put(CountryEnum.BS, "Bahamas");
		tmpMapCountryFullName.put(CountryEnum.BH, "Bahrain");
		tmpMapCountryFullName.put(CountryEnum.BD, "Bangladesh");
		tmpMapCountryFullName.put(CountryEnum.BB, "Barbados");
		tmpMapCountryFullName.put(CountryEnum.BY, "Valko-Venäjä");
		tmpMapCountryFullName.put(CountryEnum.BE, "Belgia");
		tmpMapCountryFullName.put(CountryEnum.BZ, "Belize");
		tmpMapCountryFullName.put(CountryEnum.BJ, "Benin");
		tmpMapCountryFullName.put(CountryEnum.BM, "Bermuda");
		tmpMapCountryFullName.put(CountryEnum.BT, "Bhutan");
		tmpMapCountryFullName.put(CountryEnum.BO, "Bolivia");
		tmpMapCountryFullName.put(CountryEnum.BQ, "Bonaire, Sint Eustatius ja Saba");
		tmpMapCountryFullName.put(CountryEnum.BA, "Bosnia ja Hertsegovina");
		tmpMapCountryFullName.put(CountryEnum.BW, "Botswana");
		tmpMapCountryFullName.put(CountryEnum.BV, "Bouvetin saari");
		tmpMapCountryFullName.put(CountryEnum.BR, "Brasilia");
		tmpMapCountryFullName.put(CountryEnum.IO, "Brittiläinen Intian valtameren alue");
		tmpMapCountryFullName.put(CountryEnum.BN, "Brunei Darussalam");
		tmpMapCountryFullName.put(CountryEnum.BG, "Bulgaria");
		tmpMapCountryFullName.put(CountryEnum.BF, "Burkina Faso");
		tmpMapCountryFullName.put(CountryEnum.BI, "Burundi");
		tmpMapCountryFullName.put(CountryEnum.CV, "Kap Verde");
		tmpMapCountryFullName.put(CountryEnum.KH, "Kambodža");
		tmpMapCountryFullName.put(CountryEnum.CM, "Kamerun");
		tmpMapCountryFullName.put(CountryEnum.CA, "Kanada");
		tmpMapCountryFullName.put(CountryEnum.KY, "Caymansaaret");
		tmpMapCountryFullName.put(CountryEnum.CF, "Keski-Afrikan tasavalta");
		tmpMapCountryFullName.put(CountryEnum.TD, "Tšad");
		tmpMapCountryFullName.put(CountryEnum.CL, "Chile");
		tmpMapCountryFullName.put(CountryEnum.CN, "Kiina");
		tmpMapCountryFullName.put(CountryEnum.CX, "Joulusaari");
		tmpMapCountryFullName.put(CountryEnum.CC, "Kookossaaret (Keeling)");
		tmpMapCountryFullName.put(CountryEnum.CO, "Kolumbia");
		tmpMapCountryFullName.put(CountryEnum.KM, "Komorit");
		tmpMapCountryFullName.put(CountryEnum.CD, "Kongon demokraattinen tasavalta");
		tmpMapCountryFullName.put(CountryEnum.CG, "Kongon tasavalta");
		tmpMapCountryFullName.put(CountryEnum.CK, "Cook Islands");
		tmpMapCountryFullName.put(CountryEnum.CR, "Costa Rica");
		tmpMapCountryFullName.put(CountryEnum.CI, "Norsunluurannikko");
		tmpMapCountryFullName.put(CountryEnum.HR, "Kroatia");
		tmpMapCountryFullName.put(CountryEnum.CU, "Kuuba");
		tmpMapCountryFullName.put(CountryEnum.CW, "Curaçao");
		tmpMapCountryFullName.put(CountryEnum.CY, "Kypros");
		tmpMapCountryFullName.put(CountryEnum.CZ, "Tšekki");
		tmpMapCountryFullName.put(CountryEnum.DK, "Tanska");
		tmpMapCountryFullName.put(CountryEnum.DJ, "Djibouti");
		tmpMapCountryFullName.put(CountryEnum.DM, "Dominica");
		tmpMapCountryFullName.put(CountryEnum.DO, "Dominikaaninen tasavalta");
		tmpMapCountryFullName.put(CountryEnum.EC, "Ecuador");
		tmpMapCountryFullName.put(CountryEnum.EG, "Egypti");
		tmpMapCountryFullName.put(CountryEnum.SV, "El Salvador");
		tmpMapCountryFullName.put(CountryEnum.GQ, "Päiväntasaajan Guinea");
		tmpMapCountryFullName.put(CountryEnum.ER, "Eritrea");
		tmpMapCountryFullName.put(CountryEnum.EE, "Viro");
		tmpMapCountryFullName.put(CountryEnum.SZ, "Swazimaa");
		tmpMapCountryFullName.put(CountryEnum.ET, "Ethiopia");
		tmpMapCountryFullName.put(CountryEnum.FK, "Falklandinsaaret (Malvinas)");
		tmpMapCountryFullName.put(CountryEnum.FO, "Färsaaret");
		tmpMapCountryFullName.put(CountryEnum.FJ, "Fidži");
		tmpMapCountryFullName.put(CountryEnum.FI, "Suomi");
		tmpMapCountryFullName.put(CountryEnum.FR, "Ranska");
		tmpMapCountryFullName.put(CountryEnum.GF, "Ranskan Guayana");
		tmpMapCountryFullName.put(CountryEnum.PF, "Ranskan Polynesia");
		tmpMapCountryFullName.put(CountryEnum.TF, "Ranskan eteläiset alueet");
		tmpMapCountryFullName.put(CountryEnum.GA, "Gabon");
		tmpMapCountryFullName.put(CountryEnum.GM, "Gambia");
		tmpMapCountryFullName.put(CountryEnum.GE, "Georgia");
		tmpMapCountryFullName.put(CountryEnum.DE, "Saksa");
		tmpMapCountryFullName.put(CountryEnum.GH, "Ghana");
		tmpMapCountryFullName.put(CountryEnum.GI, "Gibraltar");
		tmpMapCountryFullName.put(CountryEnum.GR, "Kreikka");
		tmpMapCountryFullName.put(CountryEnum.GL, "Grönlanti");
		tmpMapCountryFullName.put(CountryEnum.GD, "Grenada");
		tmpMapCountryFullName.put(CountryEnum.GP, "Guadeloupe");
		tmpMapCountryFullName.put(CountryEnum.GU, "Guam");
		tmpMapCountryFullName.put(CountryEnum.GT, "Guatemala");
		tmpMapCountryFullName.put(CountryEnum.GG, "Guernsey");
		tmpMapCountryFullName.put(CountryEnum.GN, "Guinea");
		tmpMapCountryFullName.put(CountryEnum.GW, "Guinea-Bissau");
		tmpMapCountryFullName.put(CountryEnum.GY, "Guyana");
		tmpMapCountryFullName.put(CountryEnum.HT, "Haiti");
		tmpMapCountryFullName.put(CountryEnum.HM, "Heardin saari ja McDonaldsaaret");
		tmpMapCountryFullName.put(CountryEnum.VA, "Pyhä istuin");
		tmpMapCountryFullName.put(CountryEnum.HN, "Honduras");
		tmpMapCountryFullName.put(CountryEnum.HK, "Hong Kong");
		tmpMapCountryFullName.put(CountryEnum.HU, "Unkari");
		tmpMapCountryFullName.put(CountryEnum.IS, "Islanti");
		tmpMapCountryFullName.put(CountryEnum.IN, "Intia");
		tmpMapCountryFullName.put(CountryEnum.ID, "Indonesia");
		tmpMapCountryFullName.put(CountryEnum.IR, "Iran");
		tmpMapCountryFullName.put(CountryEnum.IQ, "Irak");
		tmpMapCountryFullName.put(CountryEnum.IE, "Irlanti");
		tmpMapCountryFullName.put(CountryEnum.IM, "Mansaari");
		tmpMapCountryFullName.put(CountryEnum.IL, "Israel");
		tmpMapCountryFullName.put(CountryEnum.IT, "Italia");
		tmpMapCountryFullName.put(CountryEnum.JM, "Jamaika");
		tmpMapCountryFullName.put(CountryEnum.JP, "Japani");
		tmpMapCountryFullName.put(CountryEnum.JE, "Jersey");
		tmpMapCountryFullName.put(CountryEnum.JO, "Jordan");
		tmpMapCountryFullName.put(CountryEnum.KZ, "Kazakhstan");
		tmpMapCountryFullName.put(CountryEnum.KE, "Kenia");
		tmpMapCountryFullName.put(CountryEnum.KI, "Kiribati");
		tmpMapCountryFullName.put(CountryEnum.KP, "Pohjois-Korea");
		tmpMapCountryFullName.put(CountryEnum.KR, "Etelä-Korea");
		tmpMapCountryFullName.put(CountryEnum.KW, "Kuwait");
		tmpMapCountryFullName.put(CountryEnum.KG, "Kirgistan");
		tmpMapCountryFullName.put(CountryEnum.LA, "Lao");
		tmpMapCountryFullName.put(CountryEnum.LV, "Latvia");
		tmpMapCountryFullName.put(CountryEnum.LB, "Libanon");
		tmpMapCountryFullName.put(CountryEnum.LS, "Lesotho");
		tmpMapCountryFullName.put(CountryEnum.LR, "Liberia");
		tmpMapCountryFullName.put(CountryEnum.LY, "Libya");
		tmpMapCountryFullName.put(CountryEnum.LI, "Liechtenstein");
		tmpMapCountryFullName.put(CountryEnum.LT, "Liettua");
		tmpMapCountryFullName.put(CountryEnum.LU, "Luxemburg");
		tmpMapCountryFullName.put(CountryEnum.MO, "Macao");
		tmpMapCountryFullName.put(CountryEnum.MK, "North Macedonia");
		tmpMapCountryFullName.put(CountryEnum.MG, "Madagaskar");
		tmpMapCountryFullName.put(CountryEnum.MW, "Malawi");
		tmpMapCountryFullName.put(CountryEnum.MY, "Malesia");
		tmpMapCountryFullName.put(CountryEnum.MV, "Malediivit");
		tmpMapCountryFullName.put(CountryEnum.ML, "Mali");
		tmpMapCountryFullName.put(CountryEnum.MT, "Malta");
		tmpMapCountryFullName.put(CountryEnum.MH, "Marshallinsaaret");
		tmpMapCountryFullName.put(CountryEnum.MQ, "Martinique");
		tmpMapCountryFullName.put(CountryEnum.MR, "Mauritania");
		tmpMapCountryFullName.put(CountryEnum.MU, "Mauritius");
		tmpMapCountryFullName.put(CountryEnum.YT, "Mayotte");
		tmpMapCountryFullName.put(CountryEnum.MX, "Meksiko");
		tmpMapCountryFullName.put(CountryEnum.FM, "Mikronesia");
		tmpMapCountryFullName.put(CountryEnum.MD, "Moldova");
		tmpMapCountryFullName.put(CountryEnum.MC, "Monaco");
		tmpMapCountryFullName.put(CountryEnum.MN, "Mongolia");
		tmpMapCountryFullName.put(CountryEnum.ME, "Montenegro");
		tmpMapCountryFullName.put(CountryEnum.MS, "Montserrat");
		tmpMapCountryFullName.put(CountryEnum.MA, "Marokko");
		tmpMapCountryFullName.put(CountryEnum.MZ, "Mosambik");
		tmpMapCountryFullName.put(CountryEnum.MM, "Myanmar");
		tmpMapCountryFullName.put(CountryEnum.NA, "Namibia");
		tmpMapCountryFullName.put(CountryEnum.NR, "Nauru");
		tmpMapCountryFullName.put(CountryEnum.NP, "Nepal");
		tmpMapCountryFullName.put(CountryEnum.NL, "Alankomaat");
		tmpMapCountryFullName.put(CountryEnum.NC, "Uusi-Kaledonia");
		tmpMapCountryFullName.put(CountryEnum.NZ, "Uusi-Seelanti");
		tmpMapCountryFullName.put(CountryEnum.NI, "Nicaragua");
		tmpMapCountryFullName.put(CountryEnum.NE, "Niger");
		tmpMapCountryFullName.put(CountryEnum.NG, "Nigeria");
		tmpMapCountryFullName.put(CountryEnum.NU, "Niue");
		tmpMapCountryFullName.put(CountryEnum.NF, "Norfolkinsaari");
		tmpMapCountryFullName.put(CountryEnum.MP, "Pohjois-Mariaanit");
		tmpMapCountryFullName.put(CountryEnum.NO, "Norja");
		tmpMapCountryFullName.put(CountryEnum.OM, "Oman");
		tmpMapCountryFullName.put(CountryEnum.PK, "Pakistan");
		tmpMapCountryFullName.put(CountryEnum.PW, "Palau");
		tmpMapCountryFullName.put(CountryEnum.PS, "Palestiina");
		tmpMapCountryFullName.put(CountryEnum.PA, "Panama");
		tmpMapCountryFullName.put(CountryEnum.PG, "Papua-Uusi-Guinea");
		tmpMapCountryFullName.put(CountryEnum.PY, "Paraguay");
		tmpMapCountryFullName.put(CountryEnum.PE, "Peru");
		tmpMapCountryFullName.put(CountryEnum.PH, "Filippiinit");
		tmpMapCountryFullName.put(CountryEnum.PN, "Pitcairn");
		tmpMapCountryFullName.put(CountryEnum.PL, "Puola");
		tmpMapCountryFullName.put(CountryEnum.PT, "Portugali");
		tmpMapCountryFullName.put(CountryEnum.PR, "Puerto Rico");
		tmpMapCountryFullName.put(CountryEnum.QA, "Qatar");
		tmpMapCountryFullName.put(CountryEnum.RE, "Réunion");
		tmpMapCountryFullName.put(CountryEnum.RO, "Romania");
		tmpMapCountryFullName.put(CountryEnum.RU, "Venäjä");
		tmpMapCountryFullName.put(CountryEnum.RW, "Rwanda");
		tmpMapCountryFullName.put(CountryEnum.BL, "Saint Barthélemy");
		tmpMapCountryFullName.put(CountryEnum.SH, "Saint Helena, Ascension and Tristan da Cunha");
		tmpMapCountryFullName.put(CountryEnum.KN, "Saint Kitts ja Nevis");
		tmpMapCountryFullName.put(CountryEnum.LC, "Saint Lucia");
		tmpMapCountryFullName.put(CountryEnum.MF, "Saint Martin (ranskalainen osa)");
		tmpMapCountryFullName.put(CountryEnum.PM, "Saint-Pierre ja Miquelon");
		tmpMapCountryFullName.put(CountryEnum.VC, "Saint Vincent ja Grenadiinit");
		tmpMapCountryFullName.put(CountryEnum.WS, "Samoa");
		tmpMapCountryFullName.put(CountryEnum.SM, "San Marino");
		tmpMapCountryFullName.put(CountryEnum.ST, "São Tomé ja Príncipe");
		tmpMapCountryFullName.put(CountryEnum.SA, "Saudi Arabia");
		tmpMapCountryFullName.put(CountryEnum.SN, "Senegal");
		tmpMapCountryFullName.put(CountryEnum.RS, "Serbia");
		tmpMapCountryFullName.put(CountryEnum.SC, "Seychellit");
		tmpMapCountryFullName.put(CountryEnum.SL, "Sierra Leone");
		tmpMapCountryFullName.put(CountryEnum.SG, "Singapore");
		tmpMapCountryFullName.put(CountryEnum.SX, "Sint Maarten (hollantilainen osa)");
		tmpMapCountryFullName.put(CountryEnum.SK, "Slovakia");
		tmpMapCountryFullName.put(CountryEnum.SI, "Slovenia");
		tmpMapCountryFullName.put(CountryEnum.SB, "Salomonsaaret");
		tmpMapCountryFullName.put(CountryEnum.SO, "Somalia");
		tmpMapCountryFullName.put(CountryEnum.ZA, "Etelä-Afrikka");
		tmpMapCountryFullName.put(CountryEnum.GS, "Etelä-Georgia ja Eteläiset Sandwichsaaret");
		tmpMapCountryFullName.put(CountryEnum.SS, "Etelä-Sudan");
		tmpMapCountryFullName.put(CountryEnum.ES, "Spain");
		tmpMapCountryFullName.put(CountryEnum.LK, "Sri Lanka");
		tmpMapCountryFullName.put(CountryEnum.SD, "Sudan");
		tmpMapCountryFullName.put(CountryEnum.SR, "Suriname");
		tmpMapCountryFullName.put(CountryEnum.SJ, "Huippuvuoret ja Jan Mayen");
		tmpMapCountryFullName.put(CountryEnum.SE, "Ruotsi");
		tmpMapCountryFullName.put(CountryEnum.CH, "Sveitsi");
		tmpMapCountryFullName.put(CountryEnum.SY, "Syyria");
		tmpMapCountryFullName.put(CountryEnum.TW, "Taiwan");
		tmpMapCountryFullName.put(CountryEnum.TJ, "Tadžikistan");
		tmpMapCountryFullName.put(CountryEnum.TZ, "Tansania");
		tmpMapCountryFullName.put(CountryEnum.TH, "Thaimaa");
		tmpMapCountryFullName.put(CountryEnum.TL, "Timor-Leste");
		tmpMapCountryFullName.put(CountryEnum.TG, "Togo");
		tmpMapCountryFullName.put(CountryEnum.TK, "Tokelau");
		tmpMapCountryFullName.put(CountryEnum.TO, "Tonga");
		tmpMapCountryFullName.put(CountryEnum.TT, "Trinidad ja Tobago");
		tmpMapCountryFullName.put(CountryEnum.TN, "Tunisia");
		tmpMapCountryFullName.put(CountryEnum.TR, "Turkki");
		tmpMapCountryFullName.put(CountryEnum.TM, "Turkmenistan");
		tmpMapCountryFullName.put(CountryEnum.TC, "Turks and Caicos Islands");
		tmpMapCountryFullName.put(CountryEnum.TV, "Tuvalu");
		tmpMapCountryFullName.put(CountryEnum.UG, "Uganda");
		tmpMapCountryFullName.put(CountryEnum.UA, "Ukraina");
		tmpMapCountryFullName.put(CountryEnum.AE, "Yhdistyneet arabiemiirikunnat");
		tmpMapCountryFullName.put(CountryEnum.GB, "Yhdistynyt kuningaskunta");
		tmpMapCountryFullName.put(CountryEnum.UM, "United States Minor Outlying Islands");
		tmpMapCountryFullName.put(CountryEnum.US, "Yhdysvallat");
		tmpMapCountryFullName.put(CountryEnum.UY, "Uruguay");
		tmpMapCountryFullName.put(CountryEnum.UZ, "Uzbekistan");
		tmpMapCountryFullName.put(CountryEnum.VU, "Vanuatu");
		tmpMapCountryFullName.put(CountryEnum.VE, "Venezuela");
		tmpMapCountryFullName.put(CountryEnum.VN, "Vietnam");
		tmpMapCountryFullName.put(CountryEnum.VG, "Neitsytsaaret (Brittiläiset)");
		tmpMapCountryFullName.put(CountryEnum.VI, "Neitsytsaaret (Yhdysvaltain)");
		tmpMapCountryFullName.put(CountryEnum.WF, "Wallis ja Futuna");
		tmpMapCountryFullName.put(CountryEnum.EH, "Länsi-Sahara");
		tmpMapCountryFullName.put(CountryEnum.YE, "Jemen");
		tmpMapCountryFullName.put(CountryEnum.ZM, "Sambia");
		tmpMapCountryFullName.put(CountryEnum.ZW, "Zimbabwe");

		MAP_COUNTRY_FULL_NAMES_FI = Collections.unmodifiableMap(tmpMapCountryFullName);

		tmpMapCountryFullName = null; // gc
	}

}
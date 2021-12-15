package fi.ishtech.core.i18n.country;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import fi.ishtech.core.i18n.enums.CountryEnum;
import fi.ishtech.core.i18n.enums.LangEnum;

@TestMethodOrder(OrderAnnotation.class)
public class CountryNamesTest {

	@Test
	@Order(1)
	void testByLangs() {
		Map<LangEnum, Map<CountryEnum, String>> actual = CountryNames.byLangs(List.of(LangEnum.fi, LangEnum.en));
		assertNotNull(actual);
		assertFalse(actual.isEmpty());
	}

}
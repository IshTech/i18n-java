package fi.ishtech.core.i18n.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class CountryEnumTest {

	@Test
	@Order(1)
	void testFromName() {
		CountryEnum expected = CountryEnum.IN;
		CountryEnum actual = CountryEnum.fromName("IN");
		assertEquals(expected, actual);
	}

	@Test
	@Order(2)
	void testFromNameNegative() {
		assertThrows(IllegalArgumentException.class, () -> CountryEnum.fromName("Fi"));
	}

	@Test
	@Order(3)
	void testFromNameNull() {
		assertThrows(NullPointerException.class, () -> CountryEnum.fromName(null));
	}

	@Test
	@Order(4)
	void testFromNameBlank() {
		assertThrows(IllegalArgumentException.class, () -> CountryEnum.fromName(""));
	}

	@Test
	@Order(5)
	void testFromNameTrimmed() {
		CountryEnum expected = CountryEnum.IN;
		CountryEnum actual = CountryEnum.fromNameTrimmed(" IN ");
		assertEquals(expected, actual);
	}

	@Test
	@Order(6)
	void testFromNameTrimmedNegative() {
		assertThrows(IllegalArgumentException.class, () -> CountryEnum.fromName(" Fi "));
	}

	@Test
	@Order(7)
	void testFromNameIgnoreCase() {
		CountryEnum expected = CountryEnum.IN;
		CountryEnum actual = CountryEnum.fromNameIgnoreCase("In");
		assertEquals(expected, actual);
	}

	@Test
	@Order(8)
	void testFromNameTrimmedIgnoreCase() {
		assertThrows(IllegalArgumentException.class, () -> CountryEnum.fromName(" ABCD "));
	}

	@Test
	@Order(9)
	void testFromNameOrElseNull() {
		CountryEnum expected = CountryEnum.IN;
		CountryEnum actual = CountryEnum.fromNameOrElseNull("IN");
		assertEquals(expected, actual);
	}

	@Test
	@Order(10)
	void testFromNameOrElseNullNull() {
		assertNull(CountryEnum.fromNameOrElseNull(null));
	}

	@Test
	@Order(11)
	void testFromNameOrElseNullBlank() {
		CountryEnum actual = CountryEnum.fromNameOrElseNull("");
		assertNull(actual);
	}

	@Test
	@Order(12)
	void testFromNameOrElseNullWhenNotFound() {
		CountryEnum actual = CountryEnum.fromNameOrElseNull("Fi");
		assertNull(actual);
	}

	@Test
	@Order(13)
	void testFromNameTrimmedOrElseNull() {
		CountryEnum expected = CountryEnum.IN;
		CountryEnum actual = CountryEnum.fromNameTrimmedOrElseNull(" IN ");
		assertEquals(expected, actual);
	}

	@Test
	@Order(14)
	void testFromNameTrimmedOrElseBlank() {
		assertNull(CountryEnum.fromNameTrimmedOrElseNull("  "));
	}

	@Test
	@Order(15)
	void testFromNameTrimmedOrElseNullWhenNotFound() {
		assertNull(CountryEnum.fromNameTrimmedOrElseNull(" ABCD "));
	}

	@Test
	@Order(16)
	void testFromNameIgnoreCaseOrElseNull() {
		CountryEnum expected = CountryEnum.IN;
		CountryEnum actual = CountryEnum.fromNameIgnoreCaseOrElseNull(" In ");
		assertEquals(expected, actual);
	}

	@Test
	@Order(17)
	void testFromNameIgnoreCaseOrElseNullNull() {
		assertNull(CountryEnum.fromNameIgnoreCaseOrElseNull(null));
	}

	@Test
	@Order(18)
	void testFromNameIgnoreCaseOrElseNullBlank() {
		assertNull(CountryEnum.fromNameIgnoreCaseOrElseNull(" "));
	}

	@Test
	@Order(19)
	void testFromNameIgnoreCaseOrElseNullWhenNotFound() {
		assertNull(CountryEnum.fromNameIgnoreCaseOrElseNull(" ABCD "));
	}

}
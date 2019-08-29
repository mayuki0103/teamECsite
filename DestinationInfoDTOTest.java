package com.internousdev.oregon.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.oregon.dto.DestinationInfoDTO;

public class DestinationInfoDTOTest {


		// test getId()
		@Test
		public void test_getId_max() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getId_min() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			int expected = -2147483648;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getId_0() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}

		// test setId()
		@Test
		public void test_setId_max() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setId_min() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			int expected = -2147483648;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setId_0() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}

		// test getUserId()
		@Test
		public void test_getUserId_null() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = null;

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getUserId_emptyCharacter() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getUserId_space() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getUserId_fullSpace() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}

		@Test
		public void test_getUserId_alphabeticCharacters() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getUserId_halfWidthDigit() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getUserId_hiragana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "てすと";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getUserId_katakana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "テスト";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getUserId_kanji() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getUserId_all() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字 テスト　てすと123abc";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}

		// test setUserId()
		@Test
		public void test_setUserId_null() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = null;

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setUserId_emptyCharacter() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setUserId_space() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setUserId_fullSpace() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}

		@Test
		public void test_setUserId_alphabeticCharacters() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setUserId_halfWidthDigit() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setUserId_hiragana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "てすと";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setUserId_katakana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "テスト";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setUserId_kanji() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setUserId_all() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字 テスト　てすと123abc";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected,actual);
		}

		// test getFamilyName()
		@Test
		public void test_getFamilyName_null() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = null;

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFamilyName_emptyCharacter() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFamilyName_space() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFamilyName_fullSpace() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}

		@Test
		public void test_getFamilyName_alphabeticCharacters() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFamilyName_halfWidthDigit() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFamilyName_hiragana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "てすと";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFamilyName_katakana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "テスト";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFamilyName_kanji() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFamilyName_all() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字 テスト　てすと123abc";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}

		// test setFamilyName()
		@Test
		public void test_setFamilyName_null() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = null;

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFamilyName_emptyCharacter() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFamilyName_space() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFamilyName_fullSpace() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}

		@Test
		public void test_setFamilyName_alphabeticCharacters() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFamilyName_halfWidthDigit() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFamilyName_hiragana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "てすと";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFamilyName_katakana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "テスト";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFamilyName_kanji() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFamilyName_all() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字 テスト　てすと123abc";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected,actual);
		}

		// test getFirstName()
		@Test
		public void test_getFirstName_null() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = null;

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFirstName_emptyCharacter() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFirstName_space() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFirstName_fullSpace() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}

		@Test
		public void test_getFirstName_alphabeticCharacters() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFirstName_halfWidthDigit() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFirstName_hiragana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "てすと";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFirstName_katakana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "テスト";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFirstName_kanji() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFirstName_all() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字 テスト　てすと123abc";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}

		// test getFamilyNameKana()
		@Test
		public void test_getFamilyNameKana_null() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = null;

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFamilyNameKana_emptyCharacter() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFamilyNameKana_space() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFamilyNameKana_fullSpace() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}

		@Test
		public void test_getFamilyNameKana_alphabeticCharacters() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFamilyNameKana_halfWidthDigit() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFamilyNameKana_hiragana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "てすと";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFamilyNameKana_katakana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "テスト";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFamilyNameKana_kanji() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFamilyNameKana_all() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字 テスト　てすと123abc";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}

		// test setFamilyNameKana()
		@Test
		public void test_setFamilyNameKana_null() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = null;

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFamilyNameKana_emptyCharacter() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFamilyNameKana_space() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFamilyNameKana_fullSpace() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}

		@Test
		public void test_setFamilyNameKana_alphabeticCharacters() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFamilyNameKana_halfWidthDigit() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFamilyNameKana_hiragana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "てすと";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFamilyNameKana_katakana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "テスト";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFamilyNameKana_kanji() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFamilyNameKana_all() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字 テスト　てすと123abc";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected,actual);
		}

		// test setFirstName()
		@Test
		public void test_setFirstName_null() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = null;

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFirstName_emptyCharacter() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFirstName_space() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFirstName_fullSpace() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}

		@Test
		public void test_setFirstName_alphabeticCharacters() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFirstName_halfWidthDigit() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFirstName_hiragana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "てすと";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFirstName_katakana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "テスト";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFirstName_kanji() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFirstName_all() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字 テスト　てすと123abc";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected,actual);
		}

		// test getFirstNameKana()
		@Test
		public void test_getFirstNameKana_null() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = null;

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFirstNameKana_emptyCharacter() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFirstNameKana_space() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFirstNameKana_fullSpace() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}

		@Test
		public void test_getFirstNameKana_alphabeticCharacters() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFirstNameKana_halfWidthDigit() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFirstNameKana_hiragana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "てすと";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFirstNameKana_katakana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "テスト";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFirstNameKana_kanji() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getFirstNameKana_all() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字 テスト　てすと123abc";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}

		// test setFirstNameKana()
		@Test
		public void test_setFirstNameKana_null() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = null;

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFirstNameKana_emptyCharacter() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFirstNameKana_space() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFirstNameKana_fullSpace() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}

		@Test
		public void test_setFirstNameKana_alphabeticCharacters() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFirstNameKana_halfWidthDigit() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFirstNameKana_hiragana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "てすと";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFirstNameKana_katakana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "テスト";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFirstNameKana_kanji() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setFirstNameKana_all() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字 テスト　てすと123abc";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected,actual);
		}

		// test getEmail()
		@Test
		public void test_getEmail_null() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = null;

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getEmail_emptyCharacter() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getEmail_space() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getEmail_fullSpace() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}

		@Test
		public void test_getEmail_alphabeticCharacters() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getEmail_halfWidthDigit() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "123";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getEmail_hiragana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "てすと";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getEmail_katakana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "テスト";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getEmail_kanji() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getEmail_all() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字 テスト　てすと123abc";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}

		// test setEmail()
		@Test
		public void test_setEmail_null() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = null;

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setEmail_emptyCharacter() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setEmail_space() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setEmail_fullSpace() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}

		@Test
		public void test_setEmail_alphabeticCharacters() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setEmail_halfWidthDigit() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "123";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setEmail_hiragana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "てすと";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setEmail_katakana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "テスト";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setEmail_kanji() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setEmail_all() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字 テスト　てすと123abc";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected,actual);
		}

		// test getTelNumber()
		@Test
		public void test_getTelNumber_null() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = null;

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getTelNumber_emptyCharacter() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getTelNumber_space() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getTelNumber_fullSpace() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}

		@Test
		public void test_getTelNumber_alphabeticCharacters() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getTelNumber_halfWidthDigit() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "123";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getTelNumber_hiragana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "てすと";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getTelNumber_katakana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "テスト";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getTelNumber_kanji() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getTelNumber_all() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字 テスト　てすと123abc";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}

		// test setTelNumber()
		@Test
		public void test_setTelNumber_null() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = null;

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setTelNumber_emptyCharacter() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setTelNumber_space() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setTelNumber_fullSpace() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}

		@Test
		public void test_setTelNumber_alphabeticCharacters() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setTelNumber_halfWidthDigit() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "123";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setTelNumber_hiragana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "てすと";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setTelNumber_katakana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "テスト";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setTelNumber_kanji() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setTelNumber_all() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字 テスト　てすと123abc";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected,actual);
		}

		// test getUserAddress()
		@Test
		public void test_getUserAddress_null() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = null;

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getUserAddress_emptyCharacter() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getUserAddress_space() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getUserAddress_fullSpace() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}

		@Test
		public void test_getUserAddress_alphabeticCharacters() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getUserAddress_halfWidthDigit() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "123";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getUserAddress_hiragana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "てすと";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getUserAddress_katakana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "テスト";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getUserAddress_kanji() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}
		@Test
		public void test_getUserAddress_all() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字 テスト　てすと123abc";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}

		// test setUserAddress()
		@Test
		public void test_setUserAddress_null() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = null;

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setUserAddress_emptyCharacter() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setUserAddress_space() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setUserAddress_fullSpace() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}

		@Test
		public void test_setUserAddress_alphabeticCharacters() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setUserAddress_halfWidthDigit() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "123";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setUserAddress_hiragana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "てすと";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setUserAddress_katakana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "テスト";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setUserAddress_kanji() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}
		@Test
		public void test_setUserAddress_all() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "漢字 テスト　てすと123abc";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected,actual);
		}

}

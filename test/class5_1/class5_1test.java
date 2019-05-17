package class5_1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class class5_1test {

	@Test
	public void translateEng1と入力するとoneが出力される() {
		IntToEng ite = new IntToEng();
		String expected = "one";
		String actual = ite.translateEng(1);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEng21と入力するとtwentyoneが出力される() {
		IntToEng ite = new IntToEng();
		String expected = "twenty one";
		String actual = ite.translateEng(21);
		assertThat(actual,is(expected));
	}

}

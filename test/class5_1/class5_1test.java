package class5_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class class5_1test {

	@Test
	public void translateEng1と入力するとoneが出力される() {
		IntToEng ite = new IntToEng();
		String input = "one";
		String output = IntToEng.translateEng(1);
		assertThat(output,is(input));
	}

}

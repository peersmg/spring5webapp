package matt.springproject.spring5webapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

@SpringBootTest
class Spring5webappApplicationTests {

	@Test
	void contextLoads() {
		assertThat(true, is(false));
	}

}

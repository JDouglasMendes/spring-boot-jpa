package douglasmendes;

import douglasmendes.controller.PersonController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class DouglasmendesApplicationTests {
	@Autowired
	private PersonController controller;
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}
}

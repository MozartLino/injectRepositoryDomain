package br.com.infra.lino.utils;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration({ "/applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class InjectDependencies {

	@Test
	public void shouldInjectRepositoryWhenUniqueResult() {
	}

	@Test
	public void shouldInjectRepositoryWhenIsCollection() {
	}

	@Before
	public void setUp() {
	}

}

package br.com.infra.lino.utils;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.lino.domain.model.User;
import br.com.lino.domain.repository.UserRepository;

@ContextConfiguration({ "/applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class InjectDependenciesTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void shouldInjectRepositoryWhenUniqueResult() {
		User user = userRepository.load(1L);

		assertTrue("Repository não foi passado", user.isNotNullDependencies());
	}

	@Test
	public void shouldInjectRepositoryWhenIsCollection() {
		List<User> users = userRepository.list();
		
		assertTrue("Repository não foi injetado quando retornou uma lista de users", 
				users.get(0).isNotNullDependencies());
	}

	@Before
	public void setUp() {
	}

}

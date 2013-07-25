package br.com.lino.infra.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.lino.domain.model.User;
import br.com.lino.domain.repository.UserRepository;
import br.com.lino.infra.annotation.AddDependencies;

@Component
public class UserDao implements UserRepository {

	@AddDependencies
	public User load(Long id) {
		return new User(1L);
	}

	@AddDependencies
	public List<User> list() {
		return Arrays.asList(new User(1L), new User(2L));
	}

}

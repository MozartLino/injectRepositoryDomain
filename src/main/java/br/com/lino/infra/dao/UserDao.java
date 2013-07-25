package br.com.lino.infra.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.lino.domain.model.User;
import br.com.lino.domain.repository.UserRepository;

@Component
public class UserDao implements UserRepository {

	public User load(Long id) {
		return new User(1L);
	}

	public List<User> list() {
		return Arrays.asList(new User(1L), new User(2L));
	}

}

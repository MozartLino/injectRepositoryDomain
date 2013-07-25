package br.com.lino.domain.model;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.lino.domain.repository.UserRepository;

public class User {

	private Long id;

	@Autowired
	private transient UserRepository userRepository;

	public User(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public boolean isNotNullDependencies() {
		if (userRepository == null)
			throw new IllegalStateException("Não injetou o repository");

		return true;
	}
}
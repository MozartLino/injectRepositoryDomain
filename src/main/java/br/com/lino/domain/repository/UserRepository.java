package br.com.lino.domain.repository;

import java.util.List;

import br.com.lino.domain.model.User;

public interface UserRepository {

	public User load(Long id);

	public List<User> list();

}
package br.com.rvv.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rvv.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByNome(String nome);
	
}

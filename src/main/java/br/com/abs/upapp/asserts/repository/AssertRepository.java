package br.com.abs.upapp.asserts.repository;

import br.com.abs.upapp.asserts.entity.Assert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AssertRepository extends JpaRepository<Assert, Long> {

    boolean existsByAssertCode(String assertCode);

   Optional<Assert> findByAssertCode(String assertCode);
}

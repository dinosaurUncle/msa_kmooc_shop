package dinosauruncle.kmooc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import dinosauruncle.kmooc.domain.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	
	Account findByName(@Param("name") String name);
}

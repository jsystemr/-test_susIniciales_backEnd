package edu.zamorano.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.zamorano.model.Tablamemoria;

@Repository
public interface TemporalRepository extends JpaRepository<Tablamemoria, Serializable> {
	@Query(
			  value = "exec getTablamemoria",
			  nativeQuery = true)
			List<Tablamemoria> findAllTablamemoria();
}

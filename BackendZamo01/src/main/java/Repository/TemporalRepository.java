package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.zamorano.model.TablaMemoria;

public interface TemporalRepository extends JpaRepository<TablaMemoria, Integer> {

}

package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.zamorano.model.TablaMemoria;

@Repository
public interface TemporalRepository extends JpaRepository<TablaMemoria, Integer> {

}

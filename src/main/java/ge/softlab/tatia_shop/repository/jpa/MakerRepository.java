package ge.softlab.tatia_shop.repository.jpa;

import ge.softlab.tatia_shop.model.Maker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakerRepository extends JpaRepository<Maker,Long> {
}

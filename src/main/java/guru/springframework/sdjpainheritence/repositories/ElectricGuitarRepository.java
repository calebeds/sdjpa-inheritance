package guru.springframework.sdjpainheritence.repositories;

import guru.springframework.sdjpainheritence.domain.joined.ElectricGuitar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectricGuitarRepository extends JpaRepository<ElectricGuitar, Long> {

}

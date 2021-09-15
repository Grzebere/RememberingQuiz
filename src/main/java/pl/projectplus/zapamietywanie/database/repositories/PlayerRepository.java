package pl.projectplus.zapamietywanie.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.projectplus.zapamietywanie.database.entities.PlayerEntity;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}
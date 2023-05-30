package ru.fmtk.jh.bugtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fmtk.jh.bugtracker.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}

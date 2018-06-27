package com.gabrielczar.semantic.repositories;

import com.gabrielczar.semantic.entities.MatchingEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "matching-entries", collectionResourceRel = "matching_entries")
public interface MatchingEntryRepository extends JpaRepository<MatchingEntry, Long> { }

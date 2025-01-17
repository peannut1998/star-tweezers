package com.starforceps.starforceps.domain.organizer.dao;

import com.starforceps.starforceps.domain.organizer.domain.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
    List<Organizer> findAllByUserId(Long userId);
}

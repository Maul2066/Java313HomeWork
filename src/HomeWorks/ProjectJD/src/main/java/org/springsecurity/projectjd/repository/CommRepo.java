package org.springsecurity.projectjd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springsecurity.projectjd.entity.Comm;


public interface CommRepo extends JpaRepository<Comm, Long> {
}
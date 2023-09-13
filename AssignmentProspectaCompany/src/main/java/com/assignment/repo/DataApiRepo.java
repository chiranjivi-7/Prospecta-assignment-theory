package com.assignment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.model.Entry;

@Repository
public interface DataApiRepo extends JpaRepository<Entry, String> {

}

package com.repex.SpringSamples;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Myrepository extends JpaRepository<Students, Integer> {

	List<Students> findBystudentId(int studentId);

}

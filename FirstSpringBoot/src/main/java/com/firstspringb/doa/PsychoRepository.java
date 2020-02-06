package com.firstspringb.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.firstspringb.model.Psycho;

public interface PsychoRepository extends JpaRepository<Psycho, Integer> {

}

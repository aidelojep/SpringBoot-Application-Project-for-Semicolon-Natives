package com.springboot.demo.repository;
import com.springboot.demo.data.Native;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NativeRepository extends JpaRepository<Native, String> {

    Native findByEmail (String Email);
    List<Native> findNativeByCohort(String Cohort);
}

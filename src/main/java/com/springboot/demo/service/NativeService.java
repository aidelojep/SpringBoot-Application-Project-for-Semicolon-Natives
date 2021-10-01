package com.springboot.demo.service;

import com.springboot.demo.data.Native;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface NativeService {

 Native registerNative(Native newNative);
 void updateEmail(String oldEmail, String newEmail);
 Optional<Native> getNativeById(String id);
 List<Native> getNativeByCohort(String cohort);
 void deleteNatives(String id);
 List<Native> deleteNatives();

 }

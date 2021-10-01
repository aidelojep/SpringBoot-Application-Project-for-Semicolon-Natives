package com.springboot.demo.service;

import com.springboot.demo.data.Native;
import com.springboot.demo.repository.NativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NativeServiceImpl implements NativeService{

    @Autowired
    private NativeRepository nativeRepository;

    @Override
    public Native registerNative(Native newNative) {
        Native findNative = nativeRepository.findByEmail(newNative.getEmail());
        if(findNative != null){
            throw new IllegalArgumentException("Email address already exist");
        }
        return nativeRepository.save(newNative);
    }

    @Override
    public void updateEmail(String oldEmail, String newEmail) {
      Native findNative = nativeRepository.findByEmail(oldEmail);
      if(findNative == null){
          throw new IllegalStateException("Invalid email address");
      }

      findNative setEmail(newEmail);
      nativeRepository.save(findNative);
    }

    @Override
    public Optional<Native> getNativeById(String id) {

        return nativeRepository.findById(id);

    }

    @Override
    public List<Native> getNativeByCohort(String cohort) {
        return null;
    }

    @Override
    public void deleteNatives(String id) {

    }

    @Override
    public List<Native> deleteNatives() {
        return null;
    }
}

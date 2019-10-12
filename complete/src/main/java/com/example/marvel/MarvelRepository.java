package com.example.marvel;

import org.springframework.data.repository.CrudRepository;

import com.example.marvel.Marvel;

// This will be AUTO IMPLEMENTED by Spring into a Bean called marvelRepository
// CRUD refers Create, Read, Update, Delete

public interface MarvelRepository extends CrudRepository<Marvel, Integer> {

}

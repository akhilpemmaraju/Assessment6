package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Album;
import com.example.demo.model.Artist;

public interface ArtistDAL {
	Artist save(Artist a);
	
	List<Artist> findAll();
	Boolean delete(Artist a);
	Artist findById(String id);
}
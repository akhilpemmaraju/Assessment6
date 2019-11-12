package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Album;
import com.example.demo.model.Artist;
import com.example.demo.repo.ArtistDAL;

@RestController
public class ArtistController {
	@Autowired
	private ArtistDAL artDAL;
	
	@PostMapping("/artist")
	public void create(@RequestBody Artist a){
		artDAL.save(a);
	}
	
	@GetMapping("/artist")
	public List<Artist> findAll(){
		return artDAL.findAll();
	}
	
	@DeleteMapping("/artist/{id}")
	public Artist delete(@PathVariable String id) {
		Artist deletedArtist = artDAL.findById(id);
		if(artDAL.delete(deletedArtist))
			return deletedArtist;
		else
			return null;
	}
}

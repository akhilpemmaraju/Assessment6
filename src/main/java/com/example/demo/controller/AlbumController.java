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
import com.example.demo.repo.AlbumDAL;

@RestController
public class AlbumController {
	@Autowired
	private AlbumDAL albDAL;
	
	@PostMapping("/album")
	public void create(@RequestBody Album a){
		albDAL.save(a);
	}
	
	@GetMapping("/album")
	public List<Album> findAll(){
		return albDAL.findAll();
	}

	@DeleteMapping("/album/{id}")
	public Album delete(@PathVariable String id) {
		Album deletedAlbum = albDAL.findById(id);
		if(albDAL.delete(deletedAlbum))
			return deletedAlbum;
		else
			return null;
	}
}

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
import com.example.demo.model.Track;
import com.example.demo.repo.TrackDAL;

@RestController
public class TrackController {
	@Autowired
	private TrackDAL traDAL;
	
	@PostMapping("/track")
	public void create(@RequestBody Track t){
		traDAL.save(t);
	}
	
	@GetMapping("/track")
	public List<Track> findAll(){
		return traDAL.findAll();
	}
	
	@DeleteMapping("/track/{id}")
	public Track delete(@PathVariable String id) {
		Track deletedTrack = traDAL.findById(id);
		if(traDAL.delete(deletedTrack))
			return deletedTrack;
		else
			return null;
	}
}
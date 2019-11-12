package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Album;
import com.example.demo.model.Track;

public interface TrackDAL {
	Track save(Track t);
	
	List<Track> findAll();
	Boolean delete(Track a);
	Track findById(String id);
}
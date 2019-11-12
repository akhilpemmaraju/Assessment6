package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Album;
import com.example.demo.model.Track;

@Repository
public class TrackDALImp implements TrackDAL{
	
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public List<Track> findAll(){
		return mongo.findAll(Track.class);
	}
	
	@Override
	public Track save(Track tra){
		return mongo.save(tra);
	}

	@Override
	public Boolean delete(Track t) {
		// TODO Auto-generated method stub
		return mongo.remove(t).wasAcknowledged();
	}

	@Override
	public Track findById(String id) {
		// TODO Auto-generated method stub
		return mongo.findAndRemove(new Query(Criteria.where("id").is(id)), Track.class);
	}
}
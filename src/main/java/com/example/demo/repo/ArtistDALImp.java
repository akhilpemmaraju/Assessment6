package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Album;
import com.example.demo.model.Artist;

@Repository
public class ArtistDALImp implements ArtistDAL{
	
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public List<Artist> findAll(){
		return mongo.findAll(Artist.class);
	}
	
	@Override
	public Artist save(Artist art){
		return mongo.save(art);
	}

	@Override
	public Boolean delete(Artist a) {
		// TODO Auto-generated method stub
		return mongo.remove(a).wasAcknowledged();
	}

	@Override
	public Artist findById(String id) {
		// TODO Auto-generated method stub
		return mongo.findAndRemove(new Query(Criteria.where("id").is(id)), Artist.class);
	}
}
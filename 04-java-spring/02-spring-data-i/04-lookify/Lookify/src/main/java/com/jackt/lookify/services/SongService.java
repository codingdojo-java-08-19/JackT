package com.jackt.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jackt.lookify.models.Song;
import com.jackt.lookify.repositories.SongRepository;



@Service
public class SongService {
	
	private final SongRepository songRepository;
	
	public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}
	
	public List<Song> allSongs(){
		return songRepository.findAll();
	}
	
	public List<Song> topTen(){
		return songRepository.findTop10ByOrderByRatingDesc();
	}
	
	public Song createSong(Song s) {
		return songRepository.save(s);
	}
	
	public Song findSong(Long id) {
		Optional<Song> optionalSong = songRepository.findById(id);
		if(optionalSong.isPresent()) {
			return optionalSong.get();
		} else {
			return null;
		}
	}
	
	public List<Song> findSong(String artist) {
		return songRepository.findByArtistContaining(artist);
	}
	
	public Song updateSong(Long id, String title, String artist, Integer rating) {
		Song updateSong = this.findSong(id);
		updateSong.setTitle(title);
		updateSong.setArtist(artist);
		updateSong.setRating(rating);
		
		return songRepository.save(updateSong);
	}
	
	public void deleteSong(Long id) {
		this.songRepository.deleteById(id);
	}

}

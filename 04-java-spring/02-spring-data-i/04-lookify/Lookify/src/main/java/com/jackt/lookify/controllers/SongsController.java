package com.jackt.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jackt.lookify.models.Song;
import com.jackt.lookify.services.SongService;

@Controller
public class SongsController {
	
private final SongService songService;
	
	public SongsController(SongService songService) {
		this.songService = songService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "/view/index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model, @ModelAttribute("song") Song song) {
		List<Song> songs = songService.allSongs();
		model.addAttribute("songs", songs);
		return "/view/dashboard.jsp";
	}
	
	@RequestMapping(value="/process/search", method=RequestMethod.POST)
	public String searchProcess(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if(result.hasErrors()) {
			return "/view/search.jsp";
		} else {
			return "redirect:/search/" + song.getArtist();
		}
	}
	
	@RequestMapping(value="/search/{artist}")
	public String search(@PathVariable("artist") String artist, Model model, @ModelAttribute("song") Song song, BindingResult result) {
		List<Song> songs = songService.findSong(artist);
		model.addAttribute("songs", songs);
		model.addAttribute("artist", artist);
		return "/view/search.jsp";
	}
	
	@RequestMapping("/song/new")
	public String newSong( @ModelAttribute("song") Song song) {
		return "/view/new.jsp";		
	}
	
	@RequestMapping("/process/new")
	public String createSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if(result.hasErrors()) {
			return "/view/new.jsp";
		}
		else {
			songService.createSong(song);
			return "redirect:/dashboard";
		}
	}
	
	@RequestMapping("/search/topTen")
	public String createTopTen(Model model, @ModelAttribute("song") Song song) {
		List<Song> topTen = songService.topTen();
		model.addAttribute("topTen", topTen);
		return "/view/topTen.jsp";
	}
	
	@RequestMapping("/song/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Song song = songService.findSong(id);
		model.addAttribute("song", song);
		return "/view/show.jsp";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		songService.deleteSong(id);		
		return ("redirect:/dashboard");
	}
}

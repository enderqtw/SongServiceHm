package self.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import self.service.SongService;


@Controller
@RequestMapping("/")
public class SongController {

    @Autowired
    public SongService service;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/songs")
    public String getAllSongs(Model model) {
        model.addAttribute("songs", service.getSongList());
        return "allSongs";
    }

    @GetMapping("/song/genre/{genre}")
    public String getAllSongs(@PathVariable String genre, Model model) {
        model.addAttribute("songs", service.getSongListByGenre(genre));
        return "songsByGenre";
    }

    @GetMapping("/song/artist/{artist}")
    public String getSongByName(@PathVariable String artist, Model model) {
        model.addAttribute("song", service.getRandomSongByArtist(artist));
        return "randomSongByArtist";
    }

    @GetMapping("/song/list/{artist}")
    public String getAllSongsByName(@PathVariable String artist, Model model) {
        model.addAttribute("songs", service.getSongListByArtist(artist));
        return "songsByArtist";
    }

    @GetMapping("/song/year/{year}")
    public String getSongsByYear(@PathVariable int year, Model model) {
        model.addAttribute("songs", service.getSongListByReleaseYear(year));
        return "songsByReleaseYear";
    }



}

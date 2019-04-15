package com.reymatsunaga.giflib.controller;

import com.reymatsunaga.giflib.data.GifRepository;
import com.reymatsunaga.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FavoriteController {
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/favorites")
    public String getFavorites(ModelMap modelMap) {
        List<Gif> favorites = gifRepository.findByFavorite();
        modelMap.put("gifs", favorites);
        return "favorites";
    }
}

package com.st.market.stmarket.menu.services;

import com.st.market.stmarket.menu.model.MainMenu;
import com.st.market.stmarket.menu.repository.MainMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

@Service
@CacheConfig(cacheNames={"mainMenu"})
public class MainMenuServiceHandler implements MainMenuService {

    @Autowired
    MainMenuRepository mainMenuRepository;

    @Override
    public MainMenu save(MainMenu model) {
        return mainMenuRepository.save(model);
    }

    @Override
    public Optional<MainMenu> findById(Long id) {
        return mainMenuRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return mainMenuRepository.existsById(id);
    }

    @Cacheable
    @Override
    public Iterable<MainMenu> findAll() {
        return mainMenuRepository.findAll();
    }

    @Override
    public long count() {
        return mainMenuRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        mainMenuRepository.deleteById(id);
    }

    @Override
    public void delete(MainMenu model) {
        mainMenuRepository.delete(model);
    }

    @Override
    public void deleteAll() {
        mainMenuRepository.deleteAll();
    }
}

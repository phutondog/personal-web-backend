package com.eric.website.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TechService {

    private final TechRepository techRepository;

    @Autowired
    public TechService(TechRepository techRepository) {
        this.techRepository = techRepository;
    }

    public Optional<List<Tech>>  getAllTech(){
        return techRepository.getAllTech();
    }
}

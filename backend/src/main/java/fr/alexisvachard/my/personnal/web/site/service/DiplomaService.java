package fr.alexisvachard.my.personnal.web.site.service;

import fr.alexisvachard.my.personnal.web.site.model.homepage.Diploma;
import fr.alexisvachard.my.personnal.web.site.repository.DiplomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiplomaService {

    private DiplomaRepository diplomaRepository;

    @Autowired
    public DiplomaService(DiplomaRepository diplomaRepository) {
        this.diplomaRepository = diplomaRepository;
    }

    public List<Diploma> findAll() {
        return diplomaRepository.findAll();
    }
}

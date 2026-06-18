package com.skills.hub.service.impl;

import com.skills.hub.entity.SkillPack;
import com.skills.hub.repository.SkillPackRepository;
import com.skills.hub.service.SkillPackService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillPackServiceImpl implements SkillPackService {

    private final SkillPackRepository repo;

    public SkillPackServiceImpl(SkillPackRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<SkillPack> getAll() {
        return repo.findAll();
    }

    @Override
    public SkillPack save(SkillPack skillPack) {
        return repo.save(skillPack);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}





skillpackserviceimpl

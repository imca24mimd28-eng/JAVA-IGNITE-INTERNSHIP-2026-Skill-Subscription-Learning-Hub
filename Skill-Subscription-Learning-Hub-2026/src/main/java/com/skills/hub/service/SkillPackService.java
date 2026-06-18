package com.skills.hub.service;

import com.skills.hub.entity.SkillPack;
import java.util.List;

public interface SkillPackService {

    SkillPack save(SkillPack skillPack);

    List<SkillPack> getAll();

    void deleteById(Long id);
}

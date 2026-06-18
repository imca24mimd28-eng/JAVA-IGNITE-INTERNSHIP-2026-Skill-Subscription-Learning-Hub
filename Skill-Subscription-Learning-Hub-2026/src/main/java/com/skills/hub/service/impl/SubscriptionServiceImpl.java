package com.skills.hub.service.impl;

import com.skills.hub.entity.Subscription;
import com.skills.hub.repository.SubscriptionRepository;
import com.skills.hub.service.SubscriptionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    private final SubscriptionRepository repo;

    public SubscriptionServiceImpl(SubscriptionRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Subscription> getAll() {
        return repo.findAll();
    }

    @Override
    public Subscription save(Subscription subscription) {
        return repo.save(subscription);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}






subscription serviceimpl

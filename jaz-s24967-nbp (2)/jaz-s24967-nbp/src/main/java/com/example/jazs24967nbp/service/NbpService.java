package com.example.jazs24967nbp.service;

import com.example.jazs24967nbp.model.NbpModel;
import com.example.jazs24967nbp.repo.NbpRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class NbpService {

    private final RestTemplate restTemplate;
    private final NbpRepository nbpRepository;

    public NbpService(RestTemplate restTemplate, NbpRepository nbpRepository) {
        this.restTemplate = restTemplate;
        this.nbpRepository = nbpRepository;
    }

    public String getPrices(NbpModel.Material material, String date_from, String date_to){
        String uri = "http://api.nbp.pl/api/cenyzlota/" + date_from + "/"+ date_to + "/";
        String result = restTemplate.getForObject(uri, String.class);

        return result;
    }
}

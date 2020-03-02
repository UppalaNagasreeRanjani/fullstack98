package com.cts.training.restresources;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cts.training.model.InitialPublicOffering;
@RepositoryRestResource(path = "ipos", collectionResourceRel = "ipos")
public interface InitialPublicOfferingRestResources extends PagingAndSortingRepository<InitialPublicOffering, Integer>{

}

package com.thc.ent.controllers;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.thc.ent.models.HouseLocation;

@RepositoryRestResource(collectionResourceRel = "houselocations", path = "houselocation")
public interface HouseLocationRepository extends PagingAndSortingRepository<HouseLocation, Long> {

	List<HouseLocation> findByLocationName(@Param("name") String name);

}
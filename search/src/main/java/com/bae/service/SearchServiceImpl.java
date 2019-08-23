package com.bae.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.entity.Associate;
import com.bae.entity.Citizen;
import com.bae.entity.SuspectCar;
import com.bae.repository.AssociateRepository;
import com.bae.repository.CitizenRepository;
import com.bae.repository.SuspectCarRepository;

@Service
public class SearchServiceImpl implements SearchService {

	private CitizenRepository citizenRepo;
	private SuspectCarRepository suspectRepo;
	private AssociateRepository associateRepo;

	@Autowired
	public SearchServiceImpl(CitizenRepository citizenRepoy, SuspectCarRepository suspectRepo,
			AssociateRepository associateRepo) {
		this.citizenRepo = citizenRepoy;
		this.suspectRepo = suspectRepo;
		this.associateRepo = associateRepo;
	}

	public SearchServiceImpl() {
	}

	public List<Object> search(String category, String searchTerm) {
		switch (category) {
		case "name":
			return getName(searchTerm);
		case "car Reg":
			return getSuspectCar(searchTerm);
		case "getAssociates":
			return getId(searchTerm);
		default:
			return null;
		}

	}

	@Override
	public List<Object> getName(String name) {
		List<Object> foundList = new ArrayList<>();
		List<Citizen> list = citizenRepo.findAll();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getForenames().toLowerCase().contains(name.toLowerCase())) {
				foundList.add(list.get(i));
			} else if (name.equalsIgnoreCase(list.get(i).getSurname())) {
				foundList.add(list.get(i));
			}
		}
		return foundList;
	}

	@Override
	public List<Object> getLocation(String location) {
		List<Object> foundList = new ArrayList<>();
		List<Citizen> list = citizenRepo.findAll();
		for (int i = 0; i < list.size(); i++) {
			if (location.equals(list.get(i).getHomeAddress())) {
				foundList.add(list.get(i));
			}

		}

		return foundList;
	}

	@Override
	public List<Object> getSuspectCar(String carreg) {
		List<Object> foundList = new ArrayList<>();
		List<SuspectCar> list = suspectRepo.findAll();
		for (int i = 0; i < list.size(); i++) {
			if (carreg.equals(list.get(i).getCarReg())) {
				foundList.add(list.get(i));
			}
		}
		return foundList;

	}

	@Override
	public List<Object> getId(String id) {
		List<Object> foundList = new ArrayList<>();
		List<Associate> foundAssociates = associateRepo.findAll();
		List<Citizen> list = citizenRepo.findAll();
		for (int i = 0; i < list.size(); i++) {
			if (id.contentEquals(list.get(i).getCitizenId())) {
				foundList.add(list.get(i));
			}
			if (id.contentEquals(foundAssociates.get(i).getCitizenId())) {
				foundList.add(foundAssociates.get(i));
			}
		}
		return foundList;

	}

}

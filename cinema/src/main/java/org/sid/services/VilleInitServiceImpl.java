package org.sid.services;

import java.util.List;

import org.sid.dao.VilleRepository;
import org.sid.entities.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VilleInitServiceImpl implements IVilleInitService {
	@Autowired
	private VilleRepository villerepository;

	@Override
	public Ville saveVille(Ville p) {
		// TODO Auto-generated method stub
		return villerepository.save(p);
	}
	

	@Override
	public Ville updateVille(Ville p) {
		return villerepository.save(p);
	}

	@Override
	public void deleteVille(Ville p) {
		 villerepository.delete(p);
		
	}

	@Override
	public void deleteVilleById(Long id) {
		villerepository.deleteById(id);
		
	}

	@Override
	public Ville getVille(Long id) {
		// TODO Auto-generated method stub
		return villerepository.findById(id).get();
	}

	@Override
	public List<Ville> getAllVilles() {
		// TODO Auto-generated method stub
		return villerepository.findAll();
	}


}
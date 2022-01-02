package org.sid.services;

import java.util.List;

import org.sid.entities.Ville;



public interface IVilleInitService {
	Ville saveVille(Ville p);
	Ville updateVille(Ville p);
void deleteVille(Ville p);
 void deleteVilleById(Long id);
 Ville getVille(Long id);
List<Ville> getAllVilles();

}
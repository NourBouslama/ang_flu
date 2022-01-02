package org.sid.web;

import java.util.List;

import org.sid.entities.Ville;
import org.sid.services.IVilleInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/vil")
@CrossOrigin("*")
public class VilleRestController {
@Autowired
IVilleInitService VilleInitService;


@RequestMapping(method = RequestMethod.GET)
public List<Ville> getAllVilles() {
return VilleInitService.getAllVilles();
}


/*@RequestMapping(value="/{numP}",method = RequestMethod.GET)
public Proprietaire getProprietaireById(@PathVariable("numP") Long numP) {
return proprietaireService.getProprietaire(numP);
 }
*/
@RequestMapping(method = RequestMethod.POST)
public Ville createVille(@RequestBody Ville Ville) {
return VilleInitService.saveVille(Ville);
}

@RequestMapping(method = RequestMethod.PUT)
public Ville updateVille(@RequestBody Ville Ville) {
return VilleInitService.updateVille(Ville);
}

@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deleteVille(@PathVariable("id") Long id)
{
	VilleInitService.deleteVilleById(id);
}

/*@RequestMapping(value="/animalprop/{numA}",method = RequestMethod.GET)
public List<Proprietaire> getAnimalsByCatId(@PathVariable("numA") Long numA) {
return proprietaireService.findByAnimalNumA(numA);
}*/
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Ville getVilleById(@PathVariable("id") Long id) {
return VilleInitService.getVille(id);
}
	

}
package org.sid.services;

import java.util.List;

import org.sid.entities.Cinema;


public interface ICinemaInitService {
	public void initVilles();
	public void initCinemas();
	public void initSalles();
	public void initPlaces();
	public void initSeances();
	public void initCategories();
	public void initFilms();
	public void initProjections();
	public void initTickets();
	Cinema saveCinema(Cinema p);
	Cinema updateCinema(Cinema p);
void deleteCinema(Cinema p);
 void deleteCinemaById(Long id);
 Cinema getCinema(Long id);
List<Cinema> getAllCinemas();
}

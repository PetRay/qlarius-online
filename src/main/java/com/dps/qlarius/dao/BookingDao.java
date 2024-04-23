package com.dps.qlarius.dao;


import java.util.List;

import com.dps.qlarius.domain.Booking;

/**
 * Booking DAO interface.
 * @author Dan Developer
 * 
 */
public interface BookingDao {

	/**
     * Find Booking by id.
     */
    public Booking find(Long id);
    
    /**
     * Persist Booking.
     */
    public void persist(Booking Booking);

    /**
     * Merge Booking.
     */
    public void merge(Booking Booking);
    
    /**
     * Remove Booking.
     */
    public void remove(Booking Booking);
    
    /**
     * Find all Bookings.
     */
    public List<Booking> findAll();
    
    /**
     * Find a range of Bookings.
     */
    public List<Booking> findInRange(int firstResult, int maxResults);
    
    /**
     * Count the number of Bookings.
     */
    public long count();    
       
    /**
     * Find Bookings by username.
     */
    public List<Booking> findByUsername(String Username);

}
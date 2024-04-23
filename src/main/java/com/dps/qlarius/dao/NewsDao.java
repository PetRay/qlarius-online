package com.dps.qlarius.dao;


import java.util.List;

import com.dps.qlarius.domain.News;

/**
 * News DAO interface.
 * @author Dan Developer
 * 
 */
public interface NewsDao {

	/**
     * Find News article by id.
     */
    public News find(Long id);
    
    /**
     * Persist News article.
     */
    public void persist(News News);

    /**
     * Merge News article.
     */
    public void merge(News News);
    
    /**
     * Remove News article.
     */
    public void remove(News News);
    
    /**
     * Find all News articles.
     */
    public List<News> findAll();
    
    /**
     * Find a range of News articles.
     */
    public List<News> findInRange(int firstResult, int maxResults);
    
    /**
     * Count the number of News articles.
     */
    public long count();    
    
    /**
     * Find all active News articles.
     */
    public List<News> findActive();
    
    /**
     * Find limited number of active News articles.
     */
    public List<News> findActiveMax(int maxResults);

}
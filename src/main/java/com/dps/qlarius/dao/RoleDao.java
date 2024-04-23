package com.dps.qlarius.dao;

import java.util.List;

import com.dps.qlarius.domain.Role;

/**
 * Role DAO interface.
 * @author Dan Developer
 * 
 */
public interface RoleDao {

    /**
     * Find Role by authority.
     */
    public Role find(String authority);
    
    /**
     * Persist Role.
     */
    public void persist(Role role);

    /**
     * Merge Role.
     */
    public void merge(Role role);
    
    /**
     * Remove Role.
     */
    public void remove(Role role);
    
    /**
     * Find all Roles.
     */
    public List<Role> findAll();
    
    /**
     * Find a range of Roles.
     */
    public List<Role> findInRange(int firstResult, int maxResults);
    
    /**
     * Count the number of Roles.
     */
    public long count();

}
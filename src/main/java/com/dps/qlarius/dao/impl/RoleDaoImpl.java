package com.dps.qlarius.dao.impl;

import org.springframework.stereotype.Repository;

import com.dps.qlarius.dao.RoleDao;
import com.dps.qlarius.domain.Role;

/**
 * Role DAO implementation.
 * @author Dan Developer
 * 
 */
@Repository("RoleDao")
public class RoleDaoImpl extends GenericDAOImpl<Role, String> implements RoleDao {

}

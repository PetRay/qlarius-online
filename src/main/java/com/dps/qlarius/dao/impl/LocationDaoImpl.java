package com.dps.qlarius.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.dps.qlarius.dao.LocationDao;
import com.dps.qlarius.domain.Location;
import com.dps.qlarius.web.form.SearchCriteria;

/**
 * Location DAO implementation.
 * @author Dan Developer
 * 
 */
@Repository("LocationDao")
public class LocationDaoImpl extends GenericDAOImpl<Location, Long> implements LocationDao {

	// custom repository method
	@SuppressWarnings("unchecked")
	public List<Location> findLocations(SearchCriteria criteria) {
		String pattern = getSearchPattern(criteria);
		if (criteria.getPageSize() == 0) criteria.setPageSize(10);
		return (List<Location>) super.entityManager.createQuery(
				"select p from Location p where lower(p.name) like " + pattern
						+ " or lower(p.city) like " + pattern
						+ " or lower(p.zip) like " + pattern
						+ " or lower(p.address) like " + pattern)
				.setMaxResults(criteria.getPageSize()).setFirstResult(
						criteria.getPage() * criteria.getPageSize())
				.getResultList();
	}
	
	// helpers

	private String getSearchPattern(SearchCriteria criteria) {
		if (StringUtils.hasText(criteria.getSearchString())) {
			return "'%"
					+ criteria.getSearchString().toLowerCase()
							.replace('*', '%') + "%'";
		} else {
			return "'%'";
		}
	}

}

package org.launchcode.models.data;

import org.launchcode.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

//spring data layer created as interface and interact with controller layer with instances of this class to store in the database
@Repository
@Transactional
public interface CategoryDao extends CrudRepository<Category, Integer> {
}

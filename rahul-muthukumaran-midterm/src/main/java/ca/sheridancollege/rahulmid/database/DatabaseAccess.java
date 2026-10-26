package ca.sheridancollege.rahulmid.database;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.rahulmid.beans.Clothing;

@Repository
public class DatabaseAccess {
@Autowired
protected NamedParameterJdbcTemplate jdbc;
public void insertClothingHardCoded() {
MapSqlParameterSource namedParameters = new MapSqlParameterSource();
String query = "INSERT INTO clothing(brand) VALUES ('Dior',20.3,'S','Necklace','Adult')";
int rowsAffected = jdbc.update(query, namedParameters);
if (rowsAffected > 0)
System.out.println("Hard coded clothing inserted into the database");
}
public void insertClothing(Clothing clothing) {
MapSqlParameterSource namedParameters = new MapSqlParameterSource();
String query = "INSERT INTO clothing(brand) VALUES (:brand)";
namedParameters.addValue("brand", clothing.getBrand());
int rowsAffected = jdbc.update(query, namedParameters);
if (rowsAffected > 0) {
System.out.println("Clothing inserted into database");
}
}
public List<Clothing> searchClothing(Clothing clothing) {
	MapSqlParameterSource namedParameters = new MapSqlParameterSource();
	String query = "SELECT * FROM clothing WHERE LOWER(BRAND) = (:brand)";
	namedParameters.addValue("brand", clothing.getBrand());
	return jdbc.query(query, namedParameters, new
	BeanPropertyRowMapper<Clothing>(Clothing.class));
}

public List<Clothing> getClothingList() {
	MapSqlParameterSource namedParameters = new MapSqlParameterSource();
	String query = "SELECT * FROM clothing";
	return jdbc.query(query, namedParameters, new
	BeanPropertyRowMapper<Clothing>(Clothing.class));
}
public void updateClothing(Clothing updatedClothing) {
    MapSqlParameterSource namedParameters = new MapSqlParameterSource();
    
    String query = "UPDATE clothing SET brand = :brand WHERE id = :id";
    namedParameters.addValue("name", updatedClothing.getBrand());
    namedParameters.addValue("id", updatedClothing.getId());
    
    int rowsAffected = jdbc.update(query, namedParameters);
    
    if (rowsAffected > 0) {
        System.out.println("Updated Clothing with ID " + updatedClothing.getId() + " in the database.");
    }
}
}

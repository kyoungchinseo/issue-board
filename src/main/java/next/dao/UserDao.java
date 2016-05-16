package next.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import next.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
    public void insert(User user) {
        String sql = "INSERT INTO USERS VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, user.getUserId(),
                user.getPassword(),
                user.getName(),
                user.getGithubId(),
                user.getEmail());
    }

    public User findByUserId(String userId) {
        String sql = "SELECT userId, password, name, githubId, email FROM USERS WHERE userid=?";
        try {
        	return jdbcTemplate.queryForObject(sql, new UserRowMapper(), userId);
        } catch(EmptyResultDataAccessException e) {
        	return null;
        }
    }

    public List<User> findAll() throws SQLException {
        String sql = "SELECT userId, password, name, githubId, email FROM USERS";
        return jdbcTemplate.query(sql, new UserRowMapper());
    }

    public void update(User user) {
        String sql = "UPDATE USERS set password = ?, name = ?, githubId = ? ,email = ? WHERE userId = ?";
        jdbcTemplate.update(sql, user.getPassword(),
                user.getName(),
                user.getGithubId(),
                user.getEmail(),
                user.getUserId());
    }
    
    private static class UserRowMapper implements RowMapper<User> {
    	@Override
        public User mapRow(ResultSet rs, int index) throws SQLException {
            return new User(rs.getString("userId"), 
                    rs.getString("password"), 
                    rs.getString("name"),
                    rs.getString("githubId"),
                    rs.getString("email"));
        }
    }
}

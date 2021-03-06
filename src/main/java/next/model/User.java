package next.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class User {
	public static final GuestUser GUEST_USER = new GuestUser();
	
	@NotBlank
	@Size(min=4,max=12)
	private String userId;
	
	@NotBlank
	@Size(min=4,max=12)
	private String password;
	
	@NotBlank
	@Size(min=4,max=20)
	private String name;
	
	@NotBlank
	@Size(min=4,max=20)
	private String githubId;
	
	
	@Email(message="this is invalid email.")
	private String email;

	public User() {
	}

	public User(String userId, String password, String name, String githubId, String email) {
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.githubId = githubId;
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getGithubId() {
		return githubId;
	}

	public void setGithubId(String githubId) {
		this.githubId = githubId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void update(User updateUser) {
		this.password = updateUser.password;
		this.name = updateUser.name;
		this.githubId = updateUser.githubId;
		this.email = updateUser.email;
	}

	public boolean matchPassword(String password) {
		if (password == null) {
			return false;
		}

		return this.password.equals(password);
	}

	public boolean isSameUser(User user) {
		return isSameUser(user.getUserId());
	}

	public boolean isSameUser(String newUserId) {
		if (userId == null) {
			return false;
		}
		return userId.equals(newUserId);
	}
	
	public boolean isGuestUser() {
		return false;
	}
	
	private static class GuestUser extends User {
		@Override
		public boolean isGuestUser() {
			return true;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((githubId == null) ? 0 : githubId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (githubId == null) {
			if (other.githubId != null)
				return false;
		} else if (!githubId.equals(other.githubId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", githubId=" + githubId
				+ ", email=" + email + "]";
	}

	
}

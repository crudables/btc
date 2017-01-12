package com.ables.btc.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1892458628460930475L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	@NotBlank
	@Column(name="FIRST_NAME", nullable=false)
	private String firstName;
	
	@NotBlank
	@Column(name="Last_Name", nullable=false)
	private String lastName;
	
	@Column(name="Other_Names", nullable=true)
	private String otherNames;
	
	@NotBlank
	@Column(name="Username",unique=true, nullable=false)
	private String username;
	
	@NotBlank
	@Column(name="Password", nullable=false)
	private String password;
	
	@NotBlank
	@Column(name="Email", unique=true, nullable=false)
	private String email;
	
	@NotBlank
	@Column(name="Mobile_Phone", nullable=false, unique=true)
	private String phone;
	
	@Column(name="Adress", nullable=true)
	private String address;
	
	@Transient
	private Date regDate;
	
	@NotBlank
	@ManyToMany(fetch= FetchType.LAZY)
	@JoinTable(name="APP_USER_USER_PROFILE",
		joinColumns = { @JoinColumn(name="USER_ID")},
		inverseJoinColumns= {@JoinColumn(name = "USER_PROFILE_ID")}
	)
	
	private Set<UserProfile> userProfile = new HashSet<>();

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOtherNames() {
		return otherNames;
	}

	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	
	
	
	public Set<UserProfile> getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(Set<UserProfile> userProfile) {
		this.userProfile = userProfile;
	}

	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof User))
            return false;
        User other = (User) obj;
        if (Id == null) {
            if (other.Id != null)
                return false;
        } else if (!Id.equals(other.Id))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }
	
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Id == null) ? 0 : Id.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "User [id=" + Id + ", ssoId=" + username 
                + ", firstName=" + firstName + ", lastName=" + lastName
                + ", email=" + email + "]";
    }
}

package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "`User`")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "username", columnDefinition = "nchar(50)")
	private String userName;

	@Column(name = "password", columnDefinition = ("nvarchar(MAX)"))
	private String password;

	@Column(name = "hoten", columnDefinition = "nvarchar(MAX)")
	private String hoten;
	
	@Column(name = "gioitinh", columnDefinition = "nchar(10)")
	private String gioitinh;
	
	@Column(name = "diachi", columnDefinition = "nvarchar(MAX)")
	private String diachi;
	
	@Column(name = "ngaysinh", columnDefinition = "date")
	private String ngaysinh;
	
	@Column(name = "sodt", columnDefinition = "nchar(10)")
	private String sodt;
	
	@Column(name = "status")
	private int status;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "User_id"), inverseJoinColumns = @JoinColumn(name = "Role_id"))
	private List<RoleEntity> roles = new ArrayList<>();

	
	@OneToMany(mappedBy = "user")
	private List<HoadonEntity> hoadon = new ArrayList<>();
	
	
	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getSodt() {
		return sodt;
	}

	public void setSodt(String sodt) {
		this.sodt = sodt;
	}

	public List<HoadonEntity> getHoadon() {
		return hoadon;
	}

	public void setHoadon(List<HoadonEntity> hoadon) {
		this.hoadon = hoadon;
	}

	public List<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getId() {
		return id;
	}

}

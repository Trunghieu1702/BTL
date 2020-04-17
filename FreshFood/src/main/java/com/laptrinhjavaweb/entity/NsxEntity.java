package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Nsx")
public class NsxEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "tenhasx")
	private String tenhasx;
	
	@Column(name = "diachi")
	private String diachi;
	
	@Column(name = "sodt",columnDefinition = "char(10)")
	private String sodt;

	@OneToMany(mappedBy = "nsx")
	private List<SanphamEntity> sanpham1 = new ArrayList<>();

	public String getTenhasx() {
		return tenhasx;
	}

	public void setTenhasx(String tenhasx) {
		this.tenhasx = tenhasx;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSodt() {
		return sodt;
	}

	public void setSodt(String sodt) {
		this.sodt = sodt;
	}

	public List<SanphamEntity> getSanpham1() {
		return sanpham1;
	}

	public void setSanpham1(List<SanphamEntity> sanpham1) {
		this.sanpham1 = sanpham1;
	}

	public int getId() {
		return id;
	}

	
}

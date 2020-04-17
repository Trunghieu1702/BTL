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
@Table(name = "Loaisp")
public class LoaispEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "tenloaisp")
	private String tenloaisp;

	@OneToMany(mappedBy = "loaisp")
	private List<SanphamEntity> sanphams = new ArrayList<>();

	public String getTenloaisp() {
		return tenloaisp;
	}

	public void setTenloaisp(String tenloaisp) {
		this.tenloaisp = tenloaisp;
	}

	public int getId() {
		return id;
	}

	public List<SanphamEntity> getSanphams() {
		return sanphams;
	}

	public void setSanphams(List<SanphamEntity> sanphams) {
		this.sanphams = sanphams;
	}
}

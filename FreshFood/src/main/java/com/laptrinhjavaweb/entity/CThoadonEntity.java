package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cthoadon")
public class CThoadonEntity {

	@EmbeddedId
    private CThoadonID id;
	
	@Column(name = "soluong")
	private int soluong;

	public CThoadonID getId() {
		return id;
	}

	public void setId(CThoadonID id) {
		this.id = id;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
	@ManyToOne
    @JoinColumn(name = "hoadon_id",insertable = false, updatable = false)
    private HoadonEntity hoadon;
	
	@ManyToOne
    @JoinColumn(name = "sanpham_id",insertable = false, updatable = false)
    private SanphamEntity sanpham;

	public HoadonEntity getHoadon() {
		return hoadon;
	}

	public void setHoadon(HoadonEntity hoadon) {
		this.hoadon = hoadon;
	}

	public SanphamEntity getSanpham() {
		return sanpham;
	}

	public void setSanpham(SanphamEntity sanpham) {
		this.sanpham = sanpham;
	}
	
	
	
}
